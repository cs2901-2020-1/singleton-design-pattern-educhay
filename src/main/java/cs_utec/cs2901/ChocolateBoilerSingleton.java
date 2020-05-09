package cs_utec.cs2901;

public class ChocolateBoilerSingleton {
    private boolean empty;
    private boolean boiled;

	private static ChocolateBoilerSingleton instance;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

	synchronized public static ChocolateBoilerSingleton getInstance() {
		if (instance == null)
			instance = new ChocolateBoilerSingleton();
		return instance;
	}

    public void fill() {
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
