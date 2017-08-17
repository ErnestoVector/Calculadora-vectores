import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
*Esta clase define metodos generales para los arreglos
*/
public class Funciones{
	
	private static Scanner sc = new Scanner(System.in);
	
	/**
	*Metodo que lee un arreglo de una dimension especificada por el usuario
	*@param	arr Referencia al arreglo a llenar
	*/
	public static void leerArray(ArrayList<Double> arr){
		System.out.print("Ingrese el numero de dimension del vector:\t");
		int tam = sc.nextInt();
		for(int i = 0 ; i< tam ; i++ ){
			System.out.print("Ingrese el dato "+(i+1)+":\t");
			arr.add(sc.nextDouble());
		}
	}

	/**
	*Metodo que imprimie un arreglo
	*@param	arr Referencia al arreglo a imprimir
	*/
	public static void imprimirArray(ArrayList<Double> arr){
		Iterator<Double> it = arr.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}