import java.util.Scanner;

class Link {
    public String dData;
    public Link next;


    public Link(String a) {
        dData = a;
    }

    public void displayLink() {
        System.out.println( dData + " " );
    }
}

class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(String aa) {
        Link newLink = new Link( aa );
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public int theSize(){
        Link current = first;
        int i =0;
        while (current != null) {
            current = current.next;
            i++;
        }
        return i;
    }

    public String deleteFirst() {
        String temp = first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public String displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        return " ";
    }

    public String peek() {
        return first.dData;
    }

    public String poll() {
        String tempData = first.dData;
        first = first.next;
        return tempData;
    }
}

class Queue {
    public FirstLastList theList;

    public Queue() {
        theList = new FirstLastList();
    }

    public int size(){
        return theList.theSize();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void enqueue(String j) {
        theList.insertLast( j );
    }

    public String dequeue() {
        return theList.deleteFirst();
    }

    public String displayQueue() {
        System.out.print( "Queue (head-->Tail) : " );
        return theList.displayList();
    }

    public String displayPeek() {
        return theList.peek();
    }

    public String displayPoll() {
        return theList.poll();
    }

    public void menu(){
        System.out.println("Attendance Recorder Using Queue\n==================================");
        System.out.println("1. enqueue");
        System.out.println("2. dequeue");
        System.out.println("3. peek");
        System.out.println("4. isEmpty");
        System.out.println("5. size");
        Scanner instr = new Scanner( System.in );
        Scanner inStr = new Scanner( System.in );
        String temp;
        switch (instr.nextLine()){
            case "1":
                System.out.print("Please input the name that you want to add: ");
                temp = inStr.nextLine();
                enqueue( temp );
                System.out.println("Press \"enter\" to continue");
                temp = inStr.nextLine();
                menu();
                break;
            case "2":
                dequeue();
                System.out.println("The early student registered dequeued");
                System.out.println("Press \"enter\" to continue");
                temp = inStr.nextLine();
                menu();
                break;
            case "3":
                System.out.println(displayPeek());
                System.out.println("Press \"enter\" to continue");
                temp = inStr.nextLine();
                menu();
                break;
            case "4":
                System.out.println(isEmpty());
                System.out.println("Press \"enter\" to continue");
                temp = inStr.nextLine();
                menu();
                break;
            case "5":
                System.out.println("There are \""+size()+"\" students that had been registered");
                System.out.println("Press \"enter\" to continue");
                temp = inStr.nextLine();
                menu();
                break;
            default:
                System.out.println("Please input the number as you SUPPOSED TO DO PLZ");
                menu();
                break;
        }
    }
}

public class Kegiatan2 {

    public void queueExample() {
        Queue queue = new Queue();
        queue.menu();
    }

    public static void main(String[] args) {
        new Kegiatan2().queueExample();
    }
}


