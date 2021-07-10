import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
public class Digital {
    JFrame f;

    int hours=0, minutes=0, seconds=0;
    String timeString = "";
    JButton b;

    Digital(){
        f=new JFrame();



        b=new JButton();
        b.setBounds(100,100,100,100);

        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void display() {

        while (true) {

            Calendar cal = Calendar.getInstance();
            hours = cal.get( Calendar.HOUR_OF_DAY );
            if ( hours > 12 ) hours -= 12;
            minutes = cal.get( Calendar.MINUTE );
            seconds = cal.get( Calendar.SECOND );

            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
            Date date = cal.getTime();
            timeString = formatter.format( date );

            printTime();


        }

    }

    public void printTime(){
        b.setText(timeString);
    }

    public static void main(String[] args) {
        new Digital();

        Digital ref=new Digital();
        ref.display();

    }
}