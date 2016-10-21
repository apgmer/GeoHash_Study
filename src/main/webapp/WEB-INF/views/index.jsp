<%--
  Created by IntelliJ IDEA.
  User: guoxiaotian
  Date: 2016/10/21
  Time: 上午9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>LBS show</title>
    <script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=7cf8d8b9e0ad04877c3b5c71ac4e3a29"></script>
</head>
<body>
<style>
    #container {
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        width: 100%;
        height: 100%;
    }
    #panel {
        position: absolute;
        background-color: white;
        max-height: 90%;
        overflow-y: auto;
        top: 10px;
        right: 10px;
        width: 280px;
    }

</style>
<div id="container"></div>
<div id="panel"></div>
</body>
<script src="/resource/jquery/jquery.min.js"></script>
<script src="/resource/map.js"></script>
</html>