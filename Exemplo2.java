package ADD;

import java.util.Arrays;

public class Exemplo2 {

	public static void main(String[] args) {
		String[]disciplinas = {"matemática","filosofia","historia", "física"};
      
		
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
        novaLista.add("geografia");
        novaLista.add("lingua inglesa");
        
        for (String i: novaLista);
	}
	   System.out.println("disciplina: " + i);
	}
           }