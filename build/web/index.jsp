<%-- 
    Document   : index
    Created on : 15/05/2022, 07:58:16 PM
    Author     : karen_b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carnet</title>
    </head>
    <body>
        <div>
            <h1>GENERAR CARNET</h1><br>

            <%--Formulario HTML--%>
            <form method="post">
                <input type="submit" name="persona" value="Estudiante" >
                <input type="submit" name="persona" value="Instructor" >
              <%--<input type="submit" name="persona" value="Administrador">--%>
            </form>
        </div>

        <br>

        <%

            if (request.getParameter("persona") != null) {

                if (request.getParameter("persona").equals("Estudiante")) {    %>

        <div>  

            <h1>Estudiante</h1>
            <br>
            <form method="post" action="ServletAprendiz">  
                <label>1. Ingrese sus nombres</label><br><br>
                <p><input name="repsuesta1" placeholder="Ingrese sus nombres" required></input></p>
                <br>
                <label>2. Ingrese sus apellidos</label><br><br>
                <p><input name="repsuesta2" placeholder="Ingrese sus apellido" required></input></p>
                <br>
                <label>3. Ingrese su edad</label><br><br>
                <p><input name="repsuesta3"  required></input></p>
                <br>
                <label>4. Ingrese su correo</label><br><br>
                <p><input name="repsuesta4" placeholder="Ingrese su correo" required></input></p>
                <br>
                <label>5. Ingrese su numero de contacto</label><br><br>
                <p><input name="repsuesta5" placeholder="Ejemplo 123456789" required></input></p>
                <br>
                <label>6.Seleccione su programa de formación</label><br><br>
                <select name="respuesta6" required>
                    <option value="1">ADSI</option>
                    <option value="2">COCINA</option>
                    <option value="3">NO SE XD</option>
                </select>
                <br><br>
                <label>7. Ingrese su numero de documento</label><br><br>
                <p><input name="repsuesta7"required></input></p>
                <br>
                <input type="submit" value="Generar carnet" >   
            </form>
        </div>


        <%  }
            if (request.getParameter("persona").equals("Instructor")) {
            %>
          


        <div>  

            <h1>Instructor</h1>
            <br>
            <form method="post" action="">  
                <label>1. Ingrese sus nombres</label><br><br>
                <p><textarea name="repsuesta2" placeholder="Ingrese sus nombres" required></textarea></p>
                <br>
                <label>2. Ingrese sus apellidos</label><br><br>
                <p><textarea name="repsuesta2" placeholder="Ingrese sus apellido" required></textarea></p>
                <br>
                <label>3. Ingrese su edad</label><br><br>
                <p><textarea name="repsuesta2"  required></textarea></p>
                <br>
                <label>4. Ingrese su correo</label><br><br>
                <p><textarea name="repsuesta2" placeholder="Ingrese su correo" required></textarea></p>
                <br>
                <label>5. Ingrese su numero de contacto</label><br><br>
                <p><textarea name="repsuesta2" placeholder="Ejemplo 123456789" required></textarea></p>
                <br>
                <label>6.Seleccione su estado</label><br><br>
                <input type="radio" name="respuesta8" value="1" required>Activo<br>
                <input type="radio" name="respuesta8" value="2" required>Inactivo<br>
                <br>
                <label>7.Seleccione la materia que dicta</label><br><br>
                <select name="respuesta2" required>
                    <option value="1">Programación</option>
                    <option value="2">Bases de datps</option>
                    <option value="2">Ingles</option>
                    <option value="2">Proyecto</option>
                </select>
                <br><br>
                <label>8. Ingrese su numero de documento</label><br><br>
                <p><textarea name="repsuesta2"required></textarea></p>
                <br>
                <input type="submit" value="Generar carnet" >   
            </form>
        </div>

  <% } } %>

        
    </body>
</html>
