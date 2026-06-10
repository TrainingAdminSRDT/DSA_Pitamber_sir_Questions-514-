#include <iostream>
#include <vector>


int linearSearch(const std::vector<int>& arr, int target) {
    for (size_t i = 0; i < arr.size(); ++i) {
        if (arr[i] == target) {
            return static_cast<int>(i);
        }
    }
    return -1;
}

int main() {
    std::vector<int> data = {10, 23, 45, 70, 11, 15};
    int searchElement = 70;

    int result = linearSearch(data, searchElement);

    if (result != -1) {
        std::cout << "Element " << searchElement << " found at index: " << result << std::endl;
    } else {
        std::cout << "Element " << searchElement << " not found in the list." << std::endl;
    }

    return 0;
}
