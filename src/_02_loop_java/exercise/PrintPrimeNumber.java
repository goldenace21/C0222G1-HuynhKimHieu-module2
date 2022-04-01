package _02_loop_java.exercise;

public class PrintPrimeNumber {
    public static void main(String[] args) {
            int a = 2;
        while (true){
            boolean check = true;
            for (int i =2; i<a;i++){
                if(a % i ==0){
                    check= false;
                    break;
                }
            }
            if (check){
                System.out.println(a);
            }
            a++;
            if (a>100) {
                break;
            }
        }
    }
}
