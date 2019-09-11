def invert(s):
  sol = []
  temp = []
  jump = False
  for i in range(len(s)):
    if jump:
      jump = False
      continue
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
      jump = True

  return sol

print(" ".join(invert(input().split(" "))))