package Biblioteca_01;

public class Professor extends Cliente {

	public Professor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Professor";
	}

	public int verificarDias() {
		return 20;
	}

	
}
