# C++ for Java Developers: A Comprehensive Guide

This guide is designed for Java developers who want to transition to C++. It highlights the mental shifts required and provides detailed code comparisons.

---

## 1. The Core Mental Shift
In Java, the JVM manages almost everything (memory, platform independence, safety). In C++, **you are in control**.
- **Java**: Write Once, Run Anywhere (Bytecode + JVM).
- **C++**: Write Once, Compile Everywhere (Native Machine Code).
- **Memory**: Java has a Garbage Collector; C++ uses manual management or "Smart Pointers".

---

## 2. Program Structure & Execution
### Header Files vs. Packages
Java uses `import` to bring in classes. C++ uses `#include` to copy-paste definitions from "Header Files" (`.h` or `.hpp`).

**Java:**
```java
import java.util.ArrayList;
```

**C++:**
```cpp
#include <iostream> // System header
#include "MyClass.h" // Local header
```

### The `main` Function
In Java, `main` must be inside a class. In C++, it is a global function.

**C++:**
```cpp
#include <iostream>

int main(int argc, char* argv[]) {
    std::cout << "Hello C++" << std::endl;
    return 0; // Success code
}
```

---

## 3. Memory Management (The Hard Part)
This is the biggest hurdle for Java developers.

### Stack vs. Heap
- **Java**: Almost everything (`new Object()`) is on the Heap.
- **C++**: You choose.
  - `Object obj;` -> **Stack** (Automatically destroyed when out of scope). **Prefer this!**
  - `Object* obj = new Object();` -> **Heap** (Stays until you `delete` it).

### Pointers vs. References
- **Pointers (`*`)**: Stores a memory address. Can be `nullptr`. Must be dereferenced with `->`.
- **References (`&`)**: An alias for an existing variable. Cannot be null. Used like a normal object with `.`.

**Comparison:**
```cpp
int x = 10;
int* ptr = &x;  // ptr holds address of x
int& ref = x;   // ref is just another name for x

*ptr = 20;      // x is now 20
ref = 30;       // x is now 30
```

---

## 4. Object-Oriented Programming (OOP)
### Class Definition
In C++, you typically split classes into:
1. **Header (`.h`)**: Declarations (signatures).
2. **Source (`.cpp`)**: Implementations (logic).

### Inheritance & Access
```cpp
class Parent {
public:
    virtual void sayHello() { // 'virtual' allows overriding (like Java by default)
        std::cout << "Hello from Parent";
    }
};

class Child : public Parent { // Note 'public' inheritance
public:
    void sayHello() override {
        std::cout << "Hello from Child";
    }
};
```

---

## 5. The Standard Template Library (STL)
The STL is C++'s version of the Java Collections Framework.

| Java | C++ (STL) |
| :--- | :--- |
| `ArrayList<T>` | `std::vector<T>` |
| `HashMap<K, V>` | `std::unordered_map<K, V>` |
| `HashSet<T>` | `std::unordered_set<T>` |
| `String` | `std::string` |

**Example usage:**
```cpp
#include <vector>
#include <string>

std::vector<std::string> names;
names.push_back("Alice"); // like .add()
std::string first = names[0]; // like .get(0)
```

---

## 6. Pro-Tips for Java Developers
1. **Avoid `new`**: If you can do `MyClass obj;` instead of `MyClass* obj = new MyClass();`, do it. It's faster and safer.
2. **Use `std::string`**: Don't use C-style `char*` unless absolutely necessary.
3. **Smart Pointers**: If you *must* use the heap, use `std::unique_ptr` or `std::shared_ptr` from `#include <memory>`. They work like a mini-Garbage Collector for that specific object.
4. **Const Everything**: Use `const` for parameters that shouldn't change. It helps the compiler optimize.
5. **Namespace**: Use `std::` prefix or `using namespace std;` (though prefix is better practice).

---

## 7. Basic Comparison Summary
| Feature | Java | C++ |
| :--- | :--- | :--- |
| Boolean | `boolean` | `bool` |
| Printing | `System.out.println()` | `std::cout << ... << std::endl;` |
| Null | `null` | `nullptr` (or `NULL` in old code) |
| Size of types | Fixed (e.g., int is 32-bit) | Platform dependent (use `sizeof()`) |
| Exceptions | Checked & Unchecked | All Unchecked |
