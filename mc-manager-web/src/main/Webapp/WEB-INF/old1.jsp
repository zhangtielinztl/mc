<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>老人统计</title>
		<link rel="stylesheet" href="css/bootstrap.min.css"/>
	</head>
    <body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6 col-xs-12" style="border: 1px #1B6D85 solid">
                <div  id="columnar1" style="width:100%;height:250px;"></div>
            </div>
            <div class="col-md-6 col-xs-12" style="border: 1px #1B6D85 solid">
                <div  id="columnar2" style="width:100%;height:250px;"></div>
            </div>
            <div class="col-md-6 col-xs-12" style="border: 1px #1B6D85 solid">
                <div  id="columnar3" style="width:100%;height:250px;"></div>
            </div>
        </div>
    </div>
    </body>
	<script type="text/javascript" src="js/echarts.min.js" ></script>
	<script type="text/javascript" src="js/columnarChart.js" ></script>
</html>