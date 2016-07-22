package recetas;

import inventario.Manzanas;

public class ZumoManzana {
	
	
	public int comprobarItem(){
		Manzanas manzanas = new Manzanas();
		int n=manzanas.verManzanas();
		return n;
	}
	
	public void cocinar(){
	
		if(comprobarItem()>=4){
			if(Math.random()<=0.5){
				System.out.print("Zumo manzana conseguido \n");
				Manzanas manzanas = new Manzanas();
				manzanas.zumoConseguido();
			}else{
				System.out.print("Zumo manzana no conseguido \n");
				Manzanas manzanas = new Manzanas();
				manzanas.zumoFallido();
			}
			
		}else{
			System.out.print("No tienes suficientes manzanas \n");
		}
	}

}
