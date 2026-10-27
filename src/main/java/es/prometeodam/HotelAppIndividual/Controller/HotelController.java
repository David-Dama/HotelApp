package es.prometeodam.HotelAppIndividual.Controller;


import es.prometeodam.HotelAppIndividual.model.Hotel;
import es.prometeodam.HotelAppIndividual.model.Habitacion;
import es.prometeodam.HotelAppIndividual.service.GestorXML;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HotelController {
    
    @FXML
    private TextField txtNumeroHabitacion;
    
    @FXML
    private Label lblResultado;
    
    @FXML
    private void handleBuscarHabitacion() {
        String numeroBuscado = txtNumeroHabitacion.getText().trim();
        
        try {
            // Cargas el hotel con JAXB
            Hotel hotel = GestorXML.cargarReservas("src/main/resources/reservas.xml");
            
            Habitacion encontrada = null;
            for (Habitacion h : hotel.getHabitaciones()) {
                if (h.getNumero().equals(numeroBuscado)) {
                    encontrada = h;
                    break;
                }
            }
            
            if (encontrada != null) {
                lblResultado.setText(String.format("Hab. %s [%s] -> Estado: %s (%.0f €)",
                    encontrada.getNumero(), encontrada.getTipo(),
                    encontrada.getEstado().toUpperCase(), encontrada.getPrecioNoche()));
            } else {
                lblResultado.setText("La habitación " + numeroBuscado + " no existe.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            lblResultado.setText("Error al leer el XML.");
        }
    }
}