<style>

span
{
	color : red;
}

</style>

<form>

<input type=text name="uname" value=${user.uname}><br><br>

<input type=password name="upass"> <span>${errorMessage}</span><br>

<input type=submit value=show formaction="displayName22" formmethod="post">

</form>

