import java.util.Scanner;
public class UserInput {
        public static void main(String args[]){

                int a,b,c;
                // Scanner sc = new Scanner(System.in);
                // System.out.println("Take two Input From User => ");
                // a = sc.nextInt();
                // b = sc.nextInt();
                
                // // ARITHAMATIC OPERATOR IN JAVA PROGRAM
                // c= a+b;
                // System.out.println("a+b=>"+c);
                // c=a-b;
                // System.out.println("a-b=>"+c);
                // c=a*b;

                // System.out.println("a*b=>"+c);
                // c=a/b;
                // System.out.println("a/b=>"+c);
                // c=a%b;
                // System.out.println("a%b=>"+c);

                // increament operator
                
                Scanner sc=new Scanner(System.in);
                System.out .println("Enter value for increament operator =>");
                a=sc.nextInt();
               b= ++a;
                System .out.println("++a=>"+b);
                b=a++;
                System.out.println("a++  =>"+b);
                b=--a;
                System.out .println("--a+>"+b);
                b=a--;
                System.out.println("a--  =>"+b);

        }
    
}
