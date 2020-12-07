<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
</head>
<body>
    <div class="hero-wrap js-fullheight" style="background-image: url('../images/dog_3.jpg');">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center" data-scrollax-parent="true">
          <div class="col-md-9 ftco-animate text-center" data-scrollax=" properties: { translateY: '70%' }">
            <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }"><span class="mr-2"><a href="#">Home</a></span> <span>Board</span></p>
            <h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">소통하기</h1>
          <div style="position: relative; left: 0px; top: 250px;">
        <button style='opacity: 0.7; font-size:24px; width:300pt; height:60pt;'><i class='far fa-calendar-alt'></i> 일정세우기</button>&nbsp;&nbsp;&nbsp;
        <button onclick="location.href='../dog/parkmain.do#yong'" style='opacity: 0.7; font-size:24px; width:300pt; height:60pt;'><i class='fas fa-dog'></i> 반려견산책코스</button>
          </div>
          </div>
        </div>
      </div>
    </div>
	<a name="yong"></a>
    <section class="ftco-section ftco-degree-bg">
      <div class="container">
      
          <td class="text-center">
          <div class="nav ftco-animate nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
		              <a href="list.do#yong" class="nav-link" aria-selected="false">같이가요</a>
		              <a href="../pet/list.do" class="nav-link active" aria-selected="true">자랑해요</a>
		              <a href="anonymous.do#yong" class="nav-link" aria-selected="false">익명게시판</a>
		  </div>
          </td>
          <div style="height:30px"></div>
          
          <table class="table">
          <tr>
            <td class="text-right">
            </td>
          </tr>
          </table>
          
          
          <div class="tab-pane fade show active" id="v-pills-whatwedo" role="tabpanel" aria-labelledby="v-pills-whatwedo-tab">
		  	<div>
				
				<div class="row d-flex">
 		 <c:forEach var="vo" items="${list }">
          <div class="col-md-3 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a href="detail.do?no=${vo.no }#yong" class="block-20" style="background-image: url('../images/dog_2.jpg');">
              </a>
              <div class="text p-4 d-block">
              	<span class="tag">${vo.id }</span>
                <h3 class="heading mt-3"><a href="detail.do?no=${vo.no }">${vo.subject }</a></h3>
                <div class="meta mb-3">
                  <div><a href="#"><fmt:formatDate value="${vo.regdate }" pattern="yyyy-MM-dd hh:mm:ss"/></a></div>
                  <div><a href="#">&nbsp;<br></a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> hit</a></div>
                </div>
              </div>
            </div>
          </div>
		 </c:forEach>
		 
				<div class="col-md-3 d-flex ftco-animate">
             <div class="blog-entry align-self-stretch">
              <a href="#" class="block-20" style="background-image: url('../images/pet_5.jpg');">
              </a>
              <div class="text p-4 d-block">
              	<span class="tag">최예진</span>
                <h3 class="heading mt-3"><a href="#">울토토 기지개피는게 왜케이쁘누ㅋ</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">2020-11-28 16:23:35</a></div>
                  <div><a href="#">&nbsp;<br></a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 5</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-3 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a href="#" class="block-20" style="background-image: url('../images/pet_3.jpg');">
              </a>
              <div class="text p-4 d-block">
              	<span class="tag">지서현</span>
                <h3 class="heading mt-3"><a href="#">우리집 강이 입냄새나도 귀여워</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">2020-11-23 15:12:31</a></div>
                  <div><a href="#">&nbsp;<br></a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 1</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-3 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a href="#" class="block-20" style="background-image: url('../images/pet_2.jpg');">
              </a>
              <div class="text p-4 d-block">
              	<span class="tag">현보영</span>
                <h3 class="heading mt-3"><a href="#">점심시간 소확행 고먐미</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">2020-11-28 14:11:29</a></div>
                  <div><a href="#">&nbsp;<br></a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 7</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-3 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a href="#" class="block-20" style="background-image: url('../images/pet_4.jpg');">
              </a>
              <div class="text p-4 d-block">
              	<span class="tag">이주성</span>
                <h3 class="heading mt-3"><a href="#">우리집 길동이 띠껍지만 사랑스러워버리고?</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">2020-11-28 14:01:31</a></div>
                  <div><a href="#">&nbsp;<br></a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 23</a></div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-3 d-flex ftco-animate">
            <div class="blog-entry align-self-stretch">
              <a href="#" class="block-20" style="background-image: url('../images/pet_1.jpg');">
              </a>
              <div class="text p-4 d-block">
              	<span class="tag">서영빈</span>
                <h3 class="heading mt-3"><a href="#">우리집 덕구 JGTGR</a></h3>
                <div class="meta mb-3">
                  <div><a href="#">2020-11-28 13:51:34</a></div>
                  <div><a href="#">&nbsp;<br></a></div>
                  <div><a href="#" class="meta-chat"><span class="icon-chat"></span> 0</a></div>
                </div>
              </div>
            </div>
          </div>
          
          
			</div>
		  </div>
          <table class="table">
          <tr>
            <td class="text-right">
            <div style="height:30px"></div>
              <a href="../pet/insert.do" class="btn py-3 px-4 btn-primary">글쓰기</a>
            </td>
          </tr>
        </table>
          
        </div>
        <!-- 페이지 -->
			<div class="row mt-5">
		          <div class="col text-center">
		            <div class="block-27">
		              <ul>
		              	<c:if test="${curpage>BLOCK }">
		                <li><a href="../pet/list.do?page=${startPage-1 }">&lt;</a></li>
		                </c:if>
		                <c:forEach var="i" begin="${startPage }" end="${endPage }">
		                 <c:if test="${i==curpage }">
		                 	<li class="active"><span><a href="../pet/list.do?page=${i }">${i }</a></span></li>
		                 </c:if>
		                 <c:if test="${i!=curpage }">
		                 	<li><a href="../pet/list.do?page=${i }">${i }</a></li>
		                 </c:if>
		                </c:forEach>
						<c:if test="${endPage<totalpage }">
		                <li><a href="../pet/list.do?page=${endPage+1 }">&gt;</a></li>
		                </c:if>
		              </ul>
		            </div>
		          </div>
		        </div>
      		</div>
        </div>
      </div>
    </section> <!-- .section -->
    
</body>
</html>