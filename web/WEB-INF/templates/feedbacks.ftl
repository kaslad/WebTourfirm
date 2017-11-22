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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<#include "base_nav.ftl">
    <div class="col-lg-8 col-lg-offset-3">
        <img src="static/icons/airplane-icon-png-2497.png" class="slog">
        <h1 class="centered up white">Let's help to each other</h1>
        <h2 class="centered up white">Left your review here</h2>
        <div class="content">
            <ul class="review-ul">
                                <#list  0..feedbackList?size-1 as i>
                                <li class="well">
                                    <h2 class="nom"><a href="" class="title">${userList[i].name} ${userList[i].lastName} </a></h2>
                                    <h2 class="nom">
                                        <#list 1..feedbackList[i].rate as g>
                                        &#9733;</#list></h2>
                                    <p>${feedbackList[i].feedback}</p>
                                    <h5 class="date">on     ${feedbackList[i].date}</h5>
                                </li>
                                </#list>

                            </ul>
                            <#if user_name?has_content>
                            <div class="left-commnet">
                                <form class="form-group" id="comm">
                                    <h3><a href=""> ${user_name} ${user_last_name}</a>
                                            <input id="rate-field" name="rate" value="0" style="display: none">
                                            <span rate="-1" id="">
                                            <span class="star"></span>
                                            <span class="star"></span>
                                            <span class="star"></span>
                                            <span class="star"></span>
                                            <span class="star"></span>
                                            </span>
                                    </h3>
                                    <textarea class="t-area" form="comm" name="text" rows="5"></textarea>
                                    <input class="htl btn" value="Send" type="submit">
                                </form>
                            </div>
                                    </#if>

        </div>
    </div>
</body>

</html>