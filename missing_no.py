def missing_number(arr, n):
    expected_sum = n * (n + 1) // 2
    actual_sum = sum(arr)

    return expected_sum - actual_sum


arr = [1, 2, 4, 5]
print(missing_number(arr, 5))