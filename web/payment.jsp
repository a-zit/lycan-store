<%-- 
    Document   : payment
    Created on : Nov 25, 2018, 2:04:20 AM
    Author     : DEMO TEST
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Payment - Page</title>
    </head>
    <body>
        <!--header-->
        <jsp:include page="include/header.jsp"/>
        <!--body-->
        <div class="container mt-5 mb-5">
            <div class="row">
                <div class="col-sm-6 text-center">
                    <div class="card">
                        <div class="card-header">
                            ADDRESS
                        </div>
                        <div class="card-body text-left">
                            <form>
                                <div class="form-group">
                                    <label>First Name</label>
                                    <input class="form-control" type="text" name="fname" placeholder="papop">
                                </div>
                                <div class="form-group">
                                    <label>Last Name</label>
                                    <input class="form-control" type="text" name="lname" placeholder="ruengsupapichat">
                                </div>
                                <div class="form-group">
                                    <label>Address</label>
                                    <input class="form-control" type="text" name="" placeholder="test">
                                </div>
                                <div class="form-group">
                                    <label>Street</label>
                                    <input class="form-control" type="text" name="" placeholder="test">
                                </div>
                                <div class="form-group">
                                    <label>City</label>
                                    <input class="form-control" type="text" name="" placeholder="test">
                                </div>
                                <div class="form-group">
                                    <label>State</label>
                                    <input class="form-control" type="text" name="" placeholder="test">
                                </div>
                                <div class="form-group">
                                    <label>Tel</label>
                                    <input class="form-control" type="text" name="" placeholder="test">
                                </div>
                                <div class="form-group">
                                    <label>Zip code</label>
                                    <input class="form-control" type="text" name="" placeholder="test">
                                </div>
                                <button type="submit" class="btn btn-primary mb-2">Edit</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card ">
                        <div class="card-header text-center">
                            Payment
                        </div>
                        <div class="card-body">
                            <form>
                                <div class="form-group">
                                    <label>Credit card 16 digit</label>
                                    <input class="form-control" type="text" name="" placeholder="">
                                </div>
                                <div class="form-group">
                                    <label>Name</label>
                                    <input class="form-control" type="text" name="" placeholder="">
                                </div>
                                <div class="form-group">
                                    <label>Month / Year </label>
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-sm">
                                                <input class="form-control" type="text" name="" placeholder="month">
                                            </div>
                                            <div class="col-sm">
                                                <input class="form-control" type="text" name="" placeholder="year">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>CVV</label>
                                    <input class="form-control" type="text" name="" placeholder="179">
                                </div>
                                <button type="submit" class="btn btn-danger mb-2">Accept</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--footer-->
        <jsp:include page="include/footer.jsp"/>
    </body>
</html>
