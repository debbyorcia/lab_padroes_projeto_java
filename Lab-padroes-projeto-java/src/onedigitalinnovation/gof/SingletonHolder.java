package onedigitalinnovation.gof;

/**
 * Singleton "Lazy Holder".
 * 
 * 
 * @author deboraorcia
 *
 */
public class SingletonHolder {
	
		private static class InstanceHolder {
			public static SingletonHolder instancia = new SingletonHolder();
		}
		
	private SingletonHolder() {
		super();
		
		
	}

	public static SingletonHolder getInstancia() {
				return InstanceHolder.instancia;

	}
	}

