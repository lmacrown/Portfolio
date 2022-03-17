<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Template</title>
    <!-- core:css -->
    <link rel="stylesheet" href="../../../assets/vendors/core/core.css">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <link rel="stylesheet" href="../../../assets/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
    <!-- end plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="../../../assets/fonts/feather-font/css/iconfont.css">
    <link rel="stylesheet" href="../../../assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="../../../assets/css/demo_1/style.css">
    <!-- End layout styles -->
    <link rel="shortcut icon" href="../../../assets/images/favicon.png"/>
</head>
<body class="sidebar-dark">
<div class="main-wrapper">

    <!-- partial:../../partials/_sidebar.html -->
    <jsp:include page="/WEB-INF/views/partials/admin_sidebar.jsp"/>
    <!-- partial -->

    <div class="page-wrapper">

        <!-- partial:../../partials/_navbar.html -->
        <jsp:include page="/WEB-INF/views/partials/admin_navbar.jsp"/>
        <!-- partial -->

        <div class="page-content">

            <nav class="page-breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Banners</a></li>
                </ol>
            </nav>

            <div class="row">
                <div class="col-md-12 grid-margin stretch-card">
                    <div class="card">
                        <div class="card-body">
                            <h6 class="card-title">Banner Table</h6>
                            <div class="table-responsive">
                                <table id="dataTableExample" class="table">
                                    <thead>
                                    <tr>
                                        <th>No</th>
                                        <th>이름</th>
                                        <th>내용</th>
                                        <th>클릭수</th>
                                        <th>등록 날짜</th>
                                        <th>이미지</th>
                                        <th>Edit</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:set var="bannerList" value="${bannerData}"/>
                                    <c:forEach var="i" begin = "1" end = "${bannerData.size()}">
                                        <tr>
                                            <td>${i}</td>
                                            <td>${bannerList[i-1].banTitle}</td>
                                            <td>${bannerList[i-1].banContent}</td>
                                            <td>${bannerList[i-1].banCount}</td>
                                            <td>${bannerList[i-1].banRegDate}</td>
                                                <%--<td><fmt:formatDate value="${bannerList[i-1].banRegDate}" pattern="yyyy-MM-dd" /></td>--%>
                                            <c:choose>
                                                <c:when test="${empty bannerList[i-1].banImg}">
                                                    <td>이미지 없음</td>
                                                </c:when>
                                                <c:otherwise>
                                                    <td><button class="btn btn-primary" onclick="window.open('${bannerList[i-1].banImg}')">이미지 보기</button></td>
                                                </c:otherwise>
                                            </c:choose>
                                            <td>
                                                <div class="btn-group" role="group" aria-label="Basic example">
                                                    <button class="btn btn-primary" onclick="location.href='/admin/banner/edit?banNo=${bannerList[i-1].banNo}'">수정</button>
                                                    <button class="btn btn-secondary" onclick="if(confirm('정말 삭제하시겠습니까?')){location.href='/admin/banner/delete?banNo=${bannerList[i-1].banNo}';} else {return false;}">삭제</button>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <!-- partial:../../partials/_footer.html -->
        <jsp:include page="/WEB-INF/views/partials/admin_footer.jsp"/>
        <!-- partial -->

    </div>
</div>

<!-- core:js -->
<script src="../../../assets/vendors/core/core.js"></script>
<!-- endinject -->
<!-- plugin js for this page -->
<script src="../../../assets/vendors/datatables.net/jquery.dataTables.js"></script>
<script src="../../../assets/vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
<!-- end plugin js for this page -->
<!-- inject:js -->
<script src="../../../assets/vendors/feather-icons/feather.min.js"></script>
<script src="../../../assets/js/template.js"></script>
<!-- endinject -->
<!-- custom js for this page -->
<script src="../../../assets/js/data-table.js"></script>
<!-- end custom js for this page -->
</body>
</html>