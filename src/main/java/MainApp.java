import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    @Override
    public void start(Stage primaryStage) {
        try {
            // 1. Cargamos el archivo de diseño
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main_view.fxml"));
            Parent root = loader.load();

            // 2. Configuramos la escena
            Scene scene = new Scene(root, 1000, 700); // Tamaño inicial (Ancho x Alto)

            // 3. Cargamos el CSS
            scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());

            // 4. Configuración del Stage (Ventana)
            primaryStage.setTitle("Marduk Music Player");
            primaryStage.setScene(scene);
            primaryStage.setMinWidth(800);
            primaryStage.setMinHeight(600);

            primaryStage.show();
            logger.info("La interfaz de Marduk Music Player se ha cargado correctamente.");

        } catch (Exception e) {
            logger.error("Error al cargar la interfaz principal: ", e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}