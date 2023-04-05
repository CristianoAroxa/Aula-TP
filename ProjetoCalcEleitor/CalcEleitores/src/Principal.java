
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
                CalculoEleitores calc = new CalculoEleitores();
        
            int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("***** Eleições Brejaúvas 2022 ***** \n " 
                 + "\n 1 - Inserir a Quantidade de Votos: \n 2 - Calcular Total de Eleitores: \n 3 - Calcular Percentual de Votos: \n 4 - Mostrar Percentual de Votos: \n 0 - Sair"));
            
            switch(op){
                case 1:
                    calc.inserirQtdVotos();
                    break;
                case 2:
                    calc.cacularTotalEleitores();
                    break;
                case 3:
                    calc.calcularPercentualVotos();
                    break; 
                case 4:
                    calc.mostrarPercentual();
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
