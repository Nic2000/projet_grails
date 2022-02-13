<html>
<head>

    <title><g:message code='springSecurity.login.title'/></title>
    <style type="text/css" media="screen">
    #login {
        margin: 15px 0px;
        padding: 0px;
        text-align: center;
    }

    #login .inner {
        width: 340px;
        padding-bottom: 6px;
        margin: 60px auto;
        text-align: left;
        border: 1px solid #aab;
        background-color: #f0f0fa;
        -moz-box-shadow: 2px 2px 2px #eee;
        -webkit-box-shadow: 2px 2px 2px #eee;
        -khtml-box-shadow: 2px 2px 2px #eee;
        box-shadow: 2px 2px 2px #eee;
    }

    #login .inner .fheader {
        padding: 18px 26px 14px 26px;
        background-color: #f7f7ff;
        margin: 0px 0 14px 0;
        color: #2e3741;
        font-size: 18px;
        font-weight: bold;
    }

    #login .inner .cssform p {
        clear: left;
        margin: 0;
        padding: 4px 0 3px 0;
        padding-left: 105px;
        margin-bottom: 20px;
        height: 1%;
    }

    #login .inner .cssform input[type="text"] {
        width: 120px;
    }

    #login .inner .cssform label {
        font-weight: bold;
        float: left;
        text-align: right;
        margin-left: -105px;
        width: 110px;
        padding-top: 3px;
        padding-right: 10px;
    }

    #login #remember_me_holder {
        padding-left: 120px;
    }

    #login #submit {
        margin-left: 15px;
    }

    #login #remember_me_holder label {
        float: none;
        margin-left: 0;
        text-align: left;
        width: 200px
    }

    #login .inner .login_message {
        padding: 6px 25px 20px 25px;
        color: #c33;
    }

    #login .inner .text_ {
        width: 120px;
    }

    #login .inner .chk {
        height: 12px;
    }
    * {
        box-sizing: border-box;
        -moz-box-sizing: border-box;
        -webkit-box-sizing: border-box;
        font-family: arial
    }

    h1 {
        color: #ccc;
        text-align: center;
        font-family: 'Vibur', cursive;
        font-size: 50px
    }

    .login-form {
        width: 350px;
        padding: 40px 30px;
        background: #eee;
        margin: auto;
        border: 1px solid #fff;
        position: absolute;
        left: 0;
        right: 0;
        top: 10%
    }

    .form-group {
        position: relative;
        margin-bottom: 15px
    }

    .form-control {
        width: 100%;
        height: 50px;
        border: none;
        padding: 5px 7px 5px 15px;
        background: #fff;
        color: #666;
        border: 2px solid #ddd
    }

    .form-group .mdi {
        position: absolute;
        right: 15px;
        top: 17px;
        color: #999
    }

    .mdi {
        top: 13px !important;
        color: #0AC986 !important
    }

    .form-control:focus {
        color: #fff !important;
        background-color: #fff;
        border-color: #fff !important;
        outline: none;
        box-shadow: none
    }

    .log-status.wrong-entry .form-control,
    .wrong-entry .form-control+.mdi {
        border-color: #ed1c24;
        color: #ed1c24
    }

    .log-btn {
        background: #0AC986;
        dispaly: inline-block;
        width: 100%;
        font-size: 16px;
        height: 50px;
        color: #fff;
        text-decoration: none;
        border: none
    }

    .link {
        text-decoration: none;
        color: #C6C6C6;
        float: right;
        font-size: 12px;
        margin-bottom: 15px
    }

    .alert {
        display: none;
        font-size: 12px;
        color: #f00;
        float: left
    }

    a {
        text-decoration: none !important
    }
    </style>
</head>

<body>
<div id="login">
    <div class="inner">

        <div class="login-form">
            <g:if test='${flash.message}'>
                <div class="login_message">${flash.message}</div>
            </g:if>
        <form action="${postUrl ?: '/login/authenticate'}" method="POST" id="loginForm">

                <p>Bonjour !</p>
                <p>Connectez-vous pour découvrir toutes nos fonctionnalités.</p>
                <div class="form-group "> <input type="text" class="form-control"  name="${usernameParameter ?: 'username'}" placeholder="Username " id="UserName"> <i class="mdi mdi-account"></i> </div>
                <div class="form-group log-status"> <input type="password" class="form-control" name="${passwordParameter ?: 'password'}" placeholder="Password" id="Passwod"> <i class="mdi mdi-lock"></i> </div>
                 <p>
                    <input type="submit" id="submit"  class="log-btn" value="${message(code: 'springSecurity.login.button')}"/>
                </p>

        </form>
        </div>
    </div>
</div>
<script>
    (function() {
        document.forms['loginForm'].elements['${usernameParameter ?: 'username'}'].focus();
    })();
</script>
</body>
</html>
