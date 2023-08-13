# Bucle Do While.
 
 Un bucle "do-while" en Java es una estructura de control que permite repetir un bloque de código al menos una vez, y luego continuar repitiéndolo mientras se cumpla una determinada condición.

 ### Sintaxis.
 ~~~
 do {
    // Código a ejecutar.
 } while (condición);
 ~~~

 ## Funcionamiento.

 1. Se ejecuta el bloque de código por primera vez sin verificar la condición. 
2. Después de ejecutar el bloque de código, se evalúa la condición. 
3. Si la condición es verdadera, el bucle se repetirá y se ejecutará nuevamente el bloque de código. 
4. Si la condición es falsa, el bucle se terminará y la ejecución continuará con el código que sigue después del bucle. 
 
La principal diferencia entre un bucle "do-while" y un bucle "while" es que el bucle "do-while" garantiza que el bloque de código se ejecute al menos una vez, incluso si la condición es falsa desde el principio. 
 
Es importante tener en cuenta que dentro del bloque de código del bucle "do-while", se deben realizar cambios o actualizaciones en las variables o condiciones que afectan la condición del bucle. De lo contrario, podrías caer en un bucle infinito si la condición nunca se vuelve falsa.