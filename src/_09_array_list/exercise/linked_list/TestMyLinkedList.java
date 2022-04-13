package _09_array_list.exercise.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("Minh");
        myLinkedList.addLast("Hoàng");
        myLinkedList.add(1, "hieu");
        myLinkedList.add(1, "hung");
        myLinkedList.printList();
//        myLinkedList.clear();
//        myLinkedList.printList();
//        System.out.println(myLinkedList.get(2));
//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
//        myLinkedList.remove(1);
//        System.out.println(myLinkedList.indexOf("Minh"));
//        myLinkedList.clone().printList();
//        System.out.println(myLinkedList.contain("Bình"));
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        myLinkedList.printList();
    }
}
