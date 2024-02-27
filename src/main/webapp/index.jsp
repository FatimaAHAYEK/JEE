<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulaire</title>
</head>
<body>
    <form method="Post" action="FormulaireServlet">
        <%--@declare id="nom"--%>
        <%--@declare id="prenom"--%>
        <%--@declare id="datenaissance"--%>
        <%--@declare id="email"--%>
        <%--@declare id="password"--%>
       <fieldset>
         <legend>Vos coordonnéees</legend>
              <label for="nom">Nom:</label>
              <input type="text" name="nom" placeholder="Nom"></br>

              <label for="Prenom">Prenom:</label>
              <input type="text" name="Prenom" placeholder="Prenom"></br>

              <label for="DateNaissance">Date de Naissance:</label>
              <input type="date" name="DateNaissance" placeholder="DateNaissance"></br>

              <label for="Email">Email</label>
              <input type="text" name="Email" placeholder="Email"></br>

              <label for="Password">Password</label>
              <input type="Password" name="Password" placeholder="Password"></br>

              Genre<input type="radio" name="check" id="homme">Homme<br>
                   <input type="radio" name="check" id="femme">Femme

           </br>
              Paye <select name="pays" id="pays">
                         <option value="Morocco">Morocco</option>
                         <option value="Palesine">Palesine</option>
                         <option value="India">India</option>
                         <option value="Chine">Chine</option>
                   </select>
       </fieldset>
    <fieldset>
        <input type="reset" value="Effacer">
        <input type="submit" value="Envoyer">
    </fieldset>
    </form>


</body>
</html>