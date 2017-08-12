import java.util.Scanner;	//Libreria para leer datos del teclado

public class Vector
{
//------Atributos:-----------------------------------------------------------------
	private int dimen;			//Tamaño de los vectores
	private double [] vec1;		//Vector 1
	private double [] vec2;		//Vector 2
	private double escalar;		//Para multiplicacion por escalar

//------Constructores:-------------------------------------------------------------
	//Overload
	public Vector()
	{
		this.dimen = 1;
		vec1 = new double[dimen];
	}

	public Vector(int dimen)
	{
		this.dimen = dimen;
		vec1 = new double[dimen];
	}

//------Getters & Setters----------------------------------------------------------
	public int getDimen()
	{
		return dimen;
	}
	
	public void setDimen(int dimen)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIngrese la dimencion del vector:\t");

		//Aplicando validación (sólo valores positivos)
		do
		{
			dimen = sc.nextInt();
			if (dimen >= 1)
			{
				this.dimen = dimen;
			}
			else
			{
				System.out.println("Por favor, ingresa un valor -----entero positivo-----:\t");
			}
		}while(dimen < 1);
		
	}

	public double[] getVector1()
	{
		return vec1;
	}

	public void setVector1(double[] vec1)
	{
		this.vec1 = vec1;
	}

	public double[] getVector2()
	{
		return vec2;
	}

	public void setVector2(double[] vec2)
	{
		this.vec2 = vec2;
	}
	
	public void setEscalar(double escalar)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIngrese el escalar para multiplicar la matriz:\t");
		escalar = sc.nextInt();
		this.escalar = escalar;
	}

//------Metodos:--------------------------------------------------------------------------
	//Llena el vector
	public void llenaVector()
	{
		Scanner sc = new Scanner(System.in);	//Sirve para leer valores del teclado

		for (int i = 0; i < dimen; i++)
		{
			System.out.print("Vector[" + i + "]:\t");
			vec1[i] = sc.nextDouble();	//Inserta al vector el valor leido del teclado			
		}
	}

	//Imprime el vector
	public void imprimeVector()
	{		
		System.out.print("(");

		for (int i = 0; i < dimen; i++)
		{
			System.out.print(vec1[i]);	//Imprime el valor del vector
			if(i != dimen - 1)				//Si no es el ultimo valor de la columna...
				{
					System.out.print("\t");		//Imprime un tabulador
				}
		}

		System.out.print(")");		
	}

	//Suma de vectores
	public Vector sumaVector(Vector vec2)
	{
		Vector suma = new Vector(dimen);

		if(getDimen() == vec2.getDimen())
		{
			for (int i = 0; i < dimen; i++) 
			{
				//Guarda en "suma" el resultado del vector 1 "vec1" y el vector 2 "vec2"
				suma.vec1[i] = vec1[i] + vec2.vec1[i];
				//vec2 es un parametro, por ello debemos acceder como objeto al arreglo	
			}
		}
		else
		{
			System.out.println("Vectores incompatibles para la operacion");
		}
		
		return suma;
	}

	//Resta de vectores
	public Vector restaVector(Vector vec2)
	{
		Vector resta = new Vector(dimen);

		if(getDimen() == vec2.getDimen())
		{
			for (int i = 0; i < dimen; i++) 
			{
				//Guarda en "suma" el resultado del vector 1 "vec1" y el vector 2 "vec2"
				resta.vec1[i] = vec1[i] - vec2.vec1[i];
				//vec2 es un parametro, por ello debemos acceder como objeto al arreglo	
			}
		}
		else
		{
			System.out.println("Vectores incompatibles para la operacion");
		}
		
		return resta;
	}

}