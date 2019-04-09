package main;

import estructuras.ListaSimple;
import funcionalidades.DiferenciaDeListas;

public class Main {

	public static void main(String[] args) {
		System.out.println("Primera lista: ");
		ListaSimple lista = new ListaSimple("Uno");
		lista.push("dos");
		lista.push("tres");
		lista.push("cuatro");
		lista.push("cinco");
		lista.push("seis");
		lista.show();
		
		System.out.println("Segunda lista: ");
		ListaSimple lista2 = new ListaSimple("Uno");
		lista2.push("hola");
		lista2.push("veinte");
		lista2.push("casa");
		lista2.push("cinco");
		lista2.push("perro");
		lista2.show();
		
		System.out.println("Resultado de la diferencia entre l1 y l2");
		ListaSimple diferencia = null;
		DiferenciaDeListas dif = new DiferenciaDeListas();
		diferencia = dif.diff(lista, lista2);
		diferencia.show();
	}

}
