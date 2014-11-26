<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<script type="text/javascript">

$(document).ready(function() 
{
    $.ajax({
        url: "http://localhost:8080/CRUD/test"
    }).then(function(data) {  
    	
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.name);
    });
});
   
</script>
</head>
<body>
<div>
            <p class="greeting-id">The ID is </p>
            <p class="greeting-content">The content is </p>
 </div>
<div id="hi">hello world</div>
</body>
</html>