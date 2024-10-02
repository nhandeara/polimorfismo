package Polimorfismo;

public class Dentista extends ProfissionalSaude{
	private String cro;
	
	public Dentista(String nome,String especialidade,int valorConsulto, String cro) {
		super(nome,especialidade,valorConsulto);
		this.cro=cro;
	}
	@Override
	public void agendarconsulta() {
		System.out.println("agendado");
	} 

 

}
