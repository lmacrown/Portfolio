<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,100italic,300italic,400italic,500italic,500,700,700italic,900,900italic'
          rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css"/>
    <!-- check here -->
    <%--    <link rel="stylesheet" href="../css/contents.css">--%>

    <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/gh/FortAwesome/FontAwesome@5.14.0/css/all.min.css"
    />

    <!-- check here -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <!-- check here --> <!-- check here --> <!-- check here --> <!-- check here -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- core:css -->
    <link rel="stylesheet" href="../../../assets/vendors/core/core.css">

    <link rel="stylesheet" href="../../../assets/fonts/feather-font/css/iconfont.css">
    <link rel="stylesheet" href="../../../assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="../../../assets/css/demo_5/style.css">
    <!-- End layout styles -->
    <link rel="shortcut icon" href="../../../assets/images/favicon.png" />
    <title>Template</title>
</head>
<body>
<div class="main-wrapper">

    <!-- partial:../../partials/_navbar.html -->
    <%--수평 메뉴얼--%>
    <div class="horizontal-menu">
        <nav class="navbar top-navbar">
            <div class="container">
                <div class="navbar-content">
                    <a href="#" class="navbar-brand">
                        HJH<span>UI</span>
                    </a>
                    <%--검색--%>
                    <form class="search-form">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i data-feather="search"></i>
                                </div>
                            </div>
                            <input type="text" class="form-control" id="navbarForm" placeholder="단어를 입력하세요">
                        </div>
                    </form>
                    <c:if test="${empty userLogin}">
                    </c:if>
                    <c:if test="${not empty userLogin}">
                        <%--상단 개인페이지--%>
                        <ul class="navbar-nav">
                                <%--메일 목록--%>
                            <li class="nav-item dropdown nav-messages">
                                <a class="nav-link dropdown-toggle" href="#" id="messageDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i data-feather="mail"></i>
                                </a>
                                <div class="dropdown-menu" aria-labelledby="messageDropdown">
                                    <div class="dropdown-header d-flex align-items-center justify-content-between">
                                        <p class="mb-0 font-weight-medium">9 New Messages</p>
                                        <a href="javascript:;" class="text-muted">Clear all</a>
                                    </div>
                                    <div class="dropdown-body">
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="figure">
                                                <img src="https://via.placeholder.com/30x30" alt="userr">
                                            </div>
                                            <div class="content">
                                                <div class="d-flex justify-content-between align-items-center">
                                                    <p>Leonardo Payne</p>
                                                    <p class="sub-text text-muted">2 min ago</p>
                                                </div>
                                                <p class="sub-text text-muted">Project status</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="figure">
                                                <img src="https://via.placeholder.com/30x30" alt="userr">
                                            </div>
                                            <div class="content">
                                                <div class="d-flex justify-content-between align-items-center">
                                                    <p>Carl Henson</p>
                                                    <p class="sub-text text-muted">30 min ago</p>
                                                </div>
                                                <p class="sub-text text-muted">Client meeting</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="figure">
                                                <img src="https://via.placeholder.com/30x30" alt="userr">
                                            </div>
                                            <div class="content">
                                                <div class="d-flex justify-content-between align-items-center">
                                                    <p>Jensen Combs</p>
                                                    <p class="sub-text text-muted">1 hrs ago</p>
                                                </div>
                                                <p class="sub-text text-muted">Project updates</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="figure">
                                                <img src="https://via.placeholder.com/30x30" alt="userr">
                                            </div>
                                            <div class="content">
                                                <div class="d-flex justify-content-between align-items-center">
                                                    <p>Amiah Burton</p>
                                                    <p class="sub-text text-muted">2 hrs ago</p>
                                                </div>
                                                <p class="sub-text text-muted">Project deadline</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="figure">
                                                <img src="https://via.placeholder.com/30x30" alt="userr">
                                            </div>
                                            <div class="content">
                                                <div class="d-flex justify-content-between align-items-center">
                                                    <p>Yaretzi Mayo</p>
                                                    <p class="sub-text text-muted">5 hr ago</p>
                                                </div>
                                                <p class="sub-text text-muted">New record</p>
                                            </div>
                                        </a>
                                    </div>
                                    <div class="dropdown-footer d-flex align-items-center justify-content-center">
                                        <a href="javascript:;">View all</a>
                                    </div>
                                </div>
                            </li>
                                <%--알림 모음--%>
                            <li class="nav-item dropdown nav-notifications">
                                <a class="nav-link dropdown-toggle" href="#" id="notificationDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i data-feather="bell"></i>
                                    <div class="indicator">
                                        <div class="circle"></div>
                                    </div>
                                </a>
                                <div class="dropdown-menu" aria-labelledby="notificationDropdown">
                                    <div class="dropdown-header d-flex align-items-center justify-content-between">
                                        <p class="mb-0 font-weight-medium">6 New Notifications</p>
                                        <a href="javascript:;" class="text-muted">Clear all</a>
                                    </div>
                                    <div class="dropdown-body">
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="icon">
                                                <i data-feather="user-plus"></i>
                                            </div>
                                            <div class="content">
                                                <p>New customer registered</p>
                                                <p class="sub-text text-muted">2 sec ago</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="icon">
                                                <i data-feather="gift"></i>
                                            </div>
                                            <div class="content">
                                                <p>New Order Recieved</p>
                                                <p class="sub-text text-muted">30 min ago</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="icon">
                                                <i data-feather="alert-circle"></i>
                                            </div>
                                            <div class="content">
                                                <p>Server Limit Reached!</p>
                                                <p class="sub-text text-muted">1 hrs ago</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="icon">
                                                <i data-feather="layers"></i>
                                            </div>
                                            <div class="content">
                                                <p>Apps are ready for update</p>
                                                <p class="sub-text text-muted">5 hrs ago</p>
                                            </div>
                                        </a>
                                        <a href="javascript:;" class="dropdown-item">
                                            <div class="icon">
                                                <i data-feather="download"></i>
                                            </div>
                                            <div class="content">
                                                <p>Download completed</p>
                                                <p class="sub-text text-muted">6 hrs ago</p>
                                            </div>
                                        </a>
                                    </div>
                                    <div class="dropdown-footer d-flex align-items-center justify-content-center">
                                        <a href="javascript:;">View all</a>
                                    </div>
                                </div>
                            </li>
                                <%--내 프로필--%>
                            <li class="nav-item dropdown nav-profile">
                                <a class="nav-link dropdown-toggle" href="#" id="profileDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img src="https://via.placeholder.com/30x30" alt="profile">
                                </a>
                                <div class="dropdown-menu" aria-labelledby="profileDropdown">
                                    <div class="dropdown-header d-flex flex-column align-items-center">
                                        <div class="figure mb-3">
                                            <img src="https://via.placeholder.com/80x80" alt="">
                                        </div>
                                        <div class="info text-center">
                                            <p class="name font-weight-bold mb-0">Amiah Burton</p>
                                            <p class="email text-muted mb-3">amiahburton@gmail.com</p>
                                        </div>
                                    </div>
                                    <div class="dropdown-body">
                                        <ul class="profile-nav p-0 pt-3">
                                            <li class="nav-item">
                                                <a href="../../pages/general/profile.html" class="nav-link">
                                                    <i data-feather="user"></i>
                                                    <span>Profile</span>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="javascript:;" class="nav-link">
                                                    <i data-feather="edit"></i>
                                                    <span>Edit Profile</span>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="javascript:;" class="nav-link">
                                                    <i data-feather="repeat"></i>
                                                    <span>Switch User</span>
                                                </a>
                                            </li>
                                            <li class="nav-item">
                                                <a href="javascript:;" class="nav-link">
                                                    <i data-feather="log-out"></i>
                                                    <span>Log Out</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </c:if>
                    <%--<button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="horizontal-menu-toggle">
                        <i data-feather="menu"></i>
                    </button>
                    --%>

                </div>
            </div>
        </nav>
        <%--카테고리 목록--%>
        <nav class="bottom-navbar">
            <div class="container">
                <ul class="nav page-navigation">
                    <li class="nav-item">
                        <a class="nav-link" href="../../dashboard-one.html">
                            <i class="link-icon" data-feather="box"></i>
                            <span class="menu-title">카테고리1</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            <i class="link-icon" data-feather="mail"></i>
                            <span class="menu-title">카테고리2</span>
                            <i class="link-arrow"></i>
                        </a>
                        <div class="submenu">
                            <ul class="submenu-item">
                                <li class="category-heading">A1</li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/email/inbox.html">a1</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/email/read.html">a2</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/email/compose.html">a3</a></li>
                                <li class="category-heading">B1<li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/apps/chat.html">b1</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/apps/calendar.html">b2</a></li>
                            </ul>
                        </div>
                    </li>
                    <%--<li class="nav-item mega-menu">
                        <a href="#" class="nav-link">
                            <i class="link-icon" data-feather="feather"></i>
                            <span class="menu-title">UI Kit</span>
                            <i class="link-arrow"></i>
                        </a>
                        <div class="submenu">
                            <div class="col-group-wrapper row">
                                <div class="col-group col-md-9">
                                    <div class="row">
                                        <div class="col-12">
                                            <p class="category-heading">Basic</p>
                                            <div class="submenu-item">
                                                <div class="row">
                                                    <div class="col-md-4">
                                                        <ul>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/alerts.html">Alerts</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/badges.html">Badges</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/breadcrumbs.html">Breadcrumbs</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/buttons.html">Buttons</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/button-group.html">Buttn Group</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/cards.html">Cards</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/carousel.html">Carousel</a></li>
                                                        </ul>
                                                    </div>
                                                    <div class="col-md-4">
                                                        <ul>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/collapse.html">Collapse</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/dropdowns.html">Dropdowns</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/list-group.html">List group</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/media-object.html">Media object</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/modal.html">Modal</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/navs.html">Navs</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/navbar.html">Navbar</a></li>
                                                        </ul>
                                                    </div>
                                                    <div class="col-md-4">
                                                        <ul>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/pagination.html">Pagination</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/popover.html">Popovers</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/progress.html">Progress</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/scrollbar.html">Scrollbar</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/scrollspy.html">Scrollspy</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/spinners.html">Spinners</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/ui-components/tooltips.html">Tooltips</a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-group col-md-3">
                                    <div class="row">
                                        <div class="col-12">
                                            <p class="category-heading">Advanced</p>
                                            <div class="submenu-item">
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <ul>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/advanced-ui/cropper.html">Cropper</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/advanced-ui/owl-carousel.html">Owl carousel</a></li>
                                                            <li class="nav-item"><a class="nav-link" href="../../pages/advanced-ui/sweet-alert.html">Sweetalert</a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            <i class="link-icon" data-feather="inbox"></i>
                            <span class="menu-title">Forms</span>
                            <i class="link-arrow"></i>
                        </a>
                        <div class="submenu">
                            <ul class="submenu-item">
                                <li class="nav-item"><a class="nav-link" href="../../pages/forms/basic-elements.html">Basic Elements</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/forms/advanced-elements.html">Advanced Elements</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/forms/editors.html">Editors</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/forms/wizard.html">Wizard</a></li>
                            </ul>
                        </div>
                    </li>--%>
                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            <i class="link-icon" data-feather="pie-chart"></i>
                            <span class="menu-title">Data</span>
                            <i class="link-arrow"></i>
                        </a>
                        <div class="submenu">
                            <div class="row">
                                <div class="col-md-6">
                                    <ul class="submenu-item pr-0">
                                        <li class="category-heading">Charts</li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/charts/apex.html">Apex</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/charts/chartjs.html">ChartJs</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/charts/flot.html">Float</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/charts/morrisjs.html">Morris</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/charts/peity.html">Peity</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/charts/sparkline.html">Sparkline</a></li>
                                    </ul>
                                </div>
                                <div class="col-md-6">
                                    <ul class="submenu-item pl-0">
                                        <li class="category-heading">Tables</li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/tables/basic-table.html">Basic Tables</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/tables/data-table.html">Data Table</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            <i class="link-icon" data-feather="smile"></i>
                            <span class="menu-title">Icons</span>
                            <i class="link-arrow"></i>
                        </a>
                        <div class="submenu">
                            <ul class="submenu-item">
                                <li class="nav-item"><a class="nav-link" href="../../pages/icons/feather-icons.html">Feather Icons</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/icons/flag-icons.html">Flag Icons</a></li>
                                <li class="nav-item"><a class="nav-link" href="../../pages/icons/mdi-icons.html">Mdi Icons</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="nav-item mega-menu">
                        <a href="#" class="nav-link">
                            <i class="link-icon" data-feather="book"></i>
                            <span class="menu-title">Sample Pages</span>
                            <i class="link-arrow"></i>
                        </a>
                        <div class="submenu">
                            <div class="col-group-wrapper row">
                                <div class="col-group col-md-6">
                                    <p class="category-heading">Special Pages</p>
                                    <div class="submenu-item">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <ul>
                                                    <li class="nav-item"><a class="nav-link" href="../../pages/general/blank-page.html">Blank page</a></li>
                                                    <li class="nav-item"><a class="nav-link" href="../../pages/general/faq.html">Faq</a></li>
                                                    <li class="nav-item"><a class="nav-link" href="../../pages/general/invoice.html">Invoice</a></li>
                                                </ul>
                                            </div>
                                            <div class="col-md-6">
                                                <ul>
                                                    <li class="nav-item"><a class="nav-link" href="../../pages/general/profile.html">Profile</a></li>
                                                    <li class="nav-item"><a class="nav-link" href="../../pages/general/pricing.html">Pricing</a></li>
                                                    <li class="nav-item"><a class="nav-link" href="../../pages/general/timeline.html">Timeline</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-group col-md-3">
                                    <p class="category-heading">Auth Pages</p>
                                    <ul class="submenu-item">
                                        <li class="nav-item"><a class="nav-link" href="../../pages/auth/login.html">Login</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../../pages/auth/register.html">Register</a></li>
                                    </ul>
                                </div>
                                <div class="col-group col-md-3">
                                    <p class="category-heading">Error Pages</p>
                                    <ul class="submenu-item">
                                        <li class="nav-item"><a class="nav-link" href="../../wabapp/resources/assets/images/404.html">404</a></li>
                                        <li class="nav-item"><a class="nav-link" href="../wabapp/resources/assets/images/404.html">500</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
    <!-- partial -->

    <div class="page-wrapper">
        <div class="page-content">
            <div class="wrap">
                <div class="row">
                    <div class="main-banner">
                        <div class="blue-banner"></div>
                        <div class="swiper-container">
                            <div class="swiper-wrapper">

                                <div class="swiper-slide">
                                    <div class="img-banner-wrapper">
                                        <a href="${bannerList[0].banImg}"
                                           onclick="banner_clicked(${bannerList[0].banNo})">
                                            <img src="${bannerList[0].banImg}" class="img-banner">
                                        </a>
                                    </div>
                                    <div class="wrapper-ment">
                                        <div class="banner-ment">
                                            <div class="ment-1">${bannerList[0].banTitle}</div>
                                            <div class="small-ment">${bannerList[0].banContent}</div>
                                        </div>
                                    </div>
                                    <div style="float:right";>
                                        <div class="card" style="width: 200px;margin-left: 200px;">
                                            <div class="row">
                                                <form class="forms-sample" style="float:right; padding: 30px";>

                                                    <c:if test="${empty userLogin}">
                                                    <div class="mt-3">
                                                        <a href="/login"  style="width:100px" class="btn btn-primary mr-2 mb-2 mb-md-0 text-white">Login</a>
                                                    </div>
                                                    <a href="/userregisterpage.do" style="width:300px" class="d-block mt-3 text-muted">Not a user? Sign up</a>
                                                    </c:if>
                                                    <c:if test="${not empty userLogin}">
                                                    <div class="mt-3">
                                                            <%--<div>${userLogin.userEmail}님 </div>--%>
                                                        <button style="font-weight: normal; width:80px; font-size:15px;" onclick="location.href='/myPage.do'">${userLogin.userNick}님</button>--%>
                                                        <button class="btn btn-primary mr-2 mb-2 mb-md-0 text-white" onclick="location.href='/logout'">로그아웃</button>
                                                    </div >
                                                    </c:if>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <%--<div class="swiper-slide">
                                    <div class="img-banner-wrapper">
                                        <a href="${bannerList[1].banImg}"
                                           onclick="banner_clicked(${bannerList[1].banNo})">
                                            <img src="${bannerList[1].banImg}" class="img-banner">
                                        </a>
                                    </div>
                                    <div class="wrapper-ment">
                                        <div class="banner-ment">
                                            <div class="ment-1">${bannerList[1].banTitle}</div>
                                            <div class="small-ment">${bannerList[1].banContent}</div>
                                        </div>
                                    </div>
                                    <div style="float:right";>
                                        <div class="card" style="width: 200px;margin-left: 200px;">
                                            <div class="row">
                                                <form class="forms-sample" style="float:right; padding: 30px";>

                                                    <c:if test="${empty userLogin}">
                                                    <div class="mt-3">
                                                        <a href="/login"  style="width:100px" class="btn btn-primary mr-2 mb-2 mb-md-0 text-white">Login</a>
                                                    </div>
                                                    <a href="/userregisterpage.do" style="width:300px" class="d-block mt-3 text-muted">Not a user? Sign up</a>
                                                    </c:if>
                                                    <c:if test="${not empty userLogin}">
                                                    <div class="mt-3">
                                                        <div>${userLogin.userEmail}님 </div>
                                                            &lt;%&ndash; <button style="font-weight: normal;" onclick="location.href='/myPage.do'">마이페이지</button>&ndash;%&gt;
                                                        <button class="btn btn-primary mr-2 mb-2 mb-md-0 text-white" onclick="location.href='/logout'">로그아웃</button>
                                                    </div >
                                                    </c:if>
                                            </div>
                                        </div>
                                    </div>
                                </div>--%>
                                <div class="swiper-slide">...</div>
                                <div class="swiper-slide">...</div>
                                <div class="swiper-slide">...</div>
                                <div class="swiper-slide">...</div>

                            </div>
                        </div>
                        <div class="swiper-button-next" style="margin-right: 250px;"> </div>
                        <div class="swiper-button-prev"></div>
                    </div>
                </div>
            </div>
            <div class="wrap">
                <div class="row">
                    <%--게시글 목록--%>
                    <div style="float:left">
                        <div class="form">
                            <div class="col-md-12 grid-margin stretch-card">
                                <div class="card">
                                    <div class="post-body">
                                        <h6 class="card-title">게시글 목록</h6>
                                        <div class="table-responsive">
                                            <table id="dataTableExample" class="table">
                                                <thead>
                                                <tr style="text-align: center">
                                                    <th>No</th>
                                                    <th style="width: 120px;" >제목</th>
                                                    <th style="width: 400px;" >내용</th>
                                                    <th style="width: 100px;" >작성일</th>
                                                    <th>조회</th>

                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:set var="postList" value="${postList}"/>
                                                <c:forEach var="i" begin = "1" end = "${postList.size()}">
                                                    <tr>
                                                        <td>${i}</td>

                                                        <td>${postList[i-1].postTitle}</td>
                                                        <td>${postList[i-1].postContents}</td>
                                                        <td>${postList[i-1].postRegDate}</td>
                                                        <td>${postList[i-1].postCount}</td>

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
                    <%--실시간 인기글--%>
                    <div style="float:right; width:300px;">
                        <div class="col-lg-5 col-xl-4 grid-margin grid-margin-xl-0 stretch-card">
                            <div class="form">
                                <div class="realtime-hot" style="    width: 250px;margin-left: 50px;margin-top: 150px;">
                                    <div class="d-flex justify-content-between align-items-baseline mb-2">
                                        <h6 class="card-title mb-0">실시간 인기글</h6>
                                    </div>
                                    <div class="d-flex flex-column">
                                        <a href="#" class="d-flex align-items-center border-bottom pb-3">
                                            <div class="mr-3">
                                                <img src="https://via.placeholder.com/35x35" class="rounded-circle wd-35" alt="user">
                                            </div>
                                            <div class="w-100">
                                                <div class="d-flex justify-content-between">
                                                    <h6 class="text-body mb-2">Leonardo Payne</h6>
                                                    <p class="text-muted tx-12">12.30 PM</p>
                                                </div>
                                                <p class="text-muted tx-13">Hey! there I'm available...</p>
                                            </div>
                                        </a>
                                        <a href="#" class="d-flex align-items-center border-bottom py-3">
                                            <div class="mr-3">
                                                <img src="https://via.placeholder.com/35x35" class="rounded-circle wd-35" alt="user">
                                            </div>
                                            <div class="w-100">
                                                <div class="d-flex justify-content-between">
                                                    <h6 class="text-body mb-2">Jensen Combs</h6>
                                                    <p class="text-muted tx-12">08.22 PM</p>
                                                </div>
                                                <p class="text-muted tx-13">This template is awesome!</p>
                                            </div>
                                        </a>
                                        <a href="#" class="d-flex align-items-center border-bottom py-3">
                                            <div class="mr-3">
                                                <img src="https://via.placeholder.com/35x35" class="rounded-circle wd-35" alt="user">
                                            </div>
                                            <div class="w-100">
                                                <div class="d-flex justify-content-between">
                                                    <h6 class="text-body mb-2">Amiah Burton</h6>
                                                    <p class="text-muted tx-12">05.49 AM</p>
                                                </div>
                                                <p class="text-muted tx-13">Nice to meet you</p>
                                            </div>
                                        </a>
                                        <a href="#" class="d-flex align-items-center border-bottom py-3">
                                            <div class="mr-3">
                                                <img src="https://via.placeholder.com/35x35" class="rounded-circle wd-35" alt="user">
                                            </div>
                                            <div class="w-100">
                                                <div class="d-flex justify-content-between">
                                                    <h6 class="text-body mb-2">Yaretzi Mayo</h6>
                                                    <p class="text-muted tx-12">01.19 AM</p>
                                                </div>
                                                <p class="text-muted tx-13">Hey! there I'm available...</p>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%-- <!-- partial:../../partials/_footer.html -->
     <footer class="footer d-flex flex-column flex-md-row align-items-center justify-content-between">
         <p class="text-muted text-center text-md-left">Copyright © 2020 <a href="https://www.nobleui.com" target="_blank">NobleUI</a>. All rights reserved</p>
         <p class="text-muted text-center text-md-left mb-0 d-none d-md-block">Handcrafted With <i class="mb-1 text-primary ml-1 icon-small" data-feather="heart"></i></p>
     </footer>
     <!-- partial -->--%>

</div>
</div>

<script>
    function banner_clicked(banNo) {
        console.log(banNo);
        var data = {"banNo": banNo};
        $.ajax({
            type: 'POST',
            url: '/banner/clicked',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        });
    }

    function banner_clicked(banNo) {
        console.log(banNo);
        var data = {"banNo": banNo};
        $.ajax({
            type: 'POST',
            url: '/banner/clicked',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        });
    }
    var swiper = new Swiper('.swiper1', {
        slidesPerView: 4,
        spaceBetween: 30,
        slidesPerGroup: 1,
        loop: true,
        loopFillGroupWithBlank: true,
        pagination: {
            el: '.swiper-pagination',
            clickable: true,
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        }

    });

    var swiper = new Swiper('.swiper2', {
        slidesPerView: 3,
        spaceBetween: 30,
        slidesPerGroup: 1,
        loop: true,
        loopFillGroupWithBlank: true,
        pagination: {
            el: '.swiper-pagination',
            clickable: true,
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
    });

    var swiper = new Swiper('.swiper3', {
        slidesPerView: 1,
        spaceBetween: 10,
        slidesPerGroup: 1,
        loop: true,
        loopFillGroupWithBlank: true,

        autoplay: {delay: 10000},

        pagination: {
            el: '.swiper-pagination',
            clickable: true,
        },
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
    });


</script>
<!-- core:js -->
<script src="../../../assets/vendors/core/core.js"></script>
<!-- endinject -->
<!-- plugin js for this page -->
<!-- end plugin js for this page -->
<!-- inject:js -->
<script src="../../../assets/vendors/feather-icons/feather.min.js"></script>
<script src="../../../assets/js/template.js"></script>
<!-- endinject -->
<!-- custom js for this page -->
<!-- end custom js for this page -->
</body>
</html>