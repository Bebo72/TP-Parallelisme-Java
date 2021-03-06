package polytech.tours.di.parallel.td2.exo3_2;

/**
 * Coordinates the work of different threads
 * @author Jorge E. Mendoza (dev@jorge-mendoza.com)
 * @version %I%, %G%
 *
 */
public class Coordinator {
	
	/**
	 * True if the threads should continue their work and false otherwise
	 */
	private volatile boolean run=true;
	/**
	 * 
	 * @return true if the thread should continue to work and false otherwise
	 */
	public boolean keepRunning(){
		return this.run;
	}
	/**
	 * Sets a stopping signal for all threads
	 */
	public void stop(){
		this.run=false;
	}
	
	/*NOTE: since there is going to be only one thread writing to variable run
	 * a volatile declaration is enough to ensure synchronization.
	 */
	
}
