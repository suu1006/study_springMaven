/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-30 01:20:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SpringProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1652115225267L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name = \"boardViewForm\" >\r\n");
      out.write("<input type = \"hidden\" name = \"seq\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <!-- 입력상자 -->\r\n");
      out.write("<input type = \"hidden\" name = \"pg\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<table border = \"1\" width = \"450\" cellspacing = \"0\" cellpadding = \"5\" frame = \"hsides\" rules = \"rows\"> <!-- cellspaing : 셀 간격 cellpadding : 셀과 글자간격  -->\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan = \"3\"> <!-- 합칠 열의 개수 -->\r\n");
      out.write("		<h2><span id = \"subjectSpan\"></h2>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td width = \"150\" align = \"center\"> 글번호 : <span id = \"seqSpan\"></td> <!-- span태그 안잡으면 글번호 글씨가 안보임 -->\r\n");
      out.write("		<td width = \"150\" align = \"center\"> 작성자 :<span id = \"idSpan\"></td>\r\n");
      out.write("		<td width = \"150\" align = \"center\"> 조회수 : <span id = \"hitSpan\"></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("      <td colspan=\"3\" height=\"300\" valign=\"top\">\r\n");
      out.write("         <div style=\"width: 100%; height: 100%; overflow: auto;\">\r\n");
      out.write("             <pre style=\"white-space: pre-line; word-break; break-all;\" > <!-- pre태그 안에서는 개행의 효과를 낼 수 있음. / white space:pre-line : 공백을 여러개 넣어도 1개만 표시 / 자동줄바꿈 -->\r\n");
      out.write("            <!-- word-break : 텍스트 줄바꿈속성  break-all : 문자단위로 줄바꿈-->\r\n");
      out.write("            <span id = \"contentSpan\">\r\n");
      out.write("             </pre>\r\n");
      out.write("         </div>\r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("	\r\n");
      out.write("	</table>\r\n");
      out.write("	\r\n");
      out.write("	<input type = \"button\" value = \"목록\" \r\n");
      out.write("		style = \"margin : 5px;\" \r\n");
      out.write("		onclick = \"location.href = '/SpringProject/board/boardList?pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("		\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- 글삭제와 글수정은 본인의 글일때만 뜨게한다 다른사람이 로그인하면 할 수 없지! mode는 강사님이 그냥 이름지은거 / 기능을 나눌때 이렇게 mode형식으로 나눠서 사용할 수 있쮜!-->\r\n");
      out.write("	<span id = \"boardViewSpan\">\r\n");
      out.write("	<input type = \"button\" value = \"글수정\" onclick = \"mode(1)\"> \r\n");
      out.write("	<input type = \"button\" value = \"글삭제\" id = \"boardDeleteBtn\">\r\n");
      out.write("	</span>\r\n");
      out.write("	 ");
      out.write("\r\n");
      out.write("	<!-- 글을 삭제하면 seq 들고가고, 글삭제하면 무조건 1페이지로 온다. submit을 이용 -->\r\n");
      out.write("	<input type = \"button\" value = \"답글\" onclick = \"mode(3)\">  \r\n");
      out.write("	<onclick=\"window.location.reload()\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"  src=\"http://code.jQuery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	/* boardView 할때  */\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		type : 'post',\r\n");
      out.write("		url : '/SpringProject/board/getBoardView', /* 한 사람의 글을 가져와라 */\r\n");
      out.write("		data : 'seq=' + $('input[name=\"seq\"]').val(), /* seq가 name속성으로 잡혀있네 */\r\n");
      out.write("		dataType : 'json',\r\n");
      out.write("		success : function(data){\r\n");
      out.write("			/* alert(JSON.stringify(data)), */\r\n");
      out.write("			\r\n");
      out.write("			$('#subjectSpan').text(data.boardDTO.subject);\r\n");
      out.write("			$('#seqSpan').text(data.boardDTO.seq);\r\n");
      out.write("			$('#idSpan').text(data.boardDTO.id);\r\n");
      out.write("			$('#hitSpan').text(data.boardDTO.hit);\r\n");
      out.write("			$('#contentSpan').text(data.boardDTO.content);\r\n");
      out.write("			\r\n");
      out.write("			if (data.memId == data.boardDTO.id)\r\n");
      out.write("				$('#boardViewSpan').show(); /* 글수정, 글삭제 버튼을 아이디가 작성자의 아이디이면 보여주고 아니면 보여주지않는다. */\r\n");
      out.write("			else \r\n");
      out.write("				$('#boardViewSpan').hide();\r\n");
      out.write("		},\r\n");
      out.write("		error:function(e){ \r\n");
      out.write("			console.log(e);\r\n");
      out.write("		} \r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("//글삭제버튼\r\n");
      out.write("$('#boardDeleteBtn').click(function(){\r\n");
      out.write("			if (confirm(\"정말로 삭제하시겠습니까?\")) \r\n");
      out.write("		$.ajax({\r\n");
      out.write("				type: 'post',\r\n");
      out.write("				url :'/miniProject/board/boardDelete.do',\r\n");
      out.write("				data : 'seq=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("				success : function(){\r\n");
      out.write("				alert(\"선택한 글 삭제했습니다.\");\r\n");
      out.write("				location.href = 'boardList.do?pg=1';\r\n");
      out.write("			},\r\n");
      out.write("				error:function(e){ \r\n");
      out.write("				console.log(e);\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function mode(num) { // submit을 각자 돌리고 싶어할 때\r\n");
      out.write("	if (num ==1) { // 글수정 , seq, pg submit하면 form안에 있는 데이터 다가지고 감\r\n");
      out.write("		\r\n");
      out.write("		document.boardViewForm.method = \"post\";\r\n");
      out.write("		document.boardViewForm.action = \"/miniProject/board/boardUpdateForm.do\";\r\n");
      out.write("		document.boardViewForm.submit(); // form 영역안에 있는 입력 데이터를 들고 페이지를 이동하러감 >> 회원가입 데이터같은거에 쓰면 좋다! name속성에 있는 애들을 들고가고, id속성은 안들고감 무조건 name속성이 있어야함\r\n");
      out.write("		\r\n");
      out.write("	} else if (num == 2) { // 글삭제 - 나중에 프로젝트할때는 비밀번호 물어보고 삭제하자! / seq만 가져가면 됨\r\n");
      out.write("		\r\n");
      out.write("		if (confirm(\"정말로 삭제하시겠습니까?\")) {\r\n");
      out.write("			/* document.boardViewForm.method = \"post\";\r\n");
      out.write("			document.boardViewForm.action = \"/miniProject/board/boardDelete.do\";\r\n");
      out.write("			document.boardViewForm.submit(); */\r\n");
      out.write("		}\r\n");
      out.write("	} else if (num == 3) { // 답글\r\n");
      out.write("\r\n");
      out.write("		document.boardViewForm.method = \"post\";\r\n");
      out.write("		document.boardViewForm.action = \"/SpringProject/board/boardReplyForm\";\r\n");
      out.write("		document.boardViewForm.submit();\r\n");
      out.write("		\r\n");
      out.write("	} \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
