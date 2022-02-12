package projetlecoin

import grails.converters.JSON
import grails.converters.XML

class ApiController {

    def user() {
        switch(request.getMethod())
        {
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
            case "POST":
                User.save flush:true
                withFormat {
                    html {
                        flash.message = message(code: 'default.updated.message', args: [message(code: 'User.name', default: 'User'), User.id])
                        redirect User
                    }
                    '*' { render status: OK }
                }
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
}
