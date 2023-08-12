package estudos;

import java.util.Scanner;

public class Entities {
    
    public static double dolar = 4.91;
    public static double euro = 5.38;
    public static double yuan = 0.68;
    
    int resposta;
    int moedas;
    
    public void quantidade(Scanner sc) {
        
        System.out.println("Qual moeda deseja comprar:");
        System.out.println("Dolar: 1, Euro: 2, Yuan: 3");
        
        resposta = sc.nextInt();
        
        System.out.println("Quantas moedas, deseja comprar: ");
        moedas =  sc.nextInt();
        
        casamoedas(); 
    }
    
    public void casamoedas() {
        switch (resposta) {
            case 1:
                System.out.printf("O valor a ser pago é de R$: %.2f",(moedas * dolar)); 
                break;
            case 2:
                System.out.printf("O valor a ser pago é de R$: %.2f", (moedas * euro)); 
                break;
            case 3:
                System.out.printf("O valor a ser pago é de R$: %.2f", (moedas * yuan)); 
                break;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entities atividade = new Entities();
        atividade.quantidade(scanner); 
        scanner.close();
    }
}


