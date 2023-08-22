package Logico;

public class ComponentesComputadora {
	private float precio;
	private int cantidadDisponible;
	private String numeroSerie;
	private String marca;
	private String modelo;
	
	
	public ComponentesComputadora() {
		
	}
	
	public ComponentesComputadora(float precio,int cantidadDisponible, String numeroSerie,String marca,String modelo) {
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
		this.numeroSerie = numeroSerie;
		this.setMarca(marca);
		this.setModelo(modelo);
		
		
	}
	
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	

}
