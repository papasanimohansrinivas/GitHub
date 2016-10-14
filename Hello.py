g  = int(raw_input())
list1=[None]*g
for t in range(g):
    list1[t]=raw_input()

#print list1


def subseqs(seq, length):
    for i in xrange(len(seq) - length + 1):
        yield seq[i:i+length]  

    


answer=[]
list_of_Lists=[]
for g in xrange(len(list1)):
    for i in xrange(len(list1[g])):
        for each in subseqs(list1[g], i + 1):
            answer.append(each)
    list_of_Lists.append(answer)
        

#print list_of_Lists 

string1=""
for y in range(len(list1)):
    string1=string1+list1[y]

secondlist=[]

for b in xrange(len(string1)):
    for k in subseqs(string1,b+1):
        secondlist.append(k)
thirdlist=[]

for t in xrange(len(list_of_Lists)):
    for y in xrange(len(list_of_Lists[t])):
        thirdlist.append(list_of_Lists[t][y])

if(secondlist==thirdlist):
    print True
else:
    print False


print secondlist
print thirdlist

    
