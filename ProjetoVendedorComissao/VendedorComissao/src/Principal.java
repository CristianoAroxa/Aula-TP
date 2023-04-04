

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
        Vendas calcComissao  = new Vendas();
        double valorVendido = 0;
       
     
       
       
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("*****Calculo de Comissão Vendedor***** " 
                 + "\n 1 - Digite o nome do Vendedor \n 2 - Digite o Salário Base do Vendedor \n 3 - Digite o Valor Vendido \n 4 - Calcular Comissão \n 0 - Sair"));
            
            switch(op){
                case 1:
                    calcComissao.entarNome();
                    break;
                case 2:
                    calcComissao.entrarSalarioBase();
                    break;
                case 3:
                   valorVendido = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Vendido: R$"));
                    break;
                
                case 4:
                    calcComissao.calculoComissao(valorVendido);
                    JOptionPane.showMessageDialog(null, "O vendedor: " + calcComissao.getNome() + "\n Vendeu: R$ " +calcComissao.getSalarioBase()+ "\n O valor do novo salário é: R$" + calcComissao.getNovoSalario());
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
