package _15_exception_and_debug.exercise;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle edges: ");

        int edge1;
        int edge2;
        int edge3;
        try {
            System.out.println("Enter edge 1: ");
            edge1 = scanner.nextInt();
            System.out.println("Enter edge 2: ");
            edge2 = scanner.nextInt();
            System.out.println("Enter edge 3: ");
            edge3 = scanner.nextInt();
            triangleEdgeCheck(edge1, edge2, edge3);

        } catch (IllegalTriangleException | InputMismatchException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void triangleEdgeCheck(int edge1, int edge2, int edge3) throws IllegalTriangleException {
        if (edge1 + edge2 > edge3 &&
            edge2 + edge3 > edge1 &&
            edge1 + edge3 > edge2 &&
            edge1 > 0 &&
            edge2 > 0 &&
            edge3 > 0) {
            System.out.println("enter correctly");
        } else {
            throw new IllegalTriangleException("error enter");
        }
    }
}
