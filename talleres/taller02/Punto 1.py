def f(p, q):
    if q == 0:
        return p
    else:
        return f(q, p % q)


print(f(int(input()), int(input())))
