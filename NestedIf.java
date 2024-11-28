import java.util.Scanner;
public class NestedIf{

	
public static void main(String arg[]){
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Age : ");
	
	int age= sc.nextInt();

			if(age<=100)
			{
				if(age<=59)
				{
					if(age<=22)
					{
						if(age>=0 && age<=12)
						{
							System.out.println(" child ");
						}
						else
						{
							System.out.println( " teen ");
						}
					}
					else
					{
						System.out.println( " Young ");
					}
				}
				else
				{
					System.out.println(" old");
				}
			}
			else
			{
				System.out.println(" Old ");
			}

			sc.close();
	}

}