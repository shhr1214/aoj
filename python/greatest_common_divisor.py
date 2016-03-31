from fractions import gcd

if __name__ == '__main__':
    A = input().split()

    print(gcd(int(A[0]), int(A[1])))
