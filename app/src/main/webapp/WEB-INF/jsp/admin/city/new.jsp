<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <title>Create City</title>
    <%@include file="../includes/head.jsp" %>
</head>
<body>
<%@include file="../includes/header.jsp" %>
<div class="container shadow-sm p-3 mb-5 bg-white rounded">
    <div class="row">
        <div class="col-md-2">
            <%@include file="../includes/menu.jsp" %>
        </div>
        <div class="col-md-10">
            <h1 class="h1">New City</h1>
            <form method="post" action="new">
                <input type="hidden" />
                <div class="form-group">
                    <label for="ControlName">Name</label>
                    <input name="name" type="text" class="form-control" id="ControlName" />
                </div>
                <div class="form-check">
                    <input name="active" class="form-check-input" type="checkbox" id="inlineCheckbox1" value="1" />
                    <label class="form-check-label" for="inlineCheckbox1">Active</label>
                </div>
                <button type="submit" class="btn btn-primary">Save</button>
            </form>
        </div>
    </div>
</div>
<%@include file="../includes/botton.jsp" %>
</body>
</html>