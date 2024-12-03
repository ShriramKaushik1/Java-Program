import java.util.Scanner;
public class RevOfNum {
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            int num,rev=0,rem=0;
            System.out.println("Enter any Number : ");
            num=sc.nextInt();
            while(num!=0){
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;

        }
        System.out.println("reverse : "+rev);

        }
    
}
