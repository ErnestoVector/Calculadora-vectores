import java.util.ArrayList;
public class Test{
	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<Double>();
		ArrayList<Double> arr2 = new ArrayList<Double>();
		Operaciones op = new Operaciones();

		System.out.println("Primer arreglo");
		Funciones.leerArray(arr);
		System.out.println("Segundo arreglo");
		Funciones.leerArray(arr2);
		

		System.out.println("------------------");
		Funciones.imprimirArray(op.suma(arr,arr2));
		System.out.println("------------------");
		Funciones.imprimirArray(op.resta(arr,arr2));
		System.out.println("------------------");
		op.multiplicacionEscalar(arr,3);
		Funciones.imprimirArray(arr);



	}
}