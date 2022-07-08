import java.util.Random;

public class Quicksort {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] vetor = new int[50];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= rand.nextInt(49);
		
		}
		quicksort(vetor,0, vetor.length-1);
		for (int j : vetor) {
			System.out.print(j + " ");
		}
		System.out.println();
		
	}
	
	
	static void quicksort(int[] vetor, int esquerda,int direita){
		
		if (esquerda < direita){
			int pivo = particao(vetor, esquerda,direita);
			quicksort(vetor, esquerda,pivo);
			quicksort(vetor,pivo+1,direita);
		}
	}
	static int particao(int[] vetor,int esquerda, int direita){
		int meio = (esquerda+direita)/2;
		
		int pivo = vetor[meio];
		int i = esquerda -1;
		int j = direita +1;
		while (true){
			do {
				i++;
			}while (vetor[i]<pivo);
			do {
				j--;
			}while (vetor[j]>pivo);
			if (i>=j){
				return j;
			}
			int aux = vetor[i];
			vetor[i]=vetor[j];
			vetor[j]=aux;
			
		}
	}
}
