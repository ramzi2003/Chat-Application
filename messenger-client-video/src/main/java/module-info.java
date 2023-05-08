module com.example.messengerclientvideo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messengerclientvideo to javafx.fxml;
    exports com.example.messengerclientvideo;
}