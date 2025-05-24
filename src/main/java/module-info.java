module com.example.lv4z1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lv4z1 to javafx.fxml;
    exports com.example.lv4z1;
}