<%@page language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Addition Page</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
    <div class="container">
        <h2>Notification</h2>
        <form action="addNotification" method="get">
            <input type="text" name="type" placeholder="Enter notification type" required>
            <input type="text" name="message" placeholder="Enter notification message" required>
            <button type="submit">Add</button>
        </form>
    </div>
</body>
</html>