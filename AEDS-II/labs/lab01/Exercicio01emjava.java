import java.util.Scanner;

class Exercicio01emjava {
	public static void main(String[] args){ 
		Scanner entrada = new Scanner(System.in);
		String linha = "";
		while(!linha.equals("FIM")){
			linha = entrada.nextLine(); 
			if(!linha.equals("FIM")){
				System.out.println(Maiusculo(linha));
			}
		}
	}
	static int Maiusculo(String linha){
		int qn = 0;
		for(int i = 0; i<linha.length(); i++){
                        if(linha.charAt(i) >= 'A' && linha.charAt(i) <= 'Z'){
                        	qn++;
                	}
                }
		return qn;
	}
}
