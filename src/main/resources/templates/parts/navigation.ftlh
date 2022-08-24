<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" id="sklad" href="/" style="margin-left: 20px">S K L A D</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/parts">Запчастини на складі</a>
            </li>
<#--            <li class="nav-item">-->
<#--                <a class="nav-link" href="/customer/all">All customers</a>-->
<#--            </li>-->
        </ul>-->
    </div>
</nav></nav>
<footer class="bg-light text-center bg-dark fixed-bottom text-lg-start">
    <div class="text-center p-3 text-white text-lg">
        <#if ipAddress?has_content>
            Ваша IP адреса:
            <a class="text-white">${ipAddress}</a>
        </#if>
    </div>
</footer>