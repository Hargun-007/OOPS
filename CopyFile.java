import java.io.*;

public class CopyFile {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        in = new FileInputStream("file_1.txt");
        out = new FileOutputStream("file_2.txt");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
    }
}
