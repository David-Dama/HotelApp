package es.prometeodam.HotelAppIndividual.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "hotel")
public class Hotel {
    
    private String nombre;
    private String categoria;
    private String fechaDatos;
    private String ciudad;
    private String direccion;
    private String telefono;
    private List<Habitacion> habitaciones = new ArrayList<>();
    
    // Atributos de la etiqueta raíz <hotel>
    @XmlAttribute(name = "nombre")
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @XmlAttribute(name = "categoria")
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @XmlAttribute(name = "fechaDatos")
    public String getFechaDatos() {
        return fechaDatos;
    }
    
    public void setFechaDatos(String fechaDatos) {
        this.fechaDatos = fechaDatos;
    }
    
    // Elementos hijos directos de <hotel>
    @XmlElement(name = "ciudad")
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @XmlElement(name = "direccion")
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @XmlElement(name = "telefono")
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Envoltorio <habitaciones> que contiene la lista de <habitacion>
    @XmlElementWrapper(name = "habitaciones")
    @XmlElement(name = "habitacion")
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}