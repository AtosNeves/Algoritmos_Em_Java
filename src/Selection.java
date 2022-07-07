import java.util.List;
import java.util.Random;
public class Selection {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] vetor = new int[50];
		
		for (int i = 0; i < 50; i++) {
			vetor[i]=rand.nextInt(50);
		}
		
		int[] vetor2 = ordenaSelection(vetor);
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println(vetor2[i]);
		}
		
		
		
	}
	
	public static int[] ordenaSelection(int[] vetor){
		int menor, aux;
		for (int i = 0; i < vetor.length; i++) {
			menor = i;
			for (int j = i+1; j < vetor.length; j++) {
				if (vetor[j]<vetor[menor]){
					menor=j;
				}
			}
			aux = vetor[menor];
			vetor[menor]=vetor[i];
			vetor[i]=aux;
		}
		
		return vetor;
	}
	
	
}
