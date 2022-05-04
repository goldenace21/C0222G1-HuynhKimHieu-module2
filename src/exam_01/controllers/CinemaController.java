package exam_01.controllers;

import exam_01.services.MovieServiceImpl;

import java.util.Scanner;

public class CinemaController {
    public static Scanner scanner = new Scanner(System.in);
    public static MovieServiceImpl movieService = new MovieServiceImpl();
    public static void main(String[] args) {
        cinemaController();
    }

    public static void cinemaController() {
        while (true) {
            System.out.println("1: display");
            System.out.println("2: adNew");
            System.out.println("3: delete");
            System.out.println("4: exit");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    movieService.display();
                    break;
                case 2:
                    movieService.addNew();
                    break;
                case 3:
                    movieService.delete();
                    break;
                case 4:
                    return;
            }
        }
    }
}
