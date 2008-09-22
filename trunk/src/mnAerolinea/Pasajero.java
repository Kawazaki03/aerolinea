package mnAerolinea;

public class Pasajero{
    private String documento;
    private String nombre;
    private String apellido;

    public Pasajero( String documento, String nombre, String apellido )
    {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getDocumento( )
    {
        return documento;
    }
    
    public String getNombre( )
    {
        return nombre;
    }
    
    public String getApellido( )
    {
        return apellido;
    }    

    
    public boolean igualA( Pasajero otroPasajero )
    {
        if( documento == otroPasajero.getDocumento())
            return true;
        else
            return false;
    }
}
