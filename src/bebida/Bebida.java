package bebida;

public abstract class Bebida {
	
	public final void prepararReceita(){
		ferverAgua();
		misturar();
		colocarNaXicara();
		if(clienteQuerCondimento()){
			adicionarCondimentos();
		}
		
	}
	
	public abstract void misturar();
	public abstract void adicionarCondimentos();
	
	public void ferverAgua(){
		System.out.println("Fervendo �gua");
	}
	
	public void colocarNaXicara(){
		System.out.println("Colocando na x�cara");
	}
	
	public boolean clienteQuerCondimento(){
		return true;
	}
}

