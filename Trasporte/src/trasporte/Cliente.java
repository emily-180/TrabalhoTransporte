
package trasporte;

public class Cliente {
    
    private String nome;
    private String CPF;
    private String RG;
    Viagem v1 = new Viagem("São Carlos", 800.0, 380.0);
    Camioneiro c1 = new Camioneiro("Fábio", "123.345.21-00", "123.765.876.-22", 1234.8);
    Carreta carreta1 = new Carreta("Ford");
    
    Cliente(String nome, Camioneiro c1, Carreta carreta1, Viagem v1){
        this.nome = nome;
        this.carreta1 = carreta1;
        this.v1 = v1;
        this.c1 = c1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
   
  /*  A classe “Cliente” deverá conter um método sem retorno e argumento com o nome “visualizarViagem” , esse método deverá
imprimir na saída padrão as seguintes informações: 1ª linha (nome do cliente), 2ª linha (nome do Caminhoneiro), 3ª linha (nome do
veículo), 4ª linha (destino da viagem), 5ª linha (valor do quilômetro e distância percorrida) e na 6ª linha (valor total da viagem).
*/
    public void visualizaViagem(){
        System.out.println("Nome do cliente: "+getNome());
        System.out.println("Nome do camioneiro: "+c1.getNome());
        System.out.println("Nome do veículo: "+carreta1.getModeloCarreta());
        System.out.println("Destino: "+v1.getDestino());
        System.out.println("Valor: "+ v1.getValorKM()+ "Distancia percorrida: "+v1.getDistancia());
        System.out.println("Valor total da viagem: "+ v1.getValorViagem());
    }

}
