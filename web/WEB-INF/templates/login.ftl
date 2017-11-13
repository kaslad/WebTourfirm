<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="js/jquery-3.2.1.min.js"></script>
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    <script src="js/jquery-ui-1.12.1/"></script>
    <script src="js/bootstrap.js"></script>
    <link href="css/main-style.css" type="text/css" rel="stylesheet">
    <link href="js/jquery-ui-1.12.1/jquery-ui.css" type="text/css" rel="stylesheet">
    <script src="js/jquery-ui-1.12.1/jquery-ui.js"></script>
    <script src="js/main-page-script.js"></script>
    <script src="js/onshowscript.js"></script>
    <script src="js/imageopen.js"></script>
</head>
<body>
<div class="outer-back"></div>
<div class="container log-gr">
    <div class="col-lg-8 col-lg-offset-2">
        <form class="form-group well" method="post" action="#">
            <h1 class="centered up">Login now</h1>
            <label class="lbl">Login</label>
            <input class="form-control" name = "login" type="text" hint="Login"
                   placeholder="Login">
            <label class="lbl">Password</label>
            <input class="form-control" name = "password" type="password" hint="Password" placeholder="Password">
            <input class="btn htl" type="submit" value="Login">
            <h2><button class="btn" id="reg-btn">Register</button></h2>
        </form>
    </div>
</div>
<div class="container reg-gr hidden">
    <div class="col-lg-8 col-lg-offset-2">
        <form class="form-group well" action="#" method="post">
            <h1 class="centered up">Register now</h1>
            <label class="lbl">Login</label>
            <input class="form-control" type="text" hint="Login"
                   placeholder="Login" name="login">
            <label class="lbl">Password</label>
            <input class="form-control" type="password" name="password" hint="Password" placeholder="Password">
            <label class="lbl">Confirm password</label>
            <input class="form-control" type="password" name="password_again" [hint="Password" placeholder="Password">
            <input class="btn htl" type="submit" value="Register">
        </form>
    </div>
</div>
</body>
<script>
    $(document).ready(function(){
        $("#reg-btn").on("click", function() {
            $(".log-gr").slideUp(function() {
                $(".reg-gr").hide().removeClass("hidden").slideDown()
            })
            return false;
        })
    })
</script>
</html>