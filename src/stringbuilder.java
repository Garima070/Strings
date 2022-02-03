import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String k=s.nextLine();
        StringBuilder b=new StringBuilder(k);
        System.out.println(b.charAt(2));
        b.setCharAt(0,'A');
        System.out.println(b);
        System.out.println(b.insert(0,'T'));
        System.out.println(b.insert(4,'S'));
        b.delete(0,1);
        System.out.println(b);
        b.append("Raj");
        b.append("poo");
        b.append("t");
        System.out.println(b);

    }
}
