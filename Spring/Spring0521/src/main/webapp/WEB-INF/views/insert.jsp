<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>데이터 입력</title>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<body>
<h1>학생 데이터 입력</h1>
  <section class="wrap">
    <form class="" action="insert_action">
      <label for=""> 이름 :
        <input type="text" name="name" placeholder="이름">
      </label>
      <br>
      <label for=""> 중간고사 점수:
        <input type="number" name="midScore" placeholder="점수">
      </label>
       <label for=""> 기말고사 점수:
        <input type="number" name="finScore" placeholder="점수">
      </label>
      <br>
      <input type="submit" value="입력완료">
    </form>
  </section>

</body>

</html>