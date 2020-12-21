package Java8;
import java.util.*;

public class LambdaExpression {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {4,7,1};		
		List<Integer> li  = Arrays.asList(arr);
		li.forEach(a->System.out.println(a));

	}

}
