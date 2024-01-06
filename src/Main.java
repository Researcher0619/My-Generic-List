public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java102 - Making Your Own List Class
            Make your own list class without using the collection class.
         */

        // Patika.Dev EXAMPLE:
        MyList<Integer> list = new MyList<>();
        System.out.println("List Status: " + (list.isEmpty() ? "Empty" : "Not Empty"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List Status: " + (list.isEmpty() ? "Empty" : "Not Empty"));

        // Returns the first index it finds
        System.out.println("Index: " + list.indexOf(20));

        // Returns -1 if not found
        System.out.println("Index: " + list.indexOf(100));

        // Returns the last index it finds
        System.out.println("Index: " + list.lastIndexOf(20));

        // Returns the list as an Object[] array
        Object[] array = list.toArray();
        System.out.println("First element of the Object array: " + array[0]);

        // Creates a sublist of the list with the same data type
        MyList<Integer> subList = list.subList(0, 3);
        System.out.println(subList.toString());

        // Checks if a value is in the list
        System.out.println("Is 20 in the list? : " + list.contains(20));
        System.out.println("Is 120 in the list? : " + list.contains(120));

        // Clears the list completely and sets it to the default size
        list.clear();
        System.out.println(list);

        System.out.println("***********************************************");

        list.clear();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Value at index 2: " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("Value at index 2: " + list.get(2));
        System.out.println(list);

        System.out.println("***********************************************");

        list.clear();
        System.out.println("Number of elements in the array: " + list.size());
        System.out.println("Capacity of the array: " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of elements in the array: " + list.size());
        System.out.println("Capacity of the array: " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Number of elements in the array: " + list.size());
        System.out.println("Capacity of the array: " + list.getCapacity());
    }
}
