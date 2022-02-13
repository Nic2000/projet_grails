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
                def userInstance = User.get(params.id)
                if (!userInstance)
                    return response.status = 404
                renderThis(userInstance, request.getHeader("Accept"))
                break
            case "PUT":
                break
            case "PATCH":
                break
            case "DELETE":
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
            case "PUT":
                break
            case "PATCH":
                break
            case "DELETE":
                break
            default:
                return response.status = 405
                break
        }
        return response.status = 406

    }

//    Singleton : GET / PUT / PATCH / DELETE
    def annonce() {

    }

//    Collection : GET / POST
    def annonces() {

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
