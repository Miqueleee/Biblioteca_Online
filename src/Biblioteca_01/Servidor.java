package Biblioteca_01;

public class Servidor extends Cliente {

	public Servidor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Servidor";
		
	}

	public int verificarDias() {
		return 15;
	}


}