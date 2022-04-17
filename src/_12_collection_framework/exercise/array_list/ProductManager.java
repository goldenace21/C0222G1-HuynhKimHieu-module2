package _12_collection_framework.exercise.array_list;

import java.util.*;

public class ProductManager {
    public static List<Product> listProduct = new ArrayList<>();
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
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
        Product obj = createObj();
        for (int i = 0; i < listProduct.size(); i++) {
            if (i == listProduct.size() - 1 && listProduct.get(i).getId() != obj.getId()) {
                listProduct.add(obj);
                displayProduct();
                break;
            } else if (listProduct.get(i).getId() != obj.getId()) {
                continue;
            } else {
                System.out.println("id already exists!");
                break;
            }
        }
    }

    public static void setProduct() {
        System.err.println("Enter index: ");
        int index = Integer.parseInt(scanner.nextLine());
        Product obj = createObj();
        for (int i = 0; i < listProduct.size(); i++) {
            if (i == index) {
                for (int j = 0;j< listProduct.size();j++) {
                    if (j == listProduct.size() - 1 && listProduct.get(j).getId() != obj.getId()
                          || listProduct.get(index).getId() == obj.getId()) {
                                 listProduct.set(i, obj);
                                 displayProduct();
                                 break;
                    } else if (listProduct.get(j).getId() != obj.getId()) {
                        continue;
                    } else {
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
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.remove(i);
                displayProduct();
                break;
            }
        }
    }

    public static void findProduct() {
        System.err.println("Enter name");
        String name = scanner.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().contains(name)) {
                System.out.println(listProduct.get(i));
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

    public static void ascending() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        displayProduct();
    }
}
