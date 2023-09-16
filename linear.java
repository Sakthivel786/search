package practise;
import java.util.*;

public class linear {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,20,30,40};
		System.out.println("enter the key element");
		String res=linear(a,sc.nextInt());
		System.out.println(res);
	}
	public static String linear(int[]b,int key) {
		String res="not present";
		for(int index=0;index<b.length;index++) {
		if(b[index]==key) {
			res="present";
			break;
		}
		}
return res;
	}

}
