import javax.swing.*;
public class table {
    JFrame f;
    table(){
        f=new JFrame();
        String data[][]={ {"01","Basha","45"},
                {"02","Billa","36"},{"03","Ranga","27"},{"04","Petta vellan","Unknown"}
        };
        String column[]={"ID","NAME","AGE"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new table();
    }
}
