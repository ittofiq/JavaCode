package classes;

public class InterfaceMain implements Interface {

	public InterfaceMain() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		
		InterfaceMain inMain = new InterfaceMain();
		
		System.out.println("SUM : "+inMain.sum(x, y));
		System.out.println("SUB : "+inMain.sub(x, y));
		System.out.println("MUL : "+inMain.mul(x, y));
		System.out.println("DIV : "+inMain.div(x, y));
	}
}
