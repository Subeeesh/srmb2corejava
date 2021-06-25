package stud;


import java.util.Scanner;

class Mark extends Exception {
    private int mark;
    Mark(int mark) {
        this.mark=mark;
    }

    public Mark() {

    }

    public String toString() {
        return ("mark not valid"+" "+mark);
    }
}

public class Student {

    String stud_name;
    int rollno,marks;
    Scanner sc = new Scanner(System.in);


    void getdata()
    {
        System.out.println("Enter Name of the Student:");
        stud_name = sc.nextLine();
        System.out.println("Enter roll no:");
        rollno = sc.nextInt();
        System.out.println("Enter Marks:");
        marks = sc.nextInt();

    }

    void display(){
        System.out.println(stud_name + "  has scored  " + marks + " marks" );
    }

    public static void main(String args[]){

        Student st = new Student();

        Mark m = new Mark();

        st.getdata();

        try {
            if (st.marks < 0 || st.marks > 100) {

                 throw new Mark(st.marks);

            }
            else
            {
                st.display();
            }

        }catch (Exception e)
        {
            System.out.println(e + " " + ". The marks you have entered are out of bounds");
        }









    }




}
