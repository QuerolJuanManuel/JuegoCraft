package inventario;

public class Naranjas {
	public static int naranjas=0;
	
	public void comprarNaranjas(){
		naranjas++;
	}
	
	public void venderNaranjas(){
		naranjas--;
	}
	
	public int verNaranjas(){
		return naranjas;
	}
}
