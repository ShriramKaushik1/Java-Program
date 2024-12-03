//WAP TO PRINT 100,50,10 rupees Notes of given Rupees
import java.util.Scanner;
public class FindNoOfNote {

        public static void main(String[] args) {
            
             Scanner sc = new Scanner(System.in);   
            int rupees,hundred,fifty,ten;
            System.out.println("Enter rupees => ");
            rupees=sc.nextInt();

            
            hundred=rupees/100;
            // System.out.println("100 :"+hundred);
            rupees=rupees%100;
            fifty=rupees/50;
            rupees=rupees%50;
            ten=rupees/10;
            rupees=rupees%10;
        
        System.out.println("100 :"+hundred+"\n50 :"+fifty+" \n 10 : "+ten);
    

        }
    
}
