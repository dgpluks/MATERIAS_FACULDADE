using System;
class MainClass{
	static void Main(String[] args){
		String linha = "";
 		while(linha!="FIM"){
			linha = Console.ReadLine();
			if(linha!="FIM")
				Console.WriteLine(Maiuscula(linha, 0));
		}
	}
	static int Maiuscula(String linha, int i){
		if(i == linha.Length){
			return 0;
		}else if(linha[i] >= 'A' &&  linha[i] <= 'Z'){
			return 1 + Maiuscula(linha, i+1); 
		}else{
		 	return Maiuscula(linha, i+1);
		}
	}
	
}
