
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <div class="from-group">
            书籍名称：<input type="hidden" name="bookID" value="${QBook.bookID}" class="form-control" placeholder="" required>
        </div>
        <div class="from-group">
            书籍名称：<input type="text" name="bookName" value="${QBook.bookName}" class="form-control" placeholder="" required>
        </div>
        <div class="from-group">
            书籍数量：<input type="text" name="bookCounts" value="${QBook.bookCounts}" class="form-control" placeholder="" required>
        </div>
        <div class="from-group">
            书籍详情：<input type="text" name="detail" value="${QBook.detail}" class="form-control" placeholder="" required>
        </div>
        <div class="from-group">
            <input type="submit" class="form-control" value="提交">
        </div>
    </form>

</div>
</body>
</html>
