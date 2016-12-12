<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<header>
    <title>Login Application</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</header>
<body>

<h2>Login Application</h2>
<div class="container">


    <div id="fullscreen_bg" class="fullscreen_bg"/>

    <div class="container">

        <form action="/login/" method="post" class="form-signin">
            <h1 class="form-signin-heading text-muted">Log In</h1>
            <input type="text" class="form-control" placeholder="Name" required="" autofocus="" name="formUser">
            <input type="password" class="form-control" placeholder="Password" required="" name="formPassword">
            <input type="email" class="form-control" placeholder="Email Adress" required="" name="formEmail">
            <button class="btn btn-lg btn-primary btn-block" type="submit">
                Log In
            </button>
        </form>

    </div>
        <%--<form action="/login/" method="post">--%>
        <%--<p>--%>
        <%--Username: <input type="text" name="formName"/>--%>
        <%--</p>--%>

        <%--<p>--%>
        <%--Password: <input type="password" name="formPassword"/>--%>

        <%--</p>--%>

        <%--<p>--%>
        <%--E-mail: <input type="email" name="formEmail"/>--%>
        <%--</p>--%>

        <%--<p>--%>
        <%--<input type="submit" value="Submit">--%>
        <%--</p>--%>
        <%--</form>--%>
</body>
</html>
