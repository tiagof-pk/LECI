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
    print(produtos)
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
        section.append(produtos[i][1])

    for x in compra[nc] :
        for s in section:
            print(s)
            if produtos[x][1] == s:

                print(f"{compra[nc][x]} {produtos[x][0]}         ({produtos[x][3]}%)        {f'{produtos[x][2]*compra[nc][x]:.2f}'}")
                print("{:>4} {:40s}({:2d}%){:>10.2f}".format(compra[nc][x], produtos[x][0], produtos[x][3], produtos[x][2]*compra[nc][x]))
        ttax +=(compra[nc][x]*(produtos[x][2] * produtos[x][3]/100))
        tbruto +=(compra[nc][x]*produtos[x][2])
        tliq += (compra[nc][x]*produtos[x][2] * (1 + (produtos[x][3]/100)))

    print(f"Total Bruto{f'{tbruto:.2f}'}")
    print(f"Total Iva{f'{ttax:.2f}'}")
    print(f"Total Liquido{f'{tliq:.2f}'}")
    print("{:>50}{:>10.2f}".format(f"Total Bruto{f'{tbruto:.2f}'}"))
    print("{:>50}{:>10.2f}".format(f"Total Iva{f'{ttax:.2f}'}"))
    print("{:>50}{:>10.2f}".format(f"Total Liquido{f'{tliq:.2f}'}"))


