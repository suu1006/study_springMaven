/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-30 02:08:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.imageboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imageboardWriteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".input {\r\n");
      out.write("	width:352px;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("#img {\r\n");
      out.write("	visibility : hidden;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 1. 단순 submit \r\n");
      out.write("<form id=\"imageboardWriteForm\" method=\"post\" enctype=\"multipart/form-data\" \r\n");
      out.write("action=\"/SpringProject/imageboard/imageboardWrite\"> -->\r\n");
      out.write("<!-- 2. 비동기 통신 Ajax 통신 -->\r\n");
      out.write("<form id=\"imageboardWriteForm\">\r\n");
      out.write("<table border=\"1\" style=\"border-collapse; width:500px;\" cellpadding=\"5\">\r\n");
      out.write("	<tr>\r\n");
      out.write("				<th style=\"width:25%;\">상품코드</th>\r\n");
      out.write("				<td ><input type=\"text\" name=\"imageId\" id=\"imageId\" class=\"input\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>상품명</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"imageName\" id=\"imageName\" class=\"input\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>단가</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"imagePrice\" id=\"imagePrice\" class=\"input\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>개수</th>\r\n");
      out.write("				<td><input type=\"text\" name=\"imageQty\" id=\"imageQty\" class=\"input\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>내용</th>\r\n");
      out.write("				<td><textarea cols=\"50\" rows=\"15\" name=\"imageContent\" id=\"imageContent\"></textarea></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=\"2\">\r\n");
      out.write("				<img id=\"showImg\" style=\"border:1px red solid; width:100px; height:100px;\">\r\n");
      out.write("				<img src = \"../image/camera.svg\" id =\"camera\">\r\n");
      out.write("				<input type=\"file\" name=\"img\" id=\"img\"> <!-- name명을 img로 바꿔서 dto로 넘어가지 못하게막는다. (dto에는 image라고 잡혀있어서 이름이 달라 dto로 넘어가지 않음.) -->\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"2\" style=\"text-align: center;\">\r\n");
      out.write("					<input type=\"button\" name=\"imageBtn\" id=\"uploadBtn\" value=\"이미지등록\">\r\n");
      out.write("					<input type=\"reset\" name=\"resetBtn\" id=\"resetBtn\" value=\"다시작성\">\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("<script type=\"text/javascript\"  src=\"http://code.jQuery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("	$('#camera').click(function(){\r\n");
      out.write("		$('#img').trigger('click');\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	$('#img').on('change', function(){ // 45번줄에 onchange = 이렇게 작성해도 된다\r\n");
      out.write("		readURL(this);\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	function readURL(input) {\r\n");
      out.write("		if (input.files[0]){ // 파일이 여러개일수도 있기때문에\r\n");
      out.write("			var reader = new FileReader();  // 자바스크립트 \r\n");
      out.write("			reader.onload = function(event){ // 읽기 동작이 끝났으면 \r\n");
      out.write("				$('#showImg').attr('src', event.target.result); // result 속성에 저장해서  //  e.target >> 이벤트가 발생한 요소를 반환해준다.\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			reader.readAsDataURL(input.files[0]); // 화면에 뿌려라\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	$('#uploadBtn').click(function(){\r\n");
      out.write("		// 1. 단순 submit\r\n");
      out.write("		//$('imageboardWriteForm').submit();\r\n");
      out.write("		\r\n");
      out.write("		//2. Ajax통신\r\n");
      out.write("		var formData = new FormData($('#imageboardWriteForm')[0]);\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type : 'post',\r\n");
      out.write("			url : '/SpringProject/imageboard/imageboardWrite',\r\n");
      out.write("			enctype: 'multipart/form-data', \r\n");
      out.write("			processData: false, //변수=값&변수=값 이렇게 넘기지말고 폼 안에 있는 데이터 그대로 넘겨라!\r\n");
      out.write("			contentType : false, // content 타입 그대로 넘겨라!\r\n");
      out.write("			data : formData,\r\n");
      out.write("			success :  function() {\r\n");
      out.write("				\r\n");
      out.write("				alert('상품 등록 완료');\r\n");
      out.write("				location.href='/SpringProject/imageboard/imageboardList';\r\n");
      out.write("			},\r\n");
      out.write("			error: function(err) {\r\n");
      out.write("				console.log(err);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("</script>	\r\n");
      out.write("</body>	\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("FileReader \r\n");
      out.write("<!-- \r\n");
      out.write("FileReader?\r\n");
      out.write("FileReader는 type이 file인 input 태그 또는 API 요청과 같은 인터페이스를 통해 File 또는 Blob 객체를 편리하게 처리할 수 있는 방법을 제공하는 객체이다.\r\n");
      out.write("abort, load, error와 같은 이벤트에서 발생한 프로세스를 처리하는데 주로 사용되며, File 또는 Blob 객체를 읽어서 result 속성에 저장한다.\r\n");
      out.write("\r\n");
      out.write("FileReader도 비동기로 동작한다.\r\n");
      out.write(">> 비동기로 동작한다. >> 동기로 읽어들인다면? 다 읽어들일때까지 모두 꼼짝마,, 이미지가 올동안 아무것도 움직이지 못하니까 비동기로 처리해야한다! --가장 중요함!\r\n");
      out.write("\r\n");
      out.write("FileReader.onload()\r\n");
      out.write("load 이벤트의 핸들러. 이 이벤트는 읽기 동작이 성공적으로 완료되었을 때마다 발생한다.\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" -->");
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
