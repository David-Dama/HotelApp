package es.prometeodam.HotelAppIndividual.service;

import es.prometeodam.HotelAppIndividual.model.Hotel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class GestorXML {
    public static Hotel cargarReservas(String rutaFichero) throws Exception {
        JAXBContext context = JAXBContext.newInstance(Hotel.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        // Carga el archivo como recurso desde el classpath (/datos/reservas.xml o /reservas.xml)
        InputStream inputStream = GestorXML.class.getResourceAsStream("/datos/reservas.xml");
        
        if (inputStream == null) {
            throw new RuntimeException("No se ha encontrado el archivo reservas.xml en resources.");
        }
        
        return (Hotel) unmarshaller.unmarshal(inputStream);
    }
}