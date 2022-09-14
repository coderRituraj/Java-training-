package Com.bhavna.task2;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of players: ");
		int noOfPlayers=sc.nextInt();
		HashMap<String, Long> score=new HashMap<String, Long>();
		for(int i=1;i<=noOfPlayers;i++) {
			System.out.println("Enter details of player "+i);
			sc.nextLine();
			String name=sc.nextLine();
			Long scr=sc.nextLong();
			score.put(name,scr);
		}
		
		System.out.print("Hashmap is : "+score);
		
		Set set=score.keySet();
		Iterator itr=set.iterator();
		Long max=0L;
		while(itr.hasNext()) {
			Long temp=score.get(itr.next());
			if(max<temp) {
				max=temp;
			}
						
		}
		itr=set.iterator();
		while(itr.hasNext()) {
			String name=(String)itr.next();
			Long temp=score.get(name);
			if(temp==max) {
				System.out.println("\nPlayer with maximum score is: "+name);
				break;
			}
						
		}

	}

}
