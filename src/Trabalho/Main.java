package Trabalho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Marca do carro: ");
		String marca = sc.nextLine();
		System.out.println("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Placa do carro: ");
		String placa = sc.nextLine();
		System.out.println("Cor do carro: ");
		String cor = sc.nextLine();
		System.out.println("KM do carro: ");
		int km = sc.nextInt();
		
		
		Veiculo carro = new Veiculo(marca, modelo, placa, cor, km);
		
		
		
		int entrada;
			
		do {
		
		System.out.println("\n");	
		System.out.println("Escolha uma opção:");
		System.out.println("1- Informações do carro");
		System.out.println("2- Ligar o carro");
		System.out.println("3- Desligar o carro");
		System.out.println("4- Trocar cor");
		System.out.println("5- Abastecer carro");
		
		
		entrada = sc.nextInt();
		
		switch (entrada) {
		case 1:  {
			
			System.out.printf("Marca: %s %n Modelo: %s %n Placa: %s %n Cor: %s %n Km: %s %n Tanque: %d L %n Ligado: %s %n Velocidade: %d Km", carro.getModelo(), carro.getMarca(),
					carro.getPlaca(), carro.getCor(), carro.getKm(), carro.getLitrosCombustivel(), carro.isLigado(), carro.getVelocidade());
			
			
		}break;
		
		case 2: {
			
			int opAcao;
			Veiculo.ligar();
			
			do {
				
			System.out.println("Carro ligado \n");
			System.out.println("Escola uma opção ");
			System.out.println("1- Acelerar carro ");
			System.out.println("2- Frear carro");
			System.out.println("0- Sair");
			
			opAcao = sc.nextInt();
			
			switch (opAcao) {
			
			case 1: {
				
				Veiculo.acelerar();
				
				System.out.printf("Velocidade: %d Km %n Consumo: %d L %n", carro.getVelocidade(), carro.getLitrosCombustivel());
				
			}break;
			
			case 2: {
				
				Veiculo.frear();
				System.out.printf("Velocidade: %d Km ", carro.getVelocidade());
				
			}break;
			
			default:
				System.out.println(" ");
			}
			
			}while(opAcao != 0);
			
		}break;
		
		case 3:{
			
			Veiculo.desligar();
			
		}break;
		
		case 4: {
			
			System.out.println("Digite uma nova cor para o carro: \n");
			String novaCor = sc.next();
			Veiculo.pintar(novaCor);
			
		}break;
		
		case 5: {
			
			System.out.println("Quantos litros vai ser abastecido? \n");
			int litros = sc.nextInt();
			
			Veiculo.abastecer(litros);
		}break;
		
		default:
			
			System.out.println("Saiu \n");
		}
		
		}while(entrada != 0);
		
		sc.close();
	}

}
