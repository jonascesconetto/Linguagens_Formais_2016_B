/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorteste;

import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author santiago
 */
public class CompiladorTeste {
    public static Stack<Double> pilha = new Stack<Double>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Lexico lex = new Lexico("3");
            Sintatico sin = new Sintatico();
            Semantico sem = new Semantico();
            sin.parse(lex, sem);
            System.out.println("Resultado: "+pilha.pop());
        } catch (LexicalError ex) {
            Logger.getLogger(CompiladorTeste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SyntaticError ex) {
            Logger.getLogger(CompiladorTeste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SemanticError ex) {
            Logger.getLogger(CompiladorTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
