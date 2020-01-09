package Trabalho;

public class Veiculo {

	String marca;
	String modelo;
	String placa;
	static String cor;
	float Km;
	static boolean isLigado;
	static int litrosCombustivel;
	static int velocidade;
	double preco;
	
	public Veiculo(String marca, String modelo, String placa, String cor, float km) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.Km = km;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public static void setCor(String cor) {
		Veiculo.cor = cor;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public static void setLigado(boolean isLigado) {
		Veiculo.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public static void setLitrosCombustivel(int litrosCombustivel) {
		Veiculo.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public static void setVelocidade(int velocidade) {
		Veiculo.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static void ligar() {

		if (isLigado == false) {

			setLigado(true);
		}

	}
	
	public static void desligar() {
		
		if(isLigado == true) {
			
			setLigado(false);
		}
	}

	public static void acelerar() {
		
		if(isLigado == true) {
		setVelocidade(20);
		setLitrosCombustivel(1);
	}else {
		
		System.out.println("Carro desligado!");
	}
		
	}
	
	public static void frear() {
		
		if(isLigado == true && velocidade > 0) {
			
			setVelocidade(10);
			
		}else {
			
			System.out.println("Carro desligado ou abaixo de 10 km");
		}
	}
	
	public static void abastecer(int qtdLitros) {
		
		if(qtdLitros <= 100) {
			
			setLitrosCombustivel(qtdLitros);
			
		}else {
			
			System.out.println("Quantidade de litros ecedeu!");
		}
	}
	
	public static void pintar(String cor) {
		
		setCor(cor);
	
	}


}
