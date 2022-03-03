
public class MainProject {

	public static void CallCalculator(ICalculator obj) {
		System.out.println(obj.addition(2, 3));
		System.out.println(obj.multiplication(2, 3));
		
	}
	
	public static void main(String[] args) {
		
	//	StandardCalculator stdcalc=new StandardCalculator();
		CallCalculator(new StandardCalculator());
		CallCalculator(new ScientificCalculator());
	}

}
