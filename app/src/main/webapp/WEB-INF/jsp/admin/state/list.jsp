<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <%@include file="../includes/head.jsp" %>
    <title>List States</title>
</head>
<body>
<%@include file="../includes/header.jsp" %>
<div class="container shadow-sm p-3 mb-5 bg-white rounded">
    <div class="row">
        <div class="col-md-2">
            <%@include file="../includes/menu.jsp" %>
        </div>
        <div class="col-md-10">
            <h1 class="h1">List States</h1>
            <a href="new">
                <i class="fas fa-plus" title="New State"></i> New State
            </a>
            <c:if test="${not empty states}">
                <table class="table table-hover table-striped ">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Name</th>
                        <th scope="col">Active</th>
                        <th scope="col">Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${states}" var="state">
                        <tr>
                            <td>${state.id}</td>
                            <td>${state.name}</td>
                            <td>
                                <c:if test="${state.active == true}">
                                    <a class="inactive" rel="${state.id}">
                                        <i title="To inactive" style="color:green" class="fas fa-check" ></i>
                                    </a>
                                </c:if>
                                <c:if test="${state.active == false}">
                                    <a class="active" rel="${state.id}">
                                        <i title="To active" style="color:red" class="fas fa-times"></i>
                                    </a>
                                </c:if>
                            </td>
                            <td>
                                <a class="delete" rel="${state.id}">
                                    <i class="far fa-trash-alt"></i>
                                </a>
                                <a class="edit" rel="${state.id}">
                                    <i class="fas fa-edit"></i>
                                </a>

                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>
<%@include file="../includes/botton.jsp" %>
<script src="/js/admin/list-state.js" ></script>
</body>
</html>