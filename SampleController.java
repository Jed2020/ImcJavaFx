package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SampleController {
	
	
	public Button calcular; 
	public TextField idade;
	public TextField peso;
	public TextField altura;
	
	public void clicou() {
		double mult = Double.parseDouble(altura.getText()) * Double.parseDouble(altura.getText());
		double imc = Integer.parseInt(peso.getText()) / mult;
		
		 
		   String resultado="Seu IMC �: "+(imc);
           
           
           if(imc < 18.5){
               resultado+=" . Voc� est� abaixo do peso";
           }
           else if(imc < 24.9){
               resultado+=" . Voc� est� com peso ideal";
           }
           else if(imc < 29.9){
               resultado+=" . Voc� est� levemente acima do peso";
           }
           else if(imc < 34.9){
               resultado+=" . Voc� est� no primeiro grau de obesidade";
           }
           else if(imc < 39.9){
               resultado+=" . Voc� est� no segundo grau de obesidade";
           }
           else
               resultado+=" . Voc� est� em obesidade m�rbida";

          		
		Alert alerta = new Alert(AlertType.WARNING);
		alerta.setTitle("IMC: ");
		alerta.setContentText(resultado + ". Sua Idade �: " + Integer.parseInt(idade.getText()));
		alerta.show();
		
	}
}
