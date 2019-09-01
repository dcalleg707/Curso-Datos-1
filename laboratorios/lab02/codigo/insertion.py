
# Import the necessary packages and modules
import matplotlib.pyplot as plt
import numpy as np
from time import time
import random


def insertionSort(arr):  # código extraido de https://www.geeksforgeeks.org/python-program-for-insertion-sort/
    # Traverse through 1 to len(arr)
    for i in range(1, len(arr)):

        key = arr[i]

        # Move elements of arr[0..i-1], that are
        # greater than key, to one position ahead
        # of their current position
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

a= []
b = []
c = []

for i in range(1000, 20001, 1000):
    for _ in range(i):
        a.append(random.randrange(1000))
    initial_time = time()
    insertionSort(a)
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