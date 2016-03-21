package application;

import bebida.Bebida;
import bebida.Cafe;
import bebida.Cha;

public class App {

	public static void main(String[] args) {

		Bebida bebida = new Cafe();	
		bebida.prepararReceita();
				
		bebida = new Cha();
		bebida.prepararReceita();
		
		
	}

}
