package fr.itu.mbds.grails

class User {

    String username
    Date dateCreated

    static hasMany = [annonces: Annonce]

    static constraints = {
        username unique: true, nullable: false, blank: false
    }
}
