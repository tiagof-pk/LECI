def listContacts(dic):
    """Print the contents of the dictionary as a table, one item per row."""
    print("{:>12s} : {}".format("Numero", "Nome"))
    for num in dic:
        print("{:>12s} : {}".format(num, dic[num]))

def addContact(nom,num,dic):
    print("Contact added to List :")
    print("{:>12s} : {}".format(num, nom))
    dic.update({ num : nom })
    return dic

def removeContact(rnum,dic):
    if rnum in dic :
            dic.pop(rnum)
    return dic

def searchContact(snum,dic):
    if snum in dic :
        print("{:>12s} : {}".format(snum, dic[snum]))
    else :
        print(snum)



def filterPartName(pnom, dic):
    """Returns a new dict with the contacts whose names contain partName."""
    nomPart = {}
    for num in dic :
        if pnom in dic[num]:
            nomPart.update({num : dic[num]})
    for c in nomPart:
        print("{:>12s} : {}".format(c, dic[c]))


def menu():
    """Shows the menu and gets user option."""
    print()
    print("(L)istar contactos")
    print("(A)dicionar contacto")
    print("(R)emover contacto")
    print("Procurar (N)úmero")
    print("Procurar (P)arte do nome")
    print("(T)erminar")
    op = input("opção? ").upper()  # converts to uppercase...
    return op


def main():
    """This is the main function containing the main loop."""

    # The list of contacts (it's actually a dictionary!):
    contactos = {"234370200": "Universidade de Aveiro",
                 "727392822": "Cristiano Aveiro",
                 "387719992": "Maria Matos",
                 "887555987": "Marta Maia",
                 "876111333": "Carlos Martins",
                 "433162999": "Ana Bacalhau"
                 }

    op = ""
    while op != "T": 
        op = menu()
        if op == "T":
            print("Fim")
        elif op == "L":
            print("Contactos:")
            listContacts(contactos)
        elif op == "A":
            nom=input("Nome?")
            num=(input("Número?"))
            addContact(nom,num,contactos)
        elif op == "R":
            rnum=input("Número?")
            removeContact(rnum,contactos)
        elif op == "N":
            snum=input("Número?")
            searchContact(snum,contactos)
        elif op == "P":
            pnom=input("Nome?")
            filterPartName(pnom,contactos)
        else:
            print("Não implementado!")


# O programa começa aqui
main()
