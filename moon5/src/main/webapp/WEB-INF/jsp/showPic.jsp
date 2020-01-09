<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!int i;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="referrer" content="no-referrer" />
<!--可以让img标签预加载网络图片，破除对方网站的防盗链-->
<link rel="stylesheet" type="text/css" href="/css/showPic.css">
<title>MOVIE</title>


<script language="JavaScript">
	function myrefresh() {
		window.location.reload();
	}
	setTimeout('myrefresh()', 3000); //指定3秒刷新一次
</script>
</head>

<body>
<h1>欢迎进入我的电影世界</h1>
	<%
		for (i = 0; i < 1; i++) {
	%>
	<img src="${mode.get(0) }">
	<p>片名：${mode.get(1)}</p>
	<p>导演：${mode.get(2)}</p>
	<p>主演：${mode.get(3)}</p>
	<p>评分：${mode.get(4)}</p>

	<%
		}
	%>

<footer>
	<div>
	<ul><li>关于我的开发</li></ul>
	</div>
	<div>
	<ul><li>法律问题</li></ul>
	</div>
	<div>
	<ul><li>外部链接</li></ul>
	</div>
	<div>
	<ul><li>帮助</li></ul>
	</div>


</footer>



</body>

</html>