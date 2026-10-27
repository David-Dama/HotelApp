package es.prometeodam.HotelAppIndividual.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "habitacion")
public class Habitacion {
    
    private String numero;
    private String estado;
    private String planta;
    private String tipo;
    private int capacidad;
    private double precioNoche;
    private String vista;
    private String accesible;
    
    // Atributos de la etiqueta <habitacion numero="..." estado="..." planta="...">
    @XmlAttribute(name = "numero")
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @XmlAttribute(name = "estado")
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @XmlAttribute(name = "planta")
    public String getPlanta() {
        return planta;
    }
    
    public void setPlanta(String planta) {
        this.planta = planta;
    }
    
    // Elementos hijos dentro de <habitacion> (<tipo>, <capacidad>, etc.)
    @XmlElement(name = "tipo")
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @XmlElement(name = "capacidad")
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @XmlElement(name = "precioNoche")
    public double getPrecioNoche() {
        return precioNoche;
    }
    
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }
    
    @XmlElement(name = "vista")
    public String getVista() {
        return vista;
    }
    
    public void setVista(String vista) {
        this.vista = vista;
    }
    
    @XmlElement(name = "accesible")
    public String getAccesible() {
        return accesible;
    }
    
    public void setAccesible(String accesible) {
        this.accesible = accesible;
    }
}