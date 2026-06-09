def linear_search(arr, target, index=0):
    if index == len(arr):
        return -1

    if arr[index] == target:
        return index

    return linear_search(arr, target, index + 1)


arr = [10, 20, 30, 40, 50]
target = 40

print(linear_search(arr, target))