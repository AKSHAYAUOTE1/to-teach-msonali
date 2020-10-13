package upcasting;

public class Upcating1 {

	public static void main(String[] args) {
		Father f1=new Son();
		f1.car();
		f1.home();
		f1.money();
		//f1.bike();
	}

}
