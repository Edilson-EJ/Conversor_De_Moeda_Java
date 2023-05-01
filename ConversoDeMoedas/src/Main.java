import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int escolha = 1;
		
		
		OutraMoedaParaReal valormoeda = new OutraMoedaParaReal();
		RealParaOutraMoeda real = new RealParaOutraMoeda();
		
		while(escolha != 3) {
			
			System.out.println("1: Real para outra moeda  2: Outra Moeda Para Real 3: sair");
			escolha = entrada.nextInt();
			
			if(escolha == 1 || escolha == 2) {
				
				System.out.println("Agora digite o valor que você deseja converte: ");
				int valor = entrada.nextInt();
				
				System.out.println("Valor: " + valor);
				
				if(escolha == 2 ) {
					System.out.println("Digite qual moeda você deseja converte para Real");
					System.out.println("1: DOLAR");
					System.out.println("2: EURO");
					System.out.println("3: LIBRA ESTELINA");
					System.out.println("4: PESO ARGENTINO");
					System.out.println("5: PESO CHILENO");
					int moeda = entrada.nextInt();
					
					System.out.println("Escolha: " + moeda);
					
					double resultado = valormoeda.outraMoedaParaReal(moeda, valor);
					
					System.out.println("Valor convertido:" + resultado);
					
				}else {
					System.out.println("Digite para  qual moeda você deseja converte de Real para: ");
					
					System.out.println("1: DOLAR");
					System.out.println("2: EURO");
					System.out.println("3: LIBRA ESTELINA");
					System.out.println("4: PESO ARGENTINO");
					System.out.println("5: PESO CHILENO");
					int moedaConveter = entrada.nextInt();
					double resultado = real.realParaOutraMoeda(moedaConveter, valor);
					
					System.out.println("Valor convertido e: " + resultado);
				}
		
			
		}else {
			System.out.println("Tchau!!");
		}
		
		
		
	}

}

}
