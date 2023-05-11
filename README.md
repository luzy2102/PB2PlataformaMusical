# PlataformaMusicalPB2
### Primer parcial de Programación básica 2 de la UNLaM

Programa basado en una plataforma musical online permite a los usuarios escuchar y crear listas de reproducción de canciones. La plataforma contiene información sobre artistas, álbumes y canciones.

Un artista tiene un nombre y un género musical. Un álbum tiene un título, un artista, un año de lanzamiento y una lista de canciones. Una canción tiene un título, un artista, un álbum y una duración. Para representar los elementos en común que tienen "Album" y "Cancion" se utilizó la clase abtracta "Multimedia". 

Un usuario puede registrarse en la plataforma con un nombre de usuario y una contraseña. Una vez registrado, el usuario puede buscar artistas, álbumes y canciones. Además, el usuario puede crear listas de reproducción y agregar canciones a ellas.

El programa permite realizar las siguientes operaciones:

- Registrar un nuevo usuario.
- Iniciar sesión con un usuario existente.
- Buscar artistas, álbumes y canciones.
- Crear un nuevo artista, álbum o canción.
- Agregar canciones a un álbum.
- Crear una nueva lista de reproducción.
- Agregar canciones a una lista de reproducción.
- Ver todas las listas de reproducción de un usuario.
- Ver el contenido de una lista de reproducción.
- Reproducir una lista de reproducción.
 
Además, el programa cumple con las siguientes características:

- No puede haber dos artistas con el mismo nombre.
- No puede haber dos álbumes con el mismo título y el mismo artista.
- No puede haber dos canciones con el mismo título, artista y álbum.
- Una lista de reproducción no puede contener dos veces la misma canción.
- Una lista de reproducción debe tener al menos una canción para poder ser reproducida.
