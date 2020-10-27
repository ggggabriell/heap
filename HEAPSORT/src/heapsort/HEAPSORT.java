package heapsort;


public class HEAPSORT {


  public static void heapsort(int[] vetor) {
  for (int i = vetor.length / 2 - 1; i >= 0; i--) {
			maxHeapify(vetor, i, vetor.length);
		}
		int tamanho = vetor.length;
		for (int i = vetor.length - 1; i > 0; i--) {
			troca(vetor, i, 0);
			maxHeapify(vetor, 0, --tamanho);
		}
		//for (int i = 0; i < vetor.length; i++) {
			//System.out.print(vetor[i]+" ");
		//}
	}

	private static void maxHeapify(int[] vetor, int pai, int tamanho) {
		int noEsq = 2 * pai + 1, 
				noDir = noEsq + 1;
		if (noEsq < tamanho) {
			if (noDir < tamanho && vetor[noEsq] < vetor[noDir])
				noEsq = noDir;
			if (vetor[noEsq] > vetor[pai]) {
				troca(vetor, noEsq, pai);
				maxHeapify(vetor, noEsq, tamanho);
			}
		}
	}

	public static void troca(int[] vetor, int a, int b) {
		int aux = vetor[a];
		vetor[a] = vetor[b];
		vetor[b] = aux;
	}
	
	private static void minHeapify(int[] vetor, int pai, int tamanho) {
		int noEsq = 2 * pai + 1, 
				noDir = noEsq + 1;
		if (noEsq < tamanho) {
			if (noDir < tamanho && vetor[noEsq] > vetor[noDir])
				noEsq = noDir;
			if (vetor[noEsq] < vetor[pai]) {
				troca(vetor, noEsq, pai);
				minHeapify(vetor, noEsq, tamanho);
			}
		}
	}
}
   
