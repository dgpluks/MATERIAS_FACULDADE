import java.util.Scanner;
public class tp2{

    private static int x;
    private static String linha;
    private static int val[];
    private static int and(){
        while(x ==1){

        }
        return 0;
    }
    private static int or(){
        while(x ==1){

        }
        return 0;
    }
    private static int not(){
        return  linha.charAt(x) ;
    }
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        val = new int[x];
        for(int i = 0; i < x; i++){
            val[i] = scanner.nextInt();;
        }
        scanner.nextLine();
        int x = 0;
        linha = scanner.nextLine();
        while(x < linha.length()){
            if(linha.charAt(x) == 'a'){
                x +=4;
                System.out.println(linha.charAt(x) );
            }else if(linha.charAt(x) == 'o'){
                x+=3;
                System.out.println(linha.charAt(x));
            }else if(linha.charAt(x) == 'n'){
                x+=4;
                System.out.println("not");
                System.out.println(linha.charAt(x));
                System.out.println(not());
            }else{
                x = linha.length();
            }
        }
    }
}  