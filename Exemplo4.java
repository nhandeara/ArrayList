package ADD;
import java.util.ArrayList;

public class Exemplo4 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i=0; i<5; i++) {
			int numeroAleatorio= random.nextInt(100);//
			numeros.add(numeroAleatorio);
		}
		for(int numero:numeros) {
			System.out.println(numeros);
		}

}
}