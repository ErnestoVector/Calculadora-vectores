/*
2018-1
	Galvez Martinez Ernesto
	Bruno
	Erick
	Luis

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

				
				//Multiplicacion entre matrices A*B
				case 6:
					
				break;

				
				//Multiplicacion por escalar matriz A
				case 7:
				break;

				//Multilicacion por escalar matriz B
				case 8:
				break;

				
				//Traza matriz A 
				case 9:
				break;

				
				//Traza matriz B
				case 10:
				break;

				default:
				break;

			}
		}while(opcion != 0); //Condicion para salir del menu y del programa
	}
}