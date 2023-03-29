
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
public class Calculator {
    private double n1;
    private double n2;
    private double result;
    
    public Calculator(){
        this(0.0,0.0,0.0);
    }

    public Calculator(double n1, double n2, double result) {
        this.n1 = n1;
        this.n2 = n2;
        this.result = result;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public void somar(){
        setN1 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1")));
        setN2 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2")));
        setResult(getN1()+ getN2());
        
                
    }
    public void subtrair(double a , double b){
        this.setResult(this.getN1()- getN2());
    }
    
    public double multiplicar(){
       setN1 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1")));
       setN2 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2")));
       setResult(getN1()* getN2());
        return 0;
       }
    public double dividir(double a, double b){
        this.setResult(this.getN1()/ getN2());
        return getResult();
    }
    
}
