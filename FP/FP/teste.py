a = 1
b= 2
c=0
t=dict()
for i in range(0,6):
    c+=1
    a+=2
    b+=1
    t.update({c: (a, b)})

print(t)

print(t[2])



