import java.util.Scanner;
public class NamePattern {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Your Name for Name Pattern : ");
            String name=sc.next();
            int num=name.length();

            for(int i=0;i<=num;i++){

                    System.out.println(name.substring(0,i));
            }
            // input-ram
            // o/p- 
            // r
            // r a
            // r a m

            
        }
}
