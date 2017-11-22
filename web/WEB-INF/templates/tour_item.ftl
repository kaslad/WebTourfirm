<!DOCTYPE html>
<html>
<head>
    <title></title>
    <script src="js/jquery-3.2.1.min.js"></script>
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet">
    <script src="js/jquery-ui-1.12.1/"></script>
    <script src="js/bootstrap.js"></script>
    <link href="css/main-style.css" type="text/css" rel="stylesheet">
    <link href="js/jquery-ui-1.12.1/jquery-ui.css" type="text/css" rel="stylesheet">
    <script src="js/jquery-ui-1.12.1/jquery-ui.js"></script>
    <script src="js/main-page-script.js"></script>
    <script src="js/imageopen.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<#include "base_nav.ftl">

<div class="col-lg-8 col-lg-offset-3 well content">
            <div class="header-content row">
                <div class="col-lg-5">
                    <img src="static/hotel.jpg" class="inner-img image-main image">
                    <div id="main-img-container">
                        <img src="static/hotel.jpg" class="under-imgs image">
                        <img src="static/hotel.jpg" class="under-imgs image">
                        <img src="static/hotel.jpg" class="under-imgs image">
                    </div>
                </div>
                <div class="col-lg-7">
                    <h1 style="text-align: left">${tour.fromCity} - ${tour.toCity}</h1>
                    <h4 class="">${conc_tour.date} - ${conc_tour.dateEnd}</h4>
                    <label for="feats" class="lbl">Features</label>
                    <ul class="feats">
                                    <li>${conc_tour.nutritionType}</li>
                    </ul>
                    <a href=""><h2 class="htl"></h2></a>
                </div>
            </div>
            <div class="tabs-content row">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#hotel" data-toggle="tab">Hotel</a></li>
                    <li><a href="#about" data-toggle="tab">About tour</a></li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active in" id="hotel">
                        <h2>${hotel.name}</h2>
                        <h3 class="title nom">${hotel.countStar} stars</h3>
                        <div class="centered">
                            <p>To get more information about this hotel, click this button</p>
                            <h2><a href="/hotel?id=hotel.id" class="htl full">Get more about  hotel</a></h2>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="about">
                        <label class="lbl mt">About this tour</label>
                        <p class="">${tour.description}</p>
                        <h2 class="centered">Book now for:</h2>
                        <a href="/booking?conc_tour_id=${conc_tour.id}"><h2 class="htl">${conc_tour.price}</h2></a>
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