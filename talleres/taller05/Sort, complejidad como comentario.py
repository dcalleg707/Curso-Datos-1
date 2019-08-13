import time

def sort(arreglo):
  starting_point = time.time()
  for i in range(len(arreglo)):
    for j in range(len(arreglo)):
      if arreglo[i] > arreglo[j]:
        aux = arreglo[i]
        arreglo[i] = arreglo[j]
        arreglo[j] = aux
  print(arreglo)
  elapsed_time = time.time () - starting_point
  print(elapsed_time)
  
x = []
for i in range(int(input())):
  x.append(5)
sort(x)
 
 #complejidad de O(n^2)