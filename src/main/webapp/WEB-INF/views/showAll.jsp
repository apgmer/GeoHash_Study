<%--
  Created by IntelliJ IDEA.
  User: guoxiaotian
  Date: 2016/10/21
  Time: 下午2:32
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
        top: 50px;
        left: 0;
        right: 0;
        bottom: 0;
        width: 100%;
        height: 100%;
    }
</style>
<div class="input">
    <form action="/show">
        <label>等级</label>
        <select name="l" id="l">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
        </select>
        <input type="button" onclick="sub()" value="提交">
    </form>
    <button onclick="removePoints()">移除</button>
</div>
<div id="container"></div>
</body>
<script src="/resource/jquery/jquery.min.js"></script>
<script src="/resource/showAll.js"></script>
</html>