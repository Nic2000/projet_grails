package projet_itu_grails

import itu.mbds.grails.Annonce
import itu.mbds.grails.Illustration
import itu.mbds.grails.Role
import itu.mbds.grails.User
import itu.mbds.grails.UserRole

class BootStrap {

    def init = { servletContext ->

        def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
        def roleModo = new Role(authority: 'ROLE_MODO').save()

        def userAdmin = new User(username: "Lecoincoin", password: "admin").save()
        def userModo = new User(username: "Mathilde", password: "modo").save()

        UserRole.create(userAdmin, roleAdmin, true)
        UserRole.create(userModo, roleModo, true)


    }
    def destroy = {

    }

}
