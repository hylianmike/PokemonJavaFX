module com.example.pokemonfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pokemonfx to javafx.fxml;
    exports com.example.pokemonfx;
}