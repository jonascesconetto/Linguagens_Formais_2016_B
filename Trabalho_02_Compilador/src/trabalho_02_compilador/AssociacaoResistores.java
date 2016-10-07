/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_02_compilador;

import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import trabalho_02_compilador.pilha;

/**
 *
 * @author jc
 */
public class AssociacaoResistores  implements Initializable{
         
    @FXML
    TextField txtCampo;
    
        
    @FXML
    Button btnCalcular;
    
    Stack<Double> pilha = new Stack<>();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }
    
    public void onClickCalcular( ActionEvent event)throws IOException{
        
        Stack<Double> pilha = new Stack<Double>();
        
        String aux = new String();
        aux = txtCampo.getText();
        Lexico lex = new Lexico(aux);
        
        Sintatico sin = new Sintatico();
        Semantico sem = new Semantico();
        
        try {
            sin.parse(lex, sem); 
            System.out.println("Resultado: "+pilha.pop());
        } catch (LexicalError ex) {
            Logger.getLogger(Trabalho_02_Compilador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SyntaticError ex) {
            Logger.getLogger(Trabalho_02_Compilador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SemanticError ex) {
            Logger.getLogger(Trabalho_02_Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Mensagem de alerta
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("CADASTRO EQUIPAMENTO");
        alert.setHeaderText(null);
        alert.setContentText("Cadastro realizado com sucesso!!!");
        alert.showAndWait();//esperar o click do OK!!
        
    }
}