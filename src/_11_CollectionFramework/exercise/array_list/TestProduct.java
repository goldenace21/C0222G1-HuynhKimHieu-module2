package _11_CollectionFramework.exercise.array_list;

import java.util.Scanner;

import static _11_CollectionFramework.exercise.array_list.ProductManager.*;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product obj1 = new Product(1, "dog", 11000);
        Product obj2 = new Product(2, "rat", 12000);
        Product obj3 = new Product(3, "cat", 13000);
        listProduct.add(obj1);
        listProduct.add(obj2);
        listProduct.add(obj3);
        boolean flag = true;
        while (flag) {
            System.out.println("1: Display product");
            System.out.println("2: Add product");
            System.out.println("3: Set product");
            System.out.println("4: Remove product");
            System.out.println("5: Find product");
            System.out.println("6: Sort up ascending");
            System.out.println("7: Sort descending");
            System.out.println("8: Exit");
            System.out.println("Enter your choise: ");
            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    setProduct();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
                    upAscending();
                    break;
                case 7:
                    descending();
                    break;
                case 8:
                    flag = false;
            }
        }
    }
}
