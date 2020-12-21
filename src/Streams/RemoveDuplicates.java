package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args)
	{
		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
		List<Integer> listWithDuplicates = Arrays.asList(arr);

		Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());
		setWithoutDups.forEach((i)->System.out.print(" "+i));
	}

}
