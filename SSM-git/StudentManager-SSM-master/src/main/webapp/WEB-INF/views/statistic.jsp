<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="js/echarts.js"></script>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

<title>Insert title here</title>
    <style>
body{

background-position: center center;

    
    /* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */
    background-attachment: fixed;  //此条属性必须设置否则可能无效/
    /* 让背景图基于容器大小伸缩 */
   background-size: cover;
   /* 设置背景颜色，背景图加载过程中会显示背景色 */
   background-color:	#E6E6FA;



}
</style>
</head>
<body onload="clickButton()">
<div id="main" style="width:600px;height:400px;"></div>
<input id="button" type="button" value="显示信息">
  <a href="/index.jsp">
    <button  class="btn btn-sucess">返回主页面</button>
   </a>
<script type="text/javascript">
function clickButton(){
	var button=document.getElementById('button');
	button.click();
}
var prod1;
var prod2;
var prod3;
var prod4;
$(function(){
    $("input:button").on("click",function(){
        
        $.ajax({
           type: "POST",
           url: "/getAll",
           dataType: "json",
           success: function(data){  
               /* $.each(data,function(){
                    prod1 = this.prod1;
                    prod2 = this.prod2;
                    prod3 = this.prod3;
                    prod4 = this.prod4;    
                   
               }); */
               var x1 = data[0].year;
               var x2 = data[1].year;
               var  x3 = data[2].year;
               var  x4 = data[3].year;
                var y1 = data[0].count;
                var y2 = data[1].count;
                var  y3 = data[2].count;
                var y4 = data[3].count;
               //基于准备好的dom，初始化echarts实例
                var myChart = echarts.init(document.getElementById('main'),'light');
                //指定图标的配置和数据
                var option = {
                        //设置全局调色板
                        //color: [‘#c23531‘,‘#2f4554‘, ‘#61a0a8‘, ‘#d48265‘, ‘#91c7ae‘,‘#749f83‘,  ‘#ca8622‘, ‘#bda29a‘,‘#6e7074‘, ‘#546570‘, ‘#c4ccd3‘],
                        title : {text:'历年学生变化人数情况'},
                        tooltip:{},
                        legend:{
                            data:['销量']
                        },
                        xAxis:{data:[x1,x2,x3,x4]},
                        yAxis:{},
                        series:[{name:'学生人数',type:'bar',
                            //此系列自己的调色板
                            //color: [‘#c23531‘,‘#2f4554‘, ‘#61a0a8‘, ‘#d48265‘, ‘#91c7ae‘,‘#749f83‘,  ‘#ca8622‘, ‘#bda29a‘,‘#6e7074‘, ‘#546570‘, ‘#c4ccd3‘],
                            data:[y1,y2,y3,y4]}]
                };
                //使用刚指定的配置项和数据显示图标
                myChart.setOption(option);
           }
        });
    });    
});
   
</script>
</body>
</html>