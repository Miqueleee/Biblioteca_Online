package Biblioteca_01;

public abstract class Cliente implements ValidaçãoEmprestimo{

	protected  int matricula;
	protected String nome;
	protected float tps;
	protected String tipo;
	
	public Cliente(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.tps=0;
	}
	
	
}
