
package trasporte;

public class Camioneiro {
    private String nome;
    private String CNPJ;
    private String CPF;
    private double salario;
    
    public Camioneiro(String nome, String CNPJ, String CPF, double salario) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.CPF = CPF;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
