# JVM Singleton Examples (Kotlin and Java)

This project has 3 correct implementations of the singleton pattern:

1. Using an Enum class in Java
2. Using a private static final instance with an accessor.
3. Using Kotlin's `object` declaration.

Some interesting observations need to be mentioned here.

Both Kotlin and Java implementations demonstrate that such singletons are loaded lazily, while using enums forces the JVM to eager initialize the singleton. This means that if you are forced to roll out your own implementation on Java if you want a proper singleton which does not eager load itself into memory.  Although this is not difficult, it can be very error-prone if one is not familiar with the JVM, which only instantiate fields once a static function accesses the singleton.

For proof, look at the unit test here: `kotlin/example/singleton/JvmSingletonTest.kt`. 



