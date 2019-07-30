def perm(s,y):
  for i in s:
    if i in y:
      continue
    else:   
      perm(s,y+list(i))
      
  if len(s) == len(y):
    print("".join(y))

perm(input().split(" "),[])