import java.util.Scanner;
public class Bool {
    
public static void main(String arg[]){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter Age : ");
     int age= sc.nextInt();
     boolean isCriminalcase=false;
     boolean isEducated=false;

        if(age>=21){
                if(isCriminalcase==false){
                       // System.out.println("");
                        if(isEducated==true){
                            System.out.println("You are eligible to take part in election");
                       }
                     else{
                        System.out.println("You only give vote");
                         }
                   }
                    else{
                    System.out.println("you have criminal case");
                    }
        }
         
        else if(age>=18)
        {
                System.out.println("You can vote");
        }
        else
        {
            System.out.println("you can not vote");
        }
}
}