import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1_599.99;
        int opcao = 0;

        System.out.println("******************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("******************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}
