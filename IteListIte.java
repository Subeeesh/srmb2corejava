import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteListIte {
    public static void main(String args[])
    {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(45);
        arr.add(55);

        Iterator<Integer> iter = arr.iterator();

        while (iter.hasNext()){
            System.out.println("values: "+iter.next());
        }


        ListIterator<Integer> itr =  arr.listIterator();
        while (itr.hasNext()){
            System.out.println("values: "+itr.next());
        }
        while (itr.hasPrevious()) {
            System.out.println("values: "+itr.previous());
        }


    }
}