<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
</head>
<body>
	<div class="hero-wrap js-fullheight"
		style="background-image: url('../images/dog_3.jpg');">
		<div class="overlay"></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
				data-scrollax-parent="true">
				<div class="col-md-9 ftco-animate text-center"
					data-scrollax=" properties: { translateY: '70%' }">
					<p class="breadcrumbs"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">
						<span class="mr-2"><a href="#">Home</a></span> <span>Board</span>
					</p>
					<h1 class="mb-3 bread"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">소통하기</h1>
					<div style="position: relative; left: 0px; top: 250px;">
						<button
							style='opacity: 0.7; font-size: 24px; width: 300pt; height: 60pt;'>
							<i class='far fa-calendar-alt'></i> 일정세우기
						</button>
						&nbsp;&nbsp;&nbsp;
						<button onclick="location.href='../dog/parkmain.do#yong'"
							style='opacity: 0.7; font-size: 24px; width: 300pt; height: 60pt;'>
							<i class='fas fa-dog'></i> 반려견산책코스
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<a name="yong"></a>
	<section class="ftco-section ftco-degree-bg">
	<div class="container">
		<td class="text-center">

			<div class="nav ftco-animate nav-pills" id="v-pills-tab"
				role="tablist" aria-orientation="vertical">
				<a href="list.do#yong" class="nav-link active" aria-selected="true">같이가요</a>
				<a href="../pet/list.do" class="nav-link" aria-selected="false">자랑해요</a>
				<a href="anonymous.do#yong" class="nav-link" aria-selected="false">익명게시판</a>
			</div>
		</td>
		<div style="height: 30px"></div>

		<table class="table">
			<tr>
				<td class="text-right"></td>
			</tr>
		</table>



		<div class="row">
			<div class="col-md-8 ftco-animate">
				<h2 class="mb-3">글쓰기</h2>
				<form method="post" action="insert_ok.do" class="p-5 bg-light">
					<div class="form-group">
						<label for="name">닉네임 *</label> <input type="text"
							class="form-control" name=id>
					</div>
					<div class="form-group">
						<label for="email">비밀번호 *</label> <input type="password"
							class="form-control" name=pwd>
					</div>
					<div class="form-group">
						<label for="website">제목 *</label> 
						<input type="text"
							class="form-control" name=subject>
					</div>
					<div class="form-group">
						<label for="message">내용 *</label>
						<textarea name=content cols="30" rows="10" class="form-control"></textarea>
					</div>
					<div class="danger text-right">
						<label for="upload">사진 첨부</label>
						<div>
							<input type=file name=upload size=20
								class="input-sm" title="사진 파일만 업로드 가능합니다.">
						</div>
					</div>
					<div>
						<!-- <tr>
							<th class="danger text-right" width=30%>사진 첨부</th>
							<td width=70%><input type=file name=upload size=20
								class="input-sm" title="사진 파일만 업로드 가능합니다."></td>
						</tr> -->

					</div>
					<div class="form-group">
						<input type=submit value="댓글달기" class="btn py-3 px-4 btn-primary">
						<input type=button value="취소" class="btn py-3 px-4 btn-primary"
							onclick="location.href='../pet/list.do'">
					</div>
				</form>
			</div>
			<!-- 사이드바 .col-md-8 -->
			<div class="col-md-4 sidebar ftco-animate">
				<div class="sidebar-box">
					<form action="#" class="search-form">
						<div class="form-group">
							<span class="icon fa fa-search"></span> <input type="text"
								class="form-control" placeholder="검색어를 입력하세요.">
						</div>
					</form>
				</div>
				<div class="sidebar-box ftco-animate">
					<div class="categories">
						<h3>카테고리</h3>
						<li><a href="#">같이가요 <span>(12)</span></a></li>
						<li><a href="../pet/list.do">자랑해요 <span>(22)</span></a></li>
						<li><a href="#">익명게시판 <span>(37)</span></a></li>
					</div>
				</div>
				<div class="sidebar-box ftco-animate">
					<h3>최근 본 산책코스</h3>
					<div class="block-21 mb-4 d-flex">
						<a class="blog-img mr-4"><img
							src="http://parks.seoul.go.kr/file/info/view.do?fIdx=1884"
							width="100px" ; hieght="100px";></a>
						<div class="text">
							<h3 class="heading">
								<a href="#">남산도시자연공원</a>
							</h3>
							<div class="meta">
								<div>
									<a href="#"><span class="icon-calendar"></span> 17:12</a>
								</div>
								<div>
									<a href="#"><span class="icon-chat"></span> 3</a>
								</div>
							</div>
						</div>
					</div>
					<div class="block-21 mb-4 d-flex">
						<a class="blog-img mr-4"><img
							src="http://parks.seoul.go.kr/file/info/view.do?fIdx=1888"
							width="100px" ; hieght="100px";></a>
						<div class="text">
							<h3 class="heading">
								<a href="#">월드컵공원</a>
							</h3>
							<div class="meta">
								<div>
									<a href="#"><span class="icon-calendar"></span> 17:15</a>
								</div>
								<div>
									<a href="#"><span class="icon-chat"></span> 2</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	</section>
	<!-- .section -->
</body>
</html>
