# C++ vs Java Cheat Sheet

| Feature | C++ | Java |
| :--- | :--- | :--- |
| **Approach** | Multi-paradigm (Procedural + OOP) | Mostly Object-Oriented |
| **Execution** | Compiled (Machine Code) | Compiled to Bytecode, then JIT Compiled |
| **Portability** | Platform Dependent (Compile for each OS) | Platform Independent ("Write Once, Run Anywhere") |
| **Memory Management**| Manual (`new`, `delete`) | Automatic (Garbage Collection) |
| **Pointers** | Supports direct pointer manipulation | No direct pointers (uses references internally) |
| **Multiple Inheritance**| Supported (Multiple classes) | Supported only through Interfaces |
| **Operator Overloading**| Supported | Not Supported |
| **Standard Library** | STL (Standard Template Library) | Java Class Library |
| **Main Function** | Outside any class | Inside a class |
| **Generics** | Templates (Compile-time) | Generics (Type Erasure at runtime) |

---

## Code Comparison

### 1. Hello World
**C++**
```cpp
#include <iostream>
int main() {
    std::cout << "Hello World";
    return 0;
}
```
**Java**
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### 2. Classes and Inclusion
**C++**
```cpp
#include <iostream>
class Car {
public:
    void drive() { std::cout << "Driving"; }
};
```
**Java**
```java
// No Header files, uses packages
public class Car {
    public void drive() {
        System.out.println("Driving");
    }
}
```

### 3. Strings
**C++**
```cpp
#include <string>
std::string name = "User";
```
**Java**
```java
String name = "User"; // Built-in Object
```

### 4. Memory Allocation
**C++**
```cpp
int* arr = new int[10];
delete[] arr; // Must be manually deleted
```
**Java**
```java
int[] arr = new int[10];
// Garbage collector handles deletion automatically
```

---

## Key Differences Summary
1. **Speed**: C++ is generally faster as it compiles to native code.
2. **Safety**: Java is safer due to lack of pointers and built-in bounds checking.
3. **Complexity**: C++ has more features (pointers, overloading, etc.) making it more complex to master.
4. **Use Case**:
   - **C++**: Systems programming, Game Dev, Embedded, High-performance apps.
   - **Java**: Enterprise apps, Android apps, Web backend, Big Data.
