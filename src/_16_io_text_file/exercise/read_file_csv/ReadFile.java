package _16_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "src/_16_io_text_file/exercise/read_file_csv/Nation.csv";
        List<String []> listString = readFile(filePath);
        display(listString);
    }
    public static void display(List<String[]> listString) {
        List<Nation> nationList = new ArrayList<>();
        Nation nation;
        for (String[] item : listString) {
            nation = new Nation(Integer.parseInt(item[0]),item[1],item[2]);
            nationList.add(nation);
        }
        for (Nation item : nationList) {
            System.out.println(item.toString());
        }
    }

    public static List<String[]> readFile(String path) {
        List<String []> listString = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader((new FileReader(path)));
            String line = "";
            while((line = br.readLine()) != null) {
                String[] array = line.split(",");
                listString.add(array);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listString;
    }


}
