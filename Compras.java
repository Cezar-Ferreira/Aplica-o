package switchcase;

	import java.util.Scanner;

	public class Compras {
	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o nome da pessoa:");
	        String nome = scanner.nextLine();
	        System.out.println("Digite a idade da pessoa:");
	        int idade = scanner.nextInt();
	        System.out.println("Digite o sexo da pessoa (M/F):");
	        String sexo = scanner.next();

	      
	        System.out.println("Digite o saldo da conta da pessoa:");
	        double saldoConta = scanner.nextDouble();

	       
	        System.out.println("Opções de compra:");
	        System.out.println("1 - Sapato");
	        System.out.println("2 - Camisa");
	        System.out.println("3 - Calça");

	       
	        int opcaoCompra = scanner.nextInt();
	        String compra = "";

	        switch (opcaoCompra) {
	            case 1:
	                double valorSapato = 300;
	                if (valorSapato > saldoConta) {
	                    System.out.println("Você não pode comprar o sapato.");
	                } else {
	                    saldoConta -= valorSapato;
	                    compra = "Sapato";
	                }
	                break;
	            case 2:
	                double valorCamisa = 200;
	                if (valorCamisa > saldoConta) {
	                    System.out.println("Você não pode comprar a camisa.");
	                } else {
	                    saldoConta -= valorCamisa;
	                    compra = "Camisa";
	                }
	                break;
	            case 3:
	                double valorCalca = 400;
	                if (valorCalca > saldoConta) {
	                    System.out.println("Você não pode comprar a calça.");
	                } else {
	                    saldoConta -= valorCalca;
	                    compra = "Calça";
	                }
	                break;
	            default:
	                System.out.println("Opção inválida.");
	        }

	        System.out.println("Relatório da pessoa:");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Sexo: " + sexo);
	        if (!compra.isEmpty()) {
	            System.out.println("Compra: " + compra);
	        } else {
	            System.out.println("A pessoa não comprou nada ou não quis fazer nada.");
	        }
	    }
	}

