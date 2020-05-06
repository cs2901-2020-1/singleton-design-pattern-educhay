public class ChocolateBoilerSingleton {
	private static ChocolateBoiler instance;

	public static ChocolateBoiler getInstance() {
		if (instance == null)
			instance = new ChocolateBoiler();
		return instance;
	}
}
