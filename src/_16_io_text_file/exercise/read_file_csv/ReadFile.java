package _16_io_text_file.exercise.read_file_csv;

import _12_collection_framework.exercise.array_list.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "src/_16_io_text_file/exercise/read_file_csv/nation.csv";
        File file = new File(filePath);
        readObj(file);
    }

    public static void readObj(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Product product = null;
            String line = "";
            while((line= br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
