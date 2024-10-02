package Polimorfismo;

public class Medico extends ProfissionalSaude{
	private String crm;
	
	public Medico(String nome,String especialidade,int valorConsulto, String crm) {
		super(nome,especialidade,valorConsulto);
		this.crm=crm;
	}
	@Override
	public void agendarconsulta() {
		System.out.println("agendado");
	} 

}
