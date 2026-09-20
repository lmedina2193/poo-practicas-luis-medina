# Guía de Git y GitHub de la semana 3

Autor: Luis Medina Quispe.
Modalidad: trabajo individual.

## Organización de ramas

- main: rama destinada a las entregas terminadas.
- develop: integra las funcionalidades de la semana.
- feature/luis-sobrecarga: sobrecarga de métodos y colecciones.
- feature/luis-errores: ejecución y manejo de errores.
- feature/luis-documentacion: guía e informe.

Los commits utilizan el formato tipo(alcance): descripción.

## Sobrecarga y colecciones

Curso incluye dos versiones de inscribir:
una recibe un estudiante y otra recibe un estudiante y una observación.
Se utiliza HashMap para guardar estudiantes por código y evitar duplicados.

## Uso de git stash

Se agregó un comentario en Curso.java.
git stash push guardó temporalmente el cambio.
Luego se cambió a develop y se regresó a feature/luis-sobrecarga.
git stash pop recuperó el comentario y git diff permitió comprobarlo.
Finalmente, el cambio se guardó mediante un commit.

## Manejo de errores

Principal.java utiliza try, catch y finally.
La ejecución inscribe dos estudiantes y controla una inscripción duplicada,
una nota fuera del rango permitido y un estudiante nulo.
Las pruebas terminaron correctamente.

## Integración realizada

La sobrecarga se fusionó inicialmente en main por error.
Después se incorporó también en develop mediante otro Pull Request.
El manejo de errores se integró correctamente en develop mediante el Pull Request 6.

Los aportes y las fusiones fueron realizados individualmente.
No se presenta la revisión propia como revisión de un compañero.

## Documentación del proyecto

El informe contiene las evidencias, el problema propuesto,
el diagrama de Ishikawa y los antecedentes con referencias.
Academia Horizonte es un caso ficticio; no se realizó una visita de campo.

## Estado actual

El código de sobrecarga y manejo de errores está integrado en develop.
La documentación está en preparación.
La integración final de develop en main está pendiente.