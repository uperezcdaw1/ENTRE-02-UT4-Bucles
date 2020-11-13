import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Unai Pérez
 */
public class Utilidades
{
    //Métodos
    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) { 
        //Variables para obtener los dígitos, he supuesto que no habrían números mayores de 7 dígitos.
        int numero = n;
        int septimo;
        int sexto;
        int quinto;
        int cuarto;
        int tercero;
        int segundo;
        int primero;
        septimo = numero%10;
        numero = numero/10;
        sexto = numero%10;
        numero = numero/10;
        quinto = numero%10;
        numero = numero/10;
        cuarto = numero%10;
        numero = numero/10;
        tercero = numero%10; 
        numero = numero/10;
        segundo = numero%10;
        numero = numero/10;
        primero = numero%10;
        while((septimo<8) && (sexto<8) && (quinto<8) && (cuarto<8) && (tercero<8) && (segundo<8) && (primero<8)){
            return true;
        }         
        return false;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        //Variables para saber cuantos dígitos tiene nuestro número
        int digitos = 0;

        while(n != 0)
        {
            n = n/10;
            digitos++;
        }

        return digitos;
    }

}
