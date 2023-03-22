package example.singleton;

public enum HelloMessageEnumSingleton implements HelloMessage
{
	SINGLETON;

	public static final String LOADED_OK = "JVM_LOADED_SINGLETON: EnumSingleton";

	HelloMessageEnumSingleton()
	{
		System.out.println( LOADED_OK );
	}

	@Override
	public String hello()
	{
		return HELLO;
	}
}
