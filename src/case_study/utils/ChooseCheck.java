package case_study.utils;

import static case_study.controllers.FuramaController.scanner;

public class ChooseCheck {
    public int chooseCheck(int numberMax) {
        int temp;
        while (true) {
            try {
                System.out.println("Enter your choose: ");
                temp = Integer.parseInt(scanner.nextLine());
                if (temp > 0 && temp <= numberMax) {
                    return temp;
                } else
                    System.err.println("Enter number 1-" + numberMax);
            } catch (NumberFormatException e) {
                System.err.println("Number format exception");
            }
        }
    }
}
