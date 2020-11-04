package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	static String heredar = "Mensaje de texto";
	public static List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
			listaNombres.add("Elohim");
			listaNombres.add("Emmanuel");
			listaNombres.add("Carmen");
			listaNombres.add("Eugenia");
			listaNombres.add("Goliat");
			listaNombres.add("Goliat");
		return listaNombres;
				
	}
	
	public static List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList<>();
			listaNumeros.add(1);
			listaNumeros.add(10);
			listaNumeros.add(20);
			listaNumeros.add(30);
			listaNumeros.add(40);
			listaNumeros.add(15);
			listaNumeros.add(30);
			listaNumeros.add(10);
		return listaNumeros;
	}
}
