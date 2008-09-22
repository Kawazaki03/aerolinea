package mnAerolinea;

import java.util.*;

public class Avion {
	
	public final static short TOTAL_FILAS_ECONOMICA = 6;
	public final static short TOTAL_FILAS_EJECUTIVA = 4;

	private String matricula;
	private short  totalSillasEconomica;
	private short  totalSillasEjecutiva;
	
	private ArrayList<Silla> listaSillas;
    
    
  public Avion(String matricula, short totalFilasEjecutiva, short totalFilasEconomica )
	{
		this.matricula=matricula;	
		totalSillasEconomica=(short)(totalFilasEconomica*TOTAL_FILAS_ECONOMICA);
		totalSillasEjecutiva=(short)(totalFilasEjecutiva*TOTAL_FILAS_EJECUTIVA);
		
		listaSillas = new ArrayList<Silla>(); 
		
		int numeroSilla=1;
	 
		for (int i= 1;i<=totalFilasEjecutiva;i++)
		{
			listaSillas.add(new Silla((short)numeroSilla++,Silla.CLASE_EJECUTIVA,Silla.VENTANA)); 
			listaSillas.add(new Silla((short)numeroSilla++,Silla.CLASE_EJECUTIVA,Silla.PASILLO));					
			listaSillas.add(new Silla((short)numeroSilla++,Silla.CLASE_EJECUTIVA,Silla.PASILLO)); 
			listaSillas.add(new Silla((short)numeroSilla++,Silla.CLASE_EJECUTIVA,Silla.VENTANA));			
		}
		
		int ubicacion; 		
		for (int i= 1;i<=totalSillasEconomica;i++)
		{
            if( i % 6 == 1 || i % 6 == 0 )
                ubicacion = Silla.VENTANA;

            else if( i % 6 == 2 || i % 6 == 5 )
                ubicacion = Silla.CENTRAL;

            else
                ubicacion = Silla.PASILLO;
            
			listaSillas.add(new Silla((short)numeroSilla++,Silla.CLASE_ECONOMICA,(short)ubicacion));
							
		}	
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	 public String toString()
	    {
	    	return "Avion de matricula=\t"+matricula+"\tsillas Economicas="+totalSillasEconomica+
	    			"\tsillas Ejecutivas"+totalSillasEjecutiva;
	    }
	 public boolean valido()
	 {
		 boolean valido=false;
		 if(!matricula.trim().equals("")&&totalSillasEconomica>=0&&totalSillasEjecutiva>=0)
			 valido=true;
		 return valido;
	 }
 
	    public Silla asignarSilla( int clase, int ubicacion, Pasajero pasajero )
	    {

	        Silla silla = null;
	        silla = buscarSillaLibre( clase,ubicacion );
	        
	        if( silla != null ) 
	        {
	            silla.asignarAPasajero( pasajero );
	        }
	        return silla;
	    }

	    public Silla buscarSillaLibre( int clase, int ubicacion )
	    {	    
	        for(Silla s : listaSillas)
	          if(  s.sillaLibre() && s.getClase()== clase && s.getUbicacion()==ubicacion )
	            {
	                return s;	               
	            }	       
	        return null;
	   }

	    public Silla[] obtenerSillasEconomica()
	    {
	    	
	    	Silla[] sillasEconomica= new Silla[totalSillasEconomica];
	    	int i=0;
	    	for(Silla s:listaSillas) 
	    		sillasEconomica[i++]=s;	    	    	    
	    	
	    	return sillasEconomica;
	    }
	    
	    public Silla[] obtenerSillasEjecutiva()
	    {
	    	
	    	Silla[] sillasEjecutivas= new Silla[totalSillasEjecutiva];
	    	int i=0;
	    	for(Silla s:listaSillas) 
	    		sillasEjecutivas[i++]=s;	    	    	    
	    	
	    	return sillasEjecutivas;
	    }
	 public StringBuilder listarSillas()
	    {
	    	 StringBuilder listaStr=new StringBuilder();
	    	  for (Silla s : listaSillas)
	    		  listaStr.append(s.toString()+"\n");
	    	  
	    	  return listaStr;	          		    
	    }
  }
