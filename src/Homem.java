
public class Homem implements Pessoa{
	public synchronized void run()
	{
		while(true)
		{
			System.out.println("FUI LARGADO POR MAIS UMA NAMORADA PQ SOU OT�RIO! :(");
			try {
				wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
