package inventario;

public class Dinero {
	public static int dinero=0;

	public int getDinero(){
		return dinero;
	}
	
	public void obtenerDinero(){
		dinero=dinero+100;
	}
	
	public void gastarDinero(int gasto){
		dinero=dinero-gasto;
	}
}
