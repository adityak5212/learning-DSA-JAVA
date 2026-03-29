import java.util.*;
public class Main {
    public static void main(String[] args){


        LinkedList<String> linkedList = new LinkedList<String>();

        /*
        linkedList.push("A");
        linkedList.push("b");
        linkedList.push("c");
        linkedList.push("d");
        linkedList.push("f");
        linkedList.pop();
        */

        //LinkedList as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");


        System.out.println(linkedList);

    }
}