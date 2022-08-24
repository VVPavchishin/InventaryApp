<#import "parts/common.ftlh" as co>

<@co.page>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Артикул</th>
            <th scope="col">Назва запчастини</th>
            <th scope="col">Локація</th>
            <th scope="col">К-ть облікова</th>
            <th scope="col">К-ть фактична</th>
        </tr>
        </thead>
        <tbody>
        <#if parts?has_content>
            <#list parts as part>
                <tr>
                    <th scope="row">${part?counter}</th>
                    <td>${part.partNumber}</td>
                    <td>${part.partName}</td>
                    <td>${part.partLocation}</td>
                    <td>${part.partQuantity}</td>
                    <td>${part.partQuantityFact}</td>
                </tr>
            </#list>
            <#else>
            <p>Запчастин немає!!!</p>
        </#if>
        </tbody>
    </table>
</@co.page>