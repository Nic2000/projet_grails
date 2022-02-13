package itu.mbds.grails

import grails.converters.JSON
import grails.converters.XML
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
class ApiController {

//    Singleton : GET / PUT / PATCH / DELETE
    def user() {
        if (!params.id)
            return response.status = 400
        switch (request.getMethod()) {
            case "GET":
                def UserInstance = User.get(params.id)
                if (!UserInstance)
                    return response.status = 404
                response.withFormat {
                    xml { render UserInstance as XML}
                    json { render UserInstance as JSON }
                }
                break
            case "PUT":
                def UserInstance = User.putAt(params.id,request)
                if (!UserInstance)
                    return response.status = 404
                response.withFormat {
                    xml { render UserInstance as XML}
                    json { render UserInstance as JSON }
                }
                break
            case "DELETE":
                def UserInstance = User.delete(params.id)
                if (!UserInstance)
                    return response.status = 404
                response.withFormat {
                    xml { render UserInstance as XML}
                    json { render UserInstance as JSON }
                }
                break
            default:
                return response.status = 405
                break
        }
        return response.status = 406
    }

//    Collection : GET / POST
    def users() {
        switch (request.getMethod()) {
            case "GET":
                def UserInstance = User.list();
                response.withFormat {
                    xml { render UserInstance as XML}
                    json { render UserInstance as JSON }
                }
                break

            case "DELETE":
                def UserInstance = User.deleteAll()
                if (!UserInstance)
                    return response.status = 404
                response.withFormat {
                    xml { render UserInstance as XML}
                    json { render UserInstance as JSON }
                }
                break
            default:
                return response.status = 405
                break
        }
        return response.status = 406

    }

//    Singleton : GET / PUT / PATCH / DELETE
    def annonce() {
        if (!params.id)
            return response.status = 400
        switch (request.getMethod()) {
            case "GET":
                def annonceInstance = Annonce.get(params.id)
                if (!annonceInstance)
                    return response.status = 404
                renderThis(annonceInstance, request.getHeader("Accept"))
                break
            case "PUT":
                def annonceInstance = Annonce.putAt(params.id,request)
                if (!annonceInstance)
                    return response.status = 404
                renderThis(annonceInstance, request.getHeader("Accept"))
                break
            case "DELETE":
                def annonceInstance = Annonce.delete(params.id)
                if (!annonceInstance)
                    return response.status = 404
                renderThis(annonceInstance, request.getHeader("Accept"))
                break
            default:
                return response.status = 405
                break
        }
        return response.status = 406
    }

//    Collection : GET / POST
    def annonces() {
        switch (request.getMethod()) {
            case "GET":
                def annonceInstance = Annonce.list();
                response.withFormat {
                    xml { render annonceInstance as XML}
                    json { render annonceInstance as JSON }
                }
                break

            case "DELETE":
                def annonceInstance = Annonce.deleteAll()
                if (!annonceInstance)
                    return response.status = 404
                renderThis(annonceInstance, request.getHeader("Accept"))
                break
            default:
                return response.status = 405
                break
        }
        return response.status = 406
    }

    def renderThis(Object instance, String accept)
    {
        switch(accept)
        {
            case "xml":
            case "text/xml":
            case "application/xml":
                render instance as XML
                break;
            case "json":
            case "text/json":
            case "application/json":
                render instance as JSON
                break;
        }
    }
}
