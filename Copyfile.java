import java.io.FileInputStream;
import java.io.FileOutputStream;

class Copyfile {
    public static void main(String[] args) {

        byte[] array = new byte[50];
        try {
            FileInputStream sourceFile = new FileInputStream("C:\\Users\\subee\\Documents\\test\\input.txt");
            FileOutputStream destFile = new FileOutputStream("C:\\Users\\subee\\Documents\\test\\final.txt");

            // reads all data from input.txt
            sourceFile.read(array);

            // writes all data to newFile
            destFile.write(array);
            System.out.println("The input.txt file is copied to newFile.");

            // closes the stream
            sourceFile.close();
            destFile.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}