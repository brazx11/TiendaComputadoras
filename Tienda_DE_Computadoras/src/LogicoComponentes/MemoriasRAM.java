package LogicoComponentes;

import Logico.ComponentesComputadora;
import Logico.Enum.TipoRam;

public class MemoriasRAM extends ComponentesComputadora {
	private double cantidadMemoria;
	private TipoRam tipoRam;
	
	
	public MemoriasRAM(double cantidadMemoria, TipoRam tipoRam, float precio, int cantidadDisponible, String numeroSerie, String marca, String modelo) {
		super(precio, cantidadDisponible, numeroSerie, marca, modelo);
		this.setCantidadMemoria(cantidadMemoria);
		this.setTipoRam(tipoRam);
	}


	public double getCantidadMemoria() {
		return cantidadMemoria;
	}


	public void setCantidadMemoria(double cantidadMemoria) {
		this.cantidadMemoria = cantidadMemoria;
	}


	public TipoRam getTipoRam() {
		return tipoRam;
	}


	public void setTipoRam(TipoRam tipoRam) {
		this.tipoRam = tipoRam;
	}

}
