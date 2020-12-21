package Java8;

@FunctionalInterface
public interface FirstFunctionalInterface {

	public void displayData();

	default void getStatus() {
		String str = "welcome to java8";
		String[] strarr = str.split(" ");
		for (String s : strarr) {
			System.out.println(s);
		}
	}

}
