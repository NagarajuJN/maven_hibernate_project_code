package in.nagaraj.java8;

interface MyInterfaceone{
	public void m1();
}
public  class MyApp1  implements MyInterfaceone{
	public void m1()
	{
		System.out.println("M1 method called...");
	
}
	
	public static void main(String[] args) {

	MyApp1 mao=new MyApp1();
	mao.m1();
	}

}
