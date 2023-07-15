package Ejercicios;

import java.io.PrintStream;
import Funcion.funciones;

public class menu {

	public static void main(String[] args) {
		MenuPrincipal();
		
		//String carpetaActual = System.getProperty("user.dir");
        //System.out.println("Carpeta actual: " + carpetaActual);
	}
	
	 public static void MenuPrincipal() {
        PrintStream ps = new PrintStream(System.out);

        ps.println("---------------------------------------------------------------");
        ps.println("");
        ps.println("�Cu�l ejercicio quer�s ver?");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1 - Ejercicio 1");
        ps.println("2 - Ejercicio 2");
        ps.println("3 - Ejercicio 3");
        ps.println("4 - Ejercicio 4");
        ps.println("");
        ps.println("Tu opci�n: ");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
                ps.println("");
                ps.println("Saliendo...");
                break;
            case 1:
                MenuEjer1();
            case 2:
                MenuEjer2();
            case 3:
            	MenuEjer3();
            case 4:
            	MenuEjer4();
            default:
            	ps.println("");
                ps.println("Opci�n inv�lida. Por favor, ingrese una opci�n que se encuentre disponible.");
                MenuPrincipal();
        }
    }
	
	 

	// MENÚ EJERCICIO 1
	public static void MenuEjer1() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
        ps.println("---------------------------------------------------------------");
        ps.println("");
        ps.println("Elige un ejercicio para ver:");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1 - Calcula el valor del sueldo bruto dando como par�metros la cantidad de horas trabajadas y el valor por hora.");
        ps.println("2 - Calcula el valor de un tercer �ngulo dados el de los otros dos.");
        ps.println("3 - Dada la superficie de un cuadrado (en m2), la computadora muestra su per�metro.");
        ps.println("4 - Convierte la temperatura dada en Fahrenheit en Celsius.");
        ps.println("5 - Dado un tiempo, lo convierte en d�as, horas, minutos y segundos.");
        ps.println("6 - Dado el precio de un art�culo, la computadora muestra los valores a pagar seg�n cada plan.");
        ps.println("7 - Dado el signo zodiacal del usuario, la computadora muestra su mes de nacimiento aproximado.");
        ps.println("");
        ps.println("Tu opci�n: ");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Saliendo al men� principal...");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer1_Guia.Ej1a();
                MenuEjer1();
            case 2:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer1_Guia.Ej1b();
                MenuEjer1();
            case 3:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer1_Guia.Ej1c();
                MenuEjer1();
            case 4:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer1_Guia.Ej1d();
                MenuEjer1();
            case 5:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer1_Guia.Ej1e();
                MenuEjer1();
            case 6:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer1_Guia.Ej1f();
                MenuEjer1();
            case 7:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer1_Guia.Ej1g();
                MenuEjer1();
            default:
            	ps.println("");
                ps.println("Opci�n inv�lida. Por favor, ingrese una opci�n que se encuentre disponible.");
                MenuEjer1();
        }
        ps.close();
    }
	
	
	
	
	// MENÚ EJERCICIO 2
	public static void MenuEjer2() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
        ps.println("---------------------------------------------------------------");
        ps.println("");
        ps.println("Elige un ejercicio para ver:");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1 - Dados tres apellidos, la computadora los muestra ordenados alfab�ticamente.");
        ps.println("2 - Dados cuatro n�meros reales, la computadora indica cu�l es el menor.");
        ps.println("3 - Dado un n�mero, la computadora indica si es par o impar.");
        ps.println("4 - Dados dos n�meros reales, la computadora indica si el mayor es divisible por el menor.");
        ps.println("5 - Dada la fecha de nacimiento de una persona, la computadora muestra su signo del zodiaco.");
        ps.println("6 - Dado el nombre y apellido de 2 personas, la computadora muestra cu�l de los 2 tiene el apellido m�s largo.");
        ps.println("7 - Dado un entero N natural, la computadora muestra su tabla de multiplicar.");
        ps.println("8 - Dado un n�mero natural, la computadora indica si es primo o no.");
        ps.println("");
        ps.println("Tu opción: ");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Saliendo al men� principal...");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2a();
                MenuEjer2();
            case 2:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2b();
                MenuEjer2();
            case 3:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2c();
                MenuEjer2();
            case 4:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2d();
                MenuEjer2();
            case 5:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2e();
                MenuEjer2();
            case 6:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2f();
                MenuEjer2();
            case 7:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2g();
                MenuEjer2();
            case 8:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer2_Guia.Ej2h();
                MenuEjer2();
            default:
            	ps.println("");
                ps.println("Opci�n inv�lida. Por favor, ingrese una opci�n que se encuentre disponible.");
                MenuEjer2();
        }
        ps.close();
    }
	
	
	
	
	// MENÚ EJERCICIO 2
	public static void MenuEjer3() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
        ps.println("---------------------------------------------------------------");
        ps.println("");
        ps.println("Elige un ejercicio para ver:");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1 - Crea un archivo de texto que guarda solo el �ltimo dato que el usuario escriba por consola.");
        ps.println("2 - Crea un archivo de texto que guarda TODOS los valores NUMERICOS que ingresa el usuario por consola.");
        ps.println("3 - Crea un archivo de texto (fuera de la carpeta del proyecto) que se llama �n�meros.txt� que guarda los n�meros pares desde el 0 al 1000.");
        ps.println("4 - Utiliza el archivo creado anteriormente �n�meros.txt� y lee los valores para mostrarlos por la consola.");
        ps.println("5 - Utiliza el archivo creado anteriormente �n�meros.txt� y borra todos los renglones que contengan n�meros impares.");
        ps.println("6 - Utiliza el archivo creado anteriormente �n�meros.txt y coloca en otro archivo de texto �primos.dat todos los n�meros de �n�meros.txt� que sean primos.");
        ps.println("7 - Crea un archivo de texto plano llamado �caracteres.dat�, carga 10 palabras que contengan la letra �� mediante consola. Luego muestra las 10 \n"
        		 + "    palabras por consola con la leyenda �Fichero original: � y luego edita el fichero para que cambie todas las apariciones de la letra �� por su fon�tico \n"
        		 + "    �nie-nio� y muestra de nuevo las palabras con la leyenda �Fichero arreglado:�.");
        ps.println("");
        ps.println("Tu opci�n: ");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Saliendo al men� principal...");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer3_Guia.Ej3a();
                MenuEjer3();
            case 2:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer3_Guia.Ej3b();
                MenuEjer3();
            case 3:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer3_Guia.Ej3c();
                MenuEjer3();
            case 4:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer3_Guia.Ej3d();
                MenuEjer3();
            case 5:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer3_Guia.Ej3e();
                MenuEjer3();
            case 6:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer3_Guia.Ej3f();
                MenuEjer3();
            case 7:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer3_Guia.Ej3g();
                MenuEjer3();
            default:
            	ps.println("");
                ps.println("Opci�n inv�lida. Por favor, ingrese una opci�n que se encuentre disponible.");
                MenuEjer3();
        }
        ps.close();
    }
	
	
	
	
	public static void MenuEjer4() {
        PrintStream ps = new PrintStream(System.out);
        
        ps.println("");
        ps.println("---------------------------------------------------------------");
        ps.println("");
        ps.println("Elige un ejercicio para ver:");
        ps.println("");
        ps.println("0 - Salir");
        ps.println("1 - Lista de n�meros.");
        ps.println("2 - Nacionalidades por alumno.");
        ps.println("3 - Dias de la semana en una lista.");
        ps.println("4 - Jugadores del FC BARCERLONA en una lista.");
        ps.println("5 - Generador de bolas random.");
        ps.println("7 - Uni�n de dos conjuntos.");
        ps.println("");
        ps.println("Tu opci�n: ");

        int opcion = Integer.parseInt(funciones.leer());

        switch(opcion) {
            case 0:
            	ps.println("");
                ps.println("Saliendo al men� principal...");
                ps.println("");
                MenuPrincipal();
                break;
            case 1:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer4_Guia.Ej4a();
                MenuEjer3();
            case 2:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer4_Guia.Ej4b();
                MenuEjer3();
            case 3:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer4_Guia.Ej4c();
                MenuEjer3();
            case 4:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer4_Guia.Ej4d();
                MenuEjer3();
            case 5:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer4_Guia.Ej4e();
                MenuEjer3();
            case 7:
            	ps.println("");
                ps.println("Ejecutando ejercicio...");
                ps.println("");
                ps.println("---------------------------------------------------------------");
                ps.println("");
                Ejer4_Guia.Ej4g();
                MenuEjer3();
            default:
            	ps.println("");
                ps.println("Opci�n inv�lida. Por favor, ingrese una opci�n que se encuentre disponible.");
                MenuEjer3();
        }
        ps.close();
    }
}
