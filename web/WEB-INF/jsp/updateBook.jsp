<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/6 0006
  Time: 上午 1:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">

        <div class="form-group">
            <input  type="hidden" class="form-control" name="bookID" value="${book.bookID}" >
        </div>
        <div class="form-group">
            <label>书籍名称:</label>
            <input type="text" class="form-control" name="bookName" value="${book.bookName}" >
        </div>
        <div class="form-group">
            <label>书籍数量:</label>
            <input type="text" class="form-control" name="bookCounts" value="${book.bookCounts}" >
        </div>
        <div class="form-group">
            <label>书籍描述:</label>
            <input type="text" class="form-control" name="detail" value="${book.detail}" >
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>


    </form>

</div>

</body>
</html>
