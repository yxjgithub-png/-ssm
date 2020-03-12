<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <title>书籍展示页面</title>
</head>
<style>
    #1,#2 {
        display: inline-block;
    }
    span{
        color: red;
    }
</style>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 -------显示所有书籍</small>
                </h1>
            </div>
        </div>
        <div>
            <div class="row">
                <div class="col-md-4 column" >
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addBookPage">新增书籍</a>
                </div>
            </div>
            <div >
                <form action="${pageContext.request.contextPath}/book/queryBookByName">
                    <input type="text" placeholder="请输入你想要的查询的书" name="bookName">
                    <input type="submit" value="查询">
                    <span>${error}</span>
                </form>
            </div>
        </div>

    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookID}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/updatepage?bookID=${book.bookID}">修改</a>
                            &nbsp;|&nbsp;
                            <a id=""
                               href="${pageContext.request.contextPath}/book/deleteBook?bookID=${book.bookID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
</div>
</body>
</html>