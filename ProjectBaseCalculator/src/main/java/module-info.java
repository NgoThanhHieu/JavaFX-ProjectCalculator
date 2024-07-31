module com.mycompany.projectbasecalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.projectbasecalculator to javafx.fxml;
    exports com.mycompany.projectbasecalculator;
}
