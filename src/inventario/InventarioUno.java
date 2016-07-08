package inventario;

public class InventarioUno {
	public static int naranjas=0;
	public static int manzanas=0;
	
	public void comprarObjeto(String objeto){
		if(objeto.equals(naranjas)){
			naranjas++;
		}else if(objeto.equals(manzanas)){
			manzanas++;
		}
	}

}
