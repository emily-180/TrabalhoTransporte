/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasporte;

import java.util.Scanner;

public class Teste {
         
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carreta carreta1 = new Carreta("Ford");
        Camioneiro c1 = new Camioneiro("Marquinhos", "123.345.21-00", "123.765.876.-22", 1234.8);
        Viagem viagem = new Viagem ("São Carlos", 800.0, 380.0);
        Cliente cliente1 = new Cliente("Fábio", c1, carreta1, viagem);
        
        
        System.out.println("Digite o cpf do cliente: ");
        cliente1.setCPF(input.nextLine());
        System.out.println("Digite o rg do cliente: ");
        cliente1.setRG(input.nextLine());
        
        viagem.calcularViagem();
        cliente1.visualizaViagem();
        
    }
}
