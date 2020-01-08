package Trabalho;

import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo("Chevrolet", "Opala", "AWJ-9875", "Branco", 4477);
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Escolha uma opção:");
		System.out.println("1- Informações do carro");
		System.out.println("2- Ligar o carro");
		System.out.println("3- Trocar cor");
		System.out.println("4- Abastecer carro");
		
		int entrada = sc.nextInt();
		
		switch (entrada) {
		case 1:  {
			
			System.out.printf("Marca: %s %n Modelo: %s %n Placa: %s %n Cor: %s %n Km: %s %n", carro.getModelo(), carro.getMarca(), carro.getPlaca(), carro.getCor(), carro.getKm());
			
			
		}break;
		
		case 2: {
			
			Veiculo.ligar();
			System.out.println("Carro ligado \n");
			System.out.println("Escola uma opção ");
			System.out.println("1- Acelerar carro ");
			System.out.println("2- Frear carro");
			
			int opAcao = sc.nextInt();
			
			switch (opAcao) {
			
			case 1: {
				
				Veiculo.acelerar();
				
				System.out.printf("Velocidade: %d Km %n Consumo: %d L \n", carro.getVelocidade(), carro.getLitrosCombustivel());
				
			}break;
			
			case 2: {
				
				Veiculo.frear();
				System.out.printf("Velocidade: %d Km ", carro.getVelocidade());
				
			}break;
			
			default:
				throw new IllegalArgumentException("opção inválida \n");
			}
			
			
		}break;
		
		case 3: {
			
			System.out.println("Digite uma nova cor para se carro: \n");
			String cor = sc.nextLine();
			Veiculo.pintar(cor);
			
		}break;
		
		case 4: {
			
			System.out.println("Quantos litros vai ser abastecido? \n");
			int litros = sc.nextInt();
			
			Veiculo.abastecer(litros);
		}break;
		
		default:
			
			System.out.println("Opção inválida! \n");
		}
		
		
	}

}
