/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretador;
import gals.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jc
 */
public class Interpretador {
    
    public static Stack<Double> pilha = new Stack<Double>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lexico lex = new Lexico("(1+1)*99");
       
        Sintatico sin = new Sintatico();
        Semantico sem = new Semantico();
        
        try {
            sin.parse(lex, sem);
            
            System.out.println("Resultado: "+pilha.pop());
        } catch (LexicalError ex) {
            Logger.getLogger(Interpretador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SyntaticError ex) {
            Logger.getLogger(Interpretador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SemanticError ex) {
            Logger.getLogger(Interpretador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
