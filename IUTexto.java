import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Unai Pérez
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        Scanner teclado = new Scanner(System.in);
        Pantalla borrar = new Pantalla();
        borrar.borrarPantalla();
        Utilidades octales = new Utilidades();
        char continuar;
        do{
            System.out.println("Inserte el primer número octal");
            int octal1 = teclado.nextInt();             
            while(octales.estaEnOctal(octal1) == false){
                System.out.println("Inserte un número válido");
                octal1 = teclado.nextInt();
            }
            System.out.println("Inserte el segundo número octal");
            int octal2 = teclado.nextInt();
            while(octales.estaEnOctal(octal2) == false){
                System.out.println("Inserte un número válido");
                octal2 = teclado.nextInt();
            }
            System.out.println("La suma de ambos números es " + calculadora.sumarEnOctal(octal1,octal2));
            System.out.println("¿Desea repetir? Presione S o s, introduce cualquier tecla para cancelar");
            continuar = teclado.next().charAt(0);            
        }while( continuar == 'S' || continuar == 's');
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        Scanner teclado = new Scanner(System.in);
        Pantalla borrar = new Pantalla();
        borrar.borrarPantalla();
        PintorFiguras pintor = new PintorFiguras();
        char continuar;

        do{
            System.out.println("Inserte la altura de su figura");
            int altura = teclado.nextInt();
            pintor.dibujarFigura(altura);
            System.out.println("¿Desea repetir? Presione S o s, introduce cualquier tecla para cancelar");
            continuar = teclado.next().charAt(0);  
        }while( continuar == 'S' || continuar == 's');
        teclado.close();
    }

}

