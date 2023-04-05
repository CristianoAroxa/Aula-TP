
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
public class CalculoEleitores {
    private int numeroEleitores;
    private int numeroVotosBrancos;
    private int numeroVotosNulos;
    private int numeroVotosValidos;
    private double percVBrancos;
    private double percVNulo;
    private double percVValidos;
    
    public CalculoEleitores(){
        this(0,0,0,0,0.0,0.0,0.0);
    }

    public CalculoEleitores(int numeroEleitores, int numeroVotosBrancos, int numeroVotosNulos, int numeroVotosValidos, double percVBrancos, double percVNulo, double percVValidos) {
        this.numeroEleitores = numeroEleitores;
        this.numeroVotosBrancos = numeroVotosBrancos;
        this.numeroVotosNulos = numeroVotosNulos;
        this.numeroVotosValidos = numeroVotosValidos;
        this.percVBrancos = percVBrancos;
        this.percVNulo = percVNulo;
        this.percVValidos = percVValidos;
    }

    public int getNumeroEleitores() {
        return numeroEleitores;
    }

    public void setNumeroEleitores(int numeroEleitores) {
        this.numeroEleitores = numeroEleitores;
    }

    public int getNumeroVotosBrancos() {
        return numeroVotosBrancos;
    }

    public void setNumeroVotosBrancos(int numeroVotosBrancos) {
        this.numeroVotosBrancos = numeroVotosBrancos;
    }

    public int getNumeroVotosNulos() {
        return numeroVotosNulos;
    }

    public void setNumeroVotosNulos(int numeroVotosNulos) {
        this.numeroVotosNulos = numeroVotosNulos;
    }

    public int getNumeroVotosValidos() {
        return numeroVotosValidos;
    }

    public void setNumeroVotosValidos(int numeroVotosValidos) {
        this.numeroVotosValidos = numeroVotosValidos;
    }

    public double getPercVBrancos() {
        return percVBrancos;
    }

    public void setPercVBrancos(double percVBrancos) {
        this.percVBrancos = percVBrancos;
    }

    public double getPercVNulo() {
        return percVNulo;
    }

    public void setPercVNulo(double percVNulo) {
        this.percVNulo = percVNulo;
    }

    public double getPercVValidos() {
        return percVValidos;
    }

    public void setPercVValidos(double percVValidos) {
        this.percVValidos = percVValidos;
    }
    public void inserirQtdVotos(){
        this.setNumeroVotosBrancos(Integer.parseInt(JOptionPane.showInputDialog("Digite o de votos brancos: ")));
        this.setNumeroVotosNulos(Integer.parseInt(JOptionPane.showInputDialog("Digite o de votos nulos: ")));
        this.setNumeroVotosValidos(Integer.parseInt(JOptionPane.showInputDialog("Digite o de votos válidos: ")));
    }
    public void cacularTotalEleitores(){
        this.setNumeroEleitores(getNumeroVotosValidos()+ getNumeroVotosBrancos() + getNumeroVotosNulos());    
    }
    public void calcularPercentualVotos(){
        setPercVBrancos((numeroVotosBrancos * 100)/numeroEleitores);
        setPercVNulo((numeroVotosNulos * 100)/numeroEleitores);
        setPercVValidos((numeroVotosValidos * 100)/numeroEleitores);        
    }
    public void mostrarPercentual(){
        JOptionPane.showMessageDialog(null," O total de votos é: " +getNumeroEleitores()+ "\n O percentual de Votos Brancos é: "+getPercVBrancos()+"%"+ "\n O percentual de Votos Nulos é: "
                +getPercVNulo()+"%"+ "\n O percentual de Votos Válidos é: "+getPercVValidos()+"%");
       
    }
    
    
    
}
    

