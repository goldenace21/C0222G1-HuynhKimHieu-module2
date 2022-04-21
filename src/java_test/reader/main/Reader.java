package java_test.reader.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Reader {
    public static void main(String[] args) {
        File f = new File("java_test/writer/file.tx");
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while(true) {
                line = br.readLine();
                if ( line == null) {
                    break;
                } else {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
