package inventario;

public class Manzanas {
	public static int manzanas=0;
	
	public void comprarManzanas(){
		manzanas++;
	}
	
	public void venderManzanas(){
		manzanas--;
	}
	
	public int verManzanas(){
		return manzanas;
	}
	
	public void zumoConseguido(){	
		manzanas=manzanas-4;
	}
}
