package ADD;

import java.util.ArrayList;

public class Exemplo3 {

	public static void main(String[] args) {
		
		//criando um ArrayList de numeros inteiros 
		ArrayList<Integer>numeros = new ArrayList<>();
		numeros.add(10);//Adicionando elementos no ArrayList
		numeros.add(20);
		
		System.out.println(numeros.get(0));//saida:10//Acessando elementos do 
		System.out.println(numeros.get(1));//saida:20
		
		numeros.set(1 , 25);
		System.out.println(numeros.get(1));//saida 25 //modificando um elemento 
        
		numeros.remove(0);
		System.out.println(numeros.get(0));//saida 25//removendo um elemento 
		
		System.out.println(numeros.size());//saída:2//obetendo o tamanho da ArrayList 
	}

}
