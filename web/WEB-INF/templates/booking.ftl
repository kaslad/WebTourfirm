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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <div id="img-b"><div class="outer-back"></div></div>
        <nav class="navbar navbar-default h-nav">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                    <li><a href="#" id="enter">Sign In</a></li>
                    <li><a href="#" id="register">Sign Up</a></li>
                </ul>
            </div>
        </nav>
        <ul class="nav m-nav nav-stacked hidden-xs hidden-sm">
            <li><a href="" class="active">Main<span>&rsaquo;</span></a></li>     
            <li><a href="">Hotels<span>&rsaquo;</span></a></li>
            <li><a href="">Tours<span>&rsaquo;</span></a></li>
            <li><a href="" class="danger">Hot sales<span>&rsaquo;</span></a></li>
            <li><a href="">About us<span>&rsaquo;</span></a></li>
            <li><a href="">Profile<span>&rsaquo;</span></a></li>
        </ul>
    <div class="col-lg-8 content col-lg-offset-3 well">
        <div class="result-list">
                <li class="container well out-li" data-toggle="collapse" data-target="#sl1">
                            <div class="col-lg-3 col-md-3">
                                <img src="static/hotel.jpg" class="inner-img image">
                            </div>
                            <div class="col-lg-6 col-md-6">
                                <a class="title" href="">Kazan &rarr; New York</a>
                                <div><a class="htl" href="">Grand America Hotel</a></div>
                                <ul style="list-style: none" class="feats mt" h="0">
                                    <li>Breakfast and lunch are included</li>
                                    <li>Sea in the hotel's area</li>
                                    <li>Great view from hotel's appartment</li>
                                </ul>
                            </div>
                            <div class="col-lg-3 col-md-3 inf">
                                <div class="ratio">
                                    9.3 &#9733;
                                </div>
                                <input class="btn htl price bot" value="$700" type="button" > 
                            </div>
                        </li>
            </div>
        <div>
            <h2 class="centered">Please comfirm booking</h2>
            <form class="form-group pursh-form">
                <div id="quant">
                    <div>
                        <button class="btn-transparent" id="c-off">-1</button>
                        <button class="btn-transparent" id="counter">0</button>
                        <button class="btn-transparent" id="c-on">+1</button>
                    </div>
                </div>
                <h3 class="centered">You can left us a comment</h3>
                <textarea class="t-area"></textarea>
                <!-- for login users 
                <h3 class="centered">You are booking as <a href="">Julia Sunma</a></h3>
                <button type="submit" class="htl btn btn-defalt">Book!</button>-->
                <!-- -->
                <!-- for not logged users -->
                <h3 class="centered">You are anonymous user</h3>
                <h4 class="centered">Log in or fill the fields</h4>
                <form action="" class="form-group">
                    <label class="lbl">First name</label>
                    <input type="text" class="form-control" name="first-name" placeholder="First name" hint="First name">
                    
                    <label class="lbl">Second name</label>
                    <input type="text" class="form-control" name="sec-name" placeholder="First name" hint="First name">
                    
                    <label class="lbl">Passport data</label>
                    <textarea type="text" class="t-area form-control" name="passport" placeholder="Input your passport data" hint="Input your passport data" rows="5"></textarea>
                    
                    
                    <label class="lbl">Mobile Phone</label>
                    <input type="tel" class="form-control" name="phone" placeholder="Phone number" hint="Phone number">
                    
                    
                    <label class="lbl">E-mail</label>
                    <input type="email" class="form-control" name="email" placeholder="email@example.com" hint="email@example.com">
                    <button type="submit" class="htl btn btn-defalt">Book!</button>
                </form>
            </form>
        </div>
        </div>
</body>
</html>
