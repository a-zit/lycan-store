<%-- 
    Document   : favorite
    Created on : Nov 18, 2018, 9:41:02 PM
    Author     : Pluem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body>
        <div>
            <!-- Navigation -->
            <jsp:include page="include/header.jsp"/>
            <!--Empty Favorite-->
            <div style="margin-top: 10vh" class="text-center">     
                <h1 class="mb-4">Your Favorite is Empty</h1>
                <p class="mb-5">There are no products in your favorite </p>
                <hr class="mb-5" style="width:50vw">
                <a href="productlist.jsp">
                    <button type="button" class="btn btn-outline-dark" >Continue Shopping</button>
                </a>
            </div>
            <!--Empty Favorite End-->
            
            <!--Footer-->
            <div style="position: fixed; bottom: 0;width: 100%;">
                <jsp:include page="include/footer.jsp"/>
            </div>
        </div>
    </body>
</html>
