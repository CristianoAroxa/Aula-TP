
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
                CalculoQuadrado calc = new CalculoQuadrado();
        
            int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("***** Cálculo de Custo de Pisos ***** \n " 
                 + "\n 1 - Calcular Área do Quadrado: \n 2 - Calcular Perímetro do Quadrado: \n 3 - Mostrar Valores: \n 0 - Sair"));
            
            switch(op){
                case 1:
                    double ladoA = (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado")));
                    calc.calcularArea(ladoA);
                    break;
                case 2:
                    double ladoB = (Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado")));
                    calc.calcularPerimetro(ladoB);
                    break;
                case 3:
                    calc.mostrarValores();
                    break;                             
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizar Programa");
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida, tente outra vez");
            }
            
        }while(op != 0);
    }


}
