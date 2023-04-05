
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
public class ClienteControl {
    private int id;
    private String nome;
    private String endereco;
    private String email;
    private double rendaMensal;
    private double limiteCredito;
    
    public ClienteControl(){
        this(0,"","","",0.0,0.0);
    }

    public ClienteControl(int id, String nome, String endereco, String email, double rendaMensal, double limiteCredito) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.rendaMensal = rendaMensal;
        this.limiteCredito = limiteCredito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    public void cadastrarCliente(){
        this.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Cliente: ")));
        this.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente: "));
        this.setEndereco(JOptionPane.showInputDialog("Digite o endereço do Cliente: "));
        this.setEmail(JOptionPane.showInputDialog("Digite o e-mail do Cliente: "));
        this.setRendaMensal(Double.parseDouble(JOptionPane.showInputDialog("Digite a renda mensal do Cliente: ")));
       
    }
    
    public void listarCliente(){
       JOptionPane.showMessageDialog(null,"O Cliente: "+getNome()+ "\n Endereço: " +getEndereco()+ "\n E-mail: "+getEmail()+"\n Renda Mensal: R$ " +getRendaMensal());
    }
    
    public void calcularLimiteCredito(){
        this.setLimiteCredito(this.getRendaMensal()*0.40);
        JOptionPane.showMessageDialog(null,"O Cliente: "+getNome()+ " possui um limite de crédito de: R$ "+getLimiteCredito());
    }
    
}
