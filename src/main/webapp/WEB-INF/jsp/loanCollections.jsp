<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="menu.jsp" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/plugins/datatables-bs4/css/dataTables.bootstrap4.css">
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>Loan Page</h1>
				</div>
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">New Loan</li>
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
			<div class="card-header">
				<div class="row">
					<div class="col-sm-3"></div>
					<div class="col-sm-4">
						<input type="text" class="form-control"
							placeholder="Enter customer fund id" id="c_fund_id">
					</div>
					<div class="col-sm-4">
						<button id="search" class="btn btn-primary">Search</button>
					</div>
				</div>

				<div class="card-tools"></div>
			</div>
			<div class="card-body"></div>
			<!-- /.card-body -->

			<div class="row">
				<div class="col-sm-6">
					<div class="card card-info">
						<div class="card-header">
							<h3 class="card-title">Loan payment</h3>
						</div>
						<!-- /.card-header -->
						<!-- form start -->

						<div class="card-body">
							<div class="form-group">
								<label for="exampleInputEmail1">Date</label> <input type="date"
									class="form-control" id="exampleInputEmail1"
									placeholder="Enter email" required="required">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Amount</label> <input
									type="number" class="form-control" id="exampleInputPassword1"
									placeholder="Enter amount">
							</div>
							<!-- /.card-body -->

							<div class="card-footer">
								<button type="submit" class="btn btn-info">Submit</button>
							</div>

						</div>
						<!-- /.card -->

					</div>
				</div>
				<div class="col-sm-6">

					<div class="card card-info">
						<div class="card-header">
							<h3 class="card-title">Loan Details</h3>
						</div>
						<!-- /.card-header -->
						<!-- form start -->

						<div class="card-body">
							<div class="form-group">
								<label>Customer Name:&nbsp;&nbsp;&nbsp;<span
									style="color: red;">Aravind</span></label><br> <label>Loan
									Type:&nbsp;&nbsp;&nbsp;<span style="color: red;">DAILY</span>
								</label><br> <label>Location:&nbsp;&nbsp;&nbsp;<span
									style="color: red;">UKKADAM</span></label><br> <label>Loan
									Amount:&nbsp;&nbsp;&nbsp;<span style="color: red;"><i
										class="fa fa-rupee">&nbsp;&nbsp;50000</i></span>
								</label><br> <label>Pending Amount :&nbsp;&nbsp;&nbsp;<span
									style="color: red;"><i class="fa fa-rupee">&nbsp;&nbsp;2000</i></span></label><br>

							</div>
							<br>
							<br>
							<br>
						</div>
						<!-- /.card -->

					</div>



				</div>




				<div class="col-sm-12">

					<div class="card card-info">
						<div class="card-header">
							<h3 class="card-title">Loan History</h3>

						</div>
						<!-- /.card-header -->
						<!-- form start -->

						<div class="card-body">
							<table id="example1" class="table table-bordered table-striped">
								<thead>
									<tr>
										<th>Payment Date</th>
										<th>Amount Paid</th>
										<th>Pending Amount</th>
										<th>Balance days</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Win 95+</td>
										<td>4</td>
										<td>X</td>
										<td>as</td>
									</tr>

								</tbody>
								<tfoot>
									<tr>
										<th>Payment Date</th>
										<th>Amount Paid</th>
										<th>Pending Amount</th>
										<th>Balance days</th>
									</tr>
								</tfoot>
							</table>

						</div>
						<!-- /.card -->

					</div>


				</div>
			</div>




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

<script
	src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.js"></script>
<script
	src="${pageContext.request.contextPath}/plugins/datatables-bs4/js/dataTables.bootstrap4.js"></script>


<script>

$(function () {
	$("#example1").DataTable();
    
  });
  
$( document).ready(function() {
    var userId=sessionStorage.getItem("userId");
   

    if(userId!=null && userId!=""){
    	sessionStorage.removeItem("userId");		
       }
    
});

function myFunction(){
	var loan={"name":$("#name").val(),"status":$("#status").val(),"description":$("#description").val()};
	
	
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
