package onedigitalinnovation.gof;

public class Teste {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
	
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonHolder Holder = SingletonHolder.getInstancia();
		System.out.println(Holder);
		Holder = SingletonHolder.getInstancia();
		System.out.println(Holder);
	}

}
