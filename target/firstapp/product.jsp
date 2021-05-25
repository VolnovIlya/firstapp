<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<section>
    <h3>Product info</h3>
    <jsp:useBean id="product" scope="request" type="ru.geekbrains.hw.Product"/>
    <tr>
        <td>ID: ${product.id} | Title: ${product.title} | Cost: ${product.cost}</td>
        <td><a href="product?action=update">Update</a></td>
    </tr>
</section>
</body>
</html>