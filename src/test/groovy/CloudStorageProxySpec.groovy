import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class CloudStorageProxySpec extends Specification {
//    @Inject
//    CloudStorageProxy proxy

    void "should load aws cloud"() {
        when:
        println("testing")
        then:
//            println(proxy.getCloudEnv())
        pritnln("done!")
    }
}
