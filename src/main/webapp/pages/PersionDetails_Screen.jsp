<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
<head>
  
   

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
<title>PassportApplication</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

      <script src = "https://code.jquery.com/jquery-3.4.1.js"></script>
      <script src = "https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script type="text/javascript"> 
        $(document).ready(function() { 
          
            $(function() { 
                $( "#datepicker" ).datepicker()({ dateFormat:"yyyy-MM-dd" }); 
            }); 
        }) 
        
        </script>
<style type="text/css">
	body{
		color: #fff;
		background: #63738a;
		font-family: 'Roboto', sans-serif;
	}
    .form-control{
		height: 40px;
		box-shadow: none;
		color: #969fa4;
	}
	.form-control:focus{
		border-color: #5cb85c;
	}
    .form-control, .btn{        
        border-radius: 3px;
    }
	.signup-form{
		width: 400px;
		margin: 0 auto;
		padding: 30px 0;
	}
	.signup-form h2{
		color: #636363;
        margin: 0 0 15px;
		position: relative;
		text-align: center;
    }
	.signup-form h2:before, .signup-form h2:after{
		content: "";
		height: 2px;
		width: 30%;
		background: #d4d4d4;
		position: absolute;
		top: 50%;
		z-index: 2;
	}	
	.signup-form h2:before{
		left: 0;
	}
	.signup-form h2:after{
		right: 0;
	}
    .signup-form .hint-text{
		color: #999;
		margin-bottom: 30px;
		text-align: center;
	}
    .signup-form form{
		color: #999;
		border-radius: 3px;
    	margin-bottom: 15px;
        background: #f2f3f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
	.signup-form .form-group{
		margin-bottom: 20px;
	}
	.signup-form input[type="checkbox"]{
		margin-top: 3px;
	}
	.signup-form .btn{        
        font-size: 16px;
        font-weight: bold;		
		min-width: 140px;
        outline: none !important;
    }
	.signup-form .row div:first-child{
		padding-right: 10px;
	}
	.signup-form .row div:last-child{
		padding-left: 10px;
	}    	
    .signup-form a{
		color: #fff;
		text-decoration: underline;
	}
    .signup-form a:hover{
		text-decoration: none;
	}
	.signup-form form a{
		color: #5cb85c;
		text-decoration: none;
	}	
	.signup-form form a:hover{
		text-decoration: underline;
	}  
</style>


</head>
<body>
<div class="signup-form">
    <form:form action="register" method="POST" modelAttribute="persiondetails">
		<h2>PersionDetails</h2>
		<p class="hint-text">Create your account. It's free and only takes a minute.</p>
        <div class="form-group">
			<div class="row">
				<div class="col-xs-6">
		
            <form:input path="fname" placeholder="First Name" class="form-control" type="text" /></div>
        
				<div class="col-xs-6">
		
            <form:input path="lname" placeholder="Last Name" class="form-control" type="text" /></div>
        
			</div>        	
        </div>
        <div class="form-group">
        	<form:input path="email" placeholder="Email" class="form-control" type="text" />
        </div>
        <div class="form-group">
        	<form:input type="date" path="dob" placeholder="DateOfBirth" class="form-control" pattern="yyyy-MM-dd"  id="datepicker" />
        </div>
		
		<div class="form-group">
            <form:radiobutton path="gender" value="M"   />Male <form:radiobutton
					path="gender" value="F"   />Female
        </div> 
        
        
		<div class="form-group">
            <form:input path="adharno" placeholder="Adhar No" class="form-control" type="text" />
        </div> 
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Next</button>
        </div>
   </form:form>
</div>

</body>
</html>                            