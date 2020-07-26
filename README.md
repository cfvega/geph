GEPH
==========
Integrante[s]:
--------------
|  USUARIO  |       NOMBRE       |     ROL USM     |
|:------------:|:------------------:|:-----------:|
|[**_sergiomaldo_**](https://github.com/sergiomaldo)|[_Sergio Maldonado Olgin_](mailto:sergio.maldonado@sansano.usm.cl)|*201673041-9*|
|[**_arielzu_**](https://github.com/arielzu)|[_Ariel Zúñiga Ramirez_](mailto:ariel.zunigar@sansano.usm.cl)|*201673092-3*|
|[**_cfvega_**](https://github.com/cfvega)|[_Claudio Vega Lagos_](mailto:claudiov.lagos@gmail.com)|*201673070-2*|

Proyecto
---------
GEPH es uno de los microservicio que conforma una plataforma inteligente de asignación de sillones para quimioterapia y pabellones de centros asistenciales de salud.

Como equipo de desarrollo se nos asignó desarrollar **Pabellones/Salas de Recuparación**.

API
-------
````
En desarrollo
````
* Para obtener todos los pabellones ejecutar peticion **GET**  `/pabellon` y obtendrá una informacion similar a:
```javascript
[
  {
    id: INT,
    sala: INT,
    descripcion: STRING,
    estado: BOOLEAN
  }
]
````

* Para solicitar información de un pabellon ejecutar peticion **GET**  `/pabellon/{id}` y obtendrá una informacion similar a:
```javascript
{
  id: INT,
  sala: INT,
  descripcion: STRING,
  estado: BOOLEAN
}
````

* Para solicitar información de pabellones en una sala ejecutar peticion **GET**  `/pabellon/sala/{id}` y obtendrá una informacion similar a:
```javascript
[
  {
    id: INT,
    sala: INT,
    descripcion: STRING,
    estado: BOOLEAN
  }
]
````

* Para agregar pabellon a una sala ejecutar peticion **POST**  `/pabellon/add` con BodyRequest
```javascript
{
  "sala": INT,
  "estado": BOOLEAN,
  "descripcion": STRING
}
````
Responderá true | Error Object

* Para actualizar estado del pbellon ejecutar peticion **PUT**  `/pabellon/estado/{id}` con BodyRequest
```javascript
{
  "sala": INT,
  "estado": BOOLEAN,
  "descripcion": STRING
}
````

Para eliminar pabellon ejecutar peticion **GET**  `/pabellon/delete/{id}` => true | Error Object
