package exam_01.services;

import exam_01.models.Movie;
import exam_01.utils.RegexData;
import java.util.ArrayList;
import java.util.List;
import static exam_01.controllers.CinemaController.scanner;

public class MovieServiceImpl implements MovieService {
    public static RegexData regexData = new RegexData();
    public static List<Movie> movieList = new ArrayList<>();

    static {
        movieList.add(new Movie("CI-1234","Batman","12/05/2022",5));
        movieList.add(new Movie("CI-1235","Avatar","11/06/2022",4));

    }

    @Override
    public void display() {
        if (!movieList.isEmpty()) {
            for (Movie movie : movieList) {
                System.out.println(movie.toString());
            }
        } else {
            System.err.println("Empty list");
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter id: ");
        String id = RegexData.regexString(scanner.nextLine(),regexData.REGEX_ID,"correct format is CI-XXXX");
        if (isExisted(id) != null) {
            System.err.println("id is existed");
            return;
        }
        System.out.println("Enter name: ");
        String name = RegexData.regexString(scanner.nextLine(),regexData.REGEX_NAME,"correct format is Yy+");
        System.out.println("Enter show date: ");
        String showDate = RegexData.regexDate(scanner.nextLine(),regexData.REGEX_DATE);
        System.out.println("Enter quantity: ");
        int quantity = RegexData.checkQuantity(scanner.nextLine(),"quantity > 0");

        Movie tempMovie = new Movie(id,name,showDate,quantity);
        movieList.add(tempMovie);
        display();
    }

    @Override
    public void delete() {
        display();
            System.out.println("Enter id: ");
            String id = scanner.nextLine();
            for (Movie item: movieList) {
                if (item.getId().equals(id)) {
                    if (confirm()) {
                        movieList.remove(item);
                        display();
                        return;
                    } else {
                        System.err.println("cancel!");
                        return;
                    }
                }
            }
            System.err.println("id does not exist!");
    }

    @Override
    public boolean confirm() {
        int check;
        while (true) {
            try {
                System.out.println("Enter: 1-delete 2-cancel");
                check = Integer.parseInt(scanner.nextLine());
                if (check == 1) {
                    return true;
                } else if (check ==2) {
                    return false;
                }
            } catch (NumberFormatException e) {
                System.err.println("error format");
            }
        }
    }

    public Object isExisted(String id) {
        for (Movie movie : movieList) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }
}
