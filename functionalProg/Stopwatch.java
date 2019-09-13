import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Stopwatch 
{
		/*	private long startTime = 0;
			private long stopTime = 0;
			private boolean running = false;
			
			public void start()
			{
				//this.startTime = System.currentTimeMillis();
				this.running = true;
				
			}
			
			public void stop()
			{
				this.stopTime = System.currentTimeMillis();
				this.running = false;
		
			}
			
			public long getElapsedTime()
			{
				long elapsed;
				if(running)
				{
					elapsed = (System.currentTimeMillis() - startTime);
				}
				else
				{
					elapsed = (stopTime - startTime);
				}
				return elapsed;
			}
			public long getElapsedTimeSecs()
			{
				long elapsed;
				if(running)
				{
					elapsed = ((System.currentTimeMillis() - startTime) / 1000);
				}
				else
				{
					elapsed = ((stopTime - startTime) / 1000);
				}
				return elapsed;
			}*/
		public static void main(String[] args) 
		{
			/*Stopwatch s = new Stopwatch();
			s.start();
			s.stop();
			System.out.println("Elapsed  time in millisecond :: "+s.getElapsedTime());
		*/
			 Instant start = Instant.now();
			 
			    //Measure execution time for this method
			    methodToTime();
			 
			    Instant finish = Instant.now();
			 
			    long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
			    System.out.println(start+" "+" "+finish+" "+timeElapsed);
		}
			 
			  private static void methodToTime() {
			    try {
			      TimeUnit.SECONDS.sleep(3);
			    } catch (InterruptedException e) {
			      e.printStackTrace();
			    }
		}

}
