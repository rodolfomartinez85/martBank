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
import javafx.stage.Stage;

public class OperacoesController implements Initializable {
	
	@FXML
	private Button botaoSaldo;
	
	@FXML
	private Button botaoSaque;
	
	@FXML
	private Button botaoExtrato;
	
	@FXML
	private Button botaoTransferencia;
	
	@FXML
	private Button botaoSair;

	@FXML
	private Label labelSaldo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	@FXML 
	public void acaoBotaoSaldo() {
		
		Conta conta = new Conta();
		conta.setNome("Rodolfo");
		conta.setNumeroCartao(1);
		conta.setNumeroConta(123);
		conta.setSaldo(999.00);
		
		labelSaldo.setText(Double.toString(conta.getSaldo()));
	}
	
	@FXML 
	public void acaoBotaoSaque() {}
	
	@FXML 
	public void acaoBotaoExtrato() {}
	
	@FXML 
	public void acaoBotaoTransferencia() {}
	
	@FXML 
	public void acaoBotaoSair() throws IOException {
		Stage stageOperacoes = (Stage) botaoSair.getScene().getWindow(); //Obtendo a janela atual
		stageOperacoes.close(); //Fechando o Stage
	    
	    Stage stagePrincipal = new Stage();
		Parent principal = FXMLLoader.load(getClass().getResource("Principal.fxml"));
		Scene scene = new Scene(principal);
		stagePrincipal.setScene(scene);
		stagePrincipal.show();
		
	}
	

}
