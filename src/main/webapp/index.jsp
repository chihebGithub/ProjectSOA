<%--
  Created by IntelliJ IDEA.
  User: Rabeh Chiheb
  Date: 23/06/2020
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>
<body>
<div class="container">
    <!-- Content here -->
    <form action="/ProjectSOA/lifeLeftController" method="post">
        <div class="form-group">
            <label for="InputName">Name</label>
            <input type="text" class="form-control"   id="InputName" name="InputName" aria-describedby="Name" placeholder="Enter Name">
            <small id="InputNameHelp" class="form-text text-muted">Enter your Name</small>
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <label class="input-group-text" for="inputsexe">Options</label>
            </div>
            <select class="custom-select" id="inputsexe" name="inputsexe">
                <option selected>Choose...</option>
                <option value="homme">man</option>
                <option value="femme">women</option>
            </select>
        </div>
        <div class="form-group">
            <label for="InputAge">Age</label>
            <input type="text" class="form-control" id="InputAge" name="InputAge" aria-describedby="Name" placeholder="Age">
            <small id="InputHelpAge" class="form-text text-muted">Enter your LastName</small>
        </div>
        <c:if test="${not empty resultat}">
            <div class="alert alert-primary" role="alert">
                    ${resultat}

            </div>
        </c:if>



        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
