def insertionSort(numbers):
   for index in range(1,len(numbers)):
     currentvalue = numbers[index]
     position = index
     while position>0 and numbers[position-1]>currentvalue:
         numbers[position]=numbers[position-1]
         position = position-1
     numbers[position]=currentvalue
num = input()
numbers = [int(valor) for valor in num.split(',')]
insertionSort(numbers)

print(numbers)




