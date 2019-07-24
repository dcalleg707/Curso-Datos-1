def cadena(x,y):
    for i in x:
        if len(y) == 0 :
            return ""
        elif i == y[len(y)-1]:
            return i + " " + cadena(x, y[:len(y) - 1])
            continue
        else:
            cadena(x, y[:len(y) - 1])


print(cadena(list(input()), str(input()))[::-1])

