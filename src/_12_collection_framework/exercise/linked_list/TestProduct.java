package _12_collection_framework.exercise.linked_list;

import java.util.Scanner;

import static _12_collection_framework.exercise.array_list.ProductManager.*;
import static _12_collection_framework.exercise.linked_list.ProductManager.linkedProduct;

public class TestProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product obj1 = new Product(1, "pen", 11000);
        Product obj2 = new Product(2, "book", 12000);
        Product obj3 = new Product(3, "ruler", 13000);

        linkedProduct.add(obj1);
        linkedProduct.add(obj2);
        linkedProduct.add(obj3);

        boolean flag = true;
        while (flag) {
            System.err.println("1: Display product" + "\n" +
                               "2: Add product" + "\n" +
                               "3: Set product" + "\n" +
                               "4: Remove product" + "\n" +
                               "5: Find product" + "\n" +
                               "6: Sort ascending" + "\n" +
                               "7: Sort descending" + "\n" +
                               "8: Exit" + "\n" +
                               "Enter your choose: ");
            int choose = scanner.nextInt();
            switch (choose) {
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
                    ascending();
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
