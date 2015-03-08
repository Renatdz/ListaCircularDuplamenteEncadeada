public class Lista {
	
	//atributos
	private No init;
	
	//methods
	
	/**
	 * Add, adiciona um novo dado/informação no inicio da lista.
	 * @param int n
	 */
	void add(int n){
		if(init == null){
			init = new No(n);
		}else{
			No novo = new No(n);
			novo.setProx(getInit());
			init.setAnt(novo);
			No aux  = getInit();
			novo.setAnt(aux);
			setInit(novo);	
			novo = aux;
		}
	}
		
	/**
	 * remove, remove um dado/informação da lista, caso exista. Caso contrário, nada ocorre.
	 * @param int n
	 */
	void remove(int n){
		No aux, p;
		p = getInit();
		aux = null;
		while(p != null && p.getDado() != n){
			aux = p;
			p = p.getProx();
		}
		if(p != null){
			if(aux == null)
				setInit(p.getProx());
			else
				aux.setProx(p.getProx());
			
			p = null;
		}		
	}
	
	/**
	 * listar, lista/printa no console os valores correntes na lista
	 */
	void listar(){
		for(No p = getInit(); p != null; p = p.getProx())
			System.out.print(p.getDado() + " ");
	}	
	
	//getters and setters privates
	private No getInit() {
		return init;
	}
	private void setInit(No init) {
		this.init = init;
	}
	
}