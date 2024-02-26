
def IMC( lst ):
    for x in lst:
        dt=lst[x]
        print(dt)
        



def listPessoas(filename,d):
    lst=dict()
    with open(filename, "r") as fin:
        for line in fin:
            s= line.strip().split()
            nm=s[0]
            w=s[1]
            h=s[2]
            lst[nm] = (w, h)
    return lst

def readPessoas(d):
    for i in lst.keys():
        lname.append(i)
    return lname










# name, we  ,  h
file="pessoas.text"
lst=dict()
lname=[]
lst=listPessoas(file,lst)
limc=[]
print(lst)
print(readPessoas(lst))
IMC(lst)
