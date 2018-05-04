def interpolationsearch (a,x):
    lowerbound=0
    upperbound=len(a)-1
    index=-1
    while(lowerbound<upperbound):
        middlepoint=lowerbound+((upperbound-lowerbound)/(a[upperbound]-a[lowerbound]))*(x-a[lowerbound])
        middlepoint = int(middlepoint)
        if (x==a[middlepoint]):
            print('posicion de numero ingresado',middlepoint)
            index=middlepoint
            break
        else:
            if(x<a[middlepoint]):
              upperbound=middlepoint-1
            else:
                lowerbound=middlepoint+1
    if (lowerbound==upperbound and a[lowerbound]==x):
        print('posicion de numero ingresado',lowerbound)
        index=lowerbound
    return index

num = input()
x= [int(valor) for valor in num.split(',')]
n = int(input())
interpolationsearch(x,n)
#print(x)

