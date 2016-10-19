
public class Mulher implements Pessoa{
	public synchronized void run()
	{
		while(true)
		{
			System.out.println("LARGUEI MAIS UM NAMORADO OTÁRIO!");
			try {
				wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
