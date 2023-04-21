module com.example.hp_graphicpart {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.hp_graphicpart to javafx.fxml;
    exports com.example.hp_graphicpart;
}