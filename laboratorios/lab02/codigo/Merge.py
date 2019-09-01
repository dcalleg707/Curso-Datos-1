# Import the necessary packages and modules
import matplotlib.pyplot as plt
import numpy as np
from time import time
import random


# Import the necessary packages and modules
import matplotlib.pyplot as plt
import numpy as np
from time import time
import random


# Python program for implementation of MergeSort
def mergeSort(arr):  #código extraido de https://www.geeksforgeeks.org/merge-sort/
    if len(arr) > 1:
        mid = len(arr) // 2  # Finding the mid of the array
        L = arr[:mid]  # Dividing the array elements
        R = arr[mid:]  # into 2 halves

        mergeSort(L)  # Sorting the first half
        mergeSort(R)  # Sorting the second half

        i = j = k = 0

        # Copy data to temp arrays L[] and R[]
        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        # Checking if any element was left
        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1

a= []
b = []
c = []

for i in range(10000, 200001, 10000):
    for _ in range(i):
        a.append(random.randrange(10000))
    initial_time = time()
    mergeSort(a)
    final_time = time()-initial_time
    b.append(i)
    c.append(final_time)
    print(str(i)," ",final_time)
    a.clear()

plt.xlabel("data")
plt.ylabel("time")
plt.plot(b, c, "ro")
plt.suptitle("Merge Sort")
plt.legend()
plt.show()