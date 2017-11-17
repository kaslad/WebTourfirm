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
<div class="col-lg-10 col-lg-offset-2">
    <div class="content">
        <div id="search">
            <form class="form-group" method="get">
                <div class="way-group">
                    <div class="col-lg-6 col-md-6">
                        <input class="form-control" type="text" id="form-from-place" placeholder="Where from..."
                               name = "where_from" hint="Where from...">
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <input class="form-control" type="text" id="form-to-place"
                               placeholder="Where to..." name="where_to" hint="Where to...">
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 time-group">
                    <input class="form-control" type="datetime" id="form-from-date"
                           placeholder="From..." name="from_date" hint="From..." readonly>
                    <input class="form-control" type="datetime" id="form-to-date"
                           placeholder="To..." name="to_date" hint="To..." readonly>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="money-group">
                        <div id="slider" ></div>
                        <h3 id="amount" class="centered"></h3>
                    </div>
                </div>
                <div class="full">
                    <input type="button" value="Search" id="srch" class="form-control">
                </div>
            </form>
        </div>
        <div class="results">
            <ul class="result-list">
                <li class="well container out-li row" data-toggle="collapse" data-target="#sl1">
                    <div class="col-lg-3 col-md-3">
                        <img src="static/hotel.jpg" class="inner-img image">
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <a class="title" href="">Kazan &rarr; New York</a>
                        <div><a class="htl" href="">Grand America Hotel</a></div>
                        <button toggled="false"
                                class="btn-toggle">Main features <span class="caret"></span></button>
                        <ul style="list-style: outside" class="feats collapse" h="0">
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
                <ul class="sublist collapse" id="sl1">
                    <li class="well out-li row">
                        <div class="col-lg-3">
                            <a href="" class="title">
                                <h3>Kazan - Thailand</h3>
                            </a>
                        </div>
                        <div class="col-lg-6">
                            <ul class="feats sub">
                                <il>+ Dinner</il>
                                <li>+ Extra bed</li>
                            </ul>
                        </div>
                        <div class="col-lg-3">
                            <input class="htl price btn" value="$600" type="button">
                        </div>
                    </li>
                    <li class="well out-li row">
                        <div class="col-lg-3">
                            <a href="" class="title">
                                <h3>Kazan - Thailand</h3>
                            </a>
                        </div>
                        <div class="col-lg-6">
                            <ul class="feats sub">
                                <il>+ Dinner</il>
                                <li>+ Extra bed</li>
                                <li>+ All inclusive</li>
                            </ul>
                        </div>
                        <div class="col-lg-3">
                            <input class="htl price btn" value="$800" type="button">
                        </div>
                    </li>
                </ul>
                <li class="well container out-li row" data-toggle="collapse" data-target="#sl2">
                    <div class="col-lg-3">
                        <img src="static/hotel.jpg" class="inner-img image">
                    </div>
                    <div class="col-lg-6">
                        <a class="title" href="">Kazan &rarr; New York</a>
                        <div><a class="htl" href="">Grand America Hotel</a></div>
                        <button toggled="false"
                                class="btn-toggle">Main features <span class="caret"></span></button>
                        <ul style="list-style: outside" class="feats collapse" h="0">
                            <li>Breakfast and lunch are included</li>
                            <li>Sea in the hotel's area</li>
                            <li>Great view from hotel's appartment</li>
                        </ul>
                    </div>
                    <div class="col-lg-3 inf">
                        <div class="ratio">
                            9.3 &#9733;
                        </div>
                        <input class="btn htl price bot" value="$700" type="button">
                    </div>
                </li>
                <ul class="sublist collapse" id="sl2">
                    <li class="well out-li row">
                        <div class="col-lg-3">
                            <a href="" class="title">
                                <h3>Kazan - Thailand</h3>
                            </a>
                        </div>
                        <div class="col-lg-6">
                            <ul class="feats sub">
                                <il>+ Dinner</il>
                                <li>+ Extra bed</li>
                            </ul>
                        </div>
                        <div class="col-lg-3">
                            <input class="htl price btn" value="$600" type="button">
                        </div>
                    </li>
                    <li class="well out-li row">
                        <div class="col-lg-3">
                            <a href="" class="title">
                                <h3>Kazan - Thailand</h3>
                            </a>
                        </div>
                        <div class="col-lg-6">
                            <ul class="feats sub">
                                <il>+ Dinner</il>
                                <li>+ Extra bed</li>
                                <li>+ All inclusive</li>
                            </ul>
                        </div>
                        <div class="col-lg-3">
                            <input class="htl price btn" value="$800" type="button">
                        </div>
                    </li>
                </ul>
            </ul>
        </div>
    </div>
</div>

<div class="image-modal">
    <span class="close">&times;</span>
    <img class="image-modal-content" src="">
</div>
</body>
</html>