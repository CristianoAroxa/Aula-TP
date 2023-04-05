
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
           ClienteControl controler = new ClienteControl();  
       
       
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("***** Cálculo de limite de Crédito ***** \n " 
                 + "\n 1 - Cadastrar Cliente: \n 2 - Listar Cliente: \n 3 - Calcular Limite de Crédito: \n 0 - Sair"));
            
            switch(op){
                case 1:
                    controler.cadastrarCliente();
                    break;
                case 2:
                    controler.listarCliente();
                    break;
                case 3:
                    controler.calcularLimiteCredito();
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
    }
    
}
