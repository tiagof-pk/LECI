a=0
b=0
c=0
m=0
def max2(a,b):
    a = float(input("a?"))
    b = float(input("b?"))
    c = float(input("c?"))
    m = 0
    if b > a and b > c:
        m = m+b
        print("b>a; max=", b)
    elif a>b and a>c:
        m = m+a
        print("a>b; a=", a)
    else:
        m= m+c
        print("a>b; max=", c)
    print(m)
    return m

max2(a,b)
print(m)


if isLeapYear(year) == True :
      day += 1



