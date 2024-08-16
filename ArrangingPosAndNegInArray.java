package Coading_Practice;
import java.util.*;
public class ArrangingPosAndNegInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
//		int pos=0,neg=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> pos=new ArrayList<>();
		ArrayList<Integer> neg=new ArrayList<>();
		for(int i=0;i<size;i++) {
			int x=arr[i];
			if(x>0) {
				pos.add(x);
			}
			else {
				neg.add(x);
			}
		}
		pos.addAll(neg);
		System.out.println(pos);
	}

}
