import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static int getSum(String s) {
		int sum=0;
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) {
		int n=Integer.parseInt(st.nextToken());
		sum+=n;
		
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result=getSum("2 3 4 6");
 	System.out.println(result);
 	System.out.println("Pushing to github account");

	}

}
