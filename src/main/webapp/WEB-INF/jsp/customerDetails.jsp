<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <jsp:include page="menu.jsp" />
    
 <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datatables-bs4/css/dataTables.bootstrap4.css">
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
              <li class="breadcrumb-item active">Customer Details</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
    <div class="card">
            <div class="card-header">
              <h3 class="card-title">All customer Details</h3>
              <div  style="display:none;">              
              		<input type="text" id="token" value="${token}">
              </div>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>CustomerID</th>
                  <th>Name</th>
                  <th>Location</th>                 
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                 
                  <td>Win 95+</td>
                  <td>4</td>
                  <td>X</td>
                  <td><a href="#" onClick="viewClick('1')"><i class="fas fa-edit" style="cursor:pointer;color:red;"></i></a></td>
                  <td><a><i class="fas fa-trash" style="cursor:pointer;color:red;"></i></a></td>
                </tr>

                </tbody>
                <tfoot>
               <tr>
                   <th>Name</th>
                  <th>Description</th>
                  <th>Status</th>                 
                  <th>Edit</th>
                  <th>Delete</th>
                </tr>
                </tfoot>
              </table>
            </div>
            <!-- /.card-body -->
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

<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables-bs4/js/dataTables.bootstrap4.js"></script>

<script>


function viewClick(id){

	//alert(id);
	sessionStorage.setItem("userId", id);
	window.location.href="/fund/ui/addUser";
}
$(function () {
	$("#example1").DataTable();
    
  });

var token=localStorage.getItem("token");
if(token=="" || token==null){
	 window.location.href ="/fund/ui";
	 return false;			
	}
	
$.ajax({
    type: "GET",
    contentType : 'application/json; charset=utf-8',
    headers: {"Authorization":'$ure$h '+token},
    dataType : 'json',
    url: "/fund/users",
    //data: JSON.stringify(employee),
    success :function(result) {
          console.log(result);
  	  $.each(result,function( i,j ) {
  		  
  		  t.row.add( [
  			  j.id,j.title,j.dep_name,j.date_of_event,
  			  '<button onClick="meetingStatus('+j.dep_id+')")>view</button>',
  			  '<i class="fas fa-pie-chart" style="cursor:pointer;">',
  			  '<i class="fas fa-edit" style="cursor:pointer;"></i>'
  			  
  			  
  		  ]).draw( false );
  	  });
   },
 error: function(e){          	   
	  console.log(e)
	   
	  }
});


</script>


</body>
</html>
   