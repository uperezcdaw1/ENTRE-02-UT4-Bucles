
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

        int llevadas = 0;
        int unidadExtra = 0;
        int modulo = 10;
        int division = 1;
        int resultado = 0;

        for(int i = 1; i <= Utilidades.contarCifras(n1); i++){
            int numero1 = (n1 % modulo) / division;
            int numero2 = (n2 % modulo) / division;
            modulo = modulo * 10;
            division = division * 10;
            int suma = numero1 + numero2 + unidadExtra;
            if(suma > 7){
                suma = suma - 8;
                unidadExtra = 1;
            }
            resultado += suma * (int)(Math.pow(10, llevadas));
            llevadas++;
        }

        resultado = resultado + unidadExtra * division;
        return resultado;
    }

}
