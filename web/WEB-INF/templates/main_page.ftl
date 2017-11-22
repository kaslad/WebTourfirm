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
<#include "base_nav.ftl">

<div class="col-lg-10 col-lg-offset-2 col-md-10 col-md-offset-2">
    <img src="static/icons/airplane-icon-png-2497.png" class="slog">
    <h1 class="centered up">Start search your tour now...</h1>
    <div class="content">
        <div id="search">
            <form class="form-group">
                <div class="way-group">
                    <div class="col-lg-6">
                        <input class="form-control" type="text" id="form-from-place" placeholder="Where from..." hint="Where from...">
                    </div>
                    <div class="col-lg-6">
                        <input class="form-control" type="text" id="form-to-place"
                               placeholder="Where to..." hint="Where to...">
                    </div>
                </div>
                <div class="col-lg-6 time-group col-md-6">
                    <input class="form-control" type="datetime" id="form-from-date"
                           placeholder="From..." hint="From..." readonly>
                    <input class="form-control" type="datetime" id="form-to-date"
                           placeholder="To..." hint="To..." readonly>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class=" money-group">
                        <div id="slider"></div>
                        <h4 id="amount" class="centered"></h4>
                    </div>
                </div>
                <div class="full">
                    <input type="button" value="Search" id="srch" class="form-control">
                </div>
            </form>
        </div>
        <h2 class="centered up mt">Or</h2>
        <div class="news">
            <div class="container">
                <h2 class="centered up">Follow ours news</h2>
                <ul class="news-list">
                    <li class="well">
                        <h2>Title</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean sagittis ante id lacus dignissim congue. Curabitur dapibus purus eu nunc facilisis, sit amet tempor tellus consequat. Ut at sollicitudin dui. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus a lacus fermentum, cursus erat et, malesuada arcu. Vestibulum aliquam ... <a href="">Read more...</a> </p>
                        <h4 class="date">21.11.2011</h4>
                    </li>
                    <li class="well">
                        <h2>Title</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean sagittis ante id lacus dignissim congue. Curabitur dapibus purus eu nunc facilisis, sit amet tempor tellus consequat. Ut at sollicitudin dui. Lorem ipsum dolor sit amet, consectetur adipiscing elit.  Etiam... <a href="">Read more...</a></p>
                        <h4 class="date">21.11.2011</h4>
                    </li>
                    <li class="well">
                        <h2>Title</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean sagittis ante id lacus dignissim congue. Curabitur dapibus purus eu nunc facilisis, sit amet tempor tellus consequat. Ut at sollicitudin dui. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus a lacus fermentum, cursus erat et, malesuada arcu. Vestibulum aliquam orci ac nibh vestibulum, sed luctus leo mollis... <a href="">Read more...</a></p>
                        <h4 class="date">21.11.2011</h4>
                    </li>
                </ul>
                <div class="gages">
                    <ul class="pagination pagination-centered">
                        <li><a href="#">Prev</a></li>
                        <li class="active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">Next</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="image-modal">
    <span class="close">&times;</span>
    <img class="image-modal-content" src="">
</div>
</body>

</html>