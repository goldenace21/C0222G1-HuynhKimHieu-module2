package case_study.utils;

import static case_study.controllers.FuramaController.scanner;

public class FacilityRegex {

    public static final String REGEX_NAME = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_STYLE_RENTAL = "^(day|hour|month|year)$";
    public static final String REGEX_ROOM_STANDARD = "^(standard|vip)$";
    public static final String REGEX_FLOOR = "^[1-9]|([1-9][0-9])$";
    public static final String REGEX_FREE_SERVICE = "^(service)$";
    public static final String REGEX_DATEOFBIRTH = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
    public static final String REGEX_PHONENUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
    public static final String REGEX_EMAILGG = "^[a-z0-9]+(?!.*(?:\\+{2,}|\\-{2,}|\\.{2,}))(?:[\\.+\\-]{0,1}[a-z0-9])*@gmail\\.com$";

    public String enterIdVila() {
        System.out.println("Enter id villa: ");
        return RegexData.regexString(scanner.nextLine(),REGEX_ID_VILLA,"correct format is SVVL-YYYY");
    }

    public String enterIdHouse() {
        System.out.println("Enter id house: ");
        return RegexData.regexString(scanner.nextLine(),REGEX_ID_HOUSE,"correct format is SVHO-YYYY");
    }

    public String enterIdRoom() {
        System.out.println("Enter id room: ");
        return RegexData.regexString(scanner.nextLine(),REGEX_ID_ROOM,"correct format is SVRO-YYYY");
    }

    public String enterName() {
        System.out.println("Enter name: ");
        return RegexData.regexString(scanner.nextLine(), REGEX_NAME,"correct format is Xxxx...");
    }

    public String enterRentalPeople() {
        System.out.println("Enter Rental people: ");
        return RegexData.regexString(scanner.nextLine(),REGEX_AMOUNT,"correct format is 1-20");
    }

    public Double enterArea() {
        boolean check = true;
        double area = 0;
        do {
            try {
                System.out.println("Enter area use/pool: ");
                area = Double.parseDouble(scanner.nextLine());
                if (area>30) {
                    check = false;
                } else {
                    System.err.println("area > 30");
                }
            }catch (Exception e) {
                e.printStackTrace();
                check = true;
            }
        } while (check);
        return area;
    }

    public Double enterPrice() {
        boolean check = true;
        double price = 0;
        do {
            try {
                System.out.println("Enter price: ");
                price = Double.parseDouble(scanner.nextLine());
                if (price > 0) {
                    check = false;
                } else {
                    System.err.println("area > 30");
                }
            } catch (Exception e) {
                e.printStackTrace();
                check = true;
            }
        } while (check);
        return price;
    }

    public String enterStyleRental() {
        System.out.println("Enter style rental: ");
        return RegexData.regexString(scanner.nextLine(),REGEX_STYLE_RENTAL,"correct format is day|hour|month|year");
    }

    public String enterRoomStandard() {
        System.out.println("Enter room Standard");
        return RegexData.regexString(scanner.nextLine(),REGEX_ROOM_STANDARD,"correct format is vip|standard");
    }

    public String enterFloor() {
        System.out.println("Enter floor: ");
        return RegexData.regexString(scanner.nextLine(),REGEX_FLOOR,"correct format is 1-99");
    }

    public String enterFreeService() {
        System.out.println("Enter sevice: ");
        return RegexData.regexString(scanner.nextLine(),REGEX_FREE_SERVICE,"correct format is \"service\" ");
    }
}
