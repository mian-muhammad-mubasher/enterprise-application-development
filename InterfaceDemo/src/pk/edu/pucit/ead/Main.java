package pk.edu.pucit.ead;

import java.util.Arrays;

import pk.edu.pucit.interface1.*;
import pk.edu.pucit.interface2.Student;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example 1
		BMXBicycle bmx = new BMXBicycle();
		FonixBicycle fonix = new FonixBicycle();
		
		Bicycle b[] = new Bicycle[2];
		
		b[0] = bmx;
		b[1] = fonix;
				
		System.out.println(BicycleRaceManager.getBestBiCycle(b));
		
//		Example 2
		Student s1 = new Student("MITF11M003");
		Student s2 = new Student("MITF11M002");
		Student s3 = new Student("MITF11M001");
		
		Student sn[] = new Student[3];
		
		sn[0] = s1;
		sn[1] = s2;
		sn[2] = s3;
		
		Arrays.sort(sn);
		
		for(int i=0; i< sn.length; ++i){
			System.out.println(sn[i]);
		}
		
	}

}
