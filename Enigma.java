/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
    }

    /**
     * Encripta el numero deseado
     */
    public int encripta(Mecanismo mecanismo,int numero)
    {
        int numeroEncriptado = -1;       
        if (mecanismo instanceof MecanismoMultiplicacionPrimo) {        
            if (numero > 10) {
                numeroEncriptado= mecanismo.getNumero() * numero;        
            } 
        } 
        else if (mecanismo instanceof MecanismoOffset) {
            if (numero > 10) {
                String num = Integer.toString(numero);
                for (int i = 0; i < num.length(); i++) {
                    String caracter = num.substring(1,num.length()-i);
                    if (caracter.length() >= 1) {
                        int n = Integer.parseInt(caracter) % 10 + mecanismo.getNumero();
                        if (n < 10){
                            numero += mecanismo.getNumero() * (Math.pow(10,i));
                        }
                        else {
                            numero += mecanismo.getNumero() * (Math.pow(10,i));
                            numero -= (Math.pow(10,i + 1));
                        }
                    }
                }
                numeroEncriptado = numero;
            }            
        }
        return numeroEncriptado;
    }

    /**
     * Desencripta el numero deseado
     */
    public int desencripta(Mecanismo mecanismo,int numero) {
        int numeroDesencriptado = -1;
        if (mecanismo instanceof MecanismoMultiplicacionPrimo) {        
            if (numero /mecanismo.getNumero() > 10) {
                numeroDesencriptado = numero /mecanismo.getNumero();        
            }  else {            
                numeroDesencriptado = -1;
            }      
        } 
        else if (mecanismo instanceof MecanismoOffset){
            if (numero > 10){
                String num = Integer.toString(numero);
                for (int i = 0; i < num.length(); i++){
                    String caracter = num.substring(1,num.length()-i);
                    if (caracter.length() >= 1){
                        int digito = Integer.parseInt(caracter) % 10 + mecanismo.getNumero();
                        if ((Integer.parseInt(caracter) % 10 - mecanismo.getNumero()) >= 0){
                            numero -= mecanismo.getNumero() * (Math.pow(10,i));
                        }
                        else {
                            numero -= mecanismo.getNumero() * (Math.pow(10,i));
                            numero += (Math.pow(10,i + 1));
                        }
                    }
                }
                if (numero > 10){
                    numeroDesencriptado = numero;
                }
            }
        }
        return numeroDesencriptado;
    }
}