package example.singleton

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.system.SystemOutWireListener
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldNotContain

class JvmSingletonTest : FunSpec({

    fun stdoutClue(action: () -> Unit) = withClue("standard output", action)

    val stdout = SystemOutWireListener().also(::listener)

    test("EnumSingleton initialized lazy") {
        stdoutClue { stdout.output().shouldNotContain(HelloMessageEnumSingleton.LOADED_OK) }
        HelloMessageEnumSingleton.SINGLETON.hello().shouldBe(HelloMessageEnumSingleton.HELLO)
        stdoutClue { stdout.output().shouldNotContain(HelloMessageEnumSingleton.LOADED_OK) }
    }

    test("NonTrivialSingleton initialized lazy.") {
        stdoutClue { stdout.output().shouldNotContain(HelloMesssageNonTrivialSingleton.HELLO) }
        HelloMesssageNonTrivialSingleton.getInstance().hello().shouldBe(HelloMesssageNonTrivialSingleton.HELLO)
        stdoutClue { stdout.output().shouldContain(HelloMesssageNonTrivialSingleton.LOADED_OK) }
    }

    test("HelloMessageSingleton (Kotlin) initialized lazy") {
        stdoutClue { stdout.output().shouldNotContain(LOADED_OK) }
        HelloMessageSingleton.hello().shouldBe(HelloMessage.HELLO)
        stdoutClue { stdout.output().shouldContain(LOADED_OK) }
    }
})

