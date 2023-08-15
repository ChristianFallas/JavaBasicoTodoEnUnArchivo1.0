# Bucle While.

Un bucle "while" en Java es una estructura de control que permite repetir un bloque de código mientras se cumpla una determinada condición.

### Sintaxis.
~~~
while (condición) {
    /* Aquí el código que se desea se ejecute.
    * Aquí también es necesario actualizar la condición para que eventualmente
    * se vuelva falsa y se detenga la ejecución de while.
    */
}
~~~

## Funcionamiento.

1. Se evalúa la condición antes de ejecutar el bloque de código. Si la condición es falsa desde el principio, el bloque de código nunca se ejecutará. 
2. Si la condición es verdadera, se ejecuta el bloque de código. 
3. Después de ejecutar el bloque de código, se vuelve a evaluar la condición. 
4. Si la condición sigue siendo verdadera, se vuelve a ejecutar el bloque de código. Este proceso se repite hasta que la condición se vuelva falsa. 
5. Una vez que la condición se vuelve falsa, la ejecución continúa con el código que sigue después del bucle "while". 
 
Es importante tener cuidado al utilizar un bucle "while" para evitar caer en un bucle infinito si la condición nunca se vuelve falsa. Para evitar esto, es necesario asegurarse de que la condición se actualice o modifique dentro del bloque de código para que eventualmente se vuelva falsa. 

## Romper o alterar el flujo de ejecución de un ciclo while.

Si lo que deseamos es interrumpir la ejecución de un bucle while mientras se ejecuta, es necesario hacer uso de un `break`. Esto detendrá la ejecución del bucle.  
Pero si lo que deseamos es saltarnos una iteración por ejemplo si estamos haciendo un operación matemática y no queremos que se aplique en los números primos. Para este fin usamos `continue`.`continue` lo que nos permitirá es saltar a la siguiente iteración.