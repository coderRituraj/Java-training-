package Com.bhavna.task1;

import java.util.Scanner;

public class CricketMain {

	public static void main(String[] args) {
		CricketWeb obj = new CricketWeb();
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of batsman ");
        String name_bowler = sc.next();
        System.out.print("Enter name of Bowler ");
        String name_batsman = sc.next();
       	System.out.print("Enter runs on that ball");
		int run =sc.nextInt();
		sc.close();
		obj.displayDeliveryDetails(name_bowler,name_batsman);
		obj.displayDeliveryDetails(run);
		

}
}
