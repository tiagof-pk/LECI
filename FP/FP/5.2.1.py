def inputFloatList (n) :
    n=input("nº?")
    while n != "":
        lst.append(float(n))
        n=input("nº?")
    return lst
def countLower(lst,avg):

    for x in lst :
        if x < avg :
            count.append(x)

    return count , len(count)
def minmax(lst):
    maxn = lst[0]
    minn = lst[0]
    for x in lst :
        if x > maxn :
            maxn = x
        if x < minn :
            minn =x
    return minn , maxn


n=0
lst=[]
count=[]
v=0
inputFloatList(n)
print(lst)
print (minmax(lst))
minmaxn=minmax(lst)
avg=(minmaxn[1] + minmaxn[0]) / 2
print(countLower(lst,avg))
print(avg)


