import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        String name = "Rennan Marcos Wanzo" ;
        String accountType = "Corrente";
        double accountBalance = 2000.00;
        int options = 0;
        double transfer = 0;

        System.out.println("-------------------------------");
        System.out.println("       Dados da Conta\n");
        System.out.println("Nome: " + name);
        System.out.println("Tipo de Conta: " + accountType);
        System.out.println("Saldo: " + accountBalance);
        System.out.println("-------------------------------");

        while (options != 4){

            System.out.println("""
                \n        Opções
                        
                1 - Verificar Saldo.
                2 - Realizar Transferência.
                3 - Receber Transferência.
                4 - Sair.

                """);
            options = reading.nextInt();

            if (options == 1) {
                System.out.println("\nSaldo Atual: R$ " + accountBalance + "\n");
            }
            else if (options == 2) {
                System.out.println("\nDigite o valor que deseja transferir");
                transfer = reading.nextDouble();

                if (transfer > accountBalance) {
                    JOptionPane.showMessageDialog(null,
                            "Não há saldo suficiente para completar a transação!");
                } else{
                accountBalance -= transfer;
                System.out.println("Saldo Atual: R$ " + accountBalance + "\n");
                }
            }
            else if (options == 3) {
                System.out.println("\nDigite o valor a receber");
                transfer = reading.nextDouble();
                accountBalance += transfer;
                System.out.println("Saldo Atual: R$ " + accountBalance + "\n");
            }
            else if (options == 4) {
                System.out.println("\nEncerrando Sistema...");
            }
            else JOptionPane.showMessageDialog(null,
                        "Opção Inválida!");
        }
    }
}