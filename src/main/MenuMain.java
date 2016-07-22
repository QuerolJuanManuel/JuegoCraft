package main;

import inventario.Dinero;
import inventario.Manzanas;
import inventario.Naranjas;

import java.util.Scanner;

import recetas.ZumoManzana;
import recetas.ZumoNaranja;

public class MenuMain {
	
	static int opcion;
	
	public static void menuPrin(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu \n 1 Tienda \n 2 Craftear \n 3 Inventario \n 4 Salir \n 5 Obtener dinero");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			menuTienda();
		}else if(opcion==2){
			menuCraft();
		}else if(opcion==3){
			menuInven();
		}else if(opcion==4){
			salir();
		}else if(opcion==5){
			Dinero dinero = new Dinero();
			dinero.obtenerDinero();
			menuPrin();
		}
		teclado.close();
	}
	
	public static void menuTienda(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu \n 1 Comprar \n 2 Vender \n 3 Volver");
		
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
		System.out.print("Introduce el valor del menu \n 1 Naranjas \n 2 Manzanas \n 3 Volver");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			Dinero dinero = new Dinero();
			int d=dinero.getDinero();
			if(d>=2){	
				Naranjas naranjas = new Naranjas();
				naranjas.comprarNaranjas();
				dinero.gastarDinero(2);
				System.out.print("Naranja comprada \n");
				menuCompra();
			}else{
				System.out.print("No tienes suficiente dinero");
				menuCompra();
			}
		}else if(opcion==2){
			Dinero dinero = new Dinero();
			int d=dinero.getDinero();
			if(d>=4){
				Manzanas manzanas =new Manzanas();
				manzanas.comprarManzanas();
				dinero.gastarDinero(4);
				System.out.print("Manzanas comprada \n");
				menuCompra();
			}else{
				System.out.print("No tienes suficiente dinero");
				menuCompra();
			}
		}else if(opcion==3){
			menuTienda();
		}
		teclado.close();
	}
	
	public static void menuVenta(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu \n 1 Naranjas \n 2 Manzanas \n 3 Volver");
		
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
		System.out.print("Menu inventario \n 1 Ver inventario \n 2 Volver");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			Naranjas naranjas = new Naranjas();
			int n=naranjas.verNaranjas();
			Manzanas manzanas = new Manzanas();
			int m=manzanas.verManzanas();
			Dinero dinero = new Dinero();
			int d=dinero.getDinero();
			System.out.print("Inventario \n Dinero "+d+"\n");
			System.out.print(" Naranjas "+n+"\n");
			System.out.print(" Manzanas "+m+"\n");
			menuInven();
		}else if(opcion==2){
			menuPrin();
		}
		teclado.close();
	}
	
	public static void salir(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el valor del menu \n 1 Salir sin guardar \n 2 Salir y guardar");
		
		opcion=teclado.nextInt();
		if(opcion==1){
			System.out.print("No se a guardo");
		}else if(opcion==2){
			System.out.print("Guardando");
		}
		teclado.close();
	}
	
}
