class Annonce {
//definition des attributs
    String      title
    String      description
    Float       price
    Boolean     status = Boolean.FALSE
    Date        dateCreated
    Date        lastUpdated
    List        illustrations

    //définition de la relation une annonce peut avoir plusieurs annonces
    static hasMany = [illustrations: Illustration]
    //relation forte entre user et annonce : l'annonce doit être supprimée si l'user est supprimé
    static belongsTo = [author: User]
    //definition des contraintes
    static constraints = {
        title nullable: false, blank: false
        description nullable: false, blank: false
        price min: 0F, nullable: false
        status nullable: false
    }

    static mapping = {
        description type: 'text'
    }
}
