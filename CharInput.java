import java.util.Scanner;
public class CharInput {
    public static void main(String args[]){

            Scanner sc= new Scanner(System.in);

            System.out.print("Enter a Character:  ");
            String s1=sc.next();

            char s2= s1.charAt(0);
            System.out.println("You Entered : "+s2);

            sc.close();
    }
    
}
