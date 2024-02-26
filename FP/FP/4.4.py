def factorial(n):
    assert isinstance(n, int), "n should be an int"
    assert n >= 0            , "n should not be negative"
    f=0
    Nfact=[]
    n=int(input("n=?"))
    while f != n:
      f += 1
      nfact= f
      Nfact.append(nfact)
      print(Nfact)
      factor=Nfact[0]*Nfact[1]
      Nfact=[factor]
    return Nfact
nfact=0
n=0
f=0
Nfact=[]
factor=0
resp= factorial(n)
print(resp)