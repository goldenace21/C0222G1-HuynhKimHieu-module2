package exam_01.utils;

import java.io.*;
import java.util.List;

public class IOData {

    public final String CUSTOMER_FILE = "";
//    public static boolean writeToCSV(Movie movie) {
//        try {
//            FileWriter fileWriter = new FileWriter("src/exam_01/data/movies.csv", true);
//            fileWriter.write(movie.toString() + "\n");
//            fileWriter.close();
//            return true;
//        } catch (IOException e) {
//            return false;
//        }
//    }
//
//    public static List<Movie> readFromCSV() throws IOException {
//        List<Movie> movieList = new ArrayList<>();
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/exam_01/data/movies.csv"));
//
//        String movie;
//        while ((movie = bufferedReader.readLine()) != null) {
//            String[] movieAttr = movie.split(",");
//            movieList.add(new Movie(movieAttr[0], movieAttr[1], movieAttr[2], Integer.parseInt(movieAttr[3])));
//        }
//
//        bufferedReader.close();
//        return movieList;
//    }

    public static void writeToCSV(List<Object> list, String file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Object item:list) {
                bw.write(item.toString() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
