package iuAerolinea;


import mnAerolinea.*;

public class Consola {


	public static void main(String[] args) {
				
		Aerolinea ae1 = new Aerolinea();
		Aerolinea ae2 = new Aerolinea("01","Avianca");
		Aerolinea ae4 = new Aerolinea("01","Avianca");
		
		System.out.println(ae1.toString());
		System.out.println(ae2.toString());
		
		ae1.setNit("02");
		ae1.setNombre("ACES");
		
		System.out.println(ae1.toString());
		
		Avion a1 = new Avion("HK01",(short)10,(short)5);
		
		
		if(ae1.adicionarAvion(a1))
		{
			System.out.println("adicionado  "+a1.toString());
		}
		else
			System.out.println("error  ");
		
		
		if(ae1.adicionarAvion(a1))
		{
			System.out.println("adicionado  "+a1.toString());
		}
		else
			System.out.println("error  ");
		
		Avion a2 = new Avion("HK02",(short)4, (short)10);
	
		
		if(ae1.adicionarAvion(a2))
		{
			System.out.println("adicionado  "+a2.toString());
		}
		else
			System.out.println("error  ");
		
		System.out.println(ae1.listarAviones());
		
	}

}
