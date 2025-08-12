
import java.util.Scanner;
class atividade01{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int que = 1;
		while( que != 0){
			System.out.println("ESCOLHA QUAL VOCÊ QUER TESTAR:\n1--questão 1\n2--questão 2\n3--questão 3\n4--questão 4\n5--questão 5\n6--escolha os valores\nDIGITE (0) PARA FINALIZAR\n\n\nEU FIZ A FUNÇÃO função "+"dec2bin(x)"+" POR CONTA PROPRIA, NÃO UTILIZANDO UMA BIBLIOTECA\n\n\n\n");
			que = entrada.nextInt();
			if(que != 0){
				switch(que){
					case 1:
						PRIMEIRA();
						break;
					case 2:
						SEGUNDA();
						break;
					case 3:
						TERCEIRA();
						break;
					case 4:
						QUARTA();
						break;
					case 5:
						QUINTA();
						break;
					case 6:
						SEXTA();
						break;
					default:
						System.out.println("OPÇÃO INVÁLIDA\n");
						break;
				}
			}

		}
	}
	public static void dec2bin(int num[], int x){
			System.out.print("\n\n");
		for(int i = 0; i<x; i++){
			if(num[i] == 0){
				System.out.print("0 em binário é 0");
			}else{
				int numero = num[i];
				int[] ver = new int[20];
			       	int j = 0, aux = 1;
				while(aux <= num[i]){
					ver[j] = aux;
					aux +=aux;
					j++;
				}
				int[] val = new int[j+1];
				System.out.println("O valor de " + num[i]+ " em binário é: ");
			       for(aux = 0; aux < j; aux++){	
					if(numero >= ver[j-aux-1]){
						val[aux] = 1;
						numero -= ver[j-1-aux];
					}else{
						val[aux] = 0;
					}
					System.out.print(val[aux]);
				}
			}
			System.out.println("\n");
		}	
		System.out.println("\n\n\n");		
	}
	public static void PRIMEIRA(){
		int[] sequencia = {29, 53, 751,321, 365};
		dec2bin(sequencia, 5);
	}
	public static void SEGUNDA(){
		int[] sequencia = {0, 0, 0,0, 0};
		dec2bin(sequencia, 5);
        }
	public static void TERCEIRA(){
		int[] sequencia = {1,1,1,1,1};
		dec2bin(sequencia, 5);
        }
        public static void QUARTA(){
		int[] sequencia = {2, 2, 2,2, 2};
		dec2bin(sequencia, 5);
        }  
	public static void QUINTA(){
		int[] sequencia = {30, 30, 30,30, 30};
		dec2bin(sequencia, 5); 
        } 
      	public static void SEXTA(){
		Scanner entrada = new Scanner(System.in);	
                System.out.println("Quantos números você quer converter para binàrio??");
		int x = entrada.nextInt();
		int y = 0;
		int[] sequencia = new int[x];
		for(int i = 0; i<x; i++){
			System.out.println("Digite o "+ (i+1) +" valor(maior que 0)");
			sequencia[i] = entrada.nextInt();
			if(sequencia[i] < 0){
				System.out.println("Valor inválido, digite novamente");
				i--;
			}
		}
                dec2bin(sequencia, x);
        }

}
