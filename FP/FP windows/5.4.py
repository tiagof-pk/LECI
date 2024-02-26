def allMatches(teams):
    lst=[]
    for t1 in teams :
        for t2 in teams :
            if t1 != t2 :
                lst.append((t1,t2))
    return lst
teams=["FCP","SCP","SLB"]
print(allMatches(teams))