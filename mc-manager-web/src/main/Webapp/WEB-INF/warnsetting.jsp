<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>预警设置</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body>
<table width="90%" border="1">
    <tbody>
    <tr>
        <td>id</td>
        <td>类目id </td>
        <td>老人姓名 </td>
        <td>预警项目</td>
        <td>单位 </td>
        <td>最大值</td>
        <td>最小值</td>
        <td>操作</td>
    </tr>
    </tbody>
    <c:forEach items="${warnList }" var="list">
        <tr>
            <td>${list.id }</td>
            <td>${list.warnsettingId }</td>
            <td>${list.name }</td>
            <td>${list.warnProject }</td>
            <td>${list.unit }</td>
            <td>${list.max }</td>
            <td>${list.min }</td>
            <td><a href="javascript:void(0)" onclick="deleteWarnsetting(${list.id})">删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>