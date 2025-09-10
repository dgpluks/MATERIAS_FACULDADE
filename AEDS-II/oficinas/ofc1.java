import java.util.Scanner;
class pessoa{
	private String nome;
	private int gols;
	private int ass;
	private int part;
	public pessoa(){
		nome = "";
		gols = 0;
		ass = 0;
		part = 0;
	}
	public int getPart(){
		return part;
	}
	public String getNome(){
		return nome;
	}
	public int getGols(){
		return gols;
	}
	public int getAss(){
		return ass;
	}
	public void setPart(int qn){
		part = qn;
	}
	public void setNome(String Nome){
		nome = Nome;
	}
	public void setGols(int qn){
		gols = qn;
	}
	public void setAss(int qn){
		ass = qn;
	}
}
public class ofc1{
	public static boolean alfa(String p, String s){
		int j = 0;
		while(p.length() > j && s.length() > j){
			if(s.charAt(j) > p.charAt(j)){
				return false;
			}else if(s.charAt(j) < p.charAt(j)){
				return true;
			}
			j++;
		}
		if(p.length() < s.length()){
			return false;
		}
		return true;
	}
	public static void iO(pessoa[] jog, pessoa pl, int i){
		if(i == 0){
			jog[i] = pl;
		}else{
			while((jog[i-1].getGols()+jog[i-1].getAss())/jog[i-1].getPart() > (pl.getGols()+pl.getAss())/pl.getPart()){
				jog[i] = jog[i-1];
				i--;
			}
			while((jog[i-1].getGols()+jog[i-1].getAss())/jog[i-1].getPart() == (pl.getGols()+pl.getAss())/pl.getPart() && jog[i-1].getGols() > pl.getGols()){
				jog[i] = jog[i-1];
				i--;
			}
			while(jog[i-1].getGols() == pl.getGols() && alfa(jog[i].getNome(), pl.getNome())){
				jog[i] = jog[i-1];
				i--;
			}
			jog[i] = pl;
		}
	}
	public static Scanner sc = new Scanner(System.in);
	public static void setPes(pessoa[] jog, int i){
		pessoa p = new pessoa();
		String nome = sc.next();
		p.setNome(nome);
		int cont = 0;
		while(sc.hasNextInt()){
			if(cont == 0){
				p.setGols(p.getGols() + sc.nextInt());
				cont = 1;
				p.setPart(p.getPart() + 1);
			}else if (cont == 1){
			System.out.println("asda");
				p.setAss(p.getAss() + sc.nextInt());
				cont = 0;
			}
		}
		iO(jog, p, i);
	}
	public static void main(String[] args){
		int qn;
		qn = sc.nextInt();
		pessoa[] jog = new pessoa[qn];
		for(int i = 0; i < qn; i++){
			setPes(jog, i);
		}
		for(int i = 0; i < qn; i++){
			System.out.println(i + " " +jog[i].getNome() + " " + " - Média: " + (jog[i].getGols()+jog[i].getAss())/jog[i].getPart() + " - Gols: " + jog[i].getGols());
		}
	}
}
