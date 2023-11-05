package Activity2Dastruct;

import java.util.*;
public class Main {

    static Scanner input = new Scanner(System.in);
    public  static Node front, rear;
    public static int s;
    public static class Node{
        int info;
        Node next;
    }

    public void main(){
        front = null;
        rear = null;
        s = 0;
    }

    public static boolean isempty(){
        return (s == 0);
    }

    public static void enqueue(int info){
        Node oldnode = rear;
        rear = new Node();
        rear.info = info;
        rear.next = null;
        if(isempty()){

            front = rear;
        }else{
            oldnode.next = rear;
        }
        s++;
        System.out.println(info+" Enqueued :) ");
        System.out.println();
    }

    public static void dequeue(){
        int info = front.info;
        front = front.next;
        if(isempty()){
        
            System.out.println("Voided Queue :( ");
            System.out.println();
            rear = null;
        }
        
        System.out.println("Element Dequeued :) ");
        System.out.println();
        s--;
    }

    public static void front(){
        if(isempty()){
            System.out.println();
            System.out.print("Voided Queue :( ");
            System.out.println();
        }else{
            System.out.println();
            System.out.print("Front is: "+front.info);
            System.out.println();
        }

    }

    public static void rear(){
        if(isempty()){
        
            System.out.println();
            System.out.println("Voided Queue :( ");
            System.out.println();

        }else {
        
            System.out.println();
            System.out.println("Rear is "+rear.info);
            System.out.println();
            
        }

    }

    public static void print(){
        if (isempty()) {
        
            System.out.println();
            System.out.println("Voided Queue :( ");
            System.out.println();
            
            return;
            
        }

        Node current = front;
        
        System.out.print("Queue: ");
        while (current != null) {
            
            System.out.print(current.info + " ");
            current = current.next;
            
            
        }
        
        System.out.println();

    }

    public static void  menu(){
        while(true) {
            System.out.println();
            System.out.println("******** Menu ********");
            System.out.println("* Type 1 for Enqueue *");
            System.out.println("* Type 2 for Dequeue *");
            System.out.println("* Type 3 for Front   *");
            System.out.println("* Type 4 for Rear    *");
            System.out.println("* Type 5 for Print   *");
            System.out.println("**********************");
            System.out.println();
            
            System.out.print("Type your number of choice: ");
            int choose = input.nextInt();
            Choose(choose);
        }
    }

    public static Node Choose(int choose){

            if (choose == 1) {
                System.out.println();
                System.out.print("Enter an element to be Enqueued: ");
                int num = input.nextInt();
                enqueue(num);
            } else if (choose == 2) {
                dequeue();
            } else if (choose == 3) {
                front();
            } else if (choose == 4) {
                rear();
            } else if (choose == 5) {
                print();
            }
            else{
              
              System.out.println();
              System.out.println("Invalid!");
              System.exit(0);
              
              
            }
            return front;

    }

    public static void main(String[] args) {
        menu();
    }
}