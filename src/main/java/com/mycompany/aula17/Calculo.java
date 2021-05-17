
package com.mycompany.aula17;
import javax.swing.JOptionPane;


public class Calculo {
    
    public void soma(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Valor A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Valor b"));
        int resultado = a+b;
        
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        
        
        
        
    }
    public int soma(int a, int b) {
        return a+b;
    }
    
    public int soma(int a, int b, int c){
        return a+b+c;
    }
    
}
