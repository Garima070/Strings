import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        String a="Garima";
        String b="Rajpoot";
        String m=a+" "+b;
        System.out.println(m);
        System.out.println(m.length());
        for (int i = 0; i < m.length(); i++) {
            System.out.println(m.charAt(i));
        }
        if(a.compareTo(b)==0) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        System.out.println("enter a string: ");
        Scanner s=new Scanner(System.in);
        String k=s.nextLine();
        System.out.println(k);
        System.out.println(k.substring(0,4));
        System.out.println(k.substring(0));
        System.out.println(k.substring(5));
    }
}
