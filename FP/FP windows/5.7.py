def isPalindrome (str):
    str_l=[]
    for i in str :
        str_l.append(i)
    for x in range (0, len(str_l)//2):
        if str_l[x] != str_l[len(str_l)-1-x]:
            return False
    return True

str=input("-------->")
print(isPalindrome(str))
