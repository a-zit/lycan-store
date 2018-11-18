<%-- 
    Document   : cart
    Created on : Nov 18, 2018, 9:39:27 PM
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
            <!--Empty Cart-->
            <!--            <div style="margin-top: 10vh" class="text-center">     
                            <h1 class="mb-4">Your Cart is Empty</h1>
                            <p class="mb-5">There are no products in your shopping cart</p>
                            <hr class="mb-5" style="width:50vw">
                            <a href="productlist.jsp">
                                <button type="button" class="btn btn-outline-dark" >Continue Shopping</button>
                            </a>
                        </div>-->
            <!--Empty Cart End-->
            <div class="container" style="margin-top: 10vh;">
                <div class="row">
                    <div class="col-sm-7 card">
                        <div class="card-body">
                            <h5>YOUR CART ( 2 )</h5>
                            <hr>
                            <div class="row">
                                <div class="col-sm-3">
                                    <img src="image/1.png" class="img-thumbnail">
                                </div>
                                <div class="col-sm-6">
                                    <div class="row" style="font-size: 12px;">
                                        <div class="col-sm-6">
                                            <p>PRODUCT NAME :</p>
                                            <p>TYPE :</p>
                                            <p>SIZE :</p>
                                            <p>QTY :</p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p>BB SOLID TEE</p>
                                            <p>T-SHIRTS</p>
                                            <p> M </p>
                                            <p> 1</p>
                                        </div>
                                    </div>

                                </div>
                                <div class="col-sm-3">
                                    <p>999 ฿</p>
                                </div>
                            </div>
                            <div class="text-right">
                            <button type="button" class="btn btn-outline-secondary">Remove</button>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-3">
                                    <img src="image/3.png" class="img-thumbnail">
                                </div>
                                <div class="col-sm-6">
                                    <div class="row" style="font-size: 12px;">
                                        <div class="col-sm-6">
                                            <p>PRODUCT NAME :</p>
                                            <p>TYPE :</p>
                                            <p>SIZE :</p>
                                            <p>QTY :</p>
                                        </div>
                                        <div class="col-sm-6">
                                            <p>ESSENTIALS LINEAR TEE</p>
                                            <p>T-SHIRTS</p>
                                            <p> M </p>
                                            <p> 1</p>
                                        </div>
                                    </div>

                                </div>
                                <div class="col-sm-3">
                                    <p>1000 ฿</p>
                                </div>
                            </div>
                            <div class="text-right">
                            <button type="button" class="btn btn-outline-secondary">Remove</button>
                            </div>
                            <hr>
                        </div>
                    </div>
                    <div class="col-sm-1"></div>
                    <div class="col-sm-4 card text-white bg-dark mb-3" style="height: 35vh">
                        <div class="card-body">
                            <h5>SUMMARY</h5>
                            <hr>
                            <div class="row">
                                <div class="col-sm-9">
                                    <p>SUBTOTAL</p>
                                    <p>ESTIMATED DUTIES & TAXES</p>
                                    <p>TOTAL</p>
                                </div>
                                <div class="col-sm-3">
                                    <p>1999 ฿</p>
                                    <p>100 ฿</p>
                                    <p>2099 ฿</p>
                                </div>
                            </div>
                            <hr>
                            

                            <div class="text-center">
                                <button type="button" class="btn btn-outline-warning">CHECKOUT</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!--Footer-->
            <div style="position: fixed; bottom: 0;width: 100%;">
                <jsp:include page="include/footer.jsp"/>
            </div>
        </div>
    </body>
</html>
