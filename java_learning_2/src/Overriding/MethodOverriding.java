package Overriding;

//class Child{	
//@Override
//public String toString(){
//	return "toString() override in Child class";
//}
//
//}

class Vechile{
public void speed(){
	System.out.println("Average speed :120km/hr");
}
}

class FourWheeler extends Vechile{

@Override
public void speed(){
	System.out.println("Avereage speed :150km/hr");
}
}

public class MethodOverriding {

public static void main(String[] args) {
//	Child ch = new Child();
//	System.out.println(ch);
	
	FourWheeler fourWheeler = new FourWheeler();
	fourWheeler.speed();

}

}