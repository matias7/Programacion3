package main;


import estructuras.ArbolBinario;

public class Main {

	public static void main(String[] args) {
		System.out.println("Recorriendo el àrbol");
		String content = "Contenido";
		ArbolBinario ab = new ArbolBinario(content);
		ab.insert("Otro");
		ab.insert("Another");
		ab.insert("Gg");
		ab.insert("Ga");
		ab.show();
		System.out.println(ab.getHeight());
	}

}
