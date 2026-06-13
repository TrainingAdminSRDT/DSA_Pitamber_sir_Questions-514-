def isHappy(n):
    seen = set()

    while n != 1:

        if n in seen:
            return False

        seen.add(n)

        total = 0

        while n > 0:
            digit = n % 10
            total += digit * digit
            n = n // 10

        n = total

    return True

# main function
if __name__ == "__main__":

    n = 19

    result = isHappy(n)

    print(result)