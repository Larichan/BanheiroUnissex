import java.util.concurrent.Semaphore;

public class Slot {
	public Slot()
	{
		
	}
	
	private Pessoa pessoa;
	private final Semaphore occupied = new Semaphore(1);
}
