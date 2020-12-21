package Java8;

public class MethodReference {
	public static void saySomething(){  
		System.out.println("Hello, this is static method.");  
	}  
	public static void main(String[] args) {  
		// Referring static method  
		FirstFunctionalInterface methodRef = MethodReference::saySomething;  
		// Calling interface method  
		methodRef.displayData();
	}  
}
