
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calc = new Calculator();
        
                             
        
                int op;
                
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: " 
                 + "\n 1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir \n 0-Sair"));
            
            switch(op){
                case 1:
                    calc.somar();
                    JOptionPane.showMessageDialog(null,"o resultado da soma é " +calc.getResult());
                   
                    break;
                case 2:
                    
                    double a = (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1")));
                    double b = (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2")));
                    
                    calc.subtrair(a,b);
                    JOptionPane.showMessageDialog(null,"o resultado da subtração é " +calc.getResult());
                    break;
                case 3:
                    calc.multiplicar();
                    JOptionPane.showMessageDialog(null,"o resultado da multiplicação é " +calc.getResult());
                    break;
                case 4: 
                    double a1 = (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1")));
                    double b1 = (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2")));
                    calc.dividir(a1,b1);
                    JOptionPane.showMessageDialog(null,"o resto da divisão é " +calc.getResult());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o Programa");
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida, tente outra vez");
            }
            
        }while(op != 0);
    }
    
}
