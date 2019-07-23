def subgrupos(lista, arr):
  for i in range(len(lista)):
    if i == 0:
      if (" ".join(lista[1:])) not in arr:
        arr.append((" ".join(lista[1:])))

      subgrupos(lista[1:], arr)
    else:
      if (" ".join((lista[0:i] + lista[i+1:]))) not in arr:
        arr.append(" ".join((lista[0:i] + lista[i+1:])))

      subgrupos(lista[0:i] + lista[i+1:], arr)

arr = []
subgrupos(input().split(" "), arr)
for i in arr:
  print(i)

