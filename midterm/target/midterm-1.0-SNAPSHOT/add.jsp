<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Главная</title>
    <link href="https://rust.litnet.com/common/plugins/bxslider/jquery.bxslider.css?v=1466973214" rel="stylesheet">
    <link href="https://rust.litnet.com/assets/ec9df54/css/widget-bxslider.css?v=1531047733" rel="stylesheet">
    <link href="https://rust.litnet.com/assets/240f3d8a/css/bootstrap.min.css?v=1550073338" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/font-awesome.min.css?v=1.1" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/litnet-icon-font.css?v=1.1" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/grids.css?v=1.1" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/site.css?v=36" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/social-likes_classic.css?v=1.1" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/flags16.css?v=1.1" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/showLoading.css?v=1.1" rel="stylesheet">
    <link href="https://rust.litnet.com/common/css/jquery.jgrowl.min.css?v=1.1" rel="stylesheet">
    <link href="https://rust.litnet.com/dist/main.css?v=3.7" rel="stylesheet">
    <link href="https://rust.litnet.com/assets/751e66ed/css/eauth.css?v=1491769381" rel="stylesheet">
</head>
<body>
    <%@ include file="index.jsp"%>
    <div class="modal-content">
        <div class="modal-header">
            <h4 class="modal-title">Adding story to library</h4>
        </div>
        <form action="/add" method="post" id="login-form">
            <div class="modal-body">
                <span class="pre-label">Title</span>
                <input type="text" name="title" placeholder="Title of thestory" class="form-control" style="width: 500px;">
                <span class="pre-label">Brief description</span>
                <input name="description" type="text" placeholder="Brief description" class="form-control" style="width: 500px;">
                <span class="pre-label">Content</span>
                <input name="content" type="text" placeholder="Content of the story" class="form-control">
            </div>
            <div class="modal-footer clearfix">
                <button type="submit" class="btn btn-pink pull-right">Add Story</button>
            </div>
        </form>
    </div>
</body>
</html>
