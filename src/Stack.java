public class Stack<T extends Comparable<T>> {
    private final MyList<T> list;

    public Stack(MyList<T> list) {
        this.list = list;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return list.size();
    }

    public T top() {
        return list.getLast();
    }

    public void push(T element) {
        list.addLast(element);
    }

    public T pop() {
        T topElement = list.getLast();
        list.removeLast();
        return topElement;
    }
}