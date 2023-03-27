
package transporteArrayList;

import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private String CPF;
    private String RG;
    Camioneiro c1;
    Carreta carreta1;
    ArrayList<Viagem> v1 = new ArrayList<>();
    
    Cliente(String nome, Camioneiro c1, Carreta carreta1, ArrayList v1){
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
   
    public void visualizaViagem(){
        for(int i=0; i < v1.size();i ++){
            System.out.println("Nome do cliente: "+getNome());
            System.out.println("Nome do camioneiro: "+c1.getNome());
            System.out.println("Nome do veículo: "+carreta1.getModeloCarreta());
            System.out.println("Destino: "+v1.get(i).getDestino());
            System.out.println("Valor: "+ v1.get(i).getValorKM()+ "Distancia percorrida: "+v1.get(i).getDistancia());
            System.out.println("Valor total da viagem: "+ v1.get(i).getValorViagem());
            System.out.println("____________________________________");
            System.out.println("");
        }
        
    }

}
