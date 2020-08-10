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

Frontend
--------
Frontend está en colaboracion con el equipo de **Equipamientos** en: [JBenas
/
service-front](https://github.com/JBenas/service-front)

API
-------
````
Proximo a modificación
````
* Para obtener todos los pabellones ejecutar petición **GET**  `/pabellon` y obtendrá una información similar a:
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

* Para solicitar información de un pabellón ejecutar petición **GET**  `/pabellon/{id}` y obtendrá una información similar a:
```javascript
{
  id: INT,
  sala: INT,
  descripcion: STRING,
  estado: BOOLEAN
}
````

* Para solicitar información de pabellones en una sala ejecutar petición **GET**  `/pabellon/sala/{id}` y obtendrá una información similar a:
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

* Para agregar pabellón a una sala ejecutar petición **POST**  `/pabellon/add` con BodyRequest
```javascript
{
  "sala": INT,
  "estado": BOOLEAN,
  "descripcion": STRING
}
````
Responderá true | Error Object

* Para actualizar estado del pabellón ejecutar petición **PUT**  `/pabellon/estado/{id}` con BodyRequest
```javascript
{
  "sala": INT,
  "estado": BOOLEAN,
  "descripcion": STRING
}
````

Para eliminar pabellon ejecutar peticion **GET**  `/pabellon/delete/{id}` => true | Error Object


* Para obtener todas las salas de recuperación ejecutar petición **GET**  `/salas` y obtendrá una informacion similar a:
```javascript
[
  {
    id: INT,
    cama: INT,
    sala: INT,
    descripcion: STRING,
    estado: BOOLEAN
  }
]
````

* Para solicitar información de una sala de recuperación ejecutar petición **GET**  `/salas/{id}` y obtendrá una información similar a:
```javascript
{
  id: INT,
  cama: INT,
  sala: INT,
  descripcion: STRING,
  estado: BOOLEAN
}
````

* Para agregar una sala de recuperación **POST**  `/salas/add` con BodyRequest
```javascript
{
  "cama": INT,
  "sala": INT,
  "estado": BOOLEAN,
  "descripcion": STRING
}
````
Responderá true | Error Object

* Para actualizar estado de una sala de recuperación ejecutar petición **PUT**  `/salas/estado/{id}` con BodyRequest
```javascript
{
  "cama": INT,
  "sala": INT,
  "estado": BOOLEAN,
  "descripcion": STRING
}
````

Para eliminar una sala de recuperación ejecutar petición **GET**  `/salas/delete/{id}` => true | Error Object
