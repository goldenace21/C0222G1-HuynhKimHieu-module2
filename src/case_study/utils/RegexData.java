package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static case_study.controllers.FuramaController.scanner;

public class RegexData {
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

    public static String regexAge(String temp, String regex){
        boolean check = true;
        while(check) {
            try {
                if (temp.matches(regex)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp,formatter);
                    LocalDate now = LocalDate.now();
                    int currentYear = Period.between(age,now).getYears();
                    if (currentYear<100 && currentYear>18) {
                        check = false;
                    } else {
                        throw new AgeException("18 < age < 100");
                    }
                } else {
                    throw new AgeException("Error format age");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}

