package case_study.utils;

import static case_study.controllers.FuramaController.scanner;

public class ChooseException {
    public int checkChoose() {
        int temp = 0;
        boolean check = true;
        while (check) {
            try{
                System.out.println("Enter your choose: ");
                temp = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Number format exception");
            }
        }
        return temp;
    }
}
