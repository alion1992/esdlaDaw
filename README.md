## RA`s EVALUADOS EN LA PRÁCTICA
1. RA2. Crea aplicaciones FrontEnd utilizando FrameWork de Cliente
2. RA3. Despliega aplicaciones de cliente y de servidor creadas con frameworks
3. RA4. Modifica la interfaz de usuario utilizando Framework de diseño





## PARTE 1/3 
20% del RA2
30% del RA4

Desde la empresa de el señor de los anillos nos comentan la posibilidad de hacer una mejora de la opción de menú Personajes. 
En esta opción de menú en un primer lugar estan actualmente los héroes de nuestra saga:

<img width="500" height="400" alt="image" src="https://github.com/user-attachments/assets/5f0203e3-7402-45c3-a2df-cfd55f00b6f1" />

Como podéis observar el diseño actual ademas de incompleto esta muy básico. Queremos que esta pantalla en lugar de un html que ha hecho un becario utilice algunos de los modelos de primeNG para mostrar los datos:

<a href="https://primeng.org/table">Documentación de Prime de las tablas</a>

Actualmente en nuesta página solo podemos ver que se pueden editar en las acciones, pero añadiremos más funciones como borrar.

Necesitaremos que cuando pulsemos sobre el botón editar se cargue en una pantalla nueva todos los datos de nuestro héroe.
Por último en esta primera entrega queremos también queremos una pantalla para dar de alta personajes nuevos. Actualmente sabemos que no tenemos disponible en el servidor un endpoint para guardarlos. Pero lo queremos dejar listo en el front con sus correspondientes validaciones.
<strong>Nota:</strong> Desde el equipo de back se comunica que ya están disponibles tanto el crear personaje como el editar.



## Entrega
Dejo la fecha abierta a negociarlo mañana con vosotros. 
Se hace todo a través de git con el aula virtual.

## PARTE 2/3 
30% del RA2
20% del RA4

## Petición funcional del cliente:
Tras la nueva actualización del servidor con dos nuevos servicios disponibles:

#### 1. ("/api/bajaLogica/{id}")
#### 2. ("/api/bajaFisica/{id}")
#### 3. ("/api/reactivar({id}")

Se quiere introducir esta funcionalidad en el front. Para ello a través de la aplicación en el componente de listar-personaje habra dos nuevos botones. 
<br>
<img width="20" height="20" alt="image" src="https://github.com/user-attachments/assets/c7f978b2-4c39-4d55-ba14-50a2656ee7d7" /> Para la baja Física
<br>
<img width="20" height="20" alt="image" src="https://github.com/user-attachments/assets/bbba141b-bebe-40ab-878d-081a4ccfe122" /> Para la baja Lógica

Cuando se pulse alguno de los dos botones se tiene que mostrar una ventana emergente que nos diga lo siguiente en los siguientes escenarios:

1. Se pulsa el botón de baja física. "Se va a borrar de forma definitiva el registro ¿Estás seguro que deseas borrarlo?"
   1.1 Si se pulsa Aceptar: Si produce el borrado físico de la BBDD. Si el servicio devuelve un error ya que puede ser portado de algún anillo se mostrará un toast en la parte superior de la pantalla indicando que no se puede borrar ese personaje porque es portador.
   1.2 Se se pulsa el botón Cancelar: Se cierra la ventana emergente.

2. Se pulsa el botón de baja lógica. "Se va a dar de baja el personaje ¿Estás seguro?
   2.1 Si se pulsa Aceptar: Se muestra un toast en la parte superior que se ha dado de baja correctamente.
   2.2 Se si pulsa Cancelar: Se cierra la ventana emergente.

En el caso de que un personaje tenga fecha de baja, es decir, ya esta dado de baja en lugar del botón de baja lógica:
<br>
<img width="20" height="20" alt="image" src="https://github.com/user-attachments/assets/a9799ece-ed21-419c-bca2-068f20dd8a91" />

Se mostrará el siguiente mensaje en la ventana emergente: ¿Deseas reactivar el personaje?.
En caso afirmativo se llamará al nuevo servicio:
#### ("/api/reactivar({id}")

## Parte 3/3

50% del RA2 50% del RA4

<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/116898b2-61e7-4809-9e88-f351b8ef8f62" />

Vamos a por la última parte de nuestra aplicación web en angular!. Esta última parte esta destinada a hacer un pequeño juego de preguntas y respuestas para ver los conocimientos que teneis del señor de los anillos.

A través de un nuevo servicio:

```code
("/api/obtenerPregunta/{id}")
```

No devuelve una serie de preguntas y 4 posibles respuesta:

<img width="398" height="204" alt="image" src="https://github.com/user-attachments/assets/92934cc9-64d9-4b26-887b-419cacd69e8b" />

Como podemos observar la respuesta correcta no viene informada ya que por seguridad cada vez que el usuario responde una pregunta el servidor debe confirmar si es correcta:

```code
http://localhost:8082/api/respuesta/1/?respuestaUsuario=2
```

<img width="345" height="115" alt="image" src="https://github.com/user-attachments/assets/c35b0390-3374-4b34-99cc-d2e596a19c01" />

En caso afirmativo devuelve un true, en caso de que la respuesta sea incorrecta devolverá un false.

Bueno pues una vez que ya sabemos como conseguir las preguntas y respuestas vamos a poner las reglas del juego:

1. Cuando se empieza una partida se tiene un endpoint disponible:
   ```code
   @PostMapping("/api/empezarPartida/")
   ```
2. Cuando un usuario acierta una pregunta se actualiza la partida sumandole un punto:
```code
@PutMapping("/api/correcta/{id}/")
```
3. Cuando un usuario acierta 5 preguntas seguidas se cierra la partida:
```code
    @PutMapping("/api/finalizar/{id}/")
```
4. Al igual que cuando falla una pregunta automaticamente pierde y se finaliza el juego.

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/809f7d90-7875-4155-94d4-fdbe3142164a" />

5. Generar un componente de estadísticas de las partidas que se han jugado, victorias, derrotas. Por ejemplo un boceto sería el siguiente:

<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/5c8a8eff-e73f-4d86-a6fc-c81709986725" />


### Aclaración:

Como podemos observar no hay ningún modelo para guardar ni el usuario que juega ni el historial de las partidas.
Esto debe hacerse a nivel local (localStorage o sessionStorage).

En un mismo juego no pueden repetirse preguntas, es decir, si un usuario ya ha contentado a la pregunta número 1 no debería volver a preguntarle la misma.












