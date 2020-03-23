<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
	<jsp:include page="menu.jsp" />
	
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/toastr/toastr.min.css">
      <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>User Page</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">New User</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
      <div class="card">
     <div class="card-body">
                <form role="form" onsubmit="myFunction()">
                  <div class="row">
                    <div class="col-sm-6">
                      <!-- text input -->
                      <div class="form-group">
                        <label>First Name</label>
                        <input type="text" class="form-control" placeholder="Enter first name" id="firstname" required="required">
                      </div>
                    </div>
                    <div class="col-sm-6">
                      <div class="form-group">
                        <label>Last Name</label>
                        <input type="text" class="form-control" placeholder="Enter last name" id="lastname" required="required">
                      </div>
                    </div>
                  </div>
                 
                  
                  <div class="form-group">
                    <label>Role</label>
                    <select class="form-control" id="role">    
                    	  <option value="0">Select</option>                     
                          <option value="ADMIN">Admin</option>
                          <option value="USER">Excutive</option>
                        </select>
                  </div>
                  
                  <div class="form-group">
                    <label>Status</label>
                    <select class="form-control" id="status">
                          <option value="true">Active</option>
                          <option value="false">Inactive</option>   
                        </select>
                  </div>
                  
				   <div class="form-group">
                    <label>Email</label>
                    <input type="email" class="form-control" placeholder="Enter email" id="email">
                  </div>
                  	<div class="form-group">
                    <label>Mobile</label>
                    <input type="number" class="form-control" placeholder="Enter Mobile" id="mobile">
                  </div>
                  <div class="form-group">
                    <label>Date of birth</label>
                    <input type="date" class="form-control" placeholder="Enter date of brith" id="dob">
                  </div>
				  <div class="form-group">
                    <label>Gender</label>
                    <select class="form-control" id="gender">
                          <option value="male">Male</option>
                          <option value="female">Female</option>   
                          <option value="others">Others</option>                       
                        </select>
                  </div>
                  <div class="row">
                    <div class="col-sm-12 col-xs-12">
                      <!-- textarea -->
                      <div class="form-group">
                        <label>Address</label>
                        <textarea class="form-control" rows="3" placeholder="Enter your address" id="address" required="required"></textarea>
                      </div>
                    </div>                    
                  </div>

				
				<div class="row">
					<div class="col-md-6">
						<button type="button" onClick="myFunction()" class="btn btn-block btn-success btn" id="saveEmployee">Save</button>
					</div>
					<div class="col-md-6">
						<button type="button" class="btn btn-block btn-info btn">Cancel</button>
					</div>	
				</div>
				
                </form>
								
              </div>
              <!-- /.card-body -->
         
         
       
        <!-- /.card-footer-->
      </div>
      <!-- /.card -->

    </section>
    <!-- /.content -->
  </div>
	<jsp:include page="footer.jsp" />
  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->


<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/dist/js/demo.js"></script>

<script src="${pageContext.request.contextPath}/plugins/toastr/toastr.min.js"></script>

<script>

$( document).ready(function() {
    var userId=sessionStorage.getItem("userId");
    var token=localStorage.getItem("token");
    if(token=="" || token==null){
    	 window.location.href ="/fund/ui";
    	 	
    	}

    if(userId!=null && userId!=""){
        //alert(userId);
    	sessionStorage.removeItem("userId");

    	  $.ajax({
    	      type: "GET",
    	      contentType : 'application/json; charset=utf-8',
    	      headers: {"Authorization":'$ure$h '+token},
    	      dataType : 'json',
    	      url: "/fund/usersDetails/"+userId,
    	      //data: JSON.stringify(user),
    	      success :function(result) {
    		      console.log(result);
    		      $("#firstname").val(result.first_name);
    		      $("#lastname").val(result.last_name);
    		      $("#email").val(result.email);
    		      $("#gender").val(result.gender);
    		     // $("#status").val(j.),
    			 $("#mobile").val(result.mobile);
    			  $("#dob").val(result.dob);
    			  $("#address").val(result.address);
    			  $("#role").val(result.role);
    		
    	     },
             error: function(e){          	   
          	  console.log(e)
          	   
          	  }
    	  });		
       }
    
});

function myFunction(){

	var token=localStorage.getItem("token");
	if(token=="" || token==null){
		 window.location.href ="/fund/ui";
		 return false;			
		}
	//alert(token);
	var user={"first_name":$("#firstname").val(),"last_name":$("#lastname").val(),
			"email":$("#email").val(),"gender":$("#gender").val(),"username":$("#email").val(),"status":$("#status").val(),
			"mobile":$("#mobile").val(),"dob":$("#dob").val(),"address":$("#address").val(),"role":$("#role").val()};
	
	
	  $.ajax({
	      type: "POST",
	      contentType : 'application/json; charset=utf-8',
	      headers: {"Authorization":'$ure$h '+token},
	      dataType : 'json',
	      url: "/fund/signup",
	      data: JSON.stringify(user),
	      success :function(result) {
		      console.log(result);
	         if(result){
	        	 location.reload();
	         }else{
	        	 alertMsg();
		      }
	     },
         error: function(e){          	   
      	  console.log(e)
      	   
      	   	        }
	  });
}


function alertMsg(){
	alert("alert");
	 toastr.success('User allready exit!');
	 
}
</script>
</body>
</html>
   