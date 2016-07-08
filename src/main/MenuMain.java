package main;

import inventario.Naranjas;

import java.util.Scanner;

import recetas.ZumoNaranja;

public class MenuMain {
	
	
	
	
	/*public static void menu(){
		int opcion;
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu, 1 comprar-vender 2 craftear 3 inventario 4 salir ");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			System.out.print("Introduce el valor del menu, 1 comprar 2 vender ");
			opcion=teclado.nextInt();
			if(opcion==1){
				while(opcion!=3){
				System.out.print("comprar ");
				System.out.print("1 naranjas ");
				System.out.print("2 manzanas ");
				System.out.print("3 salir ");
				opcion=teclado.nextInt();
					if(opcion==1){
						Naranjas naranjas = new Naranjas();
						naranjas.comprarNaranjas();
						System.out.print("naranja comprada ");
					}else if(opcion==2){
						System.out.print("2 manzanas ");
					}else if(opcion==3){
						
						
						System.out.print("Introduce el valor del menu, 1 comprar-vender 2 craftear 3 inventario 4 salir ");
						
						opcion=teclado.nextInt();
						if(opcion==1){
							System.out.print("Introduce el valor del menu, 1 comprar 2 vender ");
							opcion=teclado.nextInt();
							if(opcion==1){
								while(opcion!=3){
								System.out.print("comprar ");
								System.out.print("1 naranjas ");
								System.out.print("2 manzanas ");
								System.out.print("3 salir ");
								opcion=teclado.nextInt();
									if(opcion==1){
										Naranjas naranjas = new Naranjas();
										naranjas.comprarNaranjas();
										System.out.print("naranja comprada ");
									}else if(opcion==2){
										System.out.print("2 manzanas ");
									}else if(opcion==3){
										
									}
								}
							}else if(opcion==2){
								System.out.print("vender ");
							}
						}else if(opcion==2){
							System.out.print("menu craftear ");
							System.out.print("1 zumo naranja ");
							System.out.print("2 zumo manzana ");
							opcion=teclado.nextInt();
							if(opcion==1){
								ZumoNaranja z1;
								z1=new ZumoNaranja();
								z1.cocinar();
							}else if(opcion==2){
								System.out.print("manzanar ");
							}
						}else if(opcion==3){
							System.out.print("menu inventario ");
							Naranjas naranjas = new Naranjas();
							int n=naranjas.verNaranjas();
							System.out.print(n+"hay ");
						}else if(opcion==4){
							System.out.print("salir ");
						}
						
					}
					}
				
				
			}else if(opcion==2){
				System.out.print("vender ");
			}
		}else if(opcion==2){
			System.out.print("menu craftear ");
			System.out.print("1 zumo naranja ");
			System.out.print("2 zumo manzana ");
			opcion=teclado.nextInt();
			if(opcion==1){
				ZumoNaranja z1;
				z1=new ZumoNaranja();
				z1.cocinar();
			}else if(opcion==2){
				System.out.print("manzanar ");
			}
		}else if(opcion==3){
			System.out.print("menu inventario ");
			Naranjas naranjas = new Naranjas();
			int n=naranjas.verNaranjas();
			System.out.print(n+"hay ");
		}else if(opcion==4){
			System.out.print("salir ");
		}
		
	}*/
}
