import java.util.Scanner;

public class football {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Defines Yards
		System.out.print("Enter Total Yards:");
		double Yards=input.nextDouble();
		
		//defines TD
		System.out.print("Enter touchdowns");
		double TD=input.nextDouble();
		
		//defines INT
		System.out.print("Enter interceptions:");
		double INT=input.nextDouble();
		
		//defines COMP
		System.out.print("Enter completions:");
		double COMP=input.nextDouble();
		
		//defines ATT
		System.out.print("Enter number of passes atttempted:");
		double ATT=input.nextDouble();
		
		//formula for passer rating
		double passer_rating=(((8.4*Yards)+(330*TD)+(100*COMP)-(200*INT))/(ATT));
				
		//prints results
		System.out.println("Passer Rating is" + passer_rating);

	}

}
