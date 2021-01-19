testar o jwt

chamar o endpoint http://localhost:8080/users e ver falhando por falta de autenticação

chamar o endpoint http://localhost:8080/login com o seguinte json

{
"username": "admin",
"password": "password"
}
para criar um token válido


depois chamar novamente o http://localhost:8080/users enviando no header o authorizathion token gerado


Authorization Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTYxMTM0MDg4Mn0.d8lFDs3I6SLWrJLa8Q84FY8sbdfKEalzNGv1ROZ2n3vG5OPOR2PuPUnCVgsimEUrmiC_hnw4ClRrSUfFcY8wYw