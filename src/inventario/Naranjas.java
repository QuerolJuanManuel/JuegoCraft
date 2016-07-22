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
	
	public void zumoConseguido(){	
		naranjas=naranjas-4;
	}
	
	public void zumoFallido(){
		double riesgo=Math.random();
		
		if(riesgo<=0.14){
			naranjas=naranjas-4;
			System.out.print("Has perdido 4 naranjas");
		}else if(riesgo>=0.15&&riesgo<=0.34){
			naranjas=naranjas-3;
			System.out.print("Has perdido 3 naranjas");
		}else if(riesgo>=0.35&&riesgo<=0.54){
			naranjas=naranjas-2;
			System.out.print("Has perdido 2 naranjas");
		}else if(riesgo>=0.55){
			naranjas=naranjas-1;
			System.out.print("Has perdido 1 naranjas");
		}
	}
}
