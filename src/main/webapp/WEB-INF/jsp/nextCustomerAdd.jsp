<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="menu.jsp" />
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Customer</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Customer</li>
					</ol>
				</div>
			</div>
		</div>
		<!-- /.container-fluid -->
	</section>

	<!-- Main content -->
	<section class="content">

		<!-- Default box -->
		<div class="card">
			<div class="card-body">
				<form role="form" onsubmit="myFunction()">
				
				
					<div class="form-group">
							<label>Customer ID</label> 
							<input type="text" class="form-control cDetails"
								placeholder="Customer ID" id="c_id">
					</div>
					<div class="form-group">
							<label>Customer Account Number</label> 
							<input type="text" class="form-control cDetails"
								placeholder="Customer account" id="c_account">
					</div>
					<div class="form-group">
						<label>Business Name</label> <input type="text" class="form-control"
							placeholder="Enter business name" id="name">
					</div>
					
					<div class="form-group">
						<label>Income-Tax</label> <input type="number" class="form-control"
							placeholder="Enter income tax amount" id="tax">
					</div>
					<div class="form-group">
						<label>Request Amount</label> 
						<input type="text" class="form-control"
							placeholder="Enter customer request amount" id="rqest_amount">
					</div>
					<div class="form-group">
						<label>Loan Type</label> 
					<select class="form-control" id="loan_type">
							<option value="no">No</option>
					</select>		
					</div>
					<div class="form-group">
						<label>Reference Name</label> 
						<input type="text" class="form-control"
							placeholder="Enter reference name" id="reference_name">
					</div>
					<div class="form-group">
						<label>Reference Relationship</label> 
						<input type="number" class="form-control"
							placeholder="Enter reference Relationship" id="reference_relationship">
					</div>
									


					<div class="row">
						<div class="col-md-6">
							<button type="submit" class="btn btn-block btn-success btn"
								id="saveLoan">Save</button>
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
<script
	src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script
	src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/dist/js/demo.js"></script>


<script>

$( document).ready(function() {


	
	$(".cDetails").attr("disabled", true);
	/* $(document).keydown(function (event) {
	    if (event.keyCode == 123) { // Prevent F12
	        return false;
	    } else if (event.ctrlKey && event.shiftKey && event.keyCode == 73) { // Prevent Ctrl+Shift+I        
	        return false;
	    }
	}); */
    var customer=JSON.parse(localStorage.getItem('customer'));  
   
	
    if(customer!=null && customer!=""){
       // console.log(customer);
       //alert("adsf");
        $("#c_id").val(customer.cus_fund_id);
        $("#c_account").val(customer.cus_acc_id);
        //localStorage.removeItem("customer");		
       }
    
});

function myFunction(){
	var customerDTo={"name":$("#name").val(),"dob":$("#").val(),"familyPerson":$("#familyPerson").val(),
			"familyPersonCount":$("#familyPersonConut").val(),"education":$("#education").val(),"marital":$("#marital").val(),
			"religon":$("#religon").val(),"gender":$("#gender").val(),"mobile":$("#mobile").val(),"current_address":$("#current_address").val(),
			"permanent_address":$("#permanent_address").val(),"years":$("#years").val(),"house_type":$("#house_type").val(),"id_type":$("#id_type").val(),
			"id_number":$("#id_number").val(),"status":$("#status").val()};
	
	
	  $.ajax({
	      type: "POST",
	      contentType : 'application/json; charset=utf-8',
	      dataType : 'json',
	      url: "localhost:8080/fund/signup",
	      data: JSON.stringify(loan),
	      success :function(result) {
		      console.log(result);
	         if(result){
	        	 alert("Employee added!")
	         }
	     },
         error: function(e){          	   
      	  console.log(e)
      	   
      	   	        }
	  });
}

</script>
</body>
</html>
