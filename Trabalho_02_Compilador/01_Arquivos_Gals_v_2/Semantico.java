package gals;
import trabalho_02_compilador.*; 

public class Semantico implements Constants{
    
    public void executeAction(int action, Token token)	throws SemanticError{
        
        Double a, b;
        
        switch(action){
            
            case 1:
                a = Double.parseDouble(token.getLexeme());
                Trabalho_02_Compilador.pilha.push(a);
                System.out.println(a);
                break;
            case 2:
                a = Trabalho_02_Compilador.pilha.pop();
                b = Trabalho_02_Compilador.pilha.pop();
                System.out.println(a+"+"+b);
                Trabalho_02_Compilador.pilha.push((a*b)/(a+b));
                break;
            case 3:
                a = Trabalho_02_Compilador.pilha.pop();
                b = Trabalho_02_Compilador.pilha.pop();
                System.out.println(a+"*"+b);
                Trabalho_02_Compilador.pilha.push(a+b);
                break;
        }	
    }
}

