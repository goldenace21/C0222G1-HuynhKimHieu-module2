package _17_io_binary_file_serialization.exercise.manege_product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRun {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> listProduct = new ArrayList<>();
    public static File file = new File("src/_17_io_binary_file_serialization/exercise/ManegeProduct/Text.txt");
    public static String stringPath = file.getAbsolutePath();

     static {
        listProduct.add(new Product(1, "santafe", "hyundai", 10000)) ;
        listProduct.add(new Product(2, "k5", "kiA", 14000)) ;
        listProduct.add(new Product(3, "luxA", "vinFast", 12000)) ;

     }

    public static void main(String[] args) {
        write(stringPath,listProduct);
        boolean flag = true;
        while (flag) {
            System.out.println("1: Display");
            System.out.println("2: Add");
            System.out.println("3: Search");
            System.out.println("4: Exit");
            System.out.println("Enter choose:");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    display();
                    break;
                case 2:
                    addObject();
                    break;
                case 3:
                    findByName();
                    break;
                case 4:
                    flag = false;
            }
        }
    }

    public static void display() {
        List<Product> list = read();
        for (Product item: list) {
            System.out.println(item);
        }
    }

    public static Product add() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        write(stringPath, listProduct);
        return new Product(id, name, brand, price);
    }

    public static void findByName() {
         List<Product> products = read();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        for (Product item : products) {
            if (item.getName().contains(name)) {
                System.out.println(item);
            }
        }
    }

    public static void write(String path, List<Product> list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path, false);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> read() {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(stringPath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void addObject() {
         List<Product> list = read();
         Product product = add();
         list.add(product);
         write(stringPath,list);
    }
}
