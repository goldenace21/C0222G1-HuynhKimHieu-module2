package exam_01.utils;

import exam_01.models.Movie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOData {
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

    public static void writeToCSV(List<Object> list, File file) {

    }
}
