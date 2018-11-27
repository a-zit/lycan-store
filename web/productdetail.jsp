<%-- 
    Document   : productdetail
    Created on : Nov 18, 2018, 9:33:17 PM
    Author     : Pluem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Shop Item - Start Bootstrap Template</title>
        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <!-- Custom styles for this template -->
        <link rel="stylesheet" type="text/css" href="CSS/shop-item.css" />
    </head>
    <body>

        <!-- Navigation -->
        <jsp:include page="include/header.jsp"/>

        <!-- Page Content -->
        <div class="container">

            <div class="row">

                <div class="col-lg-12">

                    <div class="card mt-4" style="padding: 10px">
                        <div class="row">
                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">
                                <img class="card-img-top img-fluid" src="./Images/${product.productid}.png" alt="">
                            </div>
                            <div class="col-sm-3"></div>
                        </div>
                        <div class="card-body">
                            <h3 class="card-title">${product.productname}</h3>
                            <h4>Price : ${product.price} ฿ </h4>
                            <h4>Size : ${product.productsize}</h4>
                            <hr>
                            <p class="card-text">${product.productdetail}</p>
                            <hr>
                            <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
                            4.0 stars
                        </div>
                            <a href="ProductList" class="btn btn-danger">Add to Cart</a>
                    </div>
                    <!-- /.card -->

                    <div class="card card-outline-secondary my-4">
                        <div class="card-header">
                            Product Reviews
                        </div>
                        <div class="card-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                            <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                            <hr>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                            <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                            <hr>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                            <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                            <hr>
                            <a href="ProductList" class="btn btn-success">Leave a item</a>
                        </div>
                    </div>
                    <!-- /.card -->

                </div>
                <!-- /.col-lg-9 -->

            </div>

        </div>
        <!-- /.container -->

        <!-- Footer -->
        <jsp:include page="include/footer.jsp"/>


        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>
</html>
