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
	*@param	arr Arreglo a multiplicar
	*@param escalar Escalar por el que se multiplicara
	*/
	public static void multiplicacionPorEscalar(ArrayList<Double> arr, int escalar){
		for (int i = 0 ; i<arr.size() ; i++ ) {
			arr.set(i, arr.get(i) * escalar);
		}
	}

	/**
	*Metodo que obtiene la norma de un vector
	*@param	arr Arreglo al cual calcular la norma
	*@return El tamaño resultante del vector
	*/
	public static double norma(ArrayList<Double> arr){		
		Iterator<Double> it = arr.iterator();
		double suma = 0;

		while(it.hasNext())
			suma += Math.pow(it.next(),2);

		return Math.sqrt(suma);
	}
	
	/**
	*Metodo que obtiene el angulo entre dos vectores
	*@param	arr1 Primer arreglo para calcular el angulo
	*@param arr2 Segundo arreglo para calcular el angulo
	*@return El angulo resultante
	*/
	public static double angulo(ArrayList<Double> arr1, ArrayList<Double> arr2){

		return Math.acos(	productoPunto(arr1,arr2) / ( norma(arr1)*norma(arr2) )  );

	}

	private static double productoPunto(ArrayList<Double> arr1,ArrayList<Double> arr2){
		Iterator<Double> it1 = arr1.iterator();
		Iterator<Double> it2 = arr2.iterator();
		double suma = 0;
		while(it1.hasNext() && it2.hasNext()){
			suma += (it1.next()*it2.next());
		}

		return suma;
	} 
}