package itu.mbds.grails

import grails.converters.JSON
import grails.converters.XML

class ApiController {

//    Singleton : GET / PUT / PATCH / DELETE
    def user() {
        if (!params.id)
            return response.status = 400
        switch (request.getMethod()) {
            case "GET":
                //s'il n'y a pas de paramètre on récupère toutes les données
                if (!params.id){
                    def UserInstance = User.list();
                    response.withFormat {
                        xml { render UserInstance as XML}
                        json { render UserInstance as JSON }
                    }
                }
                //s'il y aun paramètre on récupère une seule donnée
                else{
                    def UserInstance = User.get(params.id)
                    if (!UserInstance)
                        return response.status = 404
                    response.withFormat {
                        xml { render UserInstance as XML}
                        json { render UserInstance as JSON }
                    }
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
            case "POST":
                def UserInstance = User.create(params.id,request)
                if (!UserInstance)
                    return response.status = 404
                response.withFormat {
                    xml { render UserInstance as XML}
                    json { render UserInstance as JSON }
                }
                break
            case "DELETE":
                //s'il n'y a pas de paramètre on supprime toutes les données
                if (!params.id){
                    def UserInstance = User.deleteAll();
                    response.withFormat {
                        xml { render UserInstance as XML}
                        json { render UserInstance as JSON }
                    }
                }
                //s'il y aun paramètre on supprime une seule donnée
                else{
                    def UserInstance = User.delete(params.id)
                    if (!UserInstance)
                        return response.status = 404
                    response.withFormat {
                        xml { render UserInstance as XML}
                        json { render UserInstance as JSON }
                    }
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
                //s'il n'y a pas de paramètre on récupère toutes les données
                if (!params.id){
                    def AnnonceInstance = Annonce.list();
                    response.withFormat {
                        xml { render AnnonceInstance as XML}
                        json { render AnnonceInstance as JSON }
                    }
                }
                //s'il y aun paramètre on récupère une seule donnée
                else{
                    def AnnonceInstance = Annonce.get(params.id)
                    if (!AnnonceInstance)
                        return response.status = 404
                    response.withFormat {
                        xml { render AnnonceInstance as XML}
                        json { render AnnonceInstance as JSON }
                    }
                }

                break
            case "PUT":
                def AnnonceInstance = Annonce.putAt(params.id,request)
                if (!AnnonceInstance)
                    return response.status = 404
                response.withFormat {
                    xml { render AnnonceInstance as XML}
                    json { render AnnonceInstance as JSON }
                }
                break
            case "POST":
                def AnnonceInstance = Annonce.create(params.id,request)
                if (!AnnonceInstance)
                    return response.status = 404
                response.withFormat {
                    xml { render AnnonceInstance as XML}
                    json { render AnnonceInstance as JSON }
                }
                break
            case "DELETE":
                //s'il n'y a pas de paramètre on supprime toutes les données
                if (!params.id){
                    def AnnonceInstance = Annonce.deleteAll();
                    response.withFormat {
                        xml { render AnnonceInstance as XML}
                        json { render AnnonceInstance as JSON }
                    }
                }
                //s'il y aun paramètre on supprime une seule donnée
                else{
                    def AnnonceInstance = Annonce.delete(params.id)
                    if (!AnnonceInstance)
                        return response.status = 404
                    response.withFormat {
                        xml { render AnnonceInstance as XML}
                        json { render AnnonceInstance as JSON }
                    }
                }
                break
            default:
                return response.status = 405
                break
        }
        return response.status = 406
    }
}
