
package com.mycompany.aula17;
import javax.swing.JOptionPane;


public class Alunos {
    
    public void cadastrarAluno(){
        String a[] = new String [10];
        String m[] = {"Matemática", "Português", "Ciências"};
        
        for (int i = 0; i < 10; i++) {
            a[i] = JOptionPane.showInputDialog("Nome do aluno: " + i);
            
        }
        
        
        
    }
    
}
