package simplecalc;

import javax.swing.JOptionPane;

/**
 * @author Matheus
 */

public class SimpleCalc {

    public static double soma(){
        double v1=Double.parseDouble(JOptionPane.showInputDialog("Entre com o 1º valor"));
        double v2=Double.parseDouble(JOptionPane.showInputDialog("Entre com o 2º valor"));
        double result=v1+v2;
        return result;
    }
    public static double subtrac(){
        double v1=Double.parseDouble(JOptionPane.showInputDialog("Entre com o 1º valor"));
        double v2=Double.parseDouble(JOptionPane.showInputDialog("Entre com o 2º valor"));
        double result=v1-v2;
        return result;
    }
    
    public static void main(String[] args) {
        double result;
        int funcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o operador:\n1 - Soma\n2 - Subtração"));
        switch(funcao){
            case 1:
                result = soma();
                break;
            case 2:
                result = subtrac();
                break;
            default:
                result=0;
                break;

        }
        JOptionPane.showMessageDialog(null,"O resultado é: "+result);
    }
    
}
