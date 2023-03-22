import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.names.TestNameCase
import io.kotest.core.test.TestCaseOrder

class KotestProjectConfig : AbstractProjectConfig() {
    override val testCaseOrder: TestCaseOrder = TestCaseOrder.Sequential
    override val testNameCase: TestNameCase = TestNameCase.Sentence
}