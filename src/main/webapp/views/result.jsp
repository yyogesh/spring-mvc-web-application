<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Result is: <%= session.getAttribute("result") %></h2>
         <h2>Result in JSTL: ${result}</h2>
         <h1>${notification}</h1>
         <p>
                   Today is:  ${today}
                  </p>
    </body>
</html>