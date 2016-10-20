import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {
	public Application()
	{
		scanner = new Scanner(System.in);
		fila = new ArrayList<Pessoa>();
	}
	
	private Pessoa gerarPessoa()
	{
		Pessoa pessoa;
		
		Random random = new Random();
		boolean gender = random.nextBoolean();
		if(gender)
		{
			pessoa = new Homem();
		}
		else
		{
			pessoa = new Mulher();
		}
		
		return pessoa;
	}
	
	private void initialState()
	{
		System.out.println("Bem vindo ao programa Banheiro Unissex.");
		System.out.print("Insira o tamanho máximo da fila de espera para entrar no banheiro: ");
		filaMaxSize = scanner.nextInt();
		System.out.print("Insira o número de espaços no banheiro: ");
		banheiro = new Banheiro(scanner.nextInt());
		
		System.out.print("Aperte qualquer tecla para continuar...");
		scanner.nextLine();
		scanner.nextLine();
	}
	
	public void start()
	{
		initialState();
		
		/*Random random = new Random();
		
		while(true)
		{
			random.nextInt(3);
		}*/
	}
	
	private Banheiro banheiro;
	private Scanner scanner;
	private ArrayList<Pessoa> fila;
	private int filaMaxSize;
}
