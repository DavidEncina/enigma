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
        return numeroDesencriptado;
    }
}