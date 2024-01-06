# Custom List Implementation

This project demonstrates a custom list implementation in Java without using the collection classes.

## Interfaces

### `IMyList<T>`

```java
public interface IMyList<T> {
    int size();
    int getCapacity();
    void add(T data);
    T get(int index);
    T remove(int index);
    T set(int index, T data);
    String toString();
    int indexOf(T data);
    int lastIndexOf(T data);
    boolean isEmpty();
    T[] toArray();
    void clear();
    MyList<T> subList(int start, int finish);
    boolean contains(T data);
}


Implementation

MyList<T>

import java.util.Arrays;

public class MyList<T> implements IMyList<T> {
    // ... (implementation details)
}


Example Usage

Main.java

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java102 - Making Your Own List Class
            Make your own list class without using the collection class.
         */

        // Patika.Dev EXAMPLE:
        MyList<Integer> list = new MyList<>();
        // ... (example usage details)
    }
}

Features

. Dynamic resizing of the array
. Adding, removing, and updating elements
. Sublist creation
. Index-based operations
. Checking if the list is empty
. Converting the list to an array
. Clearing the list