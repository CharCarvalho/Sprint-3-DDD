package com.example.controller;

import java.io.IOException;

import com.example.App;
import com.example.model.Chamado;
import com.example.model.Incidente;
import com.example.model.Solicitante;
import com.example.model.Veiculo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML TextField txtNomeSolicitante;
    @FXML TextField txtNumeroSolicitante;
    @FXML TextField txtCPFSolicitante;
    @FXML TextField txtEmailSolicitante;
    @FXML TextField txtMarcaCarro;
    @FXML TextField txtModeloCarro;
    @FXML TextField txtAnoCarro;
    @FXML TextField txtPlacaCarro;
    @FXML TextField txtPesoCarro;
    @FXML TextField txtEnderecoChamado;
    @FXML TextField txtHoraChamado;
    @FXML TextArea txtDescricaoChamado;

    

    public void adicionarChamado() throws IOException{
        criarChamado();
        enviarChamado();
        limparTela();
        mudarParaPrincipal();
    }

    public void enviarChamado(){
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Aviso");
        alerta.setHeaderText("Solicitação Modal");
        alerta.setContentText("Seus dados foram coletados e em breve a seguradora entrará em contato com você. Clique em 'Ok' para prosseguir.");
        
        alerta.showAndWait();
    }

    private void limparTela(){
        txtNomeSolicitante.clear();
        txtNumeroSolicitante.clear();
        txtCPFSolicitante.clear();
        txtEmailSolicitante.clear();
        txtMarcaCarro.clear();
        txtModeloCarro.clear();
        txtAnoCarro.clear();
        txtPlacaCarro.clear();
        txtPesoCarro.clear();
        txtEnderecoChamado.clear();
        txtHoraChamado.clear();
        txtDescricaoChamado.clear();
    }

    private void criarChamado(){
        Solicitante solicitante = new Solicitante(txtNomeSolicitante.getText(), txtNumeroSolicitante.getText(),txtCPFSolicitante.getText(), txtEmailSolicitante.getText());
        Veiculo veiculo = new Veiculo(txtMarcaCarro.getText(),
        txtModeloCarro.getText(), txtAnoCarro.getText(), txtPlacaCarro.getText(), txtPesoCarro.getText());
        Incidente incidente = new Incidente(txtEnderecoChamado.getText(), txtHoraChamado.getText(), txtDescricaoChamado.getText());
        Chamado chamado = new Chamado(solicitante, veiculo, incidente);
    }

    
    private void mudarParaPrincipal() throws IOException {
        App.setRoot("primary");
    }
    
}