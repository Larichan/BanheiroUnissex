import java.util.ArrayList;

public class Banheiro {

	public Banheiro(int maxPessoas)
	{
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(Pessoa pessoa)
	{
		pessoas.add(pessoa);
	}
	
	ArrayList<Pessoa> pessoas;
}
