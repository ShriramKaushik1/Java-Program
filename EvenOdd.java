import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        //Number define in code
        // int num=10;
        // if(num%2==0){
        //         System.out.println(num+" is Even ");
        // }
        // else{
        //         System.out.println(num+" is Odd");
        // }

    //User Input 
    System.out.println("Enter any Number : ");
    int num=sc.nextInt();
    if(num%2==0){
                System.out.println(num+" is Even ");
        }
        else{
                System.out.println(num+" is Odd");
        }

}
}
