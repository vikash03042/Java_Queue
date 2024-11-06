import java.util.*;
public class DequeQu {
    // deque=double ended queue
    public static void main(String args[]){
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println("1st element is"+dq.getFirst());
        System.out.println("last element is"+dq.getLast());

    }
}
