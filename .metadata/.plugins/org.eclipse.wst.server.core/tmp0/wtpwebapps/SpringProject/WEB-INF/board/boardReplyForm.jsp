<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>답글쓰기</title>
</head>

<style>
   .alertMsg{
      background-color : yellow;
      color : red;
      font-size : 10px;
      width : 150px;
   }
   
</style>
<body>
<h3>답글쓰기</h3>
<form name="boardReplyForm" >
<input type = "hidden" name = "pseq" id = "pseq" value = "${requestScope.pseq}"> <!-- 원글번호가 pseq로 이름이 바뀌어서 보내졌다. -->
<input type = "hidden" name = "pg" id = "pg" value = "${pg}">
	<table border="1" cellspacing="0" cellpadding="5">
         <tr>
            <td width="70" align="center">제목</td>
            <td>
            	<input type="text" name = "subject" id = "subject" placeholder="제목을 입력하세요 ">
            	<div class="alertMsg" id = "subjectDiv"></div>    
            </td>        
         </tr>

         <tr>
            <td align="center">내용</td>
            <td>
            	<textarea name="content" id="content" rows="15" cols="50" placeholder="내용을 입력하세요 "></textarea>
            	<div class="alertMsg" id="contentDiv"></div>
            </td>
         </tr>
         
         <tr>
            <td colspan="2" align="center"> 
               	<input type="button" value="답글쓰기" onclick="checkBoardReply()" id = "boardReplyBtn">
               	<input type="reset" value="다시작성">
				<input type="button" value="목록" onclick="location.href='/SpringProject/board/boardList?pg=1'">
            </td>
         </tr>
         
      </table>
   </form>
   
   
 <script type="text/javascript"  src = "http://code.jQuery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#boardReplyBtn').click(function(){
		 $('#subjectDiv').empty(); // Div 영역을 클릭하면 비워라  >> 비우지않으면 경고문이 떠있으니까 empty를 꼭 써주기 / 다음번에 글씨가 들어갔을 때 아무이상 없음.
		 $('#contentDiv').empty();
		 if($('#subject').val() == ''){
		      $('#subjectDiv').html('제목을 입력하세요'); 
		 }else if($('#content').val() == ''){
		      $('#contentDiv').html('내용을 입력하세요');
		 }else {
			 $.ajax({
				 type :'post',
				 url : '/SpringProject/board/boardReply',
				 data : {
					 'pseq' : $('#pseq').val(), // 원글번호
					 'subject' : $('#subject').val(),
					 'content' : $('#content').val()
					 },
					 success : function() { 
			   			  alert('답글을 등록하였습니다.');
			   			  location.href = '/SpringProject/board/boardList?pg=${pg}';
			   		  },
			   		 error: function(e){
				         console.log(e);
				 } 
			 });
		 }
	});
});
</script>
   
   
   
   
   
   
   
   
   
   
  <!--  <script>
      function checkBoardReply(){
         const subjectEle = document.getElementById('subject');
         const contentEle = document.getElementById('content');
         const subjectDiv = document.getElementById('subjectDiv');
         const contentDiv = document.getElementById('contentDiv');

         subjectDiv.innerText = "";
         contentDiv.innerText = "";
         
         if(subjectEle.value === ""){
            subjectDiv.innerText="제목을 입력해야합니다.";
         }else{
            if(contentEle.value === ""){
               contentDiv.innerText="내용을 입력해야합니다.";
            }else{
                 document.boardReplyForm.submit();     
            }        
         }
      }
   </script> -->
   
   
   

</body>
</html>