package br.senai.sp.jandira;

import java.util.Scanner;

public class Menu {

    Cliente referenciaCliente = new Cliente();

    Conta referenciaConta = new Conta();


    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean exit = false;

        while (!exit) {


            System.out.println("//// ---- Menu ----////");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Gerar Conta");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Realizar Deposito");
            System.out.println("5 - Realizar Saque");
            System.out.println("6 - Realizar Transferência");
            System.out.println("7 - Sair ");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/");

            int opionUser = scanner.nextInt();
            scanner.nextLine();




            switch (opionUser) {

                case 1:
                    Cliente cliente = new Cliente();
                    cliente.cadastrarCliente();
                    referenciaCliente.adicionarCliente(cliente);
                    break;
                case 2:

                    System.out.println("Informe o CPF do Titular:");
                    long cpfTitular = scanner.nextLong();
                    scanner.nextLine();

                    Cliente clienteConta = referenciaCliente.pesquisarCliente(cpfTitular);
                    if (clienteConta != null) {
                        Conta conta = new Conta();
                        referenciaConta.adcionarConta(conta);
                        System.out.println("Conta criada com sucesso...");
                    } else {
                        System.out.println("O cliente não tem cadastro...");
                    }

                    break;
                case 3:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfSaldo = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaSaldo = referenciaConta.pesquisarConta(cpfSaldo);

                    if (contaSaldo != null) {
                        contaSaldo.consultarSaldo();
                    } else {
                        System.out.println("O cliente não tem conta cadastrada...");
                    }


                    break;
                case 4:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfDeposito = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaDeposito = referenciaConta.pesquisarConta(cpfDeposito);

                    if (contaDeposito != null) {
                        System.out.println("Informe o valor para deposto: ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();

                        contaDeposito.realizarDeposito(valorDeposito);
                    } else {
                        System.out.println("O cliente não tem conta cadastrada...");
                    }


                    break;
                case 5:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfSaque = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaSaque = referenciaConta.pesquisarConta(cpfSaque);
                    if (contaSaque != null) {
                        System.out.println("Informe o valor que deseja Sacar:");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine();
                    } else {
                        System.out.println("O cliente não tem conta cadastrada...");
                    }


                        break;
                        case 6:
                            System.out.println("Informe o CPF do Titular: ");
                            long cpfUser = scanner.nextLong();
                            scanner.nextLine();
                            System.out.println("Informe a conta para quem deseja depositar: ");
                            long cpfDestinatario = scanner.nextLong();
                            scanner.nextLine();
                            Conta contaUser = referenciaConta.pesquisarConta(cpfUser);
                            Conta contaDestinatario = referenciaConta.pesquisarConta(cpfDestinatario);

                            if (contaUser != null && contaDestinatario != null) {
                                referenciaConta.realizarTransferencia(contaUser, contaDestinatario);
                            } else {
                                System.out.println("Por favor verifique as informações digitadas...");
                            }
                            break;


                        case 7:
                            exit = true;
                            break;
                    }


            }
    }


}
