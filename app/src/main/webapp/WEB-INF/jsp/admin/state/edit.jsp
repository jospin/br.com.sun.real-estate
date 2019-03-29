<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>Edit States</title>
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
            <h1 class="h1">Edit State</h1>
            <form method="post" action="/admin/state/edit">
                <input type="hidden" name="id" value="${state.id}"/>
                <div class="form-group">
                    <label for="ControlName">Name</label>
                    <input name="name" value="${state.name}" type="text" class="form-control" id="ControlName" />
                </div>
                <div class="form-group">
                    <label for="ControlUF">UF</label>
                    <input name="uf" value="${state.uf}" type="text" maxlength="2" class="form-control" id="ControlUF" />
                </div>
                <div class="form-check">
                    <c:if test="${state.active = true }">
                        <c:set var="checked" value="checked" />
                    </c:if>
                    <c:if test="${state.active = false }">
                        <c:set var="checked" value="" />
                    </c:if>
                    <input name="active" ${checked} class="form-check-input" type="checkbox" id="inlineCheckbox1" value="1" />
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