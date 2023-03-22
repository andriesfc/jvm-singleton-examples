# JVM Singleton Examples (Kotlin and Java)

This project has 3 correct implementations of the singleton pattern:

1. Using an Enum class in Java
2. Using a private static final instance with an accessor.
3. Using Kotlin's `object` declaration.

Some interesting observations need to be mentioned here.

Both Kotlin and Java implementations demonstrate that such singletons are loaded lazily, while using enums forces the JVM to eager initialize the singleton. This means that if you want an lazy loaded singleton implementation on the JVM, and for some reason cannot use Kotlin, you are forced to roll out your own in Java, each and every time 🤬.

For proof, look at the unit test here: `kotlin/example/singleton/JvmSingletonTest.kt`. 



