import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
public class Default {

   static class Game{
        private int appID = 0;
        private String name = "";
        private String data = "00/00/00";
        private int owners = 0; 
        private float price = 0;
        private ArrayList<String> languages = new ArrayList<>();
        private int metascore = 0;
        private int userscore = 0;
        private int achievement = 0;
        private String publisher = "";
        private String developers = "";
        private ArrayList<String> categories = new ArrayList<>();
        private ArrayList<String> genres = new ArrayList<>();
        private ArrayList<String> tags = new ArrayList<>();
        
        public Game(){
            this.appID = 0;
            this.name = "";
            this.data = "";
            this.owners = 0;
            this.price = 0;
            this.languages = null;
            this.metascore = 0;
            this.userscore = 0;
            this.achievement = 0;
            this.publisher = "";
            this.developers = "";
            this.categories = null;
            this.genres = null;
            this.tags = null;
        }

        public Game(int appID, String name, String data, int owners, float price,
                ArrayList<String> languages, int metascore, int userscore, int achievement,
                String publisher, String developers, ArrayList<String> categories,
                ArrayList<String> genres, ArrayList<String> tags) {

            this.appID = appID;
            this.name = name;
            this.data = data;
            this.owners = owners;
            this.price = price;
            this.languages = languages;
            this.metascore = metascore;
            this.userscore = userscore;
            this.achievement = achievement;
            this.publisher = publisher;
            this.developers = developers;
            this.categories = categories;
            this.genres = genres;
            this.tags = tags;
        }
        

        int getAppID(){return appID;}
        String getName(){return name;}
        String getData(){return data;}
        int getOwners(){return owners;}
        float getPrice(){return price;}
        ArrayList<String> getLanguages(){return languages;}
        int getMetascore(){return metascore;}
        int getUserscore(){return userscore;}
        int getAchievement(){return achievement;}
        String getPublisher(){return publisher;}
        String getDevelopers(){return developers;}
        ArrayList<String> getCategories(){return categories;}
        ArrayList<String> getGenres(){return genres;}
        ArrayList<String> getTags(){return tags;}


        void setAppID(int x){appID = x;}
        void setName(String x){name = x;}
        void setData(String x){data = x;}
        void setOwners(int x){owners = x;}
        void setPrice(float x){price = x;}
        void setLanguages(ArrayList<String> x){languages = x;}
        void setMetascore(int x){metascore = x;}
        void setUserscore(int x){userscore = x;}
        void setAchievement(int x){achievement = x;}
        void setPublisher(String x){publisher = x;}
        void setDevelopers(String x){developers = x;}
        void setCategories(ArrayList<String> x){categories = x;}
        void setGenres(ArrayList<String> x){genres = x;}
        void setTags(ArrayList<String> x){tags = x;}


        void print(){
            System.out.print("=> " + appID + " ");
            System.out.print("## " + name + " ");
            System.out.print("## " + data + " ");
            System.out.print("## " + owners + " ");
            System.out.print("## " + price + " ");
            
            //languages
            System.out.print("## [");
            for(int i = 0; i < languages.size(); i++){
                System.out.print(languages.get(i));
                if(i != languages.size() -1) System.out.print(", ");
            }
            System.out.print("] ");

            System.out.println("## " + metascore + " ");
            System.out.println("## " + userscore + " ");
            System.out.println("## " + achievement + " ");
            System.out.println("## " + publisher + " ");
            System.out.println("## " + developers + " ");
            
            //Categories
            System.out.print("## [");
            for(int i = 0; i < categories.size(); i++){
                System.out.print(categories.get(i));
                if(i != categories.size() -1) System.out.print(", ");
            }
            System.out.print("] ");


            //Genres
            System.out.print("## [");
            for(int i = 0; i < genres.size(); i++){
                System.out.print(genres.get(i));
                if(i != genres.size() -1) System.out.print(", ");
            }
            System.out.print("] ");


            //Tags
            System.out.print("## [");
            for(int i = 0; i < tags.size(); i++){
                System.out.print(tags.get(i));
                if(i != tags.size() -1) System.out.print(", ");
            }
            System.out.print("] ");
        }
    }

    public static Game transform(String line) {
        String[] tokens = transform_String(line).split(",");

        int appID = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        String data = tokens[2];
        int owners = Integer.parseInt(tokens[3]);
        float price = Float.parseFloat(tokens[4]);

        // Lista de linguagens
        ArrayList<String> languages = new ArrayList<>();
        for (String lang : tokens[5].replace("[", "").replace("]", "").split(";")) {
            languages.add(lang.trim());
        }

        int metascore = Integer.parseInt(tokens[6]);
        int userscore = Integer.parseInt(tokens[7]);
        int achievement = Integer.parseInt(tokens[8]);

        String publisher = tokens[9];
        String developers = tokens[10];

        ArrayList<String> categories = new ArrayList<>();
        for (String cat : tokens[11].replace("[", "").replace("]", "").split(";")) {
            categories.add(cat.trim());
        }

        ArrayList<String> genres = new ArrayList<>();
        for (String g : tokens[12].replace("[", "").replace("]", "").split(";")) {
            genres.add(g.trim());
        }

        ArrayList<String> tags = new ArrayList<>();
        for (String tag : tokens[13].replace("[", "").replace("]", "").split(";")) {
            tags.add(tag.trim());
        }

        return new Game(appID, name, data, owners, price, languages, metascore, userscore, achievement, publisher, developers, categories, genres, tags);
    }

    public static String transform_String(String line){
        String newString = "";
        boolean hasQuotes = false;

        for(int i = 0; i < line.length(); i++){
            if(hasQuotes){
                if(line.charAt(i) == ','){
                     newString += ';';   
                }
            }else{
                newString += line.charAt(i);
            }

            if(line.charAt(i) == '"'){
                hasQuotes = !hasQuotes;
            }
        }

        return newString;
    }


    public static Game[]  read_Csv() throws Exception{
        String filePath = "./tmp/games.csv";

        RandomAccessFile raf = new RandomAccessFile(filePath, "r");
        Game[] games = new Game[1850];

        raf.readLine();

        for(int i = 0; i < 1851; i++){
            String line = raf.readLine();
            games[i] = transform(line);
        }

        raf.close();


        return games;
    }

    public static Game findGame(Game[] games ,int appID){
        for(Game game : games){
            if(game.getAppID() == appID){
                return game;
            }
        }
        return null;
    }
    public static void main(String[] args) throws Exception{
        Game[] games = read_Csv();
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine()){
            
        }


        input.close();
    }
}
