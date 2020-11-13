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
    public  void dibujarFigura(int altura) {

        for(int i=1;i<=altura;i++){
            escribirEspacios(' ',2);
            for(int j=1;j<(int)(altura/2)+i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<(int)(altura)+i;j++){
                System.out.print("B");
                if(j%4==0 && j%8!=0){
                    {
                        System.out.print("====");
                        break;
                    }
                }
            }         
            System.out.println();
        }

    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        caracter = ' ';
        for (int j=0; j<n; j++) 
        { 
            System.out.print(caracter); 
        } 
    }
}
