<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/w3.css">
<style>
* {
	box-sizing: border-box;
}

.bz-wodth-20 {
	width: 20%
}

.bz-width-50 {
	width: 50%;
}

.bz-review {
	display: flex;
	flex-flow: wrap;
}

.w3-card-4 {
	margin: 5px;
}

search {
	background-color: green;
	width: 100%;
}


nav{
	background-color: green;
	color: black;
}
	ul.menu{
	list-style: none;
	display: flex;
}
	ul.menu a{
		display: block;
            color: inherit;
            text-decoration: none;
            padding: 14px 16px;
}


table {
	border: 1px solid #777777;
	width: 50%;
	border-collapse: collapse;
}

th {
	text-align: center;
}

th, td {
	padding: 20px;
}
table tr.tr_rows:nth-child(even) {
background-color: #888888;
color: white;
	
}
table tr.tr_rows:nth-child(odd){
background-color:  #444444;
color: white;
}
table tr.tr_rows:hover{
	background-color: white;
	color: black;
	cursor: pointer;
}
</style>
</head>
<body>
	<!-- 로고 검색 -->
	<header>
		<form>
			<div>
			<a href="#">
				<img
					src="${pageContext.request.contextPath}/resources/image/vigunLifeLogo.png"
					width="200px">
					</a>
				<div class="search">
					<input type="text" name="m_text" id="m_texr">
					<button>
						<img
							src="${pageContext.request.contextPath}/resources/image/vigunLifeft.png"
							class="img1" width="20px"></img>

					</button>
				</div>
			</div>
		</form>
	</header>
	<!-- 유저 인터페이스 -->
	<nav>
	<ul class="menu">
		<li><a href="#">공지상황</a></li>
		<li><a href="#">맛집리뷰</a></li>
		<li><a href="#">커뮤니티</a></li>
		<li><a href="#">FQL</a></li>
	</ul>
	</nav>
	<!-- 로그인 -->
	<section>
	<form>
		<fieldset class="fi_login">
			<div class="login">
				<label for="m_userid">회원아이디</label> 
				<input type="text" name="m_userid" id="m_userid">
			</div>
			<div class="login">
				<label for="m_password">비밀번호</label> <input type="password"
					name="password" id="password">
			</div>
			<div class="login">
				<a href="#">회원가입</a> <a href="#">아이디/비밀번호</a>
			</div>
			<div class="btn-box">
				<button>로그인</button>
			</div>
		</fieldset>
	</form>
	
	<!-- 리뷰 이미지 게시판 -->
		<div class="bz-review">
			<div class="w3-card-4 bz-wodth-20">
				<a href="#"> <img
					src="${pageContext.request.contextPath}/resources/image/food1.png"
					width="100%">
				</a>
				<footer class="w3-container w3-center">
				<a href="#">
					<p>설명</p>
					</a>
				</footer>
			</div>
			<div class="w3-card-4 bz-wodth-20">

				
				<a href="#"><img
					src="${pageContext.request.contextPath}/resources/image/food2.png"
					width="100%"> </a>
				<footer class="w3-container w3-center">
			<a href="#">	
					<p>설명</p>
					</a>
				</footer>
			</div>

			<div class="w3-card-4 bz-wodth-20">
				<a href="#"><img
					src="${pageContext.request.contextPath}/resources/image/food3.png"
					width="100%"> </a>

				<footer class="w3-container w3-center">
					<a href="#">
						<p>설명</p>
					</a>
				</footer>
			</div>
		</div>
		
		<!-- 이달의 추천 식당 -->
		<div class="">
			<p>이달의 추천 식당</p>
		</div>
		<div class="">
			<a href="#"><img
				src="${pageContext.request.contextPath}/resources/image/vigunba.png"
				height="100px"></a>
		</div>
	</section>
	<!-- 메인 게시판 -->
	<div>
		<h3>
			<a href="#">자유게시판</a>
		</h3>
	</div>
	
	<table border="1">
		<tr>
			<th>no</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>날짜</th>
		</tr>
		<tr class="tr_rows">
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr class="tr_rows">
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr class="tr_rows">
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr class="tr_rows">
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		
	</table>
	<%@include file="/WEB-INF/views/include/include-footer.jspf" %>
</body>

</html>