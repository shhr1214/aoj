if __name__ == '__main__':
    N = int(input())
    R1 = int(input())
    R2 = int(input())
    maxv = R2 - R1
    minv = R2 if R2 <= R1 else R1
    for i in range(N-2):
        R3 = int(input())
        maxv = maxv if maxv >= (R3 - minv) else (R3 - minv)
        minv = minv if minv <= R3 else R3

    print(maxv)
