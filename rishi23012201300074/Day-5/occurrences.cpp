#include <iostream>
#include <vector>

/**
 * Finds the first occurrence of a target in a sorted array.
 * 
 * @param arr The sorted vector to search.
 * @param target The element to search for.
 * @return The index of the first occurrence, or -1 if not found.
 */
int findFirstOccurrence(const std::vector<int>& arr, int target) {
    int low = 0;
    int high = arr.size() - 1;
    int result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid;
            high = mid - 1; // Keep searching on the left side
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return result;
}

/**
 * Finds the last occurrence of a target in a sorted array.
 * 
 * @param arr The sorted vector to search.
 * @param target The element to search for.
 * @return The index of the last occurrence, or -1 if not found.
 */
int findLastOccurrence(const std::vector<int>& arr, int target) {
    int low = 0;
    int high = arr.size() - 1;
    int result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid;
            low = mid + 1; // Keep searching on the right side
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return result;
}

int main() {
    std::vector<int> data = {1, 2, 2, 2, 3, 4, 4, 10, 10, 12};
    int target = 2;

    int first = findFirstOccurrence(data, target);
    int last = findLastOccurrence(data, target);

    if (first != -1) {
        std::cout << "Target " << target << " occurrences:" << std::endl;
        std::cout << "First occurrence index: " << first << std::endl;
        std::cout << "Last occurrence index: " << last << std::endl;
    } else {
        std::cout << "Target " << target << " not found." << std::endl;
    }

    return 0;
}
