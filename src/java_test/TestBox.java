package java_test;

public class TestBox {
    public static void main(String[] args) {
        Box b1 = new Box<Double>(2.0);
        System.out.println(b1.getElement());

        Box b2 = new Box<Boolean>(true);
        System.out.println(b2.getElement());

        System.out.println();
    }
}
