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
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author jc
 */

//public class Trabalho_02_Compilador extends Application{
//    
//    public static Stack<Double> pilha = new Stack<Double>();
//    
//    public static void main(String[] args) {
//        launch(); 
//    }
//    
//     @Override
//     public void start(Stage palco) throws Exception {
//         
//         palco.setTitle("TELA PRINCIPAL");
//         Pane principal = FXMLLoader.load(getClass().getResource("Menu.fxml"));
//         Scene cena = new Scene(principal);
//         
//         palco.setScene(cena);
//         palco.setWidth(600);
//         palco.setHeight(400);
//         palco.show();
//     }
//}

public class Trabalho_02_Compilador {
   public static Stack<Double> pilha = new Stack<Double>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lexico lex = new Lexico("(3+6)+(2||(4+3+2))");
        
       /// Lexico lex = new Lexico("(3+3)+((2+2)||4)");
       
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
        
    }
    
}