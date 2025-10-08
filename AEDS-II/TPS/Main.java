import java.util.Scanner;
class games{
	/*public Scanner sc = new Scanner(System.in);
	private int appID = 0;
	private String name = "";
	private String data = "00/00/00";
	private int owners = 0; 
	private float price = 0;
	private Lista languages = new Lista();
	private int metascore = 0;
	private int userscore = 0;
	private int achievement = 0;
	private String publisher = "";
	private String developers = "";
	private Lista categories = new Lista();
	private Lista genres = new Lista();
	private Lista tags = new Lista();
	

	int getAppID(){return appID;}
	String getName(){return name;}
	String getData(){return data;}
	int getOwners(){return owners;}
	float getPrice(){return price;}
	Lista getLanguages(){return languages;}
	int getMetascore(){return metascore;}
	int getUserscore(){return userscore;}
	int getAchievement(){return achievement;}
	String getPublisher(){return publisher;}
	String getDevelopers(){return developers;}
	Lista getCategories(){return categories;}
	Lista getGenres(){return genres;}
	Lista getTags(){return tags;}
	

	void setAppID(int x){appID = x;}
	void setName(String x){name = x;}
	void setData(String x){data = x;}
	void setOwners(int x){owners = x;}
	void setPrice(float x){price = x;}
	void setLanguages(Lista x){languages = x;}
games teste = new games();	void setMetascore(int x){metascore = x;}
	void setUserscore(int x){userscore = x;}
	void setAchievement(int x){achievement = x;}
	void setPublisher(String x){publisher = x;}
	void setDevelopers(String x){developers = x;}
	void setCategories(Lista x){categories = x;}	
	void setGenres(Lista x){genres = x;}
	void setTags(Lista x){tags = x;}
	*/

	public String reset(String x){
		x = "";
		return x;
	}

	
	public int str_int(String cont){
		int resp = 0;
		for(int i = 0; i < cont.length();  i++){
			resp += cont.charAt(i)-'0';
			resp *=10;
		}
		return resp/10;
	}
	

	public float str_flo(String cont){
		float resp = 0;
		int i = 0;
		while(cont.charAt(i) != ','){
			resp += cont.charAt(i)-'0';
			resp *=10;
			i++;
		}
		i++;
		int j = cont.length()-1;
		while(j>=i){
			resp += cont.charAt(j);
			j--;
		}
		for(int aux = 0; aux < cont.length() - i + 1; aux++){
			resp/=10;
		}
		resp += cont.charAt(i)-'0';                         
		resp *=10;	
		return resp;
	}

	public String str_data(String x){	
		String dia = "", mes = "", ano = "";
		int i = 0;
		while(x.charAt(i) != ' '){
			mes+=x.charAt(i);
			i++;
		}
		i++;
		while(x.charAt(i) != ','){
			dia+=x.charAt(i);
			i++;
		}
		i+=2;
		while(x.charAt(i) != '"'){
			mes+=x.charAt(i);
		}
		x = reset(x);
		resp += Str_int(dia);
		resp += '/';
		switch	(dia){
			case "jan":
				resp += "01";
			case "feb":
				resp += "02";
			case "mar":
				resp += "03";
			case "apr":
				resp += "04";
			case "may":
				resp += "05";
			case "jun":
				resp += "06";
			case "jul":
				resp += "07";
			case "ago":
				resp += "08";
			case "sep":
				resp += "09";
			case "oct":
				resp += "10";
			case "nov":
				resp += "11";
			case "dec":
				resp += "12";
		}
		resp +='/';
		resp += str_int(ano);
		return x;
	}


	public games (String linha){
		int i = 0;
		String aux = "";
		while(linha.charAt(i)!=','){ //string para o ID
			aux += linha.charAt(i);
			i++;
		}
		i++;
		this.appID = str_int(aux);
		reset(aux);
		while(linha.charAt(i)!=','){	//string do nome
			aux += linha.charAt(i);
			i++;
		}
		i+=2;
		this.name = aux;
		aux = reset(aux);
		while(linha.charAt(i) != '"'){	//string da data
			aux += linha.charAt();
			i++;
		}
		i+=2;
		this.data = str_data(aux);
		while(linha.charAt(i) != ','){
			aux += linha.charAt(i);
			i++;
		}
		i++;
		this.owner = str_int(aux);
		aux = reset(aux);
	}

	public games(){
		
	}
	void print(){
		System.out.println(appID + "" + name + "" + data + "" + owners + "" + price);
		languages.print();
		System.out.println(metascore + "" + userscore + "" + achievement + "" + publisher + "" + developers);
		categories.print();
		genres.print();
		tags.print();
	}
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		games teste = new games();
		System.out.println(teste.str_flo(x));
	}
}
