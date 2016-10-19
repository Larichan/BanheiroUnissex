
public class main {
	
	public static void main(String[] args)
	{
		Pessoa pessoa[] = new Pessoa[2];
		
		pessoa[0] = new Homem();
		pessoa[1] = new Mulher();
		
		Thread t[] = new Thread[2];
		t[0] = new Thread(pessoa[0]);
		t[1] = new Thread(pessoa[1]);
		
		t[0].start();
		t[1].start();
	}
}
