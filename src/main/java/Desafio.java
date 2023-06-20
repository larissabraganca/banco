import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome = "Larissa Bragança";
        String conta = "Conta-corrente";
        double saldo = 2200.00;
        int menu = 0;
        double valorDepositar = 0;
        double valorTransferir = 0;

        System.out.println("****************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + saldo);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("****************************************");

        while (Boolean.TRUE) {
            System.out.println("""

                    Seja bem vindo ao menu de opções! 
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """);
            menu = leitura.nextInt();

            // regra de fluxo
            String mensagem = "";

            mensagem = Desafio.checarOpcaoMenu(menu);
            if (mensagem != "") {
                System.out.println(mensagem);
            }
            if (menu == 1) {
                System.out.println(Desafio.imprimirSaldo(saldo) + "\n");
            } else if (menu == 2) {
                System.out.println("Digite o valor que deseja depositar:");
                valorDepositar = leitura.nextDouble();
                // saldo += valorDepositar;
                System.out.println("O novo saldo da sua conta é de: " + Desafio.depositar(valorDepositar, saldo) + "\n");
            } else if (menu == 3) {
                System.out.println("Digite o valor que deseja transferir:");
                Double saldoTransferido = saldo;

                while (Boolean.TRUE) {
                    valorTransferir = leitura.nextDouble();
                    saldoTransferido = Desafio.resgatar(valorTransferir, saldo);

                    if (valorTransferir == 0) {
                        break;
                    }

                    if (saldoTransferido == -1d) {
                        System.out.println("O valor que você deseja transferir é maior do que o disponível em sua conta. Digite outro valor: ");

                        continue;
                    }

                    break;
                }
                
                saldo = valorTransferir;
                System.out.println("Transferência realizada com sucesso. O novo saldo da sua conta é de: " + saldo + "\n");
            } else if (menu == 4) {
                System.out.println("Programa encerrado!");
                break;
            }

        }
    }

    // regras
    public static String checarOpcaoMenu(int valorSelecionado) {
        String resultado = "";

        if (valorSelecionado < 1 || valorSelecionado > 4) {
             resultado = "Opção inválida!";
        }

        return resultado;
    }

    public static String imprimirSaldo(double saldo) {
        return "O saldo da sua conta é de: " + saldo;
    }

    public static double depositar(double valorDepositar, double saldo) {
        return saldo + valorDepositar;
    }

    public static double resgatar(double valorResgate, double saldo) {
        if (saldo < valorResgate) {
            // throw new Exception("Saldo nao suficiente para a transferencia.... "+ valorResgate);
            return -1d;
        }

        return saldo - valorResgate;
    }
}   
