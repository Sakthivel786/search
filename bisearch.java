package practise;
import java.util.*;
public class bisearch {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		System.out.println("enter key element");
		String res=binarysearch(a,sc.nextInt());
		System.out.println(res);
	
	
	}
	public static String binarysearch(int[] b,int keyelement) {
		String res="not present";
		int lowerindex=0,higherindex=b.length-1,midindex;
		while(higherindex>=lowerindex) {
			midindex=(lowerindex+higherindex)/2;
			if(keyelement==b[midindex]) {
				res="present";
				break;
			}else if(keyelement>b[midindex]){
				lowerindex=midindex+1;
			}else if(keyelement<b[midindex]){
				higherindex=midindex-1;
			}
		
		}
		return res;
	}
}
	