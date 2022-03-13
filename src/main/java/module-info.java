module com.example.desafiodiopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiodiopoo.dominio to javafx.fxml;
    exports com.example.desafiodiopoo.dominio;
}