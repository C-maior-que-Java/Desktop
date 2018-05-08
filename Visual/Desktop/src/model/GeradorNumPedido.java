package Desktop;

public class GeradorNumPedido {
	
	private static int num = 0;
	
	public static int getNumPedido() {
		num += 1;
		return num;
	}
}
