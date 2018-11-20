<%-- 
    Document   : header
    Created on : Nov 16, 2018, 12:03:40 AM
    Author     : pluem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title><!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <!-- Custom styles for this template -->
        <link rel="stylesheet" type="text/css" href="CSS/shop-item.css" />
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand" href="ProductList">Lycan Store</a>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <form class="form-inline my-2 my-lg-0 mr-5" >
                            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Search</button>
                        </form>
                        <li class="nav-item"><a class="nav-link" href="favorite.jsp">Favorite</a></li>
                        <li class="nav-item"><a class="nav-link" href="cart.jsp" style="border-right: 3px solid #bec4ce;">Cart ( 2 )</a></li>  
                        <li class="nav-item">
                            <a id="myBtn" class="cursor nav-link" href="Login">${loginshow}</a>
                        </li>
                        <li class="nav-item"><a class="nav-link">${customer.username}</a></li>
                        <li class="nav-item">
                            <a id="myBtn" class="cursor nav-link" href="Logout">${logoutshow}</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>
