package psu.util

import grails.web.api.ServletAttributes

class UtilityService implements ServletAttributes {

    def getSomethingFromSession(String key) {
        session[key]
    }
}
