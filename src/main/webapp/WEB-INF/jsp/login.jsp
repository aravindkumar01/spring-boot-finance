<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>SAI Funds | Log in</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
  
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/toastr/toastr.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="${pageContext.request.contextPath}/index2.html"><b>SAI</b>Funds</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">Sign in to start your session</p>

        <div class="input-group mb-3">
          <input type="email" class="form-control" placeholder="Email" required="required" id="username">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Password" required="required" id="password">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                Remember Me
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <button type="button" id="login-btn" class="btn btn-primary btn-block">Sign In</button>
          </div>
          <!-- /.col -->
        </div>
      

 
      <!-- /.social-auth-links -->

      <p class="mb-1">
        <a href="forgot-password.html">I forgot my password</a>
      </p>
     
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.min.js"></script>

<script src="${pageContext.request.contextPath}/plugins/toastr/toastr.min.js"></script>

<script type="text/javascript">

$(document).ready(function(){

	
	  $("#login-btn").click(function(){

		   var username=$("#username").val();
		   var password=$("#password").val();

		   var login={"username":username,"password":password};
		   if(username=="" || password=="" || username==undefined || password==undefined){
			   errorToast("Please fill correctly");
			   return false;

			   }
		  $.ajax({
		      type: "POST",
		      contentType : 'application/json; charset=utf-8',
		      dataType : 'json',
		      url: "/fund/token/generate-token",
		      data: JSON.stringify(login),
		      success :function(result) {
		            console.log(result);
		            
		             if(result.token){
		            	 localStorage.setItem("token", result.token);
		            	 window.location.href ="/fund/ui/home";
				       }	             
		       },
		   error: function(e){          	   
		  	  console.log(e)
		  	   errorToast("Username OR password wrong!");
		  	  }
		  });
		  			
		    
	  });
	});

function errorToast(msg){
	 $(document).Toasts('create', {
	        class: 'bg-danger', 
	        title: 'LOGIN',
	        subtitle: '',
	        body: msg
	      })
}

</script>
</body>
</html>
