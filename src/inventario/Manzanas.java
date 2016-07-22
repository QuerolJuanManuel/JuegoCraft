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
	
	public void zumoFallido(){
		double riesgo=Math.random();
		
		if(riesgo<=0.14){
			manzanas=manzanas-4;
			System.out.print("Has perdido 4 manzanas");
		}else if(riesgo>=0.15&&riesgo<=0.34){
			manzanas=manzanas-3;
			System.out.print("Has perdido 3 manzanas");
		}else if(riesgo>=0.35&&riesgo<=0.54){
			manzanas=manzanas-2;
			System.out.print("Has perdido 2 manzanas");
		}else if(riesgo>=0.55){
			manzanas=manzanas-1;
			System.out.print("Has perdido 1 manzanas");
		}
	}
}
