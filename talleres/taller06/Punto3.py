n = int(input())
arr = [1]
for i in range(2,n+1):
    for e in range(1,i):
      arr.append(e)
      print(e)
    arr.append(i)
print(arr)
