import java.util.Scanner;
public class ElseIf {
    
        public static void main(String arg[]){

            Scanner sc=new Scanner(System.in);

            //find Greater

        //     System.out.println("Program to Find Greater number");
        //     System.out.println("Enter Three number : ");
        //         int a = sc.nextInt();
        //         int b = sc.nextInt();
        //         int c = sc.nextInt();
        //         if(a>b&&a>c){
        //                 System.out.println(a+" Greater");
        //         }
        //         else if(b>c&&b>a){
        //                 System.out.println(b+" is greater");

        //         }
        //         else{
        //                 System.out.println(c+ " is Greater");
        //         }

        //Voting

        System.out.println("Enter age : ");
        int age=sc.nextInt();
        if(age>=21){
                        System.out.println("You are eligible to take part in election");
        }
        else if(age>=18){
                        System.out.println("You can vote");
        }
        else{
                        System.out.println("you can Not vote");
        }

                sc.close();
        }
}
