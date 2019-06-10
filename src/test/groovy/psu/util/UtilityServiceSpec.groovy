package psu.util

import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.web.ControllerUnitTestMixin
import spock.lang.Specification

@TestFor(UtilityService)
@TestMixin(ControllerUnitTestMixin)
class UtilityServiceSpec extends Specification {

    void 'test interacting with session'() {
        when:
        session.'Some Session Key' = 'King Crimson Is Awesome'

        then:
        service.getSomethingFromSession('Some Session Key') == 'King Crimson Is Awesome'
    }
}
