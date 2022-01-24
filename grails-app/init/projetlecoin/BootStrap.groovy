package projetlecoin

class BootStrap {
//initialisation des différents types de roles
    def init = { servletContext ->
        def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()
        def roleModo = new Role(authority: 'ROLE_MODO').save()
        def roleClient = new Role(authority: 'ROLE_CLIENT').save()

        def userAdmin = new User(username: "Lecoincoin", password: "admin").save()
        def userModo = new User(username: "Mathilde", password: "modo").save()

        UserRole.create(userAdmin, roleAdmin, true)
        UserRole.create(userModo, roleModo, true)
    }
    def destroy = {
    }
}
