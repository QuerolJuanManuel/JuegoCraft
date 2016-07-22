package recetas;

import inventario.Naranjas;

public class ZumoNaranja {
	
	public int comprobarItem(){
		Naranjas naranjas = new Naranjas();
		int n=naranjas.verNaranjas();
		return n;
	}
	
	public void cocinar(){
	
		if(comprobarItem()>=4){
			if(Math.random()<=0.5){
				System.out.print("Zumo naranja conseguido \n");
				Naranjas naranjas = new Naranjas();
				naranjas.zumoConseguido();
			}else{
				System.out.print("Zumo naranja no conseguido \n");
				Naranjas naranjas = new Naranjas();
				naranjas.zumoFallido();
			}
		}else{
			System.out.print("No tienes suficientes naranjas \n");
		}
	}
	

}
