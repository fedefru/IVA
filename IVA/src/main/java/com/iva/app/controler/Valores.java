package com.iva.app.controler;

public class Valores {
	private int precio;
	private int iva = 21;
	private int bruto=0;
	private int precioIva;
	private int precioBruto;
	private int precioFinal;

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getBruto() {
		return bruto;
	}

	public void setBruto(int bruto) {
		this.bruto = bruto;
	}

	public int getPrecioIva() {
		return precioIva;
	}

	public void setPrecioIva(int precioIva) {
		this.precioIva = precioIva;
	}

	public int getPrecioBruto() {
		return precioBruto;
	}

	public void setPrecioBruto(int precioBruto) {
		this.precioBruto = precioBruto;
	}

	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int CalcularIva() {
		precioIva= (precio*iva)/100;
		return precioIva;
	}
	
	public int CalcularBruto() {
		precioBruto = precio - (precio*17)/100;
		return precioBruto;
	}
	
}
