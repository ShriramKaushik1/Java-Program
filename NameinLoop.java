import java.util.Scanner;
public class NameinLoop { 
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            //method -1 

            // System.out.println("Enter number : ");
            // int num=sc.nextInt();
            // System.out.println("Enter Your name :");
            // String name1=sc.next();

          

            //     System.out.println("Dear ( "+name1+" ) here is the counting.. ");
            // for(int i=1;i<=num;i++){

            //         System.out.println(i);
            // }

            //method --2

         
            // System.out.println("Enter number : ");
            // int num=sc.nextInt();
            System.out.println("Enter Your name :");
            String name1=sc.next();

            //Convert String into integer
            // int num=Integer.parseInt(name1);
            // System.out.println(num);
          

            int num = name1.length();

                System.out.println("Dear ( "+name1+" ) here is the counting.. ");
            for(int i=1;i<=num;i++){

                    System.out.println(i);
            }
        }


    
}



