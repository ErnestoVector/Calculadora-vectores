//Clase menu (para imprimir las opciones)

public class Menu
{
	public static void imprimeMenu()
	{			
		System.out.println("\nMenu:");
		System.out.println("\t1) Vector A (Llena vector).");
		System.out.println("\t2) Vector B (Llena vector).");
		System.out.println("\t3) A + B");
		System.out.println("\t4) A - B");
		System.out.println("\t5) B - A");
		System.out.println("\t6) *A (multiplicacion por escalar)");
		System.out.println("\t7) *B (multiplicacion por escalar)");
		System.out.println("\t8) Norma Vector A");
		System.out.println("\t9) Norma Vector B");
		System.out.println("\t10) Producto Punto");
		System.out.println("\t11) Angulo entre vectores");
		System.out.println("\t0) Para salir");
	}

	public static void imprimeMiniMenu()
	{
		System.out.print("\n\nIngresa la opcion:\t");
	}
	
}