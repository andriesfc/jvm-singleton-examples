package example.singleton;

public final class HelloMesssageNonTrivialSingleton implements HelloMessage
{
	private HelloMesssageNonTrivialSingleton() {
		System.out.println(LOADED_OK);
	}

	@Override
	public String hello()
	{
		return HELLO;
	}

	private static final HelloMesssageNonTrivialSingleton instance = new HelloMesssageNonTrivialSingleton();

	public static HelloMesssageNonTrivialSingleton getInstance()
	{
		return instance;
	}

	public static final String LOADED_OK = "JVM_LOADED_SINGLETON: NonTrivialSingleton";
}
