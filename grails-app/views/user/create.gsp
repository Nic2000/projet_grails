<!DOCTYPE html>
<html>
    <head>
         <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
        <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200&display=swap');

        * {
            margin: 0;
            padding: 0
        }

        .container {
            min-height: 100vh;
            background-color: #c7a7fa;
            display: flex;
            justify-content: center;
            align-items: center
        }

        .card {}

        .main {
            display: none;
            height: 410px;
            width: 320px;
            background-color: #fff;
            border-radius: 10px;
            padding: 20px;
            box-sizing: border-box;
            cursor: pointer;
            font-family: 'Poppins', sans-serif
        }

        .active {
            display: block !important
        }

        .image {
            display: flex;
            justify-content: center;
            align-items: center
        }

        .image span {
            height: 70px;
            width: 70px;
            border: 1px solid #86b0da;
            display: flex;
            justify-content: center;
            align-items: center;
            border-radius: 50%;
            overflow: hidden
        }

        .image span img {
            width: 90%;
            object-fit: cover
        }

        .heading {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            margin-top: 20px
        }

        .heading h3 {
            font-size: 18px
        }

        .heading p {
            font-size: 13px;
            font-weight: 700
        }

        .heading p a {
            text-decoration: none;
            color: blue
        }

        .input-text {
            position: relative;
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 20px;
            padding: 0 20px
        }

        input[type="text"] {
            height: 35px;
            width: 100%;
            border-radius: 20px;
            padding: 0 20px;
            border: none;
            outline: 0;
            background-color: #f3f3f3
        }

        .button {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-top: 20px;
            padding: 0 20px;
            gap: 10px
        }

        .button button {
            height: 35px;
            width: 100%;
            border-radius: 20px;
            border: none;
            outline: 0;
            background-color: #0166cc;
            color: #fff;
            font-size: 12px;
            cursor: pointer
        }

        input[type="password"] {
            height: 35px;
            width: 100%;
            border-radius: 20px;
            padding: 0 20px;
            padding-right: 22px;
            border: none;
            outline: 0;
            background-color: #f3f3f3;
            border: 1px solid #f3f3f3
        }

        .fa-eye-slash {
            position: absolute;
            right: 27px;
            top: 13px;
            font-size: 13px
        }

        .fa-eye {
            position: absolute;
            right: 27px;
            top: 13px;
            font-size: 13px
        }

        .warning {
            border: 1px solid red !important
        }

        .final-step {
            text-align: center
        }

        .final-step p {
            margin-top: 20px;
            font-size: 13px;
            font-weight: 700;
            padding: 0 20px
        }

        .checkmark__circle {
            stroke-dasharray: 166;
            stroke-dashoffset: 166;
            stroke-width: 2;
            stroke-miterlimit: 10;
            stroke: #7ac142;
            fill: none;
            animation: stroke 0.6s cubic-bezier(0.65, 0, 0.45, 1) forwards
        }

        .checkmark {
            width: 60px;
            height: 60px;
            border-radius: 50%;
            display: block;
            stroke-width: 2;
            stroke: #fff;
            stroke-miterlimit: 10;
            margin: 10% auto;
            box-shadow: inset 0px 0px 0px #7ac142;
            animation: fill .4s ease-in-out .4s forwards, scale .3s ease-in-out .9s both
        }

        .checkmark__check {
            transform-origin: 50% 50%;
            stroke-dasharray: 48;
            stroke-dashoffset: 48;
            animation: stroke 0.3s cubic-bezier(0.65, 0, 0.45, 1) 0.8s forwards
        }

        @keyframes stroke {
            100% {
                stroke-dashoffset: 0
            }
        }

        @keyframes scale {

            0%,
            100% {
                transform: none
            }

            50% {
                transform: scale3d(1.1, 1.1, 1)
            }
        }

        @keyframes fill {
            100% {
                box-shadow: inset 0px 0px 0px 30px #7ac142
            }
        }
        </style>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
    <div class="container">
        <div class="row">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container-fluid"> <a class="navbar-brand" href="#">Lecoincoin Administration</a> <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
                            <li class="nav-item"> <a class="nav-link active" aria-current="page"  href="${createLink(uri: '/')}">Utilisateurs</a> </li>
                            <li class="nav-item"> <g:link controller="Annonce" action="create">Annonce</g:link> </li>
                        </ul>

                    </div>
                </div>
            </nav>
        </div><br>
        <div class="row">
            <div class="card">
                <div class="main active">
                    <div class="input-text"> <input type="text" placeholder="User Name" require="required" id="f_name"> </div>
                    <div class="input-text"> <input type="text" placeholder="Password"> </div>
                    <div class="input-text"> <input type="text" placeholder="Role" require="required"> </div>
                    <div class="button"> <button class="next-btn">Next</button> </div>
                </div>
            </div>
        </div>

    </div>
    </body>
</html>
