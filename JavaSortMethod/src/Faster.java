import java.util.Random;

public class Faster {

	public static void main(String[] args) {
		long tempoInicio = System.currentTimeMillis();
		 Random random = new Random();
         int array[] = new int[5000000];

         for (int i=0; i<array.length; i++) {
              array[i] = random.nextInt(5000000);
         }
		System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));

	}

}
