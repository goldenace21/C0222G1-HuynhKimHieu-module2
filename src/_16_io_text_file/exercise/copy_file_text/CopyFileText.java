package _16_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class CopyFileText {
    public static void main(String[] args) {
        File f = new File("src/_16_io_text_file/exercise/copy_file_test/Soure");
        try {
            PrintWriter pw = new PrintWriter("src/_16_io_text_file/exercise/copy_file_test/Target");
            try {
                BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
                String line = null;
                while(true) {
                    line = br.readLine();
                    if ( line == null) {
                        break;
                    } else {
                        pw.println(line);
                    }
                }
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
