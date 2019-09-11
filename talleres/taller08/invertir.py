def invert(s):
  sol = []
  for i in range(len(s)):
    if s[i] == "(":
      continue
    if s[i] == ")":
      continue
    if s[i].isnumeric():
      print(sol, s[i])
      sol.append(s[i])
      continue
    elif not s[i].isnumeric():
      print(sol, s[i])
      sol.append(" ".join(invert(s[i+1:])))
      sol.append(s[i])
      break
  return sol

print(" ".join(invert(input().split(" "))))
