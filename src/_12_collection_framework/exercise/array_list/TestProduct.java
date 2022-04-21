package _12_collection_framework.exercise.array_list;

import java.io.File;
import java.util.Scanner;

import static _12_collection_framework.exercise.array_list.ProductManager.*;

public class TestProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product obj1 = new Product(1, "pen", 11000);
        Product obj2 = new Product(2, "book", 12000);
        Product obj3 = new Product(3, "ruler", 13000);

        listProduct.add(obj1);
        listProduct.add(obj2);
        listProduct.add(obj3);

        boolean flag = true;
        while (flag) {
            System.err.println("1: Display product" + "\n" +
                               "2: Add product" + "\n" +
                               "3: Set product" + "\n" +
                               "4: Remove product" + "\n" +
                               "5: Find product" + "\n" +
                               "6: Sort ascending" + "\n" +
                               "7: Sort descending" + "\n" +
                               "8: Write product to text" + "\n" +
                               "9: Read product from text" + "\n" +
                               "10: Exit" + "\n" +
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
                    String filePath1 = "src/_12_collection_framework/exercise/array_list/text";
                    File file1 = new File(filePath1);
                    writeObj(file1);
                    break;
                case 9:
                    String filePath2 = "src/_12_collection_framework/exercise/array_list/text";
                    File file2 = new File(filePath2);
                    readObj(file2);
                    break;
                case 10:
                    flag = false;
            }
        }
    }
}
