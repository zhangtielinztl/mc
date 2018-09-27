<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>咨询问题</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="css/uniform.css" />
    <link rel="stylesheet" href="css/select2.css" />
    <link rel="stylesheet" href="css/matrix-style.css" />
    <link rel="stylesheet" href="css/matrix-media.css" />
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Header-part-->
<div id="header">
    <h1><a href="dashboard.html">MatAdmin</a></h1>
</div>
<!--close-Header-part-->
<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav">
        <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>
            <span class="text">欢迎Admin</span><b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li class="divider"></li>
                <li><a href="login.html"><i class="icon-key"></i> 退出</a></li>
            </ul>
        </li>
        <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">退出</span></a></li>
    </ul>
</div>
<div id="sidebar"> <a href="#" class="visible-phone"><i class="icon icon-th"></i>Tables</a>
    <ul>
        <li ><a href="index.html"><i class="icon icon-home"></i> <span>首页</span></a> </li>
        <li> <a href="charts.html"><i class="icon icon-user"></i> <span>医生个人信息</span></a> </li>
        <li> <a href="widgets.html"><i class="icon icon-th-large"></i> <span>老人告警信息</span></a> </li>
        <li class="active"><a href="tables.html"><i class="icon icon-th-list"></i> <span>咨询问题</span></a></li>
    </ul>
</div>
<div id="content">
    <div class="container-fluid">
        <h4>回复咨询</h4>
        <hr>

        <form class="form-inline " >
            <div class="form-group">
                <label for="exampleInputName2">姓名</label>
                <input type="text" class="form-control" id="exampleInputName2">
                <label >回复状态</label>
                <input type="text" list="mydata" placeholder="请选择" />
                <datalist id="mydata">
                    <option value="已回复">已回复</option>
                    <option value="待回复">待回复</option>
                </datalist>
                <button type="submit" class="btn btn-success">查询</button>
            </div>
        </form>


        <hr>
        <div class="widget-content nopadding">
            <table class="table table-bordered table-striped with-check">
                <thead>
                <tr>
                    <td><input type="checkbox"></td>
                    <th>序号</th>
                    <th>老人</th>
                    <th>标题</th>
                    <th>病情描述</th>
                    <th>咨询时间</th>
                    <th>状态</th>
                    <th>操作 </th>
                </tr>
                <c:forEach items="${tbReplies}" var="reply">
                    <td></td>
                    <td>${reply.id}</td>
                    <td>${reply.name}</td>
                    <td>${reply.title}</td>
                    <td>${reply.describe}</td>
                    <td>${reply.seekDate}</td>
                    <td>${reply.status}</td>
                    <td>${reply.operation}</td>
                </c:forEach>
                </thead>
                <tbody>
            </table>
            <nav aria-label="...">
                <ul class="pager">
                    <li><a href="#">上一页</a></li>
                    <li><a href="#">下一页</a></li>
                </ul>
            </nav>

        </div>
    </div>
</div>
</div>
</div>
</div>
</div>
</div>




<!--Footer-part-->

<!--end-Footer-part-->
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/matrix.js"></script>
<script src="js/matrix.tables.js"></script>
</body>
</html>
