package maven_calculater.Calculater1;

public class Test2 extends TestCalc1 implements InterCal1 {
    int r;
	Test2(int a, int b) {
		super(a, b);
		r=0;
	}

	@Override
	public int add(int a, int b) {
		r=a+b;
		//System.out.println("Sum(%d , %d) : %d"+a+b+r);
		return r;
	}

	@Override
	public int sub(int a, int b) {
		r=a-b;
		//System.out.println("Sub(%d , %d) : %d"+a+b+r);
	    return r;
	}

	@Override
	public int multiply(int a, int b) {
		r=a*b;
		//System.out.println("Multiplication(%d , %d) : %d"+a+b+r);
		return r;
	}

	@Override
	public int division(int a, int b) {
		if(a>b) {
			r=a/b;
			//System.out.println("Division(%d , %d) : %d"+a+b+r);
			return r;
		}
		else if(a<b) {
			r=b/a;
			//System.out.println("Division(%d , %d) : %d"+a+b+r);
			return r;
		}
		else {
			r=1;
			//System.out.println("Division(%d , %d) : %d"+a+b+r);
			return r;
		}
		
	}

}
