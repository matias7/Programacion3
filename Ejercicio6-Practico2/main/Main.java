package main;

import estructuras.ArbolBinario;

public class Main {

	public static void main(String[] args) {
		System.out.println("El arbol es vacio ?");
		String content = "contenido";
		ArbolBinario ab = new ArbolBinario(content);
		System.out.println(ab.getRoot());
	}

}
