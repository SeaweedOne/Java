<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- html버젼 명시  -->
<!DOCTYPE html>
<html>
<!-- 헤드에는 문서에 참조할내용들  -->

<head>
  <meta charset='utf-8'>
  <!-- 호환성 챙겨주는부분  -->
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>Main</title>
  <!-- 화면에 표시할 때 뷰포트로 표시
    (디바이스 넓이에 맞춰서 하나의 픽셀(표시되는 형식)을 맞추겠다는 의미) -->
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <!-- css파일 연결
   html에는 구조만 css에는 모든 스타일들이 위치 -->
  <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/main.css'>
</head>
<!-- 바디에는 실제 표시할 내용들  -->

<body>
  <section class="wrap">
    <!-- a태그 클릭하면 ""안의 위치로 이동하게됨 -->
    <a href="list">목록 보기</a>
    <a href="insert">데이터 입력</a>
    <a href="create_table">테이블 생성</a>
  </section>
</body>

</html>
