<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.net.InetAddress"%>
<html>
<head><title>Simple Webapp</title></head>
<body>
<h1>>Simple Webapp</h1>
<p>
Running version on host <%= InetAddress.getLocalHost().getHostAddress() %>
</p>
</body>
</html>
