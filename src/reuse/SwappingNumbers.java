package reuse;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("befre swapping values.."+a+" "+b);
		
	int	t=a;
		a=b;
		b=t;
		
		System.out.println("after swapping values.."+a+" "+b);

	}

}
