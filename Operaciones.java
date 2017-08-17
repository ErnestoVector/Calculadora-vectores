import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/*
*Clase que define las operaciones entre arreglos
*/
public class Operaciones{

	/**
	*Metodo que suma dos Arreglos, no hace la validacion de que sean del mismo tamaño
	*@param	arr1 Primer arreglo a sumar
	*@param arr2 Segundo arreglo a sumar
	*@return El arreglo resultante
	*/
	public static ArrayList<Double> suma(ArrayList<Double> arr1, ArrayList<Double> arr2){
		Iterator<Double> it1 = arr1.iterator();
		Iterator<Double> it2 = arr2.iterator();
		ArrayList<Double> res = new ArrayList<Double>();

		while(it1.hasNext() && it2.hasNext()){
			res.add( it1.next() + it2.next() );
		}

		return res;
	}

	/**
	*Metodo que resta dos Arreglos, no hace la validacion de que sean del mismo tamaño
	*@param	arr1 Primer arreglo a restar
	*@param arr2 Segundo arreglo a restar
	*@return El arreglo resultante
	*/
	public static ArrayList<Double> resta(ArrayList<Double> arr1, ArrayList<Double> arr2){
		Iterator<Double> it1 = arr1.iterator();
		Iterator<Double> it2 = arr2.iterator();
		ArrayList<Double> res = new ArrayList<Double>();

		while(it1.hasNext() && it2.hasNext()){
			res.add( it1.next() - it2.next() );
		}

		return res;
	}

	/**
	*Metodo que  hace el producto por un escalar sobre el mismo arreglo
	*@param	arr1 Arreglo a multiplicar
	*@param escalar Escalar por el que se multiplicara
	*/
	public static void multiplicacionEscalar(ArrayList<Double> arr1, int escalar){
		

	}


}