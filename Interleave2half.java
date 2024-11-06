import java.util.*;
public class Interleave2half {
    public static void Interleave(Queue<Integer>q,Queue<Integer>firsthalf){
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
Queue<Integer>q=new LinkedList<>();
        Queue<Integer>firsthalf=new LinkedList<>();

q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
q.add(6);
q.add(7);
q.add(8);
q.add(9);
q.add(10);
Interleave(q,firsthalf);
while(!q.isEmpty()){
    System.out.println(q.remove()+" ");
}
System.out.println();

    }
    
}
