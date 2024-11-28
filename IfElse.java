import java.util.Scanner;
public class IfElse {
    
        public static void main(String arg[]){
                Scanner sc= new Scanner(System.in);

                System.out.print("Enter Your Age : ");
                int age= sc.nextInt();

                
                if(age>=18){
                        System.out.println("Eligible for Vote");
                }
                else{   
                    System.out.println("Not Eligible For Vote");
                }
        }
}
