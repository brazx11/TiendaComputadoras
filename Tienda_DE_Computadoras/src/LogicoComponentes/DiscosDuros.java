package LogicoComponentes;

import Logico.ComponentesComputadora;
import Logico.Enum.TipoConexion;

public class DiscosDuros extends ComponentesComputadora {
	private double capacidadAlmacenamiento;
	private TipoConexion tipoconexion;
	

	public DiscosDuros(double capacidadAlmacenamiento, TipoConexion tipoconexion, float precio, int cantidadDisponible, String numeroSerie, String marca, String modelo) {
		super(precio, cantidadDisponible, numeroSerie, marca, modelo);
		this.setCapacidadAlmacenamiento(capacidadAlmacenamiento);
		this.setTipoconexion(tipoconexion);
	}


	public double getCapacidadAlmacenamiento() {
		return capacidadAlmacenamiento;
	}


	public void setCapacidadAlmacenamiento(double capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}


	public TipoConexion getTipoconexion() {
		return tipoconexion;
	}


	public void setTipoconexion(TipoConexion tipoconexion) {
		this.tipoconexion = tipoconexion;
	}


	public static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
