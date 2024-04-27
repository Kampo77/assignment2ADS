import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
        Stack<Integer> stack = new Stack<>();
    }

    private static void testArrayList() {
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        arrayList.addFirst(5);
        arrayList.addLast(40);

        arrayList.set(100, 2);

        arrayList.removeFirst();
        arrayList.removeLast();

        arrayList.indexOf(20);
        arrayList.lastIndexOf(20);

        arrayList.exists(30);

        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.print(arrayListIterator.next() + " ");
        }
        System.out.println();
    }

    private static void testLinkedList() {
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.addFirst("Welcome");

        linkedList.addLast("!");

        linkedList.remove(1);

        System.out.println(linkedList.indexOf("World"));
        System.out.println(linkedList.lastIndexOf("Hello"));

        System.out.println(linkedList.exists("Welcome"));

        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.print(linkedListIterator.next() + " ");
        }
        System.out.println();
    }
}
