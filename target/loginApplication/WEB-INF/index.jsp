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

    <div class="row" style="margin-top:20px">
        <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
            <form action="/login/" method="post" role="form">
                <fieldset>
                    <h2>Escreve as tuas credenciais:</h2>
                    <hr class="colorgraph">
                    <div class="form-group">
                        <input type="text" name="formName" id="username" class="form-control input-lg"
                               placeholder="Username">
                    </div>
                    <div class="form-group">
                        <input type="password" name="password" id="password" class="form-control input-lg"
                               placeholder="Password">
                    </div>
                    <div class="form-group">
                        <input type="email" name="email" id="email" class="form-control input-lg"
                               placeholder="Email Address">
                    </div>
				<span class="button-checkbox">
				</span>
                    <hr class="colorgraph">
                    <div class="row">
                        <div class="col-xs-6 col-sm-6 col-md-6">
                            <input type="submit" class="btn btn-lg btn-success btn-block" value="Submit">
                        </div>
                    </div>
                </fieldset>
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
