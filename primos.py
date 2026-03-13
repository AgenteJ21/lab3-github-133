t = int(input())
k = 0
while k < t:
    a = int(input())
    b = int(input())
    contador = 0
    for n in range(a, b + 1):
        if n >= 2:
            divisores = 0
            i = 2
            while i * i <= n:
                if n % i == 0:
                    divisores = divisores + 1
                i = i + 1
            if divisores == 0:
                contador = contador + 1
    print(contador)
    k = k + 1