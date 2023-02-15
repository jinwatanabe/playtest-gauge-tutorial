import com.thoughtworks.gauge.Step

class HelloGitHubActions {

    @Step("HelloWorldを出力する")
    fun hello(){
        println("Hello, GitHub Action")
    }
}