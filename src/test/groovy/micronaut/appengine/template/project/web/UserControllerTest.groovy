package micronaut.appengine.template.project.web

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class UserControllerTest extends Specification {

    UserController subject

    def setup() {
        subject = new UserController()
    }

    def "it returns a list of the users it finds"() {
        when:
        def found = subject.findAllUsers()

        then:
        found != null
        found.size() > 0
    }

}
