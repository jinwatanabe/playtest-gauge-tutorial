import com.thoughtworks.gauge.AfterScenario
import com.thoughtworks.gauge.BeforeScenario
import com.thoughtworks.gauge.Step
import com.github.tomakehurst.wiremock.client.WireMock

class HelloGitHubActions {

//    @BeforeSuite
//    @BeforeSpec
    @BeforeScenario
    fun prepareWireMock() {
        WireMock.reset()
    }



    @Step("HelloWorldを出力する")
    fun hello(){
        println("Hello, GitHub Action")
    }

}