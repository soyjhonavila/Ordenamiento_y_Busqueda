def selectionsort(lista):
   n=len(lista)
   for i in range(0,n-1):
          k = i
          t = lista[i]
          for j in range(i,n):
               if (lista[j] < t):
                  k = j
                  t = lista[j]
          lista[k] = lista[i]
          lista[i] = t
   return lista

num = input()
lista = [int(valor) for valor in num.split(',')]
selectionsort(lista)

print(lista)