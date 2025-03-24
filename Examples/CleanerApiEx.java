package Examples;
import java.lang.ref.Cleaner;
class Resource
{
	private static final Cleaner cleaner=Cleaner.create();
	static class CleanupTask implements Runnable
	{
		public void run()
		{
			System.out.println("Cleaning up resonance...");
		}
	}
	private final Cleaner.Cleanable cleanable;
	public Resource()
	{
		this.cleanable=cleaner.register(this, new CleanupTask());
	}
}
public class CleanerApiEx 
{
	public static void main(String[] args)
	{
		new Resource();
		System.gc();
		System.out.println("Garbage Collection Requested");
	}
}
