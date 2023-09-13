package com.example.controller;

    import javafx.application.Platform;
    import javafx.fxml.FXML;
    import javafx.scene.control.Alert;
    import javafx.scene.control.Alert.AlertType;
    import javafx.scene.control.ButtonType;
    import javafx.scene.control.TextArea;

public class TertiaryController {

    @FXML TextArea txtMotivo;
    
    @FXML
    public void cancelarChamado(){
        Alert alerta = new Alert(AlertType.CONFIRMATION);
        alerta.setTitle("Aviso");
        alerta.setHeaderText("Cancelamento da solicitação");
        alerta.setContentText("Deseja cancelar a sua solicitação? Essa operação não poderá ser desfeita.");
        var resposta = alerta.showAndWait();
        
        if (resposta.isPresent() && resposta.get().equals(ButtonType.OK)){
            Platform.exit();
        }
    }
}
