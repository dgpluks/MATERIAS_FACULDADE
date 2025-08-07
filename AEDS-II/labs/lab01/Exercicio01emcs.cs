using System;
class MainClass{
	public static void Main(string[] args){
		string linha = "";
		int qn=0;
 		while(linha!="FIM"){
			linha = Console.ReadLine();
			for(int i = 0; i < linha.Length; i++){
				if(linha[i]>='A' && linha[i]<='Z'){
					qn++;
				}
			}
			if(linha!="FIM")
				Console.WriteLine(qn);
			qn=0;
		}
	}
}
