module com.example.hmiproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hmiproject to javafx.fxml;
    exports com.example.hmiproject;
}