
<div align = "center">
  
<h1> Conversor de moneda Challenge Alura </h1>

</div>

### Indice

- [Descripción del proyecto](#descripción-del-proyecto)

- [Estado del proyecto](#Estado-del-proyecto)

- [Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

- [Acceso al proyecto](#acceso-proyecto)

- [Tecnologías utilizadas](#tecnologías-utilizadas)

- [Personas-Desarrolladores del Proyecto](#personas-desarrolladores)


## Descripción del proyecto

<p> Proyecto para convertir valores de una moneda a otra. </p>

<p> Monedas integradas: </p>

<ul>
  
  <li> USD </li>
  <li> ARS </li>
  <li> COP </li>
  <li> BRL </li>
 
</ul>


<p> Conversiones integradas: </p>

<ul>
  
  <li> USD -> ARS </li>
  <li> ARS -> USD </li>
  <li> USD -> BRL </li>
  <li> BRL -> USD </li>
  <li> USD -> COP </li>
  <li> COP -> USD </li>
 
</ul>


## Estado del proyecto

<p> Proyecto terminado, pero podría retomar un estado de "En desarrollo" en el futuro </p>

## Caracteristicas de la aplicación

 <p> La aplicación consiste en un conversor de moneda. Al iniciar la aplicación se se desplagara un menu que arroja 7 opciones: </p>

 <ul> 
 
<li> 1) Dolar =>> Peso Argentino </li>
<li> 2) Peso Argentino =>> Dolar </li>
<li> 3) Dolar =>> Real Brasileño </li>
<li> 4) real Brasileño =>> Dolar </li>
<li> 5) Dolar =>> Peso Colombiano </li>
<li> 6) Peso Colombiano =>> Dolar </li>
<li> 7) Salir </li>
 
 </ul>
   
<p> y le pide al usuario ingresar una de ellas, si el usuario ingresa una opción no disponible la aplicación le dirá: </p>
  
<p> "Esta opción no esta disponible, por favor digite una opción del 1 al 6 o si desea finalizar la aplicación digite la opción 7" </p>

<p> Ya que a la hora de ingresar un valor de tipo String, la aplicación arrojaba un error, se corrigio esto de manera que al usurio ingresar un valor de tipo String la aplicación le dirá: </p>

<p> "Opcion invalida. por favor digite una opción del 1 al 6 o si desea finalizar la aplicación digite la opción 7" </p>

<p> Se realizo este mismo procedimiento a la hora de que el usuario ingresara el valor a convertir, si esta no era un valor numerico, la aplicación le dirá:</p>

<p> "El valor solicitado es numérico. Escribe un valor numérico para continuar" </p>

<p> Si el usuario escribe todos los datos correctamente la aplición le devolvera: </p>

<p> "el valor de (Cantidad escrita por el usurio) [Moneda inicial] Es igual a (Cantidad convertida) [Moneda final]" </p>

## Acceso al proyecto

<a href="https://github.com/DavidIG99/ChallengeConversorDeMoneda" > <p> Conversor de moneda </p> </a>

## Tecnoligías utilizadas

<a href= "https://docs.oracle.com/en/java/javase/17/docs/api/index.html"> <p> JAVA </p> </a>

<a href= "https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1"> <p> Gson.jar </p> </a>

<a href= "https://www.exchangerate-api.com"> <p> API Exchagerate </p> </a>














