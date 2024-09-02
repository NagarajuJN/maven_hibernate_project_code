package in.nagaraj.java8;

interface MyInterfaceTwo{
	public void m2();
}
public class MyAppTwo {

	public static void main(String[] args) {

		MyInterfaceTwo mit =  () -> System.out.println(" calll m2 ");
	mit.m2();
	}

}
