

def binarysearch (a,x):

    lowerbound = 0
    upperbound = len(a)-1
    index = -1

    while(lowerbound < upperbound):
        middlepoint = (lowerbound + upperbound) / 2
        if (x == a[middlepoint]):
            index = middlepoint
            break
        else:
            if (x < a[middlepoint]):
                upperbound = middlepoint-1
            else:
                lowerbound = middlepoint+1

    if (lowerbound == upperbound and a[lowerbound] == x):
        index = lowerbound

    print ("el numero "+str(x)+" se encuentra en la posicion "+str(index))
    return index


m = int(input("Ingrese el tamano del arreglo:"))
a = [] * m

input1 = input("Ingrese "+str(m)+" numeros ordenados").split(",")

for i in range(0,m):
    t = int(input1[i])
    a.append(t)

x = int(input("Que numero de los ingresados anteriormente desea buscar?:"))





print(a)
print(x)
