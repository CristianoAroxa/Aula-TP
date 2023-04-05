
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
        CustoPisos calc = new CustoPisos();
        
            int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("***** Cálculo de Custo de Pisos ***** \n " 
                 + "\n 1 - Inserir Valores do Cômodo: \n 2 - Calcular Preço Por Área: \n 3 - Mostrar Valores: \n 0 - Sair"));
            
            switch(op){
                case 1:
                    calc.inserirValores();
                    break;
                case 2:
                    calc.calcularPrecoPorArea();
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
    
    

