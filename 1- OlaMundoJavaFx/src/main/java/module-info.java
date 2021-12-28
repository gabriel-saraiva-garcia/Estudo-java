module com.example.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.olamundojavafx to javafx.fxml;
    exports com.example.olamundojavafx;
}