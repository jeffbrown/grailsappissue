package grailsappissue

import grails.core.GrailsApplication
import grails.util.Environment
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        respond[grailsApplication: grailsApplication, pluginManager: pluginManager])
    }
}
