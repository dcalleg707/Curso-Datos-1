def prmat(matris):
  print(matris[0])
  if len(matris) == 1:
    print(" ")
  else:
    prmat(matris[1:])



def linea(n, m):
  if n == 1:
    return ["."]
  else:
    return m + ["."] + linea(n-1,m)



def matriz(n, result):
  for i in range(n):
    result.append(linea(n,[]))
  return(result)



def check(lista, base, com):
  if base == len(lista)-2 and com == len(lista) - 1:
    if (int(lista[base]) + base != int(lista[com]) + com and int(lista[base]) + com != int(lista[com]) + base):
      return True

  if com < len(lista):
    if (int(lista[base]) + base != int(lista[com]) + com and int(lista[base]) + com != int(lista[com]) + base):
      return True and check(lista,base,com+1)
      
  elif base < len(lista)-1:
    return check(lista, base+1, base+2)



def reinas(lista,n, matris):
  matris[n-1][int(lista[n-1])] = ("R")
  if(n == 1):
    prmat(matris)
  else:
    reinas(lista[:len(lista)], n-1, matris)
  


def perm(s,y):
  for i in s:
    if i in y:
      continue
    else:   
      perm(s,y+list(i))
      
  if len(s) == len(y):
    if(check(y,0,1)):
      reinas(y, len(y), matriz(len(y),[]))


    
lista = []
for i in range(int(input())):
  lista.append(str(i))

perm(lista, [])


  
  



