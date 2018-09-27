<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>云端管理系统</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
		
	<style type="text/css">
		@media(min-width:768px){
			#silder_sub{
				width:300px;
				margin-top: 51px;
				position: absolute;
				z-index: 1;
				height:820px;
			}
			.page_main{margin-left:305px;}
		}
	</style>	
  </head>
  <body>
	  <!-- 导航-->
    <nav class="navbar navbar-default navbar-static-top">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#silder_sub" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a href="index-main.html" target="if" class="navbar-brand"><span class="glyphicon glyphicon-th-large"></span>&nbsp;云端管理系统</a>
		</div>
		<ul class="nav navbar-nav navbar-right" style="margin-right: 25px;">
			<li>
				<a href="#"><span class="glyphicon glyphicon-user"></span>&nbsp;管理员</a>
				  
			</li>
		</ul>
		<!-- 侧边功能栏-->
<div class="navbar-default navbar-collapse" id="silder_sub">
		<ul class="nav">
				<li>
					<a href="#sub1" data-toggle="collapse">首页<span class="glyphicon glyphicon-home pull-right"></span>&nbsp;</a>
				    <ul id="sub1" class="nav collapse">
						<li><a href="user.html" target="if"><span class="glyphicon glyphicon-user"></span>&nbsp;用户信息</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub2" data-toggle="collapse">健康管理<span class="glyphicon glyphicon-book pull-right"></span>&nbsp;</a>
					<ul id="sub2" class="nav collapse">
						<li><a href="warnsetting.html" target="if"><span class="glyphicon glyphicon-cog"></span>&nbsp;预警设置</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-cog"></span>&nbsp;预警信息</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-cog"></span>&nbsp;地图定位</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub3" data-toggle="collapse">报表统计<span class="glyphicon glyphicon-eye-open pull-right"></span>&nbsp;</a>
					<ul id="sub3" class="nav collapse">
						<li><a href="old1.html" target="if"><span class="glyphicon glyphicon-eye-open"></span>&nbsp;老人统计报表</a></li>
						<li><a href="user1.html" target="if"><span class="glyphicon glyphicon-eye-open"></span>&nbsp;用户统计报表</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub4" data-toggle="collapse">信息发布<span class="glyphicon glyphicon-pencil pull-right"></span>&nbsp;</a>
					<ul id="sub4" class="nav collapse">
						<li><a href="#"><span class="glyphicon glyphicon-pencil"></span>&nbsp;信息发布</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub5" data-toggle="collapse">基础数据<span class="glyphicon glyphicon-th-list pull-right"></span>&nbsp;</a>
					<ul id="sub5" class="nav collapse">
						<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;老人管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;亲人管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;医生管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;服务中心管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;医院管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;服务点管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;服务项目管理</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub6" data-toggle="collapse">系统管理<span class="glyphicon glyphicon-list pull-right"></span>&nbsp;</a>
					<ul id="sub6" class="nav collapse">
						<li><a href="#"><span class="glyphicon glyphicon-user"></span>&nbsp;账号管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-pushpin"></span>&nbsp;医生建议</a></li>
					</ul>
				</li>
		</ul>
</div>
</nav>     
<div class="page_main" style="">
    <div class="embed-responsive embed-responsive-16by9">
        <iframe name="if" class="embed-responsive-item" src="index-main.html" width="100%" height="820px"></iframe>
    </div>
	
</div>

<script type="text/javascript">
				var menuClick = function(menuUrl) {

						$("#myManu").attr("src",menuUrl);
				};
</script>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
	
</html>