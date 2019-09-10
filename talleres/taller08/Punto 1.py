def polaco(s):
  if len(s) <= 0:
    return 
  a = s.pop()
  b = s.pop()
  c = s.pop()
  if c.isnumeric():
    return eval(c + a + b)
  else:
    s.append(c)
    return eval(b + a + str(polaco(s)))
print(polaco(input().split(" ")))
