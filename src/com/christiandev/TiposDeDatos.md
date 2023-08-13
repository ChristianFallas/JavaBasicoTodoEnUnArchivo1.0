# Tipos de datos en Java

En Java, existen dos tipos de datos: datos primitivos y datos de referencia.  
 
Los datos primitivos son tipos de datos básicos que se utilizan para almacenar valores simples. Estos incluyen: 
 
- byte: un entero de 8 bits con signo 
- short: un entero de 16 bits con signo 
- int: un entero de 32 bits con signo 
- long: un entero de 64 bits con signo 
- float: un número de punto flotante de 32 bits 
- double: un número de punto flotante de 64 bits 
- boolean: un valor booleano verdadero/falso 
- char: un carácter Unicode de 16 bits 
 
Los datos de referencia son aquellos que se utilizan para almacenar referencias a objetos. Estos incluyen: 
 
- String: una cadena de caracteres 
- Arrays: una colección de elementos del mismo tipo 
- Clases: una referencia a una clase 
- Interfaces: una referencia a una interfaz 
- Enumeraciones: una referencia a una enumeración 
- Tipos genéricos: una referencia a un tipo genérico

## Tipos de datos y sus rangos de valores.


Aquí te muestro una tabla con los tipos de datos primitivos en Java y los valores que pueden almacenar:
 | Tipo de dato  | Tamaño en bits | Rango de valores |
| ------------- | -------------- | ---------------- |
| byte          | 8              | -128 a 127       |
| short         | 16             | -32,768 a 32,767 |
| int           | 32             | -2,147,483,648 a 2,147,483,647 |
| long          | 64             | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 |
| float         | 32             | 1.4E-45 a 3.4028235E38 |
| double        | 64             | 4.9E-324 a 1.7976931348623157E308 |
| boolean       | 1              | true o false     |
| char          | 16             | '\u0000' (0) a '\uffff' (65,535) |


Aquí una tabla con los tipos de datos de referencia o envoltorios.

| Tipo de dato | Descripción                                    | Rango de valores                       | 
|--------------|------------------------------------------------|----------------------------------------| 
| String       | Representa una secuencia de caracteres         | No hay un rango específico              | 
| Integer      | Representa un número entero                    | -2,147,483,648 a 2,147,483,647         | 
| Double       | Representa un número de punto flotante         | Aproximadamente ±1.7976931348623157 x 10^308 | 
| Boolean      | Representa un valor booleano (verdadero o falso) | verdadero o falso                      | 
| Array        | Representa una colección de elementos          | No hay un rango específico              | 
| Object       | Representa una instancia de una clase          | No hay un rango específico              | 
| Class        | Representa información sobre una clase         | No hay un rango específico              | 