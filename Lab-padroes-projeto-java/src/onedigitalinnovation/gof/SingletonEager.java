package onedigitalinnovation.gof;

/**
 * Singleton "apressado".
 * @author deboraorcia
 *
 */
public class SingletonEager {
	
	
		private static SingletonEager instancia = new SingletonEager();
		
	private SingletonEager() {
		super();
		
		
	}

	public static SingletonEager getInstancia() {
				return instancia;

	}
	}

