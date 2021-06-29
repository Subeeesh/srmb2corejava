
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import javax.swing.*;

class Case{

    public static void main (String[] args) {
        try
        {
            FileReader fr = new FileReader("C:\\Users\\subee\\Documents\\test\\input.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter out = (new PrintWriter(new FileWriter("C:\\Users\\subee\\Documents\\test\\final.txt")));
            String s="";
            while((s = br.readLine()) != null)
            {
                out.write(s.toUpperCase()+"\n");
            }
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
