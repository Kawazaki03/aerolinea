package mnAerolinea;


public class Silla
{
    public final static int CLASE_EJECUTIVA = 1;
    public final static int CLASE_ECONOMICA = 2;
    public final static int VENTANA = 1;
    public final static int CENTRAL = 2;
    public final static int PASILLO = 3;

    private int numero;
    private int clase;
    private int ubicacion;
    private Pasajero pasajero;

    public Silla( int unNumero, int unaClase, int unaUbicacion )
    {
        numero = unNumero;
        clase =  unaClase;
        ubicacion = unaUbicacion;   
        pasajero = null;
    }

        public int getNumero( )
    {
        return numero;
    }
    public int getClase( )
    {
        return clase;
    }

    public int getUbicacion( )
    {
        return ubicacion;
    }
    public Pasajero getPasajero( )
    {
        return pasajero;
    }    
    public String toString()
    {
    	return "numero=\t"+numero+"\tclase\t"+clase+"\tubicación\t"+ubicacion;
    }
    public void asignarAPasajero( Pasajero p )
    {
        pasajero = p;
    }
    public boolean sillaLibre( )
    {
        if( null == pasajero )
            return true;
        else
            return false;
    }
    
}