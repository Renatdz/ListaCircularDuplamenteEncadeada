
public class Main {

	public static void main(String [] args){
		
		Lista l = new Lista();
		
		//Teste 1
		System.out.println("Teste 1 - adicionando na lista e listando");
		
		l.add(10);
		l.add(20);
		l.add(12);
		l.add(30);
		
		l.listar();
		
		System.out.println();
		
		//Teste 2
		System.out.println("Teste 2 - removendo da lista e listando");
		
		l.remove(10);
		
		l.listar();
		
	}
	
	public Main() {
		super();
	}

}
