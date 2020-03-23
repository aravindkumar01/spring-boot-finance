<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <jsp:include page="menu.jsp" />
    
  <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/toastr/toastr.min.css">
      <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Location Page</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">New Location</li>
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
                <form>
                  
                 
                  
                  
                  <div class="form-group">
                    <label>Name</label>
                    <input type="text" class="form-control" placeholder="Enter type" id="name">
                  </div>
                 
                  <div class="form-group">
                    <label>Status</label>
                    <select class="form-control" id="status">
                          <option value="true">Active</option>
                          <option value="false">Inactive</option>   
                        </select>
                  </div>
                  
				
                  <div class="row">
                    <div class="col-sm-12 col-xs-12">
                      <!-- textarea -->
                      <div class="form-group">
                        <label>Description</label>
                        <textarea class="form-control" rows="3" placeholder="Enter your description" id="description" required="required"></textarea>
                      </div>
                    </div>                    
                  </div>

				
				<div class="row">
					<div class="col-md-6">
						<button type="button" onClick="myFunction()" class="btn btn-block btn-success btn" id="saveLoan">Save</button>
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
   

    if(userId!=null && userId!=""){
    	sessionStorage.removeItem("userId");		
       }
    
});

function myFunction(){

	var token=localStorage.getItem("token");
	if(token=="" || token==null){
		 window.location.href ="/fund/ui";
		 return false;			
		}
	
	var loan={"name":$("#name").val(),"status":$("#status").val(),"description":$("#description").val()};
	
	
	  $.ajax({
	      type: "POST",
	      contentType : 'application/json; charset=utf-8',
	      headers: {"Authorization":'$ure$h '+token},
	      dataType : 'json',
	      url: "/fund/locations",
	      data: JSON.stringify(loan),
	      success :function(result) {
		      console.log(result);
	         if(result){
	        	 alertMsg();
	        	 $("#name").val('');
	        	 $("#description").val('');
	         }
	     },
         error: function(e){          	   
      	  console.log(e)
      	   
      	   	        }
	  });
}


function alertMsg(){
	
	 toastr.success('Location added!');
	 
}
</script>
</body>
</html>
    