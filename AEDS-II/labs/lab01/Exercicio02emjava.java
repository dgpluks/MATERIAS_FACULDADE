import java.util.Scanner;
public class Exercicio02emjava{
	public static int maiusculo(String linha, int i){
		if(i == linha.length()){
			return 0;
		}else if(linha.charAt(i) >= 'A' && linha.charAt(i) <= 'Z'){
			return 1 + maiusculo(linha, i+1);
		}else{
			return maiusculo(linha, i+1);
		}
	}
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		String linha = "";
		while(!linha.equals("FIM")){
			linha = entrada.nextLine();
			if(!linha.equals("FIM")){
				System.out.println(maiusculo(linha, 0));
			}
		}
	}

}
