package gals;
import interpretador.*;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        Double a, b;
        
        switch(action){
            
            case 1:
                a = Double.parseDouble(token.getLexeme());
                Interpretador.pilha.push(a);
                System.out.println(a);
                break;
            case 2:
                a = Interpretador.pilha.pop();
                b = Interpretador.pilha.pop();
                System.out.println(a+"+"+b);
                Interpretador.pilha.push(a+b);
                break;
            case 3:
                a = Interpretador.pilha.pop();
                b = Interpretador.pilha.pop();
                System.out.println(a+"*"+b);
                Interpretador.pilha.push(a*b);
                break;
        }
    }	
}