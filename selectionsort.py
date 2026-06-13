def selectionSort(arr):

    n = len(arr)

    for i in range(n):

        min_index = i

        for j in range(i + 1, n):

            if arr[j] < arr[min_index]:
                min_index = j


        arr[i], arr[min_index] = arr[min_index], arr[i]



# main function
if __name__ == "__main__":

    arr = [5, 2, 8, 1, 3]

    selectionSort(arr)

    print(arr)