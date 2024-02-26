telList = ['975318642', '234000111', '777888333','7771','7772','7773']
nameList = ['Angelina', 'Brad', 'Claudia','Angelo','Ana','Adriana']

def Tel2Name(nameList,telList):
    t=input("Phone Number:")
    if t in telList :
        n=telList.index(t)
        return nameList[n]
    else:
        return t
def name2Tel (nameList):
    na = input("Phone Name:")
    nl=[]
    for x in nameList:
        if na in x:
            nl.append(x)
    return nl
print(name2Tel(nameList))