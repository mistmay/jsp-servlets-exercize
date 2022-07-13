<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>Include Jsp</title>
    <style type="text/css">
        table, tr, td {
            font-size: 0.9em;
            border: 3px groove;
            padding: 5px;
        }
    </style>
</head>

<body>
  <table>
      <tr>
          <td>
              <jsp:include page="banner.html" flush="true" />
          </td>
      </tr>
      <tr>
          <td style="width: 160px">
              <jsp:include page="toc.html" flush="true" />
          </td>
          <td style="vertical-align: top">
              <jsp:include page="clock2.jsp" flush="true" />
          </td>
      </tr>
  </table>
</body>

</html>