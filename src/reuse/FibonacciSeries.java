package reuse;

public class FibonacciSeries {

	public static void main(String[] args) {
		

		int n1=2,n2=3,sum=0;
		System.out.println(n1+ " " + n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			n2=sum;
			System.out.println(sum);
		}
	}

}
