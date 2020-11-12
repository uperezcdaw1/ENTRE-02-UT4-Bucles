import java.util.Scanner;
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Unai Pérez
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura, int n) {
        int alto = altura;
        for(int i = 1; i < alto; i++){
            escribirEspacios(' ', n);
            for(int asteriscos = 1; asteriscos<=(alto*2); asteriscos++){
                System.out.print("*");
            }
            
        }
        System.out.println();
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        caracter = ' ';
        int espacios = n;
         for (int i = 1; i <= espacios; i++){
         System.out.print(" ");
        }
        System.out.println();
    }
}
