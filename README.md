# TPE-Prog2
1) Lista vinculada
Una lista vinculada ordenada es una estructura de datos formada por un conjunto de nodos,
cada uno de los cuales posee un objeto y una referencia al siguiente nodo de la estructura.
La particularidad que tiene este tipo de listas es que se encuentra siempre ordenada
(ascendente o descendente, según el criterio de orden con el que la lista fue creada) con
respecto a los elementos que contiene. Ejemplos:
Implementar en Java las clases necesarias para diseñar esta estructura de datos, teniendo
en cuenta que el valor de cada nodo puede ser cualquier tipo de objeto. NO pueden usarse
colecciones de Java existentes para la implementación (ArrayList, Vector, arreglos clásicos
[], etc ). La lista vinculada debe proveer al menos a los siguientes servicios:
a) Insertar un nuevo elemento en la estructura.
b) Eliminar un elemento de la estructura dado una posición.
c) Eliminar todas las ocurrencias de un elemento de la estructura dado el elemento.
d) Obtener la posición de la primera ocurrencia de un elemento dado.
e) Un mecanismo que permita recorrer uno a uno los elementos de la lista.
f) Permitir cambiar la forma en la que se ordenan los elementos (con el subsecuente
reordenamiento de los elementos ya almacenados.
2) Uso de la estructura
Como este año la cursada de Programación 2 tuvo récord de alumnos, los profesores
desean utilizar la estructura de datos implementada en el ejercicio 1 para mantener
ordenados a los alumnos de acuerdo a diferentes criterios. Cada alumno posee nombre,
apellido, DNI, edad, y una lista de palabras que representan sus intereses. Considerar la
posibilidad de utilizar órdenes compuestos (por ejemplo, ordenar por apellido, y si hay dos
alumnos con el mismo apellido, ordenarlos por nombre, y si ambos coinciden por dni)
Implementar en Java la clase Alumno, con todas las características necesarias para poder
agregar a los mismos a una lista vinculada.
3) La estructura es todo un éxito!
Dado el éxito de la estructura de datos en los alumnos de
Programación 2, la Universidad quiere adoptar la misma
para usarla para almacenar diversos grupos y subgrupos
de alumnos. La Universidad está organizada en diferentes
facultades. Cada facultad tiene diversas carreras, y cada
carrera posee un conjunto de materias. Las materias, a su
vez, organizan a sus alumnos en comisiones. Los grupos
de alumnos que desea almacenar la Universidad en la
lista vinculada ordenada pueden representar cualquiera de
las unidades antes mencionadas (facultades, carreras, materias, o incluso grupos de
alumnos formados para un fin particular, como por ejemplo un equipo de fútbol participante
Tecnicatura en Desarrollo de Aplicaciones Informáticas (TUDAI)
Trabajo Práctico Especial 2022
de las olimpiadas). Notar que también puede haber alumnos “sueltos”, es decir, que estén
inscriptos en una carrera, pero que no se hayan matriculado en ninguna materia, o que
pertenezcan a una facultad, pero no a una carrera particular (estudiantes de intercambio).
Implementar en Java las clases necesarias para manejar estos grupos de alumnos y
permitir agregarlos a la estructura definida en el ejercicio 1 siguiendo, por ejemplo, el orden
dado por la cantidad total de alumnos pertenecientes a los grupos que se inserten en la
misma (ascendente).
4) Pongámoslo a prueba
Implementar un método main en el qué:
a) Se cree la lista de números mostrada en la figura del punto 2, con los valores
insertados en el siguiente orden: 10, 21, 1, 5, 11
b) Se recorra la lista creada (utilizando un foreach) y se impriman los valores por
consola
c) Se elimine el primer elemento de la lista (por posición), luego el elemento “5” y luego
el elemento “11” (dado el elemento). Volver a recorrer e imprimir la lista resultante.
d) Se cree la lista de strings mostrada en la figura 2 del punto 1, con los valores
insertados en el siguiente orden: “Fácil”, “Es”, “Parcial”, “Prog 2”.
e) Se recorra la lista creada y se impriman los valores por consola
f) Imprimir por consola en qué posición se encuentra la palabra “Parcial”.
g) Imprimir por consola en qué posición se encuentra la palabra “Recuperatorio”
h) Se cambie el orden de la lista de strings para que los elementos queden ordenados
descendentemente.
i) Implementar las siguientes dos estructuras e insértelas en una lista vinculada
ordenadas por cantidad total de alumnos (de mayor a menor)
