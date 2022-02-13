<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <style>
        body {
            background: #eee
        }
        </style>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <div class="container-fluid"> <a class="navbar-brand" href="#">Lecoincoin Administration</a> <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
                                <li class="nav-item"> <a class="nav-link active" aria-current="page"  href="${createLink(uri: '/')}">Utilisateurs</a> </li>
                                <li class="nav-item"> <g:link controller="AnnonceController" action="create">Annonce</g:link> </li>
                            </ul>

                        </div>
                    </div>
                </nav>
            </div><br>
            <div class="row">
                <div class="col-md-8 mx-auto">
                    <table class="table bg-white rounded border">
                        <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Nom d'utilisateur</th>
                            <th scope="col">Role</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <g:each var="c" in="${userList}">
                                <li class="controller">${c.username}</li>
                            </g:each>
                        </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>