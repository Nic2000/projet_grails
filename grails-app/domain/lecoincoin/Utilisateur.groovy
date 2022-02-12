package lecoincoin

class Utilisateur {

    String nom
    String prenom
    String email
    String mdp
    Date dateCreated
    Date lastUpdated
    Role role

    List annonce

    static hasMany = [annonces: Annonce]
    static belongsTo = [role: Role]

    static constraints = {
        nom nullable : false, blank : false
        prenom nullable : false, blank : false
        email nullable : false, blank : false, size : 4..25, unique: true
        mdp nullable : false, blank : false, size : 8..25
        role nullable : false
    }
}
