package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PrincipalController implements Initializable {
	
	@FXML
	private Button botaoEntrar;
	
	@FXML
	private Label labelEntrar;
	
	@FXML
	private TextArea labelNumeroCartao;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	@FXML 
	public void acaoBotaoEntrar() throws InterruptedException, IOException {
		System.out.println("Clicou em Entrar.");
		
		Conta conta = new Conta();
		conta.setNome("Rodolfo");
		conta.setNumeroCartao(1);
		conta.setNumeroConta(123);
		conta.setSaldo(999.00);
		
		if(labelNumeroCartao.getText().isEmpty()) {
			labelEntrar.setText("Cartão não Informado");
			return;
		} else {
			if(conta.validarCartaoContaCorrente(Integer.parseInt(labelNumeroCartao.getText()))) {
				labelEntrar.setText("Entrando");
				
				Stage stageAtual = (Stage) botaoEntrar.getScene().getWindow(); //Obtendo a janela atual
				stageAtual.close(); //Fechando o Stage
				
				Stage stageOperacoes = new Stage();
				Parent operacoes = FXMLLoader.load(getClass().getResource("Operacoes.fxml"));
				Scene scene = new Scene(operacoes);
				stageOperacoes.setScene(scene);
				stageOperacoes.show();
				
				
			} else {
				labelEntrar.setText("Cartão Inválido");
			}
		}
	}
}
