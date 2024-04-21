<%@page language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Addition Page</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
    <div class="container">
            <h2>Addition</h2>
            <form action="additions" method="get">
                <input type="number" name="num1" placeholder="Enter first number" required>
                <input type="number" name="num2" placeholder="Enter second number" required>
                <button type="submit">Add</button>
            </form>
        </div>
</body>
</html>