def twoSum(nums, target):

    hashmap = {}

    for i in range(len(nums)):

        difference = target - nums[i]

        if difference in hashmap:
            return [hashmap[difference], i]


        hashmap[nums[i]] = i



# main function
if __name__ == "__main__":

    nums = [2,7,11,15]

    target = 9


    result = twoSum(nums, target)

    print(result)