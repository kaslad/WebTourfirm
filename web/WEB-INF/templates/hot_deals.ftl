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
<#include "base_nav.ftl">

<div class="col-lg-10 col-lg-offset-2">
<div class="content">
<div id="search">
<form class="form-group" method="get">
<div class="way-group">
<div class="col-lg-6 col-md-6">
<input class="form-control" type="text" id="from_city" placeholder="Where from..."
        name="from_city" hint="Where from...">
</div>
<div class="col-lg-6 col-md-6">
<input class="form-control" type="text" id="to_city"
        placeholder="Where to..." name="to_city" hint="Where to...">
</div>

<div class="full">
<input type="button" value="Search" onclick="do_search(); return false" id="srch" class="form-control">
</div>
</button>
</div>
</form>
</div>
</div>



<div class="results" id="result-list">


</div>
</div>

<div class="image-modal">
<span class="close">&times;</span>
<img class="image-modal-content" src="">
</div>
</body>
<script type="text/javascript">
        function do_search() {
        console.log(1);
        $.ajax({
        url: "/deals_ajax",
        data: {"from_city": $("#from_city").val(), "to_city": $("#to_city").val()},
        dataType: "json",
        success: function (result) {
        $("#result-list").html("");
        $("#result-list").append(result.list);
        },
        error: function (jqXHR, exception) {
        alert("kekkke");
        if (jqXHR.status === 0) {
        alert('Not connect.\n Verify Network.');
        } else if (jqXHR.status == 404) {
        alert('Requested page not found. [404]');
        } else if (jqXHR.status == 500) {
        alert('Internal Server Error [500].');
        } else if (exception === 'parsererror') {
        alert('Requested JSON parse failed.');
        } else if (exception === 'timeout') {
        alert('Time out error.');
        } else if (exception === 'abort') {
        alert('Ajax request aborted.');
        } else {
        alert('Uncaught Error.\n' + jqXHR.responseText);
        }
        }
        });
        }
</script>
</html>