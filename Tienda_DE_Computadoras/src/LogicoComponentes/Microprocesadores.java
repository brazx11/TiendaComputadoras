package LogicoComponentes;

import Logico.ComponentesComputadora;
import Logico.Enum.TipoSocket;

public class Microprocesadores extends ComponentesComputadora {
	private TipoSocket tipoSocket;
	private double velocidadProcesamiento;
	

	public Microprocesadores(float precio, int cantidadDisponible, String numeroSerie, String marca, String modelo,TipoSocket tipoSocket,double velocidadProcesamiento) {
		super(precio, cantidadDisponible, numeroSerie, marca, modelo);
		this.velocidadProcesamiento = velocidadProcesamiento;
		this.tipoSocket = tipoSocket;
	}


	public TipoSocket getTipoSocket() {
		return tipoSocket;
	}


	public void setTipoSocket(TipoSocket tipoSocket) {
		this.tipoSocket = tipoSocket;
	}


	public double getVelocidadProcesamiento() {
		return velocidadProcesamiento;
	}


	public void setVelocidadProcesamiento(float velocidadProcesamiento) {
		this.velocidadProcesamiento = velocidadProcesamiento;
	}

}
