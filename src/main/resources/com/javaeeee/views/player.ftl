<#-- @ftlvariable name="" type="com.javaeeee.views.PlayerView" -->
<html>
  <body>
    <form
      action="/twoByThree/game/check1"
      method="POST"
      enctype="multipart/form-data">
	  <label for="name">ENTER NAME<label> <br>
      <input type="text" name="name" /><br><br>
	  <label for="guess">ENTER GUESS<label> <br>
      <input type="text" name="guess" /><br><br>
      <input type="submit" value="Submit" />
    </form>
  </body>
</html>