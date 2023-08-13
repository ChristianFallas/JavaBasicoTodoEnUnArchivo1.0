# Sentencias Switch.

La sentencia "switch" en Java es una estructura de control que se utiliza para evaluar una expresión y ejecutar diferentes bloques de código según el valor de esa expresión. Permite tomar decisiones basadas en múltiples casos posibles en lugar de usar múltiples declaraciones "if-else" anidadas. 

En el ejemplo de código se evalúa los días de la semana, cada caso representa un dia. Si un caso coincide con el de la variable a evaluar entonces se ejecuta el bloque de código correspondiente si no se pasara a los siguientes casos. Y si acaso no se encuentra ninguna coincidencia entonces pasara a la ejecución el código del bloque `default`.

## Y cuando usar Switch?

La sentencia "switch" se utiliza generalmente cuando se tienen múltiples casos posibles y se desea tomar una acción diferente para cada caso. En cambio, la sentencia "if-else if" se utiliza cuando se tienen condiciones más complejas y se desea evaluar múltiples condiciones en orden. 
 
Aquí hay algunas situaciones comunes en las que es más apropiado utilizar la sentencia "switch" en lugar de "if-else if": 
 
1. Evaluación de múltiples opciones discretas: Si tienes una variable o expresión que puede tener diferentes valores discretos y deseas ejecutar diferentes bloques de código para cada valor, la sentencia "switch" puede ser más legible y concisa que una serie de declaraciones "if-else if". 
 
2. Comparación de valores constantes: Si estás comparando una variable o expresión con valores constantes conocidos, la sentencia "switch" puede ser más eficiente que una serie de declaraciones "if-else if". Esto se debe a que la sentencia "switch" utiliza una tabla de búsqueda interna para buscar el caso correspondiente, mientras que "if-else if" evalúa cada condición secuencialmente. 
 
3. Mejor legibilidad del código: En algunos casos, el uso de la sentencia "switch" puede hacer que el código sea más legible y fácil de entender, especialmente cuando se tienen muchos casos posibles. 
 
Sin embargo, es importante tener en cuenta que la elección entre "switch" y "if-else if" depende del contexto y de la complejidad de las condiciones que se deben evaluar. En algunos casos, la sentencia "if-else if" puede ser más adecuada si se tienen condiciones más complejas o si se necesita realizar comparaciones con rangos de valores. 
 
En resumen, utiliza la sentencia "switch" cuando tengas múltiples casos discretos y conocidos, y la sentencia "if-else if" cuando necesites evaluar condiciones más complejas o realizar comparaciones con rangos de valores.