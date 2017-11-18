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
    <li><a href="">Main<span>&rsaquo;</span></a></li>
    <li><a href="">Hotels<span>&rsaquo;</span></a></li>
    <li><a href="/tours">Tours<span>&rsaquo;</span></a></li>
    <li><a href="" class="danger">Hot sales<span>&rsaquo;</span></a></li>
    <li><a href="">About us<span>&rsaquo;</span></a></li>
    <li><a href="" class="active">Profile<span>&rsaquo;</span></a></li>
</ul>
<div class="col-lg-8 col-lg-offset-3">
    <div class="content well row">
        <h1 class="centered up title">Profile</h1>
        <div class="row">
            <div class="col-lg-3">
                <img src="static/icons/vk.png" class="inner-img well">
                <button class="btn-toggle full" data-toggle="modal" data-target="#edit">Edit Profile</button>
            </div>
            <div class="col-lg-9 mt">
                <h2>Login: ${login}</h2>
                <#if name?has_content>
                    <h2>Name: ${name}</h2>
                <#else>
                    <h2>Name: </h2>
                </#if>

            </div>
        </div>
        <div class="tabs-content row">
            <ul class="nav nav-tabs">
                <li class="active"><a href="#all" data-toggle="tab">All Tours</a></li>
                <li><a href="#passed" data-toggle="tab">Passed Tours</a></li>
                <li><a href="#incomming" data-toggle="tab">Incoming Tours</a></li>
                <li><a href="#info" data-toggle="tab">Info</a></li>
            </ul>
            <div class="tab-content">
                <div class="tab-pane active in" id="all">
                    <ul class="result-list mt">
                        <li class="well out-li row">
                            <div class="row">
                                <div class="col-lg-3">
                                    <a href="" class="title">
                                        <h3 class="nom">Kazan - Thailand</h3>
                                    </a>
                                    <h4 class="centered">21.01.18 - 28.01.17</h4>
                                </div>
                                <div class="col-lg-6">
                                    <ul class="feats sub">
                                        <il>+ Dinner</il>
                                        <li>+ Extra bed</li>
                                    </ul>
                                </div>
                                <div class="col-lg-3">
                                    <input class="htl price btn" value="$600" type="button">
                                    <h3 class="red">Passed</h3>
                                </div>
                            </div>
                        </li>
                        <li class="well out-li row">
                            <div class="col-lg-3">
                                <a href="" class="title">
                                    <h3 class="nom">Kazan - Thailand</h3>
                                </a>
                                <h4 class="centered">21.01.18 - 28.01.17</h4>
                            </div>
                            <div class="col-lg-6">
                                <ul class="feats sub">
                                    <il>+ Dinner</il>
                                    <li>+ Extra bed</li>
                                </ul>
                            </div>
                            <div class="col-lg-3">
                                <input class="htl price btn" value="$600" type="button">
                                <h3 class="blue">Incomming</h3>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="tab-pane fade" id="passed">
                    <ul class="result-list mt">
                        <li class="well out-li row">
                                <div class="col-lg-3">
                                    <a href="" class="title">
                                        <h3 class="nom">Kazan - Thailand</h3>
                                    </a>
                                    <h4 class="centered">21.01.18 - 28.01.17</h4>
                                </div>
                                <div class="col-lg-6">
                                    <ul class="feats sub">
                                        <il>+ Dinner</il>
                                        <li>+ Extra bed</li>
                                    </ul>
                                </div>
                                <div class="col-lg-3">
                                    <input class="htl price btn" value="$600" type="button">
                                    <h3 class="red">Passed</h3>
                                </div>
                        </li>
                    </ul>
                </div>
                <div class="tab-pane fade" id="incomming">
                    <ul class="result-list mt">
                        <li class="well out-li row">
                            <div class="col-lg-3">
                                <a href="" class="title">
                                    <h3 class="nom">Kazan - Thailand</h3>
                                </a>
                                <h4 class="centered">21.01.18 - 28.01.17</h4>
                            </div>
                            <div class="col-lg-6">
                                <ul class="feats sub">
                                    <il>+ Dinner</il>
                                    <li>+ Extra bed</li>
                                </ul>
                            </div>
                            <div class="col-lg-3">
                                <input class="htl price btn" value="$600" type="button">
                                <h3 class="blue">Incomming</h3>
                            </div>
                        </li>
                    </ul>
                </div>

                <div class="tab-pane fade" id="info">
                    <div class="pad">
                        <#if name?has_content>
                            <h4>Name <h5 class="well">${name}</h5></h4>
                        <#else>
                            <h4>Name <h5 class="well"></h5></h4>
                        </#if>
                            <#if last_name?has_content>
                                <h4>Family name <h5 class="well">${last_name}</h5></h4>
                            <#else>
                                <h4>Family name <h5 class="well"></h5></h4>
                            </#if>
                            <#if father_name?has_content>
                                <h4>Patronymic <h5 class="well">${father_name}</h5></h4>
                            <#else>
                                <h4>Patronymic <h5 class="well"></h5></h4>
                            </#if>

                        <#if phone_number?has_content>
                            <h4>Mobile<h5 class="well">${phone_number}</h5></h4>
                        <#else>
                            <h4>Mobile<h5 class="well"></h5></h4>

                        </#if>
                        <#if passport_series?has_content>
                            <h4>Passport series<h5 class="well">${passport_series}</h5></h4>
                        <#else>
                            <h4>Passport series<h5 class="well"></h5></h4>
                        </#if>
                        <#if passport_number?has_content>
                            <h4>Passport number<h5 class="well">${passport_number} </h5></h4>
                        <#else>
                            <h4>Passport number<h5 class="well"></h5></h4>
                        </#if>

                        <#if passport_who_gave?has_content>
                            <h4>Passport who gave<h5 class="well">${passport_who_gave}</h5></h4>
                        <#else>
                            <h4>Passport who gave<h5 class="well"></h5></h4>

                        </#if>

                        <#if email?has_content>
                            <h4>Email<h5 class="well">${email}</h5></h4>
                        <#else>
                            <h4>Email<h5 class="well"></h5></h4>
                        </#if>


                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="edit" role="dialog">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="blue centered up">Edit profile</h3>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <h2 class="centered blue">General</h2>
            <div class="modal-body">

                <form action="/profile?id=${id}" class="form-group" id="form1" method="post">
                    <label class="lbl">Login:</label>
                    <#if login?has_content>
                        <input class="form-control" type="text" hint="" name = "login" value="${login}">
                    <#else>
                        <input class="form-control" type="text" hint="" name = "login" value="">
                    </#if>
                    <label class="lbl">Name:</label>
                    <#if name?has_content>
                        <input class="form-control" type="text" hint="" name = "name" value="${name}">
                    <#else>
                        <input class="form-control" type="text" hint="" name = "name" value="">
                    </#if>
                    <label class="lbl">Patronymic:</label>
                    <#if father_name?has_content>
                        <input class="form-control" type="text" hint="" name = "father_name" value="${father_name}">
                    <#else>
                        <input class="form-control" type="text" hint="" name = "father_name" value="">
                    </#if>
                    <label class="lbl">Family name:</label>
                    <#if last_name?has_content>
                        <input class="form-control" type="text" hint="" name = "last_name" value="${last_name}">
                    <#else>
                        <input class="form-control" type="text" hint="" name = "last_name" value="">
                    </#if>
                    <label class="lbl">Mobile</label>
                    <#if phone_number?has_content>
                        <input class="form-control" type="text" hint="" name="phone_number" value="${phone_number}">
                    <#else>
                        <input class="form-control" type="text" hint="" name="phone_number"  >
                    </#if>




                    <div class="line"></div>
                    <h2 class="centered blue">Additional</h2>
                    <div class="modal-body">
                        <label class="lbl">Passport series</label>
                    <#if passport_series??>
                        <input class="form-control" id="passport_series" type="text" hint="" name ="passport_series" value="${passport_series}">
                    <#else>
                        <input class="form-control" id="passport_series" type="text" hint="" name ="passport_series">
                    </#if>
                        <label class="lbl">Passport number</label>
                    <#if passport_number?has_content>
                        <input class="form-control" type="text" hint="" name="passport_number" value="${passport_number}">
                    <#else>
                        <input class="form-control" type="text" hint="" name="passport_number" >
                    </#if>
                        <label class="lbl">Passport who gave</label>
                    <#if passport_who_gave?has_content>
                        <input class="form-control" type="text" hint="" name="passport_who_gave" value="${passport_who_gave}">
                    <#else>
                        <input class="form-control" type="text" hint="" name="passport_who_gave" >
                    </#if>

                        <!-- <button class="c-btn btn btn-default" data-dismiss="modal" form="form2" value="Cancel">Cancel</button> -->
                    </div>
                    <div class="line"></div>
                    <h2 class="centered blue">Password</h2>
                    <h3 class="centered">Left fields empty to pass</h3>
                    <div class="modal-body">
                        <label class="lbl">New password</label>
                        <input class="form-control" name="password" type="password" hint="">

                    </div>
                </form>
            <div class="modal-footer">
                <button class="c-btn btn btn-default" type="reset" data-dismiss="modal">Cancel</button>
                <button class="s-btn btn btn-default" type="submit" form="form1" value="Save">Save</button>
            </div>
                <script>
                $(document).ready(function()
                {
                // codes works on all bootstrap modal windows in application
                $('.modal fade').on('hidden.bs.modal', function(e)
                {
                $(this).removeData();
                }) ;
                });
                </script>
        </div>
    </div>
</div>
</body>
</html>