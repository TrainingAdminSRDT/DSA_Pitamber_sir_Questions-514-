def quickSort(arr, low, high):

    if low < high:

        pivot_index = partition(arr, low, high)

        quickSort(arr, low, pivot_index - 1)

        quickSort(arr, pivot_index + 1, high)



def partition(arr, low, high):

    pivot = arr[high]      # last element as pivot

    i = low - 1


    for j in range(low, high):

        if arr[j] <= pivot:

            i += 1

            arr[i], arr[j] = arr[j], arr[i]


    arr[i + 1], arr[high] = arr[high], arr[i + 1]

    return i + 1



# main function
if __name__ == "__main__":

    arr = [5, 2, 8, 1, 3]

    quickSort(arr, 0, len(arr)-1)

    print(arr)