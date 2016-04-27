<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trang chủ</title>
<link rel="stylesheet" href="css/StyleLogin.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

</head>
<body>
	<!-- TEST -->
	<div class="transbox"
		style="padding-left: 8%; padding-right: 8%; padding-top: 1%; padding-bottom: 5%; color: white;">
		<div id="header" align="center">
			<h1>
				<b>✩ HỆ THỐNG HỎI ĐÁP ✩ </b>
			</h1>
			<img id="idLine" align="middle" alt="line" src="Images/line2.png"
				style="width: 100%;">
		</div>
		<div id="question" class="tofade animated fadeInUp">
			<form action="home" method="POST" onsubmit="return check()"
				align="center">
				<table align="center">
					<tr>
						<td width="1" bordercolor="red"><img alt="image"
							src="Images/earth.gif" width="80" height="80"></td>
						<td width="800" align="left" style="margin-left: 70px;">
							<div class="input-group">
								<input type="text" class="form-control input-lg" value=""
									name="stringQuestion" id="stringQuestion"
									placeholder="Nhập câu hỏi của bạn..."
									style="background-color: rgba(0, 0, 0, 0); color: white;"> <span
									class="input-group-btn">
									<button class="btn btn-success btn-lg" type="submit">
										<i class="fa fa-search fa-fw"></i> Tìm kiếm
									</button>
								</span>
							</div>
						</td>
					</tr>
					<tr>
						<td></td>
						<td align="left"" ><input type="checkbox" name="ckSuggestion"
							checked="checked" value="ok"><b> Tìm câu hỏi tương
								tự(khuyến khích)</b></td>
					</tr>

				</table>
			</form>


			<script type="text/javascript">
				function check() {
					var question = document.getElementById("stringQuestion").value;
					if (question == null || question == "") {
						alert("Please input your question!");
						return false;
					}
					return true;
				}
			</script>
		</div>
		<div id=answer >
		 <b id=result style="color: white;"> <%
 	String resultFromAPI = (String) request.getAttribute("myAnswer");
 	String resultFromSample = (String) request.getAttribute("myAnswerSample");
 	if (resultFromAPI == null) {
 		out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
 	}

 	if (resultFromAPI != null) {
 		out.println("<br><u>Câu hỏi của bạn:</u><h3>" + request.getParameter("stringQuestion") + "</h3>");
 		out.println("<u>Câu trả lời:</u><h3>" + resultFromAPI + "</h3>");
 	}
 %>
			</b> <img id="idLine" align="middle" alt="line" src="Images/line2.png"
				style="width: 100%;">
				 <b id=result style="color: white;"> <%
 	if (resultFromSample != null && resultFromSample != "") {
 		out.println("<h6></h6>");
 		out.println("<h3>CÂU HỎI TƯƠNG TỰ</h3>");
 		System.out.println("VALUE OF RESULT: " + resultFromSample);
 		out.println("<h3>" + resultFromSample + "</h3>");
 	}
 %>
			</b>
		</div>
		<p id="demo"></p>
		<div id=footer align="center">
			<b>TRƯỜNG ĐẠI HỌC CÔNG NGHỆ THÔNG TIN</b><br> <b>KHÓA LUẬN
				TỐT NGHIỆP KHMT2012</b><br> <b style="size: 20px">Sinh viên:
				HUỲNH QUANG KHIÊM - NGUYỄN TRẦN THÀNH LIỄU</b>
		</div>
	</div>
</body>
</html>