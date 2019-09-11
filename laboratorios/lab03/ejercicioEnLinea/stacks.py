def arm(n):

    stack = []
    def move_onto(n, m):
        desde = 0
        hasta = 0
        rep = False
        for i in stack:
            if n in i: desde = i
            if m in i: hasta = i
        a = desde.pop()
        while a != n:
            if a == m:
                rep = True
            else:
                stack[a].append(a)
            a = desde.pop()
        if(rep):
            hasta.append(m)
        b = hasta.pop()
        while b != m:
            stack[b].append(b)
            b = hasta.pop()
        hasta.append(b)
        hasta.append(a)

    def move_over(n, m):
        rep = False
        desde = 0
        hasta = 0
        for i in stack:
            if n in i: desde = i
            if m in i: hasta = i
        a = desde.pop()
        while a != n:
            if a == m:
                rep = True
            else:
                stack[a].append(a)
            a = desde.pop()
        if rep:
            hasta.append(m)
        hasta.append(a)

    def pile_onto(n, m):
        desde = []
        hasta = []
        rep = False
        for i in stack:
            if n in i: desde = i
            if m in i: hasta = i
        a = desde.pop()
        aux = []
        while a != n:
            if a == m:
                rep = True
            else:
                aux.append(a)
            a = desde.pop()
        aux.append(a)
        if rep:
            desde.append(m)
        b = hasta.pop()
        while b != m:
            stack[b].append(b)
            b = hasta.pop()
        hasta.append(b)
        while len(aux) > 0:
            hasta.append(aux.pop())

    def pile_over(n, m):
        rep = False
        desde = []
        hasta = []
        for i in stack:
            if n in i: desde = i
            if m in i: hasta = i
        a = desde.pop()
        aux = []
        while a != n:
            if a == m:
                rep = True
            else:
                aux.append(a)
            a = desde.pop()
        if rep:
            hasta.append(m)
        aux.append(a)
        while len(aux) > 0:
            hasta.append(aux.pop())


    for i in range(n):
        stack.append([i])
    action = input()
    while(action != "quit"):
        func = action.split(" ")
        eval(func[0] + "_" + func[2] + "(" + func[1] + "," + func[3] + ")")
        print(stack)
        action = input()
    print(stack)

arm(int(input()))