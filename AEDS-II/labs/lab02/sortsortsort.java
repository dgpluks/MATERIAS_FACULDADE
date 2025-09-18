import java.util.Scanner;
class lista{
	public int[] seq;
	public int tam;
	public int atu;
	public lista(){
		tam = 10;
		seq = new int[tam];
		atu = 0;
	}
	public void expandir(){
		int aux[] = seq;
		tam *= 10;
		seq = new int[tam];
		for(int i = 0; i< atu; i++){
			seq[i] = aux[i];
		}
		return;
	}
	public void print(){
		for(int i = 0; i < atu; i++){
			System.out.println(seq[i]);
		}
	}
	public void inserir_ord(int n, int m){
		if(atu == tam){
			expandir();
		}
		int i = 0;
		while(n % m > seq[i] % m){
			i++;
		}
		if(n %2 == 0){
			while(seq[i] % 2 == 1){
				i++;
			}
			while(seq[i] < n){
				i++;
			}
			 
		}else{
			
		}
	}
}
public class sortsortsort{
	public static void pegar(int qn, int m){	
		lista vals = new lista;
		for(int i = 0; i< qn; i++){
			int val = sc.nextInt();
			inserir_ord(seq, m);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int qn, m;
		qn = sc.nextInt();
		m = sc.nextInt();
		while(qn == 0 && m == 0){
		pegar(qn, m);
		qn = sc.nextInt();
		m = sc.nextInt();
		}
		
	}
}
