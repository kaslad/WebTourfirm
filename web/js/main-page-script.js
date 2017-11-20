var isChanged = true;
var simpleStarCode = "&#9734;";
var checkedStarCode = "&#9733;";
var starSetted = 0;

function reinitStars(from, to) {
    var st = $(".star");
    if (from === undefined) {
        from = 0;
    }
    if (to === undefined) {
        to = st.length;
    }
    for (var i = from; i <= to; i++) {
        $(st[i]).html(simpleStarCode);
    }
}

function marginImagesByParent(parent) {
    var images = $(parent).find(".under-imgs");
    $(images).each(function(i, el) {
        $(el).width($(parent).width() / images.length - 7)
        console.log($(el).width());
    });
}

function getListHeight(parent) {
    var height = parseInt($(parent).find(".feats").attr("h"));
    if (height == 0) {
        height = parseInt($(parent).find(".feats").innerHeight());
        $(parent).find(".feats").attr("h", height);
    }
    return height;
}

function priceToDown(parent) {
    var height = $(parent).height() + getListHeight(parent);
    if (window.innerWidth >= 768) {
        $(parent).find(".inf").stop(true).animate({
            height: height
        }, 300);
    }
    $(parent).find(".feats").stop(true).slideDown(function () {
        isChanged = true;
    });
}

function priceToUp(parent) {
    var height = $(parent).height() - getListHeight(parent);
    if (window.innerWidth >= 768) {
        $(parent).find(".inf").stop(true).animate({
            height: height
        }, 300)
    }
    $(parent).find(".feats").stop(true).slideUp(function () {
        isChanged = true;
    });
}

$(document).ready(function() {
    var fromDate = $("#form-from-date");
    var toDate = $("#form-to-date");
    
    $(fromDate).datepicker();
    $(toDate).datepicker();
    
    var isSRCHLaunched = false;
    
    
    $(".btn-toggle").on("click", function() {
        var isToggled = $(this).attr("toggled") == "true";
        if (!isChanged) {
            return;
        }
        isChanged = false;
        if (!isToggled) {
            priceToDown($(this).parent().parent());
            $(this).attr("toggled", "true");
        } else {
            priceToUp($(this).parent().parent())
            $(this).attr("toggled", "false");
        }
        return false;
    })
    
    marginImagesByParent($("#main-img-container"));
    marginImagesByParent($("#gallery-img-container"));
    
    var inputs = document.getElementsByClassName("form-control");
        for (var i = 0; i < inputs.length; i++) {
            inputs[i].onfocus = function () {
                $(this).attr("placeholder", "");
            }
            inputs[i].addEventListener("focusout", function() {
                var hint = this.getAttribute("hint");
                this.setAttribute("placeholder", hint);
            });
        }
        $(function() {
            $("#slider").slider({
                range: true,
                min: 0,
                max: 1000,
                values:[0, 300],
                slide: function(event, el) {
                    $( "#amount" ).html( "$" + el.values[ 0 ] + " - $" + el.values[ 1 ] );
                    $("#slider").attr("from", el.values[0]);
                    $("#slider").attr("to", el.values[1]);
                }
        });
        $( "#amount" ).html( "$" + $( "#slider").slider("values",0) + " - $" + $( "#slider" ).slider( "values", 1 ) );
        });
        
        $("[data-toggle='tooltip']").tooltip();
        
        var par = document.getElementsByClassName("out-li");
        if (window.outerWidth >= 768) {
            $(par).each(function(n, el){
                $(el).find(".inf").height($(el).height());
            })
        } else {
            $(par).each(function(n, el) {
                $(el).find(".price").css({
                    position:'relative'
                });
            })
        }
    
    $(".price").on("click", function() {
        return false;
    })
    
    reinitStars();
    
    $(".star").hover(function(e) {
        var i = $(".star").index(e.currentTarget);
        for (var j = 0; j <= i; j++) {
            $(".star").get(j).innerHTML = checkedStarCode;
        }
    })
    
    $(".star").on("mouseout", function(e) {
        var r = parseInt($("#rate-field").attr("rate"));
        reinitStars(r + 1);
    })
    
    $(".star").on("click", function(e) {
        starSetted = $(".star").index(e.target);
        $("#rate-field").attr("rate", starSetted);
    })
    
    $("#c-off").on("click", function() {
        var x = $("#counter").html()
        if (x <= 0) {
            $(this).attr("disabled")
            return false;
        } else {
            $(this).removeAttr("disabled")
        }
        $("#counter").html(parseInt(x) - 1);
        return false;
    })
    
    $("#c-on").on("click", function() {
        var x = $("#counter").html()
        $("#counter").html(parseInt(x) + 1);
        return false;
    })
    
    $("2312").after
});