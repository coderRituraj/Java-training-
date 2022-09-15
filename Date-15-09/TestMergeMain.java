package Com.bhavna.task1;

import java.io.File;

public class TestMergeMain {

	public static void main(String[] args) {
		Merger obj=new Merger();
	        File f1=new File("C:\\Users\\Rituraj.singh\\Documents\\master\\master.txt");
	        File f2=new File("C:\\Users\\Rituraj.singh\\Documents\\master\\File1.txt");
	        obj.merge(f1, f2);

	}

}
