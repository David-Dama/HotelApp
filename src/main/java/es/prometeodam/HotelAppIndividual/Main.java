package es.prometeodam.HotelAppIndividual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            System.out.println("Cargando FXML...");
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/views/vista.fxml"));
            
            if (fxmlLoader.getLocation() == null) {
                System.err.println("ERROR CRÍTICO: No se encuentra 'vista.fxml'.");
                return;
            }
            
            Scene scene = new Scene(fxmlLoader.load(), 850, 520);
            stage.setTitle("Hotel Prometeo");
            stage.setScene(scene);
            stage.show();
            System.out.println("Aplicación cargada correctamente.");
            
        } catch (Exception e) {
            System.err.println("FALLO AL CARGAR LA INTERFAZ:");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}