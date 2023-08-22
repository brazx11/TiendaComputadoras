package LogicoComponentes;

import java.util.ArrayList;
import java.util.List;

import Logico.ComponentesComputadora;
import Logico.Enum.TipoRam;
import Logico.Enum.TipoSocket;

public class MotherBoard extends ComponentesComputadora {
	private TipoSocket tipoSocket;
	private TipoRam tipoRam;
	private ArrayList <String>listaConexiones;
	
	

	public MotherBoard(float precio, int cantidadDisponible, String numeroSerie, String marca, String modelo,TipoSocket tipoSocket,TipoRam tipoRam,List listaConexiones) {
		super(precio, cantidadDisponible, numeroSerie, marca, modelo);
		this.tipoRam = tipoRam;
		this.tipoSocket = tipoSocket;
		this.setListaConexiones(new ArrayList <>());
		
	}



	public MotherBoard() {
		// TODO Auto-generated constructor stub
	}



	public TipoSocket getTipoSocket() {
		return tipoSocket;
	}



	public void setTipoSocket(TipoSocket tipoSocket) {
		this.tipoSocket = tipoSocket;
	}



	public TipoRam getTipoRam() {
		return tipoRam;
	}



	public void setTipoRam(TipoRam tipoRam) {
		this.tipoRam = tipoRam;
	}



	public ArrayList<String> getListaConexiones() {
		return listaConexiones;
	}



	public void setListaConexiones(ArrayList listaConexiones) {
		this.listaConexiones = (ArrayList<String>) listaConexiones;
	}
	
	

}
