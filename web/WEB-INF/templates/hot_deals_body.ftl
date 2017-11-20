<ul class="result-list">
<#if list?has_content>
    <#list list as prop>
    <li class="well container out-li row" data-toggle="collapse" data-target="#${prop.key.tour.id}">
    <div class="col-lg-3 col-md-3">
    <img src="static/hotel.jpg" class="inner-img image">
    </div>
    <div class="col-lg-6 col-md-6">

    <a class="title" href="">${prop.key.tour.fromCity} &rarr; ${prop.key.tour.toCity}</a>
    <div><a class="htl" href="">${prop.key.hotel.name}</a></div>
        <#if prop.key.hotel.description?has_content>
        <button toggled="false"
        class="btn-toggle">Main features <span class="caret"></span></button>
        <ul style="list-style: outside" class="feats collapse" h="0">
        <li>${prop.key.hotel.description}</li>
        </ul>
        </#if>

    </div>

    <div class="col-lg-3 col-md-3 inf">
    <div class="ratio">
            9.3 &#9733;
    </div>
    </div>
    </li>
        <#if prop.value?has_content>
        <ul class="sublist collapse" id=${prop.key.tour.id}>
            <#list prop.value as concTour>
            <li class="well out-li row">
            <div class="col-lg-3">
            <a href="/tour?conc_tour_id=${concTour.id}" class="title">
            <h3>${prop.key.tour.fromCity} &rarr; ${prop.key.tour.toCity}</h3>
            </a>
            </div>
            <div class="col-lg-6">
            <ul class="feats sub">
            <il>+ Nutrition type: ${concTour.nutritionType}</il>
            <li>+ Airline: ${concTour.airline}</li>
            </ul>
            </div>
            <div class="col-lg-3">
            <input class="htl price btn" value="${concTour.price}" type="button">

            </div>
            </li>
            </#list>
        </ul>
        </#if>
    </#list>
</#if>
</ul>