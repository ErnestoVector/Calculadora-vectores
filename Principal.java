/*
2018-1
	Galvez Martinez Ernesto
	Torres Caballero Bruno
	Lopez Vite Erick Misael
	Ríos Salazar Luis Francisco

Breve descripcion: El programa debe recibir 2 vectores, y a partir de ellos,
poder realizar suma, resta, multiplicacion por un escalar... (completar)
*/
import java.util.Scanner;	//Libreria para leer datos del teclado

public class Principal
{
	public static void main(String[] args) 
	{
//---------Declaración de variables---------------------------------------------------------------------------
		int dimen = 100;						//Declaramos las filas (El límite son 100)
		double escalar = 0;						//La constante por la cual se multiplicara la matriz
		double norma = 0;
		Vector vec1 = new Vector(dimen);		//Creamos el objeto Vector vec1
		Vector vec2 = new Vector(dimen);		//Creamos el objeto Vector vec2
		Vector vecR = new Vector(dimen);		//Creamos una tercer matriz para guardar los resultados
		Scanner sc = new Scanner(System.in);	//Creamos al objeto para leer desde el teclado
		int opcion;								//Variable para el Menu
		
//------------------------------------------------------------------------------------------------------------
		Menu.imprimeMenu();

		do
		{
			Menu.imprimeMiniMenu();
			opcion = sc.nextInt();

			switch(opcion)
			{
				//Vector 1
				case 1:
					vec1.setDimen(dimen);			//Del vector 1 actualizamos dimension
					vec1.llenaVector();				//Llenamos el vector 1
					vec1.imprimeVector();			//Visualizamos el vector 1
				break;
				

				//Vector 2
				case 2:
					vec2.setDimen(dimen);			//Del vector 1 actualizamos dimension
					vec2.llenaVector();				//Llenamos el vector 1
					vec2.imprimeVector();			//Visualizamos el vector 1
				break;
				
				
				//Suma A + B
				case 3:
					System.out.println("\nSuma de 2 vectores:");
					vecR = vec1.sumaVector(vec2);	//Mandamos a sumar los 2 vectores (vec1 + vec2)
					System.out.println("La suma de los vectores es:\t");
					vecR.imprimeVector();
				break;
				
				
				//Resta A - B
				case 4:
					System.out.println("\nResta de 2 vectores:");
					vecR = vec1.restaVector(vec2);	//Mandamos a sumar los 2 vectores (vec1 + vec2)
					System.out.println("La resta A - B es:\t");
					vecR.imprimeVector();
				break;

				
				//Resta B - A
				case 5:
					System.out.println("\nResta de 2 vectores:");
					vecR = vec2.restaVector(vec1);	//Mandamos a sumar los 2 vectores (vec1 + vec2)
					System.out.println("La resta B - A es:\t");
					vecR.imprimeVector();
				break;

				
				//Multiplicacion por escalar A
				case 6:
					vec1.setEscalar(escalar);
					vecR = vec1.multEscalar();
					System.out.println("Vector A * escalar:\t");
					vecR.imprimeVector();
				break;

				
				//Multiplicacion por escalar B
				case 7:
					vec2.setEscalar(escalar);
					vecR = vec2.multEscalar();
					System.out.println("Vector B * escalar:\t");
					vecR.imprimeVector();
				break;

				//Norma del Vector A
				case 8:
					norma = vec1.normaVector();
					System.out.println("La norma del Vector A es:\t" + norma);
				break;

				
				//Norma del Vector B 
				case 9:
					norma = vec2.normaVector();
					System.out.println("La norma del Vector B es:\t" + norma);
				break;

				
				//Producto Punto
				case 10:
					escalar = vec1.productoPunto(vec2);
					System.out.println("Producto Punto:\t" + escalar);
				break;

				//Angulo entre vectores
				case 11:
					escalar = vec1.anguloVectores(vec2);
					System.out.println("Angulo entre Vectores:\t" + escalar + " radianes");
				break;

				default:
				break;

			}
		}while(opcion != 0); //Condicion para salir del menu y del programa
	}
}