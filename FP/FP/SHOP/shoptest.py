# Pode correr o programa sem argumentos:
# python3 shop
# ou passando outros ficheiros de produtos como argumento:
# python3 shop produtos1.txt ...

def loadDataBase(fname, produtos):
    """
    Lê dados do ficheiro fname e atualiza/acrescenta a informação num
    dicionário de produtos com o formato {código: (nome, secção, preço, iva), ...}.
    """

    with open(fname, "r") as file:
        next(file)
        for line in file:
            p = line.strip().split(";")
            produtos[p[0]] = (p[1], p[2], float(p[3]), float(p[4].strip("%")))
    return produtos


def registaCompra(produtos):
    """Lê códigos de produtos (ou códigos e quantidades),
    mostra nome, quantidade e preço final de cada um,
    e devolve dicionário com {codigo: quantidade, ...}
    """
    x = input("Code?")
    buy_dict = dict()
    while x != "":
        buy = x.split()
        if len(buy) == 1:
            buy.insert(1, 1)
        cd = buy[0]
        qt = int(buy[1])
        if cd in produtos:

            print(f"{produtos[cd][0]} {qt} {f'{produtos[cd][2] * (1 + (produtos[cd][3]/100)):.2f}'}")
            if cd in buy_dict:
                buy_dict[cd] += qt
            else:
                buy_dict.update({cd: qt})
        x = input("Code?")
    print(buy_dict)
    return buy_dict


def fatura(produtos, compra):
    """Imprime a fatura de uma dada compra."""
    nc=int(input("Nº de Compra?"))
    tbruto = 0
    ttax=0
    tliq=0
    section=[]
    for i in compra[nc].keys():
        if produtos[i][1] not in  section :
            section.append(produtos[i][1])
    print(section)
    for s in section:

        print(s)
        for x in compra[nc] :
            if produtos[x][1] == s:
                print("{:>5} {:40s}({:2}%){:>15.2f}".format(compra[nc][x], produtos[x][0], int(produtos[x][3]), produtos[x][2] * compra[nc][x]))

        ttax +=(compra[nc][x]*(produtos[x][2] * produtos[x][3]/100))
        tbruto +=(compra[nc][x]*produtos[x][2])
        tliq += (compra[nc][x]*produtos[x][2] * (1 + (produtos[x][3]/100)))

    print("{:>50}{:>15.2f}".format("Total Bruto:", tbruto ))
    print("{:>50}{:>15.2f}".format("Total IVA:", ttax))
    print("{:>50}{:>15.2f}".format("Total Liquido:", tliq))

def main(args):
    # produtos guarda a informação da base de dados numa forma conveniente.
    produtos = {'p1': ('Ketchup.', 'Mercearia Salgado', 1.59, 0.23)}
    # Carregar base de dados principal
    loadDataBase("produtos.txt", produtos)
    loadDataBase("produtos1.txt",produtos)
    # Juntar bases de dados opcionais (Não altere)
    for arg in args:
        loadDataBase(arg, produtos)

    # Use este código para mostrar o menu e ler a opção repetidamente
    MENU = "(C)ompra (F)atura (S)air ? "
    repetir = True
    nc=0
    numero_fatura = dict()
    while repetir:
        # Utilizador introduz a opção com uma letra minúscula ou maiúscula
        op = input(MENU).upper()
        # Processar opção
        if op == "C":
            # Esta opção regista os produtos de uma compra
            compra = registaCompra(produtos)
            # Aqui pode acrescentar a compra a uma estrutura de dados adequada...
            nc+=1
            print(nc)
            numero_fatura.update({ nc : compra})
        elif op == "F":
            fatura(produtos,numero_fatura)

        elif op == "S":
            break

    print("Obrigado!")


# Não altere este código / Do not change this code
import sys

if __name__ == "__main__":
    main(sys.argv[1:])

