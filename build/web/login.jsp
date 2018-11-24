<%-- 
    Document   : login
    Created on : Nov 18, 2018, 9:36:45 PM
    Author     : Pluem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/loginstyle.css" />
    </head>
    <body id="LoginForm">
        <!-- Navigation -->
        <jsp:include page="include/header.jsp"/>

        <div class="container-fluid" style="margin-top: 10vh;">
            <div class="login-form">
                <div class="main-div">
                    <div class="panel">
                        <h2>Login</h2>
                        <p>Please enter your email and password</p>
                    </div>
                    <form id="Login" action="Login" method="post">
                        
                        <div class="form-group">
                            ${loginalert}
                        </div>
                        
                        <div class="form-group">
                            <input type="text" class="form-control" id="inputUsername" placeholder="Username" name="username" required>
                        </div>

                        <div class="form-group">
                            <input type="password" class="form-control" id="inputPassword" placeholder="Password" name="password" required>
                        </div>
                        <div class="register">
                            <a href="Register">Register</a>
                        </div>
                        <button type="submit" class="btn btn-primary">Login</button>

                    </form>
                </div>
                <p class="botto-text"> Designed for Lycan Store</p>
            </div>
        </div>

    </body>
</html>
