package exam_01.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static case_study.controllers.FuramaController.scanner;

public class RegexData {
    public final String REGEX_ID = "^(CI-)[1-9]{4}$";
    public final String REGEX_NAME = "[A-Z][a-z]+";
    public final String REGEX_DATE = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";

    public static String regexString(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.err.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static int checkQuantity(String number, String error) {
        try {
            int quantity = Integer.parseInt(number);
            if (quantity < 1) throw new NumberFormatException();
            return quantity;
        }
        catch (NumberFormatException e) {
            System.out.println(error);
            return checkQuantity(scanner.nextLine(), error);
        }
    }

    public static String regexDate(String temp, String regex) {
        while (true) {
                if (temp.matches(regex)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int currentDay = Period.between(now, date).getDays();
                    if (currentDay > 0) {
                        return temp;
                    } else {
                        System.err.println("day > " + now.toString());
                    }
                } else {
                    System.err.println("Error format date");
                }
            System.out.println("Enter date again: ");
            temp = scanner.nextLine();
        }
    }
}

