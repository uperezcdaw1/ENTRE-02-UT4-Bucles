
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Unai Pérez
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        /*DÍGITOS PRIMER NÚMERO*/
        int numero1 = n1;
        int numero2 = n2;
        int septimo;
        int sexto;
        int quinto;
        int cuarto;
        int tercero;
        int segundo;
        int primero;
        septimo = numero1%10;
        numero1 = numero1/10;
        sexto = numero1%10;
        numero1 = numero1/10;
        quinto = numero1%10;
        numero1 = numero1/10;
        cuarto = numero1%10;
        numero1 = numero1/10;
        tercero = numero1%10; 
        numero1 = numero1/10;
        segundo = numero1%10;
        numero1 = numero1/10;
        primero = numero1%10;
        
        /*DÍGITOS SEGUNDO NÚMERO*/
        int septimo2;
        int sexto2;
        int quinto2;
        int cuarto2;
        int tercero2;
        int segundo2;
        int primero2;
        septimo2 = numero2%10;
        numero2 = numero2/10;
        sexto2 = numero2%10;
        numero2 = numero2/10;
        quinto2 = numero2%10;
        numero2 = numero2/10;
        cuarto2 = numero2%10;
        numero2 = numero2/10;
        tercero2 = numero2%10; 
        numero2 = numero2/10;
        segundo2 = numero2%10;
        numero2 = numero2/10;
        primero2 = numero2%10;
        
        /*VARIABLES PARA LAS SUMAS DE LOS DÍGITOS*/
        int sumaPrimero = (primero + primero2);
        int sumaSegundo = (segundo + segundo2);
        int sumaTercero = (tercero + tercero2);
        int sumaCuarto = (cuarto + cuarto2);
        int sumaQuinto = (quinto + quinto2);
        int sumaSexto = (sexto + sexto2);
        int sumaSeptimo = (septimo + septimo2);
        int unoForzado = 1;
        
        if(sumaSeptimo > 7){
            sumaSeptimo = sumaSeptimo - 8;
            sumaSexto = sumaSexto + 1;
        } else {
            sumaSeptimo = septimo + septimo2;
        }
        if(sumaSexto > 7){
            sumaSexto = sumaSexto - 8;
            sumaQuinto = sumaQuinto + 1;
        } else {
            sumaSexto = sexto + sexto2;
        }
        if(sumaQuinto > 7){
            sumaQuinto = sumaQuinto - 8;
            sumaCuarto = sumaCuarto + 1;
        } else {
            sumaQuinto = quinto + quinto2;
        }
        if(sumaCuarto > 7){
            sumaCuarto = sumaCuarto - 8;
            sumaTercero = sumaTercero + 1;
        } else {
            sumaCuarto = cuarto + cuarto2;
        }
        if(sumaTercero > 7){
            sumaTercero = sumaTercero - 8;
            sumaSegundo = sumaSegundo + 1;
        } else {
            sumaTercero = tercero + tercero2;
        }
        if(sumaSegundo > 7){
            sumaSegundo = sumaSegundo - 8;
            sumaPrimero = sumaPrimero + 1;
        } else {
            sumaSegundo = segundo + segundo2;
        }
        if(sumaPrimero <= 7){
            sumaPrimero = primero + primero2;
        } else {
            sumaPrimero = sumaPrimero - 8;
        }
        System.out.println(sumaPrimero + "" + sumaSegundo + "" + sumaTercero + "" + sumaCuarto + "" + sumaQuinto + "" + sumaSexto + "" + sumaSeptimo);
        return 0;
    }
    
    
}
