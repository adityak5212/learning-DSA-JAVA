import java.util.*;
public class Main {
    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        //Priority Queue = A FIFO data structure that service elements
        //       with the highest priorities first
        //        before elements with lower priority

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("B");
        queue.offer("D");
        queue.offer("C");
        queue.offer("B");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}