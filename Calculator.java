import java.util.Scanner;
public class Calculator {
        public static void main(String arg[]){

                Scanner sc=new Scanner(System.in);
               
                System.out.println("Press 1 for Addition ");
                System.out.println("Press 2 for Subtract ");
                System.out.println("Press 3 for Multiply ");
                System.out.println("Press 4 for Divide ");
                System.out.println("Press 5 for All Operation ");
                System.out.print("\nEnter Your Input : ");
                int ch=sc.nextInt();
                System.out.println("Enter First number : ");
                int a=sc.nextInt();
                System.out.println("Enter Second number : ");
                int b=sc.nextInt(); 
                int c;

                
                switch(ch){

                        case 1:
                             c =a+b;
                            System.out.println("The Addition of two No. is : "+c);
                        //     break;
                        case 2:
                             c =a-b;
                            System.out.println("The Subtraction of two no. is : "+c);
                        //     break;
                        case 3:
                             c =a*b;
                            System.out.println("the Multplication of two no.is : "+c);
                        //     break;
                        case 4:
                             c =a/b;
                            System.out.println("the Division of two no. is : "+c);
                        //     break;
                        case 5:
                                 c =a+b;
                                 System.out.println("The Addition of two No. is : "+c);
                                 c =a-b;
                                System.out.println("The Subtraction of two no. is : "+c);
                                c =a*b;
                                System.out.println("the Multplication of two no.is : "+c);
                                c =a/b;
                                System.out.println("the Division of two no. is : "+c);
                           //     break;
                        default:
                            System.out.println("Wrong Input");
                           // break;
                }

        //Method 2

        // System.out.println("Enter two number : ");
        // int a=sc.nextInt();
        // int b=sc.nextInt(); 
        // int c;
        // c =a+b;
        // System.out.println("Adiition is : "+c);
        // c =a-b;
        // System.out.println("Subtraction is : "+c);
        // c =a*b;
        // System.out.println("Multplication is : "+c);
        // c =a/b;
        // System.out.println("Division is : "+c);
        }
    
}
