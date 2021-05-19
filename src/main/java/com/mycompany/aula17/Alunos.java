
package com.mycompany.aula17;
import javax.swing.JOptionPane;


public class Alunos {
    
    public void cadastrarAluno(){
        String a[] = new String [10];
        String m[] = {"Matemática", "Português", "Ciências", "Geografia"};
        
        System.out.println(a.length);
        
        for (int i = 0; i < a.length; i++) {
            a[i] = JOptionPane.showInputDialog("Nome do aluno: " + i);
            
        }
        
        for (String aluno : a) {
            System.out.println(aluno);
            
        }
    }
        
        public void atividade1(){
            
          String disc[] = {"Português", "Matemática", "Física", "História", "Geografia"};
          double nota[] = new double[5];
          String result = "";
          
           
            for (int i = 0; i < disc.length; i++) {
                
                nota[1] = Double.parseDouble(JOptionPane.showInputDialog("Nota de: " + disc[i]));
                result += disc[1] + ": " + nota[i] + "\n";
                
                
               JOptionPane.showMessageDialog(null, result); 
            }
            
            //nao entendo oq eu fiz de errado 
            
            
            
            
                
                
            
            
           
            
            
            
        }
        

        
        
        
  
    }
    

