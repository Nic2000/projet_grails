import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User implements Serializable{
    //DEFINITION des attributs
    private static final long serialVersionUID = 1
    String username
    Date dateCreated
    String password
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    //définition de la relation : un utilisateur peut publier plusieurs annonces
    static hasMany = [annonces:Annonce]
    //definition des contraintes
    static constraints = {
        password nullable:false,blank:false,password:true
        username nullable:false,blank:false,unique:true
    }
    static mapping = {
        password column:'``password`'
    }
}
