package example.singleton


internal const val LOADED_OK = "VM_LOADED_SINGLETON (Kotlin)"

object HelloMessageSingleton : HelloMessage {

    init {
        println(LOADED_OK)
    }

    override fun hello(): String = HelloMessage.HELLO



}