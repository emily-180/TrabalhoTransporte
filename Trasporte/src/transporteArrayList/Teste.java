
package transporteArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carreta carreta1 = new Carreta("Ford");
        Camioneiro c1 = new Camioneiro("Marquinhos", "123.345.21-00", "123.765.876.-22", 1234.8);
        
        ArrayList<Viagem> lista = new ArrayList<>();
        Viagem viagem1 = new Viagem ("São Carlos", 800.0, 380.0);
        Viagem viagem2 = new Viagem ("Belo Horizonte ", 2580.0, 380.0);
        lista.add(viagem1);
        lista.add(viagem2);
        
        Cliente cliente1 = new Cliente("Fábio", c1, carreta1, lista);
        System.out.println("Digite o cpf do cliente: ");
        cliente1.setCPF(input.nextLine());
        System.out.println("Digite o rg do cliente: ");
        cliente1.setRG(input.nextLine());
        
        cliente1.visualizaViagem();
        viagem1.calcularViagem();
        viagem2.calcularViagem();
        //fazer o caucular viagem pra todos
    }

}
