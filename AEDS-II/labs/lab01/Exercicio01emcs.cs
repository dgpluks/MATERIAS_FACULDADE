using System;
class MainClass{
	public static void Main(string[] args){
		string linha = "";
 		while(linha!="FIM"){
			linha = Console.ReadLine();
			if(linha!="FIM")
				Console.WriteLine(Maiuscula(linha));
		}
	}
	static int Maiuscula(string linha){
		int qn=0;
		for(int i = 0; i < linha.Length; i++){
                                if(linha[i]>='A' && linha[i]<='Z'){
                                        qn++;
                                }
                }
		return qn;
	}
}
