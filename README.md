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









