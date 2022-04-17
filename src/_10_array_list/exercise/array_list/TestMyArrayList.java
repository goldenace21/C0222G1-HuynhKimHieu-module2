package _10_array_list.exercise.array_list;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> numberList = new MyArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        System.out.println(numberList);
        numberList.remove(2);
        System.out.println(numberList);
        System.out.println(numberList.get(1));
        numberList.add(99,1);
        System.out.println(numberList);

        for (int i =0;i< numberList.size();i++) {
            System.out.print(numberList.get(i));
            if ( i< numberList.size()-1)
            System.out.print(", ");
        }
        System.out.println();
        numberList.clear();
        System.out.println(numberList);

    }
}
