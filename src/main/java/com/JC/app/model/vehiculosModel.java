package com.JC.app.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="vehiculos")
public class vehiculosModel {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id_vehi;
	    @Column
	    private String nombre;
	    @Column
	    private Date entrada;
	    @Column
	    private Date salida;
	    @Column
	    private double pago;
	    @Column
	    private String estado;
	    @Column
	    private String vehiculo;
	    @Column
	    private Date horas;
	    
		public vehiculosModel(long id_vehi, String nombre, Date entrada, Date salida, double pago, String estado,
				String vehiculo, Date horas) {
			super();
			this.id_vehi = id_vehi;
			this.nombre = nombre;
			this.entrada = entrada;
			this.salida = salida;
			this.pago = pago;
			this.estado = estado;
			this.vehiculo = vehiculo;
			this.horas = horas;
		}
	    
		public vehiculosModel() {
			
		}
		
		

		public long getId_vehi() {
			return id_vehi;
		}

		public void setId_vehi(long id_vehi) {
			this.id_vehi = id_vehi;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Date getEntrada() {
			return entrada;
		}

		public void setEntrada(Date entrada) {
			this.entrada = entrada;
		}

		public Date getSalida() {
			return salida;
		}

		public void setSalida(Date salida) {
			this.salida = salida;
		}

		public double getPago() {
			return pago;
		}

		public void setPago(double pago) {
			this.pago = pago;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getVehiculo() {
			return vehiculo;
		}

		public void setVehiculo(String vehiculo) {
			this.vehiculo = vehiculo;
		}

		public Date getHoras() {
			return horas;
		}

		public void setHoras(Date horas) {
			this.horas = horas;
		}
		
		
	    

}
