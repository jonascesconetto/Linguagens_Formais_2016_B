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

/**
 *
 * @author jc
 */
public class Trabalho_02_Compilador {

   public static Stack<Double> pilha = new Stack<Double>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lexico lex = new Lexico("(3+6)+(2/(4+3+2))");
        
        //Lexico lex = new Lexico("(3+3)+((2+2)/4)");
       
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
