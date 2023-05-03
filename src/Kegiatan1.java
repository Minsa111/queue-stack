import java.util.Scanner;

public class Kegiatan1 {
    private int size;
    private Object[] dDatas;
    private int top;

    String ans;

    public Kegiatan1(int a) {
        size = a;
        dDatas = new Object[size];
        top = -1;
    }

    public void push(Object data) {
        if(isFull()){
            throw new RuntimeException("Latihan1.Stack Overflow");
        }
        top++;
        dDatas[top] = data;
    }

    public Object pop() {
        if (empty()) {
            throw new RuntimeException( "Latihan1.Stack underflow" );
        }
        Object element = dDatas[top];
        dDatas[top] = null;
        top--;
        return element;
    }

    public Object peek() {
        if (empty()) {
            throw new RuntimeException( "Latihan1.Stack is empty" );
        }
        return dDatas[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int search(Object element) {
        int distance = -1;
        for (int i = 0; i <= top; i++) {
            if (dDatas[i].equals( element )) {
                distance = top - i + 1;
                break;
            }
        }
        return distance;
    }


    public void input() {
        Scanner in = new Scanner( System.in );
        System.out.print("Masukkan input: ");
        String temp = null;
        ans = in.nextLine();
        for (int i=0; i < ans.length(); i++){
            temp = "";
            temp +=  ans.charAt( i ) ;
            push( temp );

        }
        System.out.print("Reversed: ");
        for (int i=0; i<ans.length(); i++){
            System.out.print(dDatas[top-i]);
        }

    }

    public static void main(String[] args) {
        Kegiatan1 st = new Kegiatan1( 20 );
        st.input();
    }
}
