package javaprogram;

public class SwapNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
	SwapNumberWithoutUsingThirdVariable swap = new SwapNumberWithoutUsingThirdVariable();
	swap.swapNumber();

	}
    public void swapNumber()
    {
    	int x = 70;
    	int y = 80;
    	x= x+y;
    	y=x-y;
    	x=x-y;
    	
    	System.out.println(x);
    	System.out.println(y);
    }
}
