package fibonacci;
import java.math.BigDecimal;

public class Fibonacci {

	
	//使用BigDemical类，int不够存储fib(200)
	public static BigDecimal of(int n) {
		BigDecimal a = BigDecimal.valueOf(1);
		BigDecimal b = BigDecimal.valueOf(1);
		
		for(int i=3;i<=n;i++) {
			BigDecimal temp = a.add(b);
			a=b;
			b=temp;
		}
		return b;
		
	}
	
	//Run
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=200;i++) {
			System.out.println(Fibonacci.of(i));
		}

	}

}
