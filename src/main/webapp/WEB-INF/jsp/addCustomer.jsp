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
				 <form role="form" id="cus-form" action="javascript:myFunction();">			 
				 
				 <div class="row div_class_name">
                    <div class="col-sm-5">
                      <!-- text input -->
                      <div class="form-group">
                        <label>Customer Id</label>
                        <input type="text" class="form-control" placeholder="Enter first name" id="c_id" required="required">
                      </div>
                    </div>
                    <div class="col-sm-5">
                      <div class="form-group">
                        <label>Customer Account</label>
                        <input type="text" class="form-control" placeholder="Enter last name" id="c_account" required="required">
                      </div>
                    </div>
                    <div class="col-sm-2">
                      <div class="form-group btn-ok">
                  			<button class="btn btn-primary" id="ok">Ok</button>
                      </div>
                    </div>
                  </div>
					
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
						<label>Date of birth</label> <input type="date" class="form-control"
							placeholder="Enter date of birth" id="dob" required="required">
					</div>
					<div class="form-group">
						<label>Family Member</label> <input type="text" class="form-control"
							placeholder="Enter family member name(wife,father)" id="familyPerson" required="required">
					</div>
					<div class="form-group">
						<label>Family Member Count</label> <input type="number" class="form-control"
							placeholder="Enter family members count" id="familyPersonsCount" required="required">
					</div>
					
				  <div class="form-group">
						<label>Education</label> 
						<select class="form-control" id="education" required="required">
							<option value="no">No</option>
							<option value="starter">Starter</option>
							<option value="higher">Higher</option>
							<option value="bachelor degree">Bachelor Degree</option>
							<option value="others">Others</option>
						</select>
					</div>
					<div class="form-group">
						<label>Marital Status</label> 
						<select class="form-control" id="marital" required="required">
							<option value="no">No</option>
							<option value="yes">Yes</option>
						</select>
					</div>
					
					<div class="form-group">
						<label>Religion</label> <select class="form-control" id="religion">
							<option value="hindu">Hindu</option>
							<option value="muslim">Muslim</option>
							<option value="christian">Christian</option>
						</select>
					</div>
					
					<div class="form-group">
						<label>Gender</label> <select class="form-control" id="gender" required="required">
							<option value="male">Male</option>
							<option value="female">Female</option>
						</select>
					</div>
					
					<div class="form-group">
						<label>Mobile</label> <input type="number" class="form-control"
							placeholder="Enter your mobile number" id="mobile" required="required">
					</div>
					
					<div class="row">
						<div class="col-sm-12 col-xs-12">
							<!-- textarea -->
							<div class="form-group">
								<label>Current Address</label>
								<textarea class="form-control" rows="3"
									placeholder="Enter your Current Address" id="current_address"
									required="required"></textarea>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12 col-xs-12">
							<!-- textarea -->
							<div class="form-group">
								<label>Permanent Address</label>
								<textarea class="form-control" rows="3"
									placeholder="Enter your Permanent Address" id="permanent_address"
									required="required"></textarea>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label>Current House Years</label> <input type="number" class="form-control"
							placeholder="Enter current house occupation years" id="years" required="required">
					</div>
					<div class="form-group">
						<label>House Type</label> <select class="form-control" id="house_type" required="required">
							<option value="own">Own</option>
							<option value="rent">Rent</option>
							<option value="contract">Contract</option>
							<option value="parents">Parents</option>
						</select>
					</div>
					
					<div class="form-group">
						<label>ID card type</label>
						 <input type="text" class="form-control"	placeholder="Enter ID type" id="id_type" required="required">
					</div>
					<div class="form-group">
						<label>ID card number</label>
						 <input type="text" class="form-control"	placeholder="Enter id card number" id="id_number" required="required">
					</div>
					<div class="form-group">
						<label>Status</label> <select class="form-control" id="status" required="required">
							<option value="true">Active</option>
							<option value="false">Inactive</option>
						</select>
					</div>

					<div class="form-group">
						<label>Business Name</label> <input type="text" class="form-control"
							placeholder="Enter business name" id="businessName" required="required">
					</div>
					<div class="form-group">
						<label>Business Experience</label> <input type="text" class="form-control"
							placeholder="Enter business name" id="experience" required="required">
					</div>
					
					<div class="form-group">
						<label>Income-Tax</label> <input type="number" class="form-control"
							placeholder="Enter income tax amount" id="income" required="required">
					</div>
					<div class="form-group">
						<label>Request Amount</label> 
						<input type="text" class="form-control"
							placeholder="Enter customer request amount" id="request_amount" required="required">
					</div>
					<div class="form-group">
						<label>Loan Type</label> 
					<select class="form-control" id="loan_type" required="required" id="loan_type">
							<option value="no">No</option>
					</select>		
					</div>
					<div class="form-group">
						<label>Reference Name</label> 
						<input type="text" class="form-control"
							placeholder="Enter reference name" id="reference_name" required="required">
					</div>
					<div class="form-group">
						<label>Reference Relationship</label> 
						<input type="text" class="form-control"
							placeholder="Enter reference Relationship" id="reference_relationship" required="required">
					</div>
					<div class="form-group">
						<label>Reference Business</label> 
						<input type="text" class="form-control"
							placeholder="Enter Reference Business" id="reference_business" required="required">
					</div>
									


					

					<div class="row">
						<div class="col-md-6">
							<button type="button" onClick="myFunction()"  class="btn btn-block btn-success btn"
								id="saveLoan">Next</button>
						</div>
						<div class="col-md-6">
							<button type="button" class="btn btn-block btn-info btn">Cancel</button>
						</div>
					</div>
					
			</form>
				<!-- </form> -->

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

<style>

.btn-ok{
margin-top:10px;
}
</style>
<script>

//loan_type

$( document).ready(function() {

	 $(".div_class_name").hide();
var token=localStorage.getItem("token");
	if(token=="" || token==null){
		 window.location.href ="/fund/ui";
		 		
		}
	  $.ajax({
	      type: "GET",
	      contentType : 'application/json; charset=utf-8',
	      headers: {"Authorization":'$ure$h '+token},
	      dataType : 'json',
	      url: "/fund/loandetails",
	      success :function(result) {
		     // console.log(result);
		      $.each(result, function(key, value) {   
			      //console.log(key+" "+value);
			      
		    	     $('#loan_type')
		    	         .append($("<option></option>")
		    	                    .attr("value",value.loanFundId)
		    	                    .text(value.type)); 
		    	});
		     
	     },
         error: function(e){          	   
      	  console.log(e)
      	   
      	   	        }
	  });
    
});


function myFunction(){

	
	
	var token=localStorage.getItem("token");
	if(token=="" || token==null){
		 window.location.href ="/fund/ui";
		 return false;			
		}
	 
	var customerDTo={"firstName":$("#firstname").val(),"lastName":$("#lastname").val(),"dob":$("#dob").val(),"familyPerson":$("#familyPerson").val(),
			"familyMembers":$("#familyPersonsCount").val(),"education":$("#education").val(),"maritalStatus":$("#marital").val(),
			"religion":$("#religion").val(),"gender":$("#gender").val(),"mobNo":$("#mobile").val(),"residentAddress":$("#current_address").val(),
			"permanentAddrs":$("#permanent_address").val(),"periodOfExistence":$("#years").val(),"houseType":$("#house_type").val(),"primaryId":$("#id_type").val(),
			"primaryIdNo":$("#id_number").val(),"status":$("#status").val(),
			"businessName":$("#businessName").val(),"income":$("#income").val(),"requestAmount":$("#request_amount").val(),
			"loaFundId":$("#loan_type").val(),"refName":$("#reference_name").val(),"refRelation":$("#reference_relationship").val(),
			"refBusiness":$("#reference_business").val(),"experience":$("#experience").val()
			};
	
	
	  $.ajax({
	      type: "POST",
	      contentType : 'application/json; charset=utf-8',
	      headers: {"Authorization":'$ure$h '+token},
	      dataType : 'json',
	      url: "/fund/new-customer",
	      data: JSON.stringify(customerDTo),
	      success :function(result) {
		      console.log(result);
		      //localStorage.setItem("customer",JSON.stringify(result));
		      
	         if(result){
	        	 $(".div_class_name").show();
	        	 $(".div_class_name").prop('disabled', true);
		         $("#c_id").val(result.cus_fund_id);
		         $("#c_account").val(result.cus_acc_id);
	        	// location.reload();
	        	 //window.location.href="/fund/ui/nextCustomerAdd";
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
