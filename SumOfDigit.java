//WAP TO PRINT SUM OF ALL DIGIT FROM ANY THREE DIGIT NUM WITHOUT USING LOOP
import java.util.Scanner;
public class SumOfDigit {
    
        public static void main(String[] args) {
          
            Scanner sc = new Scanner(System.in);
            int num,first,second,third,sum=0,rem;
            System.out.print("Enter three digit number : ");
            num=sc.nextInt();
            //1st way

            // num=sc.nextInt();
            //        first =num%10;
            //         num=num/10;
            //         second=num%10;
            //         num=num/10;
            //         third=num%10;
            //         System.out.println("Sum of digit : "+(first+second+third));

            //2nd way

            // first=num/100;
            // third=num%10;
            // second=(num/10)%10;
            // second=(num%100)/10;
            // System.out.println("Sum of digit : "+(first+second+third));

            //Loop
            
        while(num!=0){
                rem=num%10;
                sum=sum+rem;
                num=num/10;

        }
        System.out.println("Sum of digit : "+sum);



        }
}
