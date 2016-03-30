def insertion_sort(N, A):
    for i in range (N):
        v = A[i]
        j = i - 1
        while j >= 0 and A[j] > v:
            A[j+1] = A[j]
            j = j -1
        A[j+1] = v

if __name__ == '__main__':
    N = input()
    A = input().split()

    insertion_sort(N, A)
