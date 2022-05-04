package exam_02.controllers;

import exam_02.manage.ManageSubjectImpl;

import java.util.Scanner;

public class CodegymController {
    public static Scanner scanner = new Scanner(System.in);
    public static ManageSubjectImpl manageSubject = new ManageSubjectImpl();
    public static void main(String[] args) {
        manageSubject.descending();
        manageSubject.display();
        manageSubject.ascending();
        manageSubject.display();

    }
}
