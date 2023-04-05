
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
public class CalculoQuadrado {
    private double areaQuadrado;
    private double perimetroQuadrado;
    
    public CalculoQuadrado(){
        this(0.0,0.0);
    }

    public CalculoQuadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    public double calcularArea(double ladoA){
        setAreaQuadrado(Math.pow(ladoA,2));
        return 0;
    }        
    public double calcularPerimetro(double ladoA){
        setPerimetroQuadrado(4*ladoA);
        return 0;     
    }
    public void mostrarValores(){
         JOptionPane.showMessageDialog(null,"A área do quadrado é: "+getAreaQuadrado()+ "\n O perímetro do quadrado é: " +getPerimetroQuadrado());
                
    }
    
    
}
