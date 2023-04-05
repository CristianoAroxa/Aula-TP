
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
public class CustoPisos {
    
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;
    
    public CustoPisos(){
            this(0.0,0.0,0.0,0.0);
    }

    public CustoPisos(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    public void inserirValores(){
         this.setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do cômodo: M ")));
         this.setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do cômodo: M ")));
         this.setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por m² : ")));
    }
    
    public void calcularPrecoPorArea(){
        this.setCustoTotalComodo(this.getComprimentoComodo()*this.getLarguraComodo()*this.getPrecoPorArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null,"O comprimento do cômodo é: "+getComprimentoComodo()+ "M\n A largura do cômodo é: " +getLarguraComodo()+ "M\n O preço por área é: R$ "
                +getPrecoPorArea()+"\n O custo total do cômodo é: R$ " +getCustoTotalComodo());
    }
    
}
