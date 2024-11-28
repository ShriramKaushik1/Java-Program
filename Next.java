import java.util.Scanner;
public class Next{
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);

            //Integer Input from user INCORRECT FORM
            // int num=sc.next();                                  //TYPE MISMATCH cannot conver string to int 
            // System.out.println("Input interger : "+num);

            //Take integer input from user correct form
            System.out.println("Enter Integer Value :");
            int num1=sc.nextInt();                                  
            System.out.println("Input interger : "+num1);
            
            //String first word untill space or next line 
            System.out.println("Enter String  Value :");
            String name1=sc.next();
            System.out.println("Input String : "+name1);

            //String  read nextline
            System.out.println("Enter String Value :");
            String name2=sc.nextLine();
            System.out.println("Input String : "+name2);

            //Double
            System.out.println("Enter double Value :");
            double d =sc.nextDouble();                                  
            System.out.println("Input double : "+d);

            //float
            System.out.println("Enter float Value :");
            float f =sc.nextFloat();                                  
            System.out.println("Input float : "+f);
                
           


            //Scanner.close();
        }
}