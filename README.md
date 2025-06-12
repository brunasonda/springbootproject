<h1>✍ TextMachine</h1>

<h2> Una máquina sencilla y flexible para generar frases inspiradoras, de humor o Lorem Ipsum, creada con Java 21 y Spring Boot. </h2>


<h3>📄 Descripción</h3>

TextMachine es una API REST que permite gestionar frases (buscar, crear, leer, actualizar y eliminar) usando el framework Spring Boot. Esta aplicación está orientada a la práctica del patrón de arquitectura MVC en un entorno backend moderno.

Puedes utilizar la API para generar frases motivadoras (como las de David Lynch), frases cómicas o fragmentos de texto genérico (Lorem Ipsum).

<h3>🌟 Características principales </h3>

- Listar todas las frases

- Agregar nuevas frases con autor

- Editar frases existentes

- Eliminar frases por ID

- Consultar una frase específica por ID

<h3>🚀 Tecnologías utilizadas</h3>

- Java 21
- Spring Boot
- MySQL
- JPA/Hibernate
- Postman (para pruebas)

<h3>📆 Arquitectura</h3>

El proyecto sigue una arquitectura en 3 capas:
Controller: Define los endpoints REST.
Service: Contiene la lógica de negocio.
Repository: Interfaz para acceder a la base de datos usando JPA.

<h3>📁 Instalación</h3>

1. Clonar el repositorio
git clone https://github.com/tuusuario/textmachine.git

2. Abrir en IntelliJ o IDE compatible.

3. Configurar la base de datos MySQL (ver archivo application.properties). 
4. Ejecutar la aplicación

<h3>💡 Ejemplo de frases (David Lynch)</h3>

{
"author": "David Lynch",
"phrase": "El cine es un lenguaje que puede expresar cosas grandes, abstractas; es un medio mágico."
}

{
"author": "David Lynch",
"phrase": "No luches contra la oscuridad. Enciende la luz de la conciencia pura."
}

<h3>📊 Endpoints disponibles</h3>

GET /list: Listar todas las frases

POST /add: Añadir nueva frase

PUT /update/{id}: Editar una frase existente

DELETE /delete/{id}: Eliminar una frase por ID

GET /find/{id}: Obtener una frase por ID

<h3>📧 Contacto</h3>

Creado por Bruna Sonda como parte de un ejercicio de aprendizaje en backend. Puedes contribuir con mejoras o nuevas categorías de frases. 

<h3>"Las ideas te dicen todo. Te enamoras de una idea, y ella te habla." — David Lynch</h3>