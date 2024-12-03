import java.util.Scanner;
public class Table {
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
                int num,result;
                System.out.print("Enter Number which you want to Print table => ");
                num=sc.nextInt();
                for(int i=1;i<=10;i++)
                {
                        result=i*num;
                        System.out.println(i+"*"+num+"= "+result);
                }
        }
    
}
