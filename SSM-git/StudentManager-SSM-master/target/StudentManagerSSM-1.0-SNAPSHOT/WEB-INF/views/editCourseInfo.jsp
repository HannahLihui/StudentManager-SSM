<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet">

    <title>课程管理页面 - 编辑页面</title>
</head>
<body>
<div class="editDIV">

    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">编辑课程</h3>
        </div>
        <div class="panel-body">

            <form method="post" id="editForm" action="/updateCourseInfo" role="form">
                <table class="editTable">
                    <tr>
                        <td>课程号：</td>
                        <td><input type="text" name="cno" id="cno" value="${courseinfo.cno}"
                                   placeholder="请在这里输入课程号"></td>
                    </tr>
                    <tr>
                        <td>课程名：</td>
                        <td><input type="text" name="cname" id="cname" value="${courseinfo.cname}" placeholder="请在这里输入课程名">
                        </td>
                    </tr>
                    <tr>
                        <td>学分：</td>
                        <td><input type="text" name="cedit" id="cedit" value="${courseinfo.age}" placeholder="请在这里输入学分"></td>
                    </tr>
                     <tr>
                        <td>开设院系：</td>
                        <td><input type="text" name="dept" id="dept" value="${courseinfo.dept}" placeholder="请在这里输入开设院系"></td>
                    </tr>
                      <tr>
                        
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${studentinfo.id}">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>

                    </tr>

                </table>
            </form>
        </div>
    </div>

</div>

</body>
 <script>
        $(function () {
            $("#editForm").submit(function () {
            
                if (!checkEmpty("cno", "课程号"))
                    return false;
                if (!checkEmpty("cname", "课程名"))
                    return false;
                if (!checkEmpty("cedit", "学分"))
                    return false;
                if (!checkEmpty("dept", "开设院系"))
                    return false;
                return true;
            });
        });
        function checkEmpty(id, name) {
            var value = $("#" + id).val();
            if (value.length == 0) {
                alert(name + "不能为空");
                $("#" + id).focus();
                return false;
            }
            return true;
        }
    </script>
</html>