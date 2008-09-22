package mnAerolinea;
import java.util.*;
public class Aerolinea {

	private String nit;
	private String nombre;
	private ArrayList<Avion> flota;


	public Aerolinea()
	{
		flota = new ArrayList<Avion>();
	}
	
	public Aerolinea(String nit, String nombre)
	{
		setNit(nit);
		setNombre(nombre);
		flota = new ArrayList<Avion>();		
	}
	public void setNit(String nit)
	{
		this.nit=nit;
	}
	
	public String getNit()
	{
		return nit;
	}
		
	public void setNombre(String nombre)
	{
		this.nombre=nombre;		
	}
    
	public String getNombre()
	{
		return nombre;
	}
	
	public boolean adicionarAvion(Avion a)
	{
		boolean adicionado=false;
		
		if(a!=null)
		{
			if(a.valido())
			{
				if(buscarAvion(a)!=null)
					adicionado=false;  // si no lo puede adicionar retorna false
				else
				{
						flota.add(a);
						adicionado=true;  // si lo puede adicionar retorna true
				}
			}
		}
		return adicionado;	
	}
	
    public Avion buscarAvion(Avion avion )
    {
    	
    	for (Avion a : flota) {
    		
        	if(a.getMatricula().trim().equals(avion.getMatricula().trim()))        
        		return a;  //retorna el avion que encontro con la matricula dada        
		}        			      
        return null; 
    }
    
    public StringBuilder listarAviones()
    {
    	 StringBuilder listaStr=new StringBuilder();
    	  for (Avion a : flota)
    		  listaStr.append(a.toString()+"\n");
    	  
    	  return listaStr;          	   
    }    
    
    public String toString()
    {
    	return "Aerolinea ="+nombre+"  nit="+nit;
    }
}
