import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Games{
    int id;
    String name;
    String releaseDate;
    int estimatedOwners;
    float price;
    String[] supportedLanguages;
    int metacriticScore;
    float userScore;
    int achievements;
    String[] publishers;
    String[] developers;
    String[] categories;
    String[] genres;
    String[] tags;
    public Games(String linha){ //Nov 30, 2010
        linha = virgula_por_ponto_e_virgula(linha);
        String[] atributos = meu_split(linha, ',', 14);
        int i = 0;
        id = string_para_int(atributos[i], 0); //pega o id
        i++;
        name = atributos[i];  //pega o name
        i++;
        releaseDate = string_para_data(atributos[i]);  //pega a data
        i++;
        estimatedOwners = string_para_int(atributos[i], 0);  //pega o estimatedOwners
        i++;
        price = string_para_float(atributos[i]);  //pega o price
        i++;
        supportedLanguages = tira_char_da_lista(meu_split(tirar_extremos( tirar_extremos(atributos[i])), ';',1),'\'');
        i++;
        metacriticScore = string_para_int(atributos[i],-1);
        i++;
        userScore = string_para_float(atributos[i]);
        i++;
        achievements = string_para_int(atributos[i],0);
        i++;
        publishers = tira_char_da_lista(meu_split(atributos[i], ';',1),'"');
        i++;
        developers = tira_char_da_lista(meu_split(atributos[i], ';',1),'"');
        i++;
        categories = tira_char_da_lista(meu_split(atributos[i], ';',1),'"');
        i++;
        genres = tira_char_da_lista(meu_split(atributos[i], ';',1),'"');
        i++;
        tags = tira_char_da_lista(meu_split(atributos[i], ';',1),'"');
    }
    public boolean printar(){
        System.out.printf("=> %d ## %s ## %s ## %d ## %.2f ## ", id, name, releaseDate, estimatedOwners, price);
        if(supportedLanguages != null){
            System.out.printf("[");
            for(int i = 0; i < supportedLanguages.length; i++){
                System.out.print(supportedLanguages[i]);
                if(i != supportedLanguages.length-1)
                    System.out.printf(",");
            }
            System.out.printf("] ## ");
        }
        System.out.printf("%d ## %.1f ## %d ## ", metacriticScore, userScore, achievements);
        if(publishers != null){
            System.out.printf("[");
            for(int i = 0; i < publishers.length; i++){
                System.out.print(publishers[i]);
                if(i != publishers.length-1)
                    System.out.printf(",");
            }
            System.out.printf("] ## ");
        }
        
        if(developers != null){
            System.out.printf("[");
            for(int i = 0; i < developers.length; i++){
                System.out.print(developers[i]);
                if(i != developers.length-1)
                System.out.printf(",");
            }
            System.out.printf("] ## ");
        }
        if(categories != null){
            System.out.printf("[");
            for(int i = 0; i < categories.length; i++){
                System.out.print(categories[i]);
                if(i != categories.length-1)
                    System.out.printf(",");
            }
            System.out.printf("] ## ");
        }
        if(genres != null){
            System.out.printf("[");
            for(int i = 0; i < genres.length; i++){
                System.out.print(genres[i]);
                if(i != genres.length-1)
                    System.out.printf(",");
            }
            System.out.printf("] ## ");
        }
        if(tags != null){
            System.out.printf("[");
            for(int i = 0; i < tags.length; i++){
                System.out.print(tags[i]);
                if(i != tags.length-1)
                    System.out.printf(",");
            }
            System.out.printf("] ## \n");
        }
        return true;
    }
    public String[] tira_char_da_lista(String[] lista, char c){
        if(lista == null)
            return lista;
        String resp[] = new String[lista.length];
        for(int i = 0; i < lista.length; i++){
            resp[i] = "";
            for(int j = 0; j < lista[i].length(); j++){
                if(lista[i].charAt(j) != c){
                    resp[i] += lista[i].charAt(j);
                }
            }
        }
        return resp;
    }
    public int string_para_int(String valor, int vaz){   //converte string para inteiro
        if(valor == null){
            return vaz;
        }
        int resp = valor.charAt(0)-'0';
        for(int i = 1; i < valor.length(); i++){
            resp*=10;
            resp += valor.charAt(i)-'0';
        }
        return resp;
    }
    public float string_para_float(String valor){   //converte string para float
        if(valor == null || valor.equals("tbd")){
            return (float)-1.0;
        }
        float resp;
        resp = valor.charAt(0)-'0';
        int divisor = 0;
        for(int i = 1; i < valor.length(); i++){
            if(valor.charAt(i) == '.'){
                divisor = valor.length() - (i+1);
            }else{
                resp*=10;
                resp += valor.charAt(i)-'0';   
            }
        }
        for(int i = 0; i < divisor; i++){
            resp /= 10;
        }
        return resp;
    }
    public String troca_char(String alt, char sep, char novo){  //troca um caractere por outro
        String resp = "";
        for(int i = 0; i < alt.length(); i++){
            if(alt.charAt(i) == sep){
                resp += novo;
            }else{
                resp += alt.charAt(i);
            }
        }
        return resp;
    }
    public String mes_para_numero(String exi){  //converte mes para numero
        String[] meses = {"Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] num = {"02","03","04","05","06","07","08","09","10","11","12","01"};
        int i = 0;
        while(i < meses.length && !(exi.equals(meses[i]))){
            i++;
        }
        return num[i];
    }
    public String remove_repetido(String entrada, char retirar){
        String resp = "";
        for(int i = 0; i < entrada.length(); i++){
            if(!(entrada.charAt(i) == retirar && entrada.charAt(i) == entrada.charAt(i-1))){
                resp += entrada.charAt(i);
            }
        }
        return resp;
    }
    public String concatena_string(String um, String dois){
        String resp = um;
        for(int i = 0; i < dois.length(); i++){
            resp += dois.charAt(i);
        }
        return resp;
    }
    public String uma_casa_para_mais(String valor, int qn){  // coloca zeros a esquerda para deixar a quantidade solicitada de casas numericas
        String resp = "";
        for(int i = 0; i < qn-1; i++){
            resp += 0;
        }
        resp += valor;
        return resp;
    } 
    public String tirar_extremos(String str){
        String resp = "";
        for(int i = 1; i < str.length()-1; i++){
              resp += str.charAt(i);          
        }
        return resp;
    }
    public String string_para_data(String data){   //passa string para o padrão dd/mm/aaaa
        String resp = "";
        data = troca_char(data, ';', ' ');  // Mes dia; ano -->  Mes dia  ano     ----se     tiver dia mes e ano
        data = troca_char(data, ',', ' ');  // Mes dia; ano -->  Mes dia  ano     ---- " não   "    "   "  "  "
        data = remove_repetido(data, ' ');  // Mes dia  ano -->  Mes dia ano
        if(data.charAt(0) == '"'){
            data = tirar_extremos(data);
        }
        String[] valores;  //mes[0] dia[1] ano[2]
        valores = meu_split(data, ' ', 3);
        if(valores[2] == null){
            
            if(valores[0].length() == 3){ //tem mes
                resp = "01/";
                valores[0] = mes_para_numero(valores[0]);
                resp = concatena_string(resp, valores[0]);
                resp += '/';
                resp = concatena_string(resp, valores[1]);
            }else if(valores[0].length() == 2){ //tem dia
                resp = valores[0];
                resp = concatena_string(resp, "/01/");
                resp = concatena_string(resp, valores[1]);
            }else{ //somente ano
                resp = "01/01/";
                resp = concatena_string(resp, valores[0]);
            }
        }else{
            if(valores[1].length() == 1){ //coloca 0 antes se necessario
                valores[1] = uma_casa_para_mais(valores[1], 2);
            }
            resp = valores[1];
            resp += '/';
            valores[0] = mes_para_numero(valores[0]);
            resp = concatena_string(resp, valores[0]);
            resp += '/';
            resp = concatena_string(resp, valores[2]);
        }
        return resp;
    }
    public String[] mais_tamanho(String[] lista, int tam){
        String[] resp = new String[tam+1];
        for(int i = 0; i < lista.length; i++){
            resp[i] = lista[i];
        }
        return resp;
    }
    public String[] meu_split(String linha, char separador, int tam){   // separa todos os elementos que estão divididos por um separador
        if(linha == null){
            return null;
        }
        String[] atributo = new String[tam];
        int i = 0;
        int j = 0;
        while(i < linha.length()){
            if(j == tam){
                atributo = mais_tamanho(atributo , tam);
                tam++;
            }
            if(i < linha.length() && linha.charAt(i) != separador){
                atributo[j] = "";
            }
            while(i < linha.length() && linha.charAt(i) != separador){
                atributo[j] += linha.charAt(i);
                i++;
            }
            i++;
            j++;
        }
        return atributo;
    }
    public String virgula_por_ponto_e_virgula(String linha){   //troca as virgulas por pontos quando estão entre " " 
        String resp = "";
        boolean virg = false;
        for(int i = 0; i < linha.length(); i++){
            if(linha.charAt(i) == '"'){
                virg = !virg;
            }
            if(linha.charAt(i) == ',' && virg == true){
                resp += ';';
            }else{
                resp += linha.charAt(i);
            }
        }
        return resp;
    }
}
class Lista{
    Games[] jogos;
    int tam = 0;
    
    public void expandir(){
        Games[] resp = new Games[tam+1];
        for(int i = 0; i < tam; i++){
            resp[i] = jogos[i];
        }
        jogos = resp;
    }
    public void printar(){
        for(int i = 0; i < tam; i++){
            if(jogos[i] != null)
                jogos[i].printar();
        }
    }
    public void buscar(String elemento){
        int i = 0;
        while(i < jogos.length && jogos[i].id != jogos[i].string_para_int(elemento, -1)){
            i++;
        }
        if(i != jogos.length){
            jogos[i].printar();
        }else{
            System.out.println("Inexistente");
        }
    }
    public void add(String linha){
        if(tam == 0){
            tam++;
            jogos = new Games[tam];
        }else{
            expandir();
            tam++;
        }
            jogos[tam-1] = new Games(linha);
    }
}
class Arquivo{
    File arquivo; /* /tmp/games.csv */
    Scanner sc;
    String[] arq;
    int tam = 0;
    int ultimo = 0;
    public Arquivo(){
        try {
            arquivo = new File("games.csv");
            sc = new Scanner(arquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado!");
        }
    }
    public void expandir(){
        String[] resp = new String[tam+1];
        for(int i = 0; i < tam; i++){
            resp[i] = arq[i];
        }
        arq = resp;
    }
    public String[] ler_arq(){
        if(sc.hasNextLine()){
            sc.nextLine();
        }
        while(sc.hasNextLine()){
            if(tam == 0){
                tam++;
                arq = new String[tam];
            }else{
                expandir();
                tam++;
            }
            arq[tam-1] = sc.nextLine();
        }
        return arq;
    }
}
public class Tp4_1{
    public static boolean meu_equals(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int i = 0;
        while(i < a.length() && (a.charAt(i) == b.charAt(i))){
            i++;
        }
        if(i != a.length()){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        Arquivo arquivo = new Arquivo();
        String[] arq = arquivo.ler_arq();
        for(int i = 0; i < arq.length-1; i++){
            lista.add(arq[i]);
        }
        String entrada;
        entrada = sc.nextLine();
        while(!meu_equals(entrada, "FIM")){
            lista.buscar(entrada);
            entrada = sc.nextLine();
        }
    }
}
