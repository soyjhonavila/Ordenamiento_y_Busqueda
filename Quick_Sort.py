def quicksort(x):
    if len(x) < 2:
        return x
    else:
        pivot = x[0]
        less = [i for i in x[1:] if i <= pivot]
        greater = [i for i in x[1:] if i > pivot]
        return quicksort(less) + [pivot] + quicksort(greater)

print("ingrese numeros\n")
num = input()
numbers = [int(valor) for valor in num.split(',')]
print(quicksort(numbers))