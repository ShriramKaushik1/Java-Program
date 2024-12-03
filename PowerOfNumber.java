import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number & its power=> ");
        int num,pow,res=1;
        num=sc.nextInt();
        pow=sc.nextInt();
        for(int i=1;i<=pow;i++)
        {
                res=res*num;
                

        }
        System.out.println("power of num "+res);


    }

    
}
