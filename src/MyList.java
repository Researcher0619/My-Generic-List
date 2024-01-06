import java.util.Arrays;

public class MyList<T> implements IMyList<T> {

    private int size = 0;
    private int capacity;
    T[] array;
    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(T data) {
        if(size == capacity){

            int newCapacity = capacity * 2;
            array = Arrays.copyOf(array, newCapacity);
            capacity = newCapacity;
        }
        array[size++] = data;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size) return null;
        return array[index];
    }

    @Override
    public T remove(int index) {
        if(index < 0 || index >= size) return null;

        T removedItem = array[index];
        array[index] = null;
        for (int i = index + 1; i < size; i++) {
            if(array[i] != null) {
                array[i-1] = array[i];
                array[i] = null;
            }
        }
        size--;
        return removedItem;
    }

    @Override
    public T set(int index, T data) {
        if(index < 0 || index >= size) return null;

        array[index] = data;
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int indexOf(T data) {

        for (int i = 0; i < size; i++) {
            if(data.equals(array[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0 ; i--) {
            if(data.equals(array[i])) return i;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T[] toArray() {
        return (T[]) Arrays.copyOf(array, size);
    }

    @Override
    public void clear() {
        Arrays.fill(array,null);
        size = 0;
    }

    @Override
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            throw new IndexOutOfBoundsException();
        }
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(get(i));
        }
        return subList;
    }

    @Override
    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if(data.equals(array[i])) return true;
        }
        return false;
    }
}