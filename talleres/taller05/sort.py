import time
import random

def sort(arreglo):
    starting_point = time.time()
    for i in range(len(arreglo)):
        aux = i - 1
        while aux >= 0 and arreglo[i] < arreglo[aux]:
            aux -= 1
        temp = arreglo[i]
        arreglo[i] = arreglo[aux + 1]
        arreglo[aux + 1] = temp
    elapsed_time = time.time() - starting_point
    print(elapsed_time)

def arreglo(n):
    x = []
    for i in range(n):
        x.append(random.randint(1, 10))
    return x


for i in range(5000, 200001, 5000):
    sort(arreglo(i))

# complejidad de O(n^2), para grandes cantidades de datos puede no ser tan eficiente