<%-- 
    Document   : productlist
    Created on : Nov 18, 2018, 9:31:13 PM
    Author     : Pluem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
            />
        <meta name="description" content="" />
        <meta name="author" content="" />

        <title>Product - Page</title>

        <link rel="stylesheet" type="text/css" href="CSS/mystyle.css" />
        <link
            href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
            rel="stylesheet"
            id="bootstrap-css"
            />

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="css/heroic-features.css" rel="stylesheet" />
        <link
            rel="stylesheet"
            href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
            integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
            crossorigin="anonymous"
            />
    </head>
    <body>
        <!-- Navigation -->
        <jsp:include page="include/header.jsp"/>


        <!-- Page Content -->
        <div class="container">
            <!-- Jumbotron Header -->
            <header class="jumbotron my-4">
                <h1 class="display-3">A Warm Welcome!</h1>
                <p class="lead">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa, ipsam,
                    eligendi, in quo sunt possimus non incidunt odit vero aliquid
                    similique quaerat nam nobis illo aspernatur vitae fugiat numquam
                    repellat.
                </p>
                <a href="#" class="btn btn-primary btn-lg">Call to action!</a>
            </header>
            <!-- Search -->
            <div class="mb-4 row justify-content-center">
                <div class="col-12 col-md-10 col-lg-8">
                    <form class="card card-sm">
                        <div class="card-body row no-gutters align-items-center">
                            <div class="col-auto">
                                <i class="fas fa-search h4 text-body"></i>
                            </div>
                            <!-- end of col -->
                            <div class="col">
                                <input
                                    class="form-control form-control-lg form-control-borderless"
                                    type="search"
                                    placeholder="Search topics or keywords"
                                    />
                            </div>
                            <!-- end of col -->
                            <div class="col-auto">
                                <button class="btn btn-lg btn-success" type="submit">
                                    Search
                                </button>
                            </div>
                            <!-- end of col -->
                        </div>
                    </form>
                </div>
                <!-- end of col -->
            </div>

            <!-- Page Features -->
            <div class="row text-center">
                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card">
                        <img
                            class="card-img-top"
                            src="./image/2.png"
                            alt=""
                            />
                        <div class="card-body">
                            <h4 class="card-title">Card title</h4>
                            <p class="card-text">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Sapiente esse necessitatibus neque.
                            </p>
                        </div>
                        <div class="card-footer">
                            <a href="productDetail.jsp" class="btn btn-primary">Find Out More!</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card">
                        <img
                            class="card-img-top"
                            src="./image/4.png"
                            alt=""
                            />
                        <div class="card-body">
                            <h4 class="card-title">Card title</h4>
                            <p class="card-text">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Explicabo magni sapiente, tempore debitis beatae culpa natus
                                architecto.
                            </p>
                        </div>
                        <div class="card-footer">
                            <a href="productDetail.jsp" class="btn btn-primary">Find Out More!</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card">
                        <img
                            class="card-img-top"
                            src="./image/2.png"
                            alt=""
                            />
                        <div class="card-body">
                            <h4 class="card-title">Card title</h4>
                            <p class="card-text">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Sapiente esse necessitatibus neque.
                            </p>
                        </div>
                        <div class="card-footer">
                            <a href="productDetail.jsp" class="btn btn-primary">Find Out More!</a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6 mb-4">
                    <div class="card">
                        <img
                            class="card-img-top"
                            src="./image/4.png"
                            alt=""
                            />
                        <div class="card-body">
                            <h4 class="card-title">Card title</h4>
                            <p class="card-text">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Explicabo magni sapiente, tempore debitis beatae culpa natus
                                architecto.
                            </p>
                        </div>
                        <div class="card-footer">
                            <a href="productDetail.jsp" class="btn btn-primary">Find Out More!</a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->

        <!-- Footer -->
        <jsp:include page="include/footer.jsp"/>
    </div>
    <script>
        // Get the modal
        var modal = document.getElementById("myModal");

        // Get the button that opens the modal
        var btn = document.getElementById("myBtn");

        // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];

        // When the user clicks the button, open the modal
        btn.onclick = function () {
            modal.style.display = "block";
        };

        // When the user clicks on <span> (x), close the modal
        span.onclick = function () {
            modal.style.display = "none";
        };

        // When the user clicks anywhere outside of the modal, close it
        window.onclick = function (event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        };
    </script>
    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
