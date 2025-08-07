import java.util.Scanner;

class Exercicio01emjava {
	public static void main(String[] args){ 
		Scanner entrada = new Scanner(System.in);
		String linha = "";
		int qn = 0;
		while(!linha.equals("FIM")){
			linha = entrada.nextLine(); 
			for(int i = 0; i<linha.length(); i++){
				if(linha.charAt(i) >= 'A' && linha.charAt(i) <= 'Z'){
					qn++;
				}
			}
			if(!linha.equals("FIM")){
				System.out.println(qn);
				qn=0;
			}
		}
	}
}
