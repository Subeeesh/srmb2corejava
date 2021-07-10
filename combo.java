import javax.swing.*;
public class combo {
    JFrame f;
    combo(){
        f=new JFrame("Choose your character...");
        String country[]={"SUBZERO","SCORPIAN","JHONNY CAGE","SONIA BLADE","RAIDEN"};
        JComboBox cb=new JComboBox(country);
        cb.setBounds(50, 50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new combo();
    }
}