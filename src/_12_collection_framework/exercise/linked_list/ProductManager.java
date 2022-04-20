package _12_collection_framework.exercise.linked_list;

import java.util.*;

public class ProductManager {
    public static List<Product> linkedProduct = new LinkedList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static Product createObj() {
        System.err.println("Enter product id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.err.println("Enter product name: ");
        String name = scanner.nextLine();
        System.err.println("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());
        return new Product(id, name, price);
    }

    public static void displayProduct() {
        for (Product product : linkedProduct) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        Product obj = createObj();
        for (int i = 0; i < linkedProduct.size(); i++) {
            if (i == linkedProduct.size() - 1 && linkedProduct.get(i).getId() != obj.getId()) {
                linkedProduct.add(obj);
                displayProduct();
                break;
            } else if (linkedProduct.get(i).getId() == obj.getId()) {
                System.out.println("id already exists!");
                break;
            }
        }
    }

    public static void setProduct() {
        System.err.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product obj = createObj();
        for (int i = 0; i < linkedProduct.size(); i++) {
            if (linkedProduct.get(i).getId() == id) {
                for (int j = 0;j< linkedProduct.size();j++) {
                    if (j == linkedProduct.size() - 1 && linkedProduct.get(j).getId() != obj.getId()
                          || linkedProduct.get(i).getId() == obj.getId()) {
                                 linkedProduct.set(i, obj);
                                 displayProduct();
                                 break;
                    } else if (linkedProduct.get(j).getId() == obj.getId()) {
                        System.out.println("id already exists!");
                        break;
                    }
                }
            }
        }
    }

    public static void removeProduct() {
        System.err.println("Enter id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < linkedProduct.size(); i++) {
            if (linkedProduct.get(i).getId() == id) {
                linkedProduct.remove(i);
                displayProduct();
                break;
            }
        }
    }

    public static void findProduct() {
        System.err.println("Enter name");
        String name = scanner.nextLine();
        for (int i = 0; i < linkedProduct.size(); i++) {
            if (linkedProduct.get(i).getName().contains(name)) {
                System.out.println(linkedProduct.get(i));
            }
        }
    }

    public static void descending() {
        Collections.sort(linkedProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        displayProduct();
    }

    public static void ascending() {
        Collections.sort(linkedProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        displayProduct();
    }
}
