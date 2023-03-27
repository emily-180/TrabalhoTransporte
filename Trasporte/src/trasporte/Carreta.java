
package trasporte;

public class Carreta {
    private String cor;
    private String modeloCarreta;
    
    Carreta(String modelo){
        this.modeloCarreta = modelo;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModeloCarreta() {
        return modeloCarreta;
    }

    public void setModeloCarreta(String modeloCarreta) {
        this.modeloCarreta = modeloCarreta;
    }
    
    
}
