<!DOCTYPE html>
<html>
<head>
    <title>blog post</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h2>Welcome to blog post</h2><br>
    <div class="register">
    <form method="post" action="./TestController/addData">
        <label><b>Title
        </b>
        </label><br>
        <input type="text" name="title" id="title" placeholder="Enter Title">
        <br><br>
        <label><b>Description
        </b>
        </label><br>
        <input type="text" name="description" id="description" placeholder="Enter Description">
        <br><br>
        <label><b>Content
        </b>
        </label><br>
        <input type="text" name="content" id="content" placeholder="Enter Content">
        <br><br>
        <input type="submit" name="register" id="register">
        <br><br>
    </form>
</div>
</body>
</html>