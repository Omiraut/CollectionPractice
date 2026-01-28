# Collection Practice - Java

A comprehensive Java project demonstrating the usage of various Collection Framework data structures with practical examples and exercises.

## 📋 Project Overview

This project provides hands-on examples of working with Java's Collection Framework, specifically focusing on three main collection types:
- **ArrayList** - Dynamic array implementation with index-based access
- **LinkedList** - Doubly-linked list implementation optimized for insertions/deletions
- **HashSet** - Hash table-based set implementation for unique elements

Perfect for learning and practicing Java Collections API fundamentals.

## 📁 Project Structure

```
CollectionPractice/
├── src/
│   ├── App.java                          # Main entry point
│   ├── arraylistexamples/                # ArrayList demonstrations
│   │   ├── CreatingArrayList.java
│   │   ├── PrintElementUsingPosition.java
│   │   ├── InsertAtFirstPosition.java
│   │   ├── RetriveElementByIndex.java
│   │   ├── SearchElement.java
│   │   ├── UpdateElement.java
│   │   ├── RemoveElement.java
│   │   ├── CopyArrayList.java
│   │   └── ExcerciseIterateList.java
│   ├── linkedlistexamples/               # LinkedList demonstrations
│   │   ├── AppendElement.java
│   │   ├── AddAtSpecificPosition.java
│   │   ├── AddOnSpecificPosition.java
│   │   ├── AddFristAndLastPosition.java
│   │   ├── CheckElement.java
│   │   ├── CheckIfEmpty.java
│   │   ├── IterateElement.java
│   │   ├── PrintPositionWithElement.java
│   │   ├── ItrateWithSpecificIndex.java
│   │   ├── IterateInReverce.java
│   │   ├── IndexOfSpecificElement.java
│   │   ├── RetriveFirstnLastElement.java
│   │   ├── RelpaceElement.java
│   │   ├── RemoveSpecificElement.java
│   │   ├── RemoveFirstLast.java
│   │   ├── RemoveAll.java
│   │   ├── SwapElements.java
│   │   └── ShuffelElements.java
│   └── hashsetexamples/                  # HashSet demonstrations
│       └── AppendElement.java
├── lib/                                  # External libraries
└── README.md                             # This file
```

## 🚀 Quick Start

### Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- **Visual Studio Code** with Java Extension Pack installed

### Installation

1. Clone or open this project in VS Code:
```bash
cd /home/omi/Practice/java/CollectionPractice
```

2. The project structure is ready to use—no additional setup required.

### Running Examples

**Option 1: Using VS Code**
- Open any `.java` file in the editor
- Right-click and select "Run" (requires Java Extension Pack)

**Option 2: Using Terminal**
```bash
# Compile
javac src/arraylistexamples/CreatingArrayList.java

# Run
java -cp src arraylistexamples.CreatingArrayList
```

**Option 3: Using VS Code Terminal**
```bash
cd /home/omi/Practice/java/CollectionPractice
javac -d bin src/arraylistexamples/CreatingArrayList.java
java -cp bin arraylistexamples.CreatingArrayList
```

## 📚 ArrayList Examples

ArrayList is a **resizable array** that maintains insertion order and allows fast random access.

| File | Description |
|------|-------------|
| CreatingArrayList.java | Creating and initializing ArrayList |
| PrintElementUsingPosition.java | Multiple iteration techniques |
| InsertAtFirstPosition.java | Adding elements at the beginning |
| RetriveElementByIndex.java | Accessing elements by index |
| SearchElement.java | Finding specific elements |
| UpdateElement.java | Modifying existing elements |
| RemoveElement.java | Deleting elements from the list |
| CopyArrayList.java | Copying elements between lists |
| ExcerciseIterateList.java | Practice with enhanced for-loops |

**Key Operations:**
```java
ArrayList<String> list = new ArrayList<>();
list.add("item");              // Add at end - O(1) amortized
list.add(0, "first");          // Add at index - O(n)
list.get(0);                   // Access by index - O(1)
list.remove(0);                // Remove by index - O(n)
list.contains("item");         // Search - O(n)
```

**Pros:** Fast random access, maintains order
**Cons:** Slow insertions/deletions in the middle

---

## 🔗 LinkedList Examples

LinkedList is a **doubly-linked list** optimized for frequent insertions and deletions at both ends.

| File | Description |
|------|-------------|
| AppendElement.java | Adding elements to the end |
| AddAtSpecificPosition.java | Inserting at specific index |
| AddFristAndLastPosition.java | Adding at beginning and end |
| CheckElement.java | Verifying element existence |
| CheckIfEmpty.java | Checking if list is empty |
| IterateElement.java | Forward iteration |
| IterateInReverce.java | Backward iteration with descendingIterator |
| IndexOfSpecificElement.java | Finding element positions |
| RetriveFirstnLastElement.java | Getting first/last elements safely |
| RelpaceElement.java | Updating elements at positions |
| RemoveSpecificElement.java | Removing by index or value |
| RemoveFirstLast.java | Removing from ends |
| RemoveAll.java | Clearing the entire list |
| SwapElements.java | Swapping positions using Collections |
| ShuffelElements.java | Randomizing element order |

**Key Operations:**
```java
LinkedList<String> list = new LinkedList<>();
list.add("item");              // Add at end - O(1)
list.addFirst("first");        // Add at beginning - O(1)
list.addLast("last");          // Add at end - O(1)
list.get(0);                   // Access - O(n)
list.removeFirst();            // Remove from start - O(1)
list.removeLast();             // Remove from end - O(1)
list.descendingIterator();     // Reverse iteration
```

**Pros:** Fast insertions/deletions at both ends, bidirectional iteration
**Cons:** Slow random access, more memory overhead

---

## #️⃣ HashSet Examples

HashSet is an **unordered collection** with unique elements backed by a hash table.

| File | Description |
|------|-------------|
| AppendElement.java | Adding elements and iterating |

**Key Operations:**
```java
HashSet<String> set = new HashSet<>();
set.add("item");               // Add - O(1) average
set.contains("item");          // Search - O(1) average
set.remove("item");            // Remove - O(1) average
set.clear();                   // Remove all
```

**Pros:** Fast add/remove/search, prevents duplicates
**Cons:** Unordered, no index-based access

---

## 🔄 Performance Comparison

| Operation | ArrayList | LinkedList | HashSet |
|-----------|-----------|-----------|---------|
| Access by index | O(1) | O(n) | N/A |
| Insert at beginning | O(n) | O(1) | N/A |
| Insert at end | O(1) | O(1) | O(1) |
| Remove from beginning | O(n) | O(1) | N/A |
| Search | O(n) | O(n) | O(1) avg |
| Memory | Lower | Higher | Moderate |

---

## 💡 Common Patterns

### Iteration Methods

**Enhanced For Loop (Recommended)**
```java
for (String item : list) {
    System.out.println(item);
}
```

**Traditional For Loop**
```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

**Iterator**
```java
Iterator<String> iter = list.iterator();
while (iter.hasNext()) {
    System.out.println(iter.next());
}
```

**Reverse Iteration (LinkedList)**
```java
Iterator<String> revIter = list.descendingIterator();
while (revIter.hasNext()) {
    System.out.println(revIter.next());
}
```

### Collections Utility Methods

```java
import java.util.Collections;

Collections.swap(list, 0, 1);      // Swap elements at two positions
Collections.shuffle(list);         // Randomize order
Collections.copy(dest, src);       // Copy elements
Collections.sort(list);            // Sort elements
Collections.reverse(list);         // Reverse order
```

---

## 📖 Best Practices

1. **Choose the Right Collection**
   - Use **ArrayList** for frequent lookups
   - Use **LinkedList** for frequent insertions/deletions at ends
   - Use **HashSet** for fast searching with unique values

2. **Null Handling**
   - ArrayList and HashSet: Can store null values
   - LinkedList: Allows nulls, but be careful with getFirst/getLast

3. **Concurrent Modification**
   - Use Iterator for safe removal during iteration
   - Don't use enhanced for-loop if modifying the list

4. **Memory Efficiency**
   - ArrayList: Lower memory overhead
   - LinkedList: Higher memory (extra pointers per element)
   - HashSet: Depends on load factor

5. **Thread Safety**
   - Collections are not synchronized by default
   - Use `Collections.synchronizedList()` for thread-safe versions

---

## 🎓 Learning Outcomes

After working through this project, you'll understand:
- ✅ Creation and initialization of ArrayList, LinkedList, and HashSet
- ✅ Adding, removing, and searching for elements
- ✅ Multiple iteration techniques
- ✅ Performance characteristics of each collection type
- ✅ When to use each collection type
- ✅ Utility methods from the Collections class
- ✅ Best practices for working with Java collections

---

## 📝 Notes

- Compiled `.class` files are stored in the `bin/` directory
- Project uses default Java package structure for organization
- All examples are self-contained and can run independently

---

## 🤝 Contributing

This is a learning/reference project. Feel free to extend with:
- Additional collection examples (TreeMap, PriorityQueue, etc.)
- Unit tests for each example
- Performance benchmarks
- Real-world use cases

---

## 📄 License

Educational project - Free to use and modify for learning purposes.

---

**Last Updated:** January 27, 2026  
**Java Version:** JDK 8+  
**IDE:** Visual Studio Code

Happy Learning! 🚀
