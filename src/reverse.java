import java.util.*;

public class reverse {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     String t=s.nextLine();
        StringBuilder b=new StringBuilder(String.valueOf(t));
        for (int i = 0; i <b.length()/2; i++) {
            int front=i;
            int back=b.length()-1-i;
            char front1=b.charAt(front);
            char back1;
            back1 = b.charAt(back);
            b.setCharAt(front,back1);
            b.setCharAt(back,front1);
        }
        char[] ar=new char[6];
        System.out.println(b);
        b.getChars(0,6,ar,0);
        System.out.println(ar);
        }
    }

