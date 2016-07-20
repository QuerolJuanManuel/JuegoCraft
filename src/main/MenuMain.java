package main;

import inventario.Manzanas;
import inventario.Naranjas;

import java.util.Scanner;

import recetas.ZumoManzana;
import recetas.ZumoNaranja;

public class MenuMain {
	
	static int opcion;
	
	public static void menuPrin(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu, 1 Tienda 2 Craftear 3 Inventario 4 Salir");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			menuTienda();
		}else if(opcion==2){
			menuCraft();
		}else if(opcion==3){
			menuInven();
		}else if(opcion==4){
			salir();
		}
		teclado.close();
	}
	
	public static void menuTienda(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu, 1 Comprar 2 Vender 3 Volver");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			menuCompra();
		}else if(opcion==2){
			menuVenta();
		}else if(opcion==3){
			menuPrin();
		}
		teclado.close();
	}
	
	public static void menuCompra(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu, 1 Naranjas 2 Manzanas 3 Volver");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			Naranjas naranjas = new Naranjas();
			naranjas.comprarNaranjas();
			System.out.print("Naranja comprada \n");
			menuCompra();
		}else if(opcion==2){
			Manzanas manzanas =new Manzanas();
			manzanas.comprarManzanas();
			System.out.print("Manzanas comprada \n");
			menuCompra();
		}else if(opcion==3){
			menuTienda();
		}
		teclado.close();
	}
	
	public static void menuVenta(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu, 1 Naranjas 2 Manzanas 3 Volver");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			Naranjas naranjas = new Naranjas();
			naranjas.venderNaranjas();
			System.out.print("Naranja vendida \n");
			menuVenta();
		}else if(opcion==2){
			Manzanas manzanas = new Manzanas();
			manzanas.venderManzanas();
			System.out.print("Manzanas vendida \n");
			menuVenta();
		}else if(opcion==3){
			menuTienda();
		}
		teclado.close();
	}
	
	public static void menuCraft(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Menu craftear \n 1 Zumo naranja \n 2 Zumo manzana \n 3 Volver");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			ZumoNaranja z1;
			z1=new ZumoNaranja();
			z1.cocinar();
			menuCraft();
		}else if(opcion==2){
			ZumoManzana m1;
			m1=new ZumoManzana();
			m1.cocinar();
			menuCraft();
		}else if(opcion==3){
			menuPrin();
		}
		teclado.close();
	}
	
	public static void menuInven(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Menu inventario 1 Ver inventario 2 Volver");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			Naranjas naranjas = new Naranjas();
			int n=naranjas.verNaranjas();
			Manzanas manzanas = new Manzanas();
			int m=manzanas.verManzanas();
			System.out.print("Inventario \n");
			System.out.print("Naranjas "+n+"\n");
			System.out.print("Manzanas "+m+"\n");
			menuInven();
		}else if(opcion==2){
			menuPrin();
		}
		teclado.close();
	}
	
	public static void salir(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("1 Salir sin guardar 2 Salir y guardar");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			System.out.print("No se a guardo");
		}else if(opcion==2){
			System.out.print("Guardando");
		}
		teclado.close();
	}
	
	
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
