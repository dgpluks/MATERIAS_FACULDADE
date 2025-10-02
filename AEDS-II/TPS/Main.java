java.util.Scanner;
class games{
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
	int getAppID(){
		return appID;
	}
	String getName(){
		return name;
	}
	String getData(){
		return data;
	}
	int getOwners(){
		return owners;
	}
	float getPrice(){
		return price;
	}
	Lista getLanguages(){
		return languages;
	}
	int getMetascore(){
		return metascore;
	}
	int getUserscore(){
		return userscore;
	}
	int getAchievement(){
		return achievement;
	}
	String getPublisher(){
		return publisher;
	}
	String getDevelopers(){
		return developers;
	}
	Lista getCategories(){
		return categories;
	}
	Lista getGenres(){
		return genres;
	}
	Lista getTags(){
		return tags;
	}
	void setAppID(int x){
		appID = x;
	}
	void setName(String x){
		name = x;
	}
	void setData(String x){
		data = x;
	}
	void setOwners(int x){
		owners = x;
	}
	void setPrice(float x){
		price = x;
	}
	void setLanguages(Lista x){
		languages = x;
	}
	void setMetascore(int x){
		metascore = x;
	}
	void setUserscore(int x){
		userscore = x;
	}
	void setAchievement(int x){
		achievement = x;
	}
	void setPublisher(String x){
		publisher = x;
	}
	void setDevelopers(String x){
		developers = x;
	}
	void setCategories(Lista x){
		categories = x;
	}
	void setGenres(Lista x){
		genres = x;
	}
	void setTags(Lista x){
		tags = x;
	}
	void print(){
		System.out.println(appID);
		System.out.println(name);
		System.out.println(data);
		System.out.println(owners);
		System.out.println(price);
		languages.print();
		System.out.println(metascore);
		System.out.println(userscore);
		System.out.println(achievement);
		System.out.println(publisher);
		System.out.println(developers);
		categories.print();
		genres.print();
		tags.print();
	}
}
