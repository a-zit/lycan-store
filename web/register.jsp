<%-- 
    Document   : register
    Created on : Nov 18, 2018, 9:38:24 PM
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
        <div class="container" style="margin-top: 10vh;">

            <div class="login-form">
                <div class="main-div">
                    <div class="panel">
                        <h2>Register</h2>
                        <p>Please enter your email and password</p>

                    </div>
                    <form id="Register" action="Register" method="POST">

                        <div class="form-group">
                            <input type="text" class="form-control" id="inputUsername" placeholder="Username" name="username" required>
                        </div>

                        <div class="form-group">
                            <input type="password" class="form-control" id="password" placeholder="Password" name="password" required>
                        </div>

                        <div class="form-group">
                            <input type="password" class="form-control" id="confirm_password" placeholder="Confirm Password">
                        </div>
                        <div class="row form-group" style="margin-left: 0.1vw;margin-right: 0.1vw;">
                            <input style="margin-right: 0.5vw;" type="text" class="col-sm form-control" id="inputFname" placeholder="First Name" name="fname" required>
                            <input style="margin-left: 0.5vw;" type="text" class="col-sm form-control" id="inputLname" placeholder="Last Name" name="lname" required>
                        </div>

                        <div class="form-group">
                            <input type="text" class="form-control" id="street" placeholder="Street" name="street">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="city" placeholder="City" name="city">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="stateful" placeholder="State" name="statefull">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="zipcode" placeholder="Zipcode" name="zipcode">
                        </div>
                        

                        <div class="form-group">
                            <input type="text" class="form-control" id="inputTelno" placeholder="Tel Number" name="telno" required>
                        </div>

                        <div class="form-group">
                            <input type="text" class="form-control" id="inputEmail" placeholder="Email" name="email" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Register</button>
                    </form>
                </div>
                <p class="botto-text"> Designed for Lycan Store</p>
            </div>
            
        </div>
        <script>
            var password = document.getElementById("password")
                    , confirm_password = document.getElementById("confirm_password");

            function validatePassword() {
                if (password.value != confirm_password.value) {
                    confirm_password.setCustomValidity("Passwords Don't Match");
                } else {
                    confirm_password.setCustomValidity('');
                }
            }

            password.onchange = validatePassword;
            confirm_password.onkeyup = validatePassword;
        </script>
</html>
