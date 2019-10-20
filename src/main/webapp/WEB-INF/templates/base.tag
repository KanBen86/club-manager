<%@tag pageEncoding="UTF-8"%>

<%@attribute name="head" fragment="true" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="main" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Clava Meum - Club-Manager</title>
    <!-- Bootstrap CND -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- benutzerdefinierte Styles und Scripte -->
    <!--
    <link rel="stylesheet" type="text/css" href="../../../resources/css/main.css"/>
    -->
    <!-- Platzhalter für den Head-Inhalt -->
    <jsp:invoke fragment="head"/>
    <!-- Icon für den Tabreiter des Browsers -->
    <!--
    <link rel="icon" type="image/png"
           href="${pageContext.request.contextPath}resources/img/favicon32.ico" sizes="32x32">
           -->
</head>
<body>
<header>
    <!-- Platzhalter für den header-Inhalt -->
    <jsp:invoke fragment="header"/>
</header>
<main>
    <!-- Platzhalter für den main-Inhalt -->
    <jsp:invoke fragment="main"/>
</main>
<footer>
    <!-- Platzhalter für den footer-Inhalt -->
    <jsp:invoke fragment="footer"/>
</footer>
</body>

</html>