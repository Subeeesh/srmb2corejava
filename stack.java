import java.util.ArrayDeque;
import java.util.Deque;

public class stack {

    public static void main(String[] args) {
        Deque<String> obj = new ArrayDeque<String>();

        obj.push("Bat");
        obj.push("Mat");
        obj.push("Cat");
        obj.push("Rat");
        obj.push("Hat");
        obj.push("Fat");
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);

    }

}
