<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"></meta>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="/css/mystyle.css" rel="stylesheet"/>
    <title>
        注册
    </title>
</head>
<body>
<div class="container">
    <div class="col-md-6 col-md-offset-3" id="form-container">
        <h1 class="text-center">
            用 户 注 册
        </h1>
        <form action="/User/Register" class="form-inline" method="post" onsubmit="return checkRegister()" role="form">
            <div class="form-group" style="padding-bottom: 8px;">
                <label class="col-md-6 text-right" for="userName">
                    账  号 :
                </label>
                <div class="col-md-6">
                    <input class="form-control" id="username" name="userName" onblur="checkuserName" required="true" type="text"/>
                    <p id="telephoneError" style="margin-bottom: -2px;color: red;">
                    </p>
                </div>
            </div>
            <div class="form-group" style="padding-bottom: 8px;">
                <label class="col-md-6 text-right" for="password">
                    密  码 :
                </label>
                <div class="col-md-6 ">
                    <input class="form-control" id="password" name="passWord" onblur="checkPassword()" required="true" type="password"/>
                    <p id="passwordError" style="margin-bottom: -2px;color: red;">
                    </p>
                </div>
            </div>
            <div class="form-group" style="padding-bottom: 8px;">
                <label class="col-md-6 text-right" for="phone">
                    手 机  :
                </label>
                <div class="col-md-6">
                    <input class="form-control" id="phone" name="phone" onblur="checkPhone()" required="true" type="password"/>
                    <p id="rePasswordError" style="margin-bottom: -2px;color: red;">
                    </p>
                </div>
            </div>

            <div class="form-group" style="padding-bottom: 8px;">
                <label class="col-md-6 text-right" for="email">
                    邮 箱  :
                </label>
                <div class="col-md-6">
                    <input class="form-control" id="email" name="email" onblur="checkEmail()" required="true" type="text"/>
                    <p id="emailError" style="margin-bottom: -2px;color: red;">
                    </p>
                </div>
            </div>

            <div class="col-lg-6" style="margin-bottom: 8px">
                <input class="btn btn-primary btn-block" type="submit" value="注册" />

            </div>
            <div class="col-lg-6" style="margin-bottom: 18px">
                <a class="btn btn-primary btn-block" href="http://localhost:8088/">
                    已有账号
                </a>
            </div>

        </form>
    </div>
</div>
</body>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="/js/commin.js" ></script>
</html>