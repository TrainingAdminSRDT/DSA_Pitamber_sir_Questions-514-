def mergeSort(arr):

    # base condition
    if len(arr) <= 1:
        return arr


    # find middle
    mid = len(arr)//2


    # divide array
    left = arr[:mid]
    right = arr[mid:]


    # recursive call
    left = mergeSort(left)
    right = mergeSort(right)


    # merge function
    return merge(left,right)



def merge(left,right):

    result = []

    i = 0
    j = 0


    # compare elements
    while i < len(left) and j < len(right):

        if left[i] < right[j]:

            result.append(left[i])
            i += 1

        else:

            result.append(right[j])
            j += 1



    # remaining elements

    result += left[i:]
    result += right[j:]


    return result




arr = [5,2,8,1,3]


print(mergeSort(arr))