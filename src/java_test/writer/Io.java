package java_test.writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Io {
    public static void main(String[] args) {
         try {
            PrintWriter pw = new PrintWriter("src/java_test/IoTest/file.txt");
            pw.print("du lieu");
            pw.print(3.14);
            pw.println(' ');

            Student st = new Student(100, "hieu");
            pw.println(st);

            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
