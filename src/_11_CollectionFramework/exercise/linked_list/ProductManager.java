package _11_CollectionFramework.exercise.linked_list;

import java.util.*;

public class ProductManager {
    public static LinkedList<Product> listProduct = new LinkedList<>();

    public static void displayProduct() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i));
        }
    }

    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product obj = new Product(id, name, price);
        listProduct.add(obj);
        displayProduct();
    }

    public static void setProduct() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.remove(i);
                addProduct();
                break;
            }
        }
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product obj = new Product(id, name, price);
        listProduct.add(obj);
        displayProduct();
    }

    public static void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (i == index) {
                listProduct.remove(i);
            }
        }
        displayProduct();
    }

    public static void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        for (Product item : listProduct) {
            if (item.getName().equals(name)) {
                System.out.println(item);
            }
        }
    }

    public static void descending() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        displayProduct();
    }

    public static void upAscending() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        displayProduct();
    }
}
