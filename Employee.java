import java.util.LinkedList;

class details{
    private String eno;
    private String name;
    private String desi;

    details(String eno,String name,String desi){
        this.eno=eno;
        this.name=name;
        this.desi=desi;
    }
    public String toString(){
        return("Employee no: "+eno+" "+"Employee name: "+name+" "+"Designation: "+desi);
    }

}
public class Employee {

    public static void main(String[] args) {

        LinkedList<details> ref=new LinkedList<details>();
        ref.add(new details("A121","Amal","Dev"));
        ref.add(new details("A122","Ashok","Dev"));
        ref.add(new details("A123","Arun","Tes"));

        for(details det:ref){
            System.out.println(det);
        }


    }

}
