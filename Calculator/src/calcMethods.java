
public class calcMethods {
	double num1;
	double num2;
	
	public calcMethods(double number1, double number2){
		num1 = number1;
		num2 = number2;
	}
	
	public String multiply() {
		return num1 + " * " + num2 + " = " + (num1*num2);
	}

	public String subtract() {
		return num1 + " - " + num2 + " = " + (num1-num2);
	}
	
	public String add() {
		return num1 + " + " + num2 + " = " + (num1+num2);
	}
	
	public String divide() {
		return num1 + " / " + num2 + " = " + (num1/num2);
	}
	
	public String mod() {
		return num1 + " % " + num2 + " = " + (num1%num2);
	}
	
}
