package java_test;

public class Box<E> {
    private E element;

    public Box(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

}
