
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    // Almacena el numero usado para encriptar
    private int numero;

    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int numero)
    {
        this.numero = numero;
    }
    
    /**
     * Metodo para encriptar el numero
     */
    public int getNumero()
    {
        return numero;
    }
}
