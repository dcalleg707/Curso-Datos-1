def polaco(s):
  sol = []
  for i in range(len(s)):
    if s[i].isnumeric():
      sol.append(s[i])
    else:
      a = sol.pop()
      b = sol.pop()
      print(b + s[i] + a)
      sol.append(str(eval(b + s[i] + a)))
  return sol

print(polaco(input().split(" ")))
