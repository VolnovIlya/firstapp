<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<section>
    <jsp:useBean id="bot" scope="request" type="ru.geekbrains.hw.Product"/>
    <form method="post" action="product?action=submit">
        <dl>
            <dt>ID: </dt>
            <dd><input type="number" name="id" value="${product.id}" placeholder="${product.id}" /></dd>
        </dl>
        <dl>
            <dt>Title: </dt>
            <dd><input type="text" name="title" value="${product.title}" placeholder="${product.title}" /></dd>
        </dl>
        <dl>
            <dt>Cost: </dt>
            <dd><input type="number" name="cost" value="${product.cost}" placeholder="${product.cost}" /></dd>
        </dl>
        <button type="submit">Save</button>
    </form>
</section>
</body>
</html>