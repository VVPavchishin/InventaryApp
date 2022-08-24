<#import "parts/common.ftlh" as co>

<@co.page>
    <div class="container mt-3">
        <h2>Задайте шлях до файлу формату Excel...</h2>
        <form class="row mt-4" action="/parts/upload" method="post">
            <div class="col-10">
                <input class="form-control form-control-lg" name="filePath" type="url" aria-describedby="customFileInput">
            </div>
            <div class="col-2">
                <button type="submit" class="btn btn-primary btn-lg">Завантажити</button>
            </div>
        </form>
    </div>
</@co.page>