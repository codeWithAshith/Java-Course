package l.file.B_file;

import java.io.*;

public class B_File {
    public static void main(String[] args) {
        String file = "src/main/java/l/file/dummy.txt";
        String copyFile = "src/main/java/l/file/copy.txt";

        //read
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            reader.close();
            System.out.println(currentLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //append
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Spain");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //copy
        File copied = new File(copyFile);
        try (
                InputStream in = new BufferedInputStream(new FileInputStream(file));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(copied))) {

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
