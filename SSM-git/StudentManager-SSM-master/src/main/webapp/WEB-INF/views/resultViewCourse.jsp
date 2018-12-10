<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
 <script src="js/jquery/2.0.0/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link href="menu/main_nav.css" rel="stylesheet">
<title>课程查询页面</title>
</head>
<body>

<div class="container">
  <div class="row">
    <div class="col-sm">
      <div class="panel-heading">
            <h3 class="panel-title">查询课程</h3>
        </div>
    </div>
    <div class="col-sm">
     <form role="role" method="post" action="selectByChooseCourse">
              <div class="form-group">
               <select id="select" name="select" class="form-control"  style="height:30px;width:20%; border: 1px solid #bbb;
              border-radius: 10px  color: #41515B;"  >
                  <option selected="selected">按课程号查询</option>
                  <option>按课程名查询</option>
                  <option>按开设学院查询</option>
               </select>    
               </br>
               </br>      
              <input type="text" style="height:30px;width:50%; border: 1px solid #bbb; color: #4A515B
               border-radius: 10px;"  id="content" name="content" class="form-control" placeholder="输入关键字">
  
                </br>
                 <button type="submit" class="btn btn-info">提 交</button>
              </div>
              </form>
    </div>
    
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm">
     <div class="listDIV">
         <div >
            <h3 class="panel-title">显示结果</h3>
        </div>
   </br>
</div>
    </div>
    <div class="col-sm">
   <table class="table table-striped table-bordered table-hover table-condensed">
        <thead>
        <tr class="success">
           <th>课程号</th>
            <th>课程名</th>
            <th>开设学院</th>
            <th>学分</th>
            
            
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${courseResult}" var="c" varStatus="status">
            <tr>
                <td>${c.cno}</td>
                <td>${c.cname}</td>
                <td>${c.dept}</td>
                <td>${c.cedit}</td>
              
                

              
            </tr>
        </c:forEach>

        </tbody>
    </table>
    </div>
   <div class="col-sm">
     
   </br>
   <a href="/index.jsp">
    <button  class="btn btn-sucess">返回主页面</button>
   </a>
  
</div>
  </div>

</div>


</body>
</html>