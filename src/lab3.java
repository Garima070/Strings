import java.util.*;

import java.util.Scanner;

public class lab3{

    void insert()
    {
        System.out.println("insert fn is working");
    }
    void delete()
    {
        System.out.println("delete fn is working");
    }
    void traverse()
    {
        System.out.println("traverse fn is working");
    }




    public static void main(String[] args) {

        lab3 obj=new lab3();
        while(true){
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for exit");

            System.out.println("Enter your choice ");
            Scanner sc=new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");

            }
        }

    }
}