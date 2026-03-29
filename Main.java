import java.util.Stack;
public class Main {
    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty());

        stack.push("freefire");
        stack.push("Templerun");
        stack.push("minimilittia");
        stack.push("GTA");
        stack.push("Carrace");

        String pop = stack.pop();


        System.out.println(stack);
    }
}