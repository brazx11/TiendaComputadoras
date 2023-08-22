package Logico;

import java.util.ArrayList;

public class Computadora {
	
	private ArrayList<ComponentesComputadora> Computadora= new ArrayList<ComponentesComputadora>();
	
	
	public Computadora (ComponentesComputadora computadora) {
		Computadora.add(computadora);
		
	}


	public ArrayList<ComponentesComputadora> getComputadora() {
		return Computadora;
	}


	public void setComputadora(ArrayList<ComponentesComputadora> Computadora) {
		this.Computadora = Computadora;
	}
	

}
