# Funciones

### Que es una función?
Una función es una pieza de código que calcula o trabaja con unos datos independiente del resto 
del código.

### Para que nos sirve una función?

La principal función de una función, valga la redundancia, es el 
evitarnos repetir código. Si tienes una sección de tú código que 
vas a reutilizar después en el programa, la puedes convertir en 
una función, oh si, tienes que realizar la misma tarea varias 
veces, puedes programarla como una función y reutilizarla las 
veces que desee solo con invocar la función.

Además de ayudar en la corrección de errores, ya que si tienes un error en una función lo arreglas en esa función, y con eso se soluciona todos los errores en el programa, relacionados a esa función en cuestión. Y te evitas así reescribir el código en múltiples secciones del programa.

### Como esta formada una función?

Una función tiene un prototipo que consta de tres factores, El Nombre de la función o identificador, que valores (tipo de dato) va a aceptar la función, y que valores nos va a retornar esta función. Pero las funciones no tienen por qué devolver un dato. Ahí funciones que no devuelven nada. Para este tipo de funciones debemos declararlas con el valor void o vacío.


### ¿Cundo usar una función que devuelve datos? y ¿ Cuándo usar una que no devuelve nada?

Usamos una función que devuelve datos cuando necesitamos usar o manipular ese dato a posteriori. Ese caso usamos una función que devuelve datos y los guardamos en memoria(variable).
Cuando el resultado de nuestra función no va a ser relevante mas a delante en nuestro programa usamos una función void, una función que no devuelve nada.

## Funciones y sus parámetros.

Los datos que pasamos por parámetro a una función solo existen dentro de dicha función. Dentro de la función los podremos manipular como queramos, pero no fuera. Ya que fuera de las llaves que delimitan a la función esos datos o variables, no existen.

Si deseamos utilizar esos datos fuera de la función debemos usar un return, para que esa función nos devuelva el dato que deseamos, para guardarlo en una variable.
Una función puede recibir todo tipo de datos por parámetro y de diferente tipo. Ejemplo podemos indicar a la función que le vamos a pasar un parámetro de tipo int, y otro de tipo string y no hay problema.

Y también puede que no reciba parámetros. Así que tenemos métodos o funciones que reciben parámetros y otras que no los reciben o no los requieren para su funcionamiento.

Otro dato importante a comentar sobre los parámetros de una función y su interacción dentro de un programa, es que los datos que pasamos por parámetro a una función como solo existen dentro de dicha función. Esto quiere decir que se puede usar el nombre de una variable ya existente en nuestro programa, y no van a solaparse entre si, ya que se encuentran en ámbitos distintos. Así que podemos reutilizar el nombre de una variable que es un parámetro de una función, sin tener ningún inconveniente, pero no es lo más recomendado. La buena práctica dice que los nombres de variable no deben repetirse.

##### Nota:
 Las funciones deben ser lo más cortas posibles y sobre todo necesarias.

## Formas de pasar parámetros a una función.

Existen dos formas de pasar parámetros a una función. Una es pasar un parámetros por valor, y también podemos pasar parámetro por referencia. Esta última forma es menos evidente ya que la mayoría de los lenguajes de programación, esconden que pasa por debajo cuando pasamos parámetros por referencia para hacerlos más fáciles de usar.

### Paso de parámetro por valor:

Como es un paso por valor. Bueno cuando pasamos un parámetro por valor, lo hacemos cuando pasamos valores a la función cuando la invocamos. Ejemplo:

`num1 = 10;`

`num2 = 30;`

`suma(num1,num2);`

Estos son dos ejemplos de invocar y pasar parámetros ambas son pasos de parámetros por valor y no por referencia.

~~~ suma(num1,num2)
suma(10,30);
public static int suma(int a, int b) {
return = a + b;
} 
~~~

En este ejemplo, creamos una función suma, que va a recibir dos parámetros de tipo `int`. Luego invocamos la función y le pasamos los parámetros `10 y 30`. Al hacer esto, el valor `int a` es sustituido por el valor 10, y el valor `int b`, por el 30. Pero con la particularidad que lo que realmente hacemos es pasar una copia del dato y su tipo, y al ser una copia **estamos duplicando el uso de memoria**. Ya que al pasar le los parámetros a la función, `int a` y `int b` al crearla, le estamos diciendo al programa que reserve los 4 bytes de memoria que pesa el dato `int a` y los 4 bytes de `int b`. Y al invocarla y pasar los parámetros `10 y 30`, que son de tipo `int` y pesan 4 bytes cada uno. Al final usamos 8 bytes en la función y 8 bytes en la invocación de la función, en total usamos 16 bytes de memoria.


### Paso de parámetro por referencia:

Bueno cuando pasamos un parámetro por referencia, lo que hacemos es, que a la función en lugar de pasar le un valor como parámetro lo que le pasamos es una **dirección de memoria y no una copia.** Y le estamos diciendo a la función, ten esta dirección de memoria y modifica su contenido. No le estamos dando una copia de los valores de la dirección de memoria, sino que la función esta interactuando directamente con dichos valores y mortificándolos.

Ejemplo en Java:

Para ver esto mejor en java ahi que crear una instancia, el como se crear una instancia no es importante lo importante es ilustrar el paso de parámetros a una función por referencia.
~~~
public class Main {

    public static void main(Strinng[] args) {

    Potato miPotato = new Potato();
    miPotato.QuitarBrazos();
    miPotato.QuitarBrazos();
    miPotato.QuitarBrazos();

    System.out.println(miPotato.brazos);
    }
}
//Creamos la clase Potato

class Potato {

    public int brazos = 0;

    public void QuitarBrazo () {
    this .brazos --;
    }
}
~~~
Aquí creamos un objeto llamado Potato. Que tiene unas propiedades (el número de brazos)
Y tiene una función que se llama QuitarBrazos, y esta función lo que hace es manipular la cantidad de brazos de mi objeto Potato. Si por ejemplo yo invoco la función quitar brazos tres veces como en el ejemplo, vamos a ver que obtendremos un numero que es negativo. Ya que cada vez que invocamos la función QuitarBrazos restamos un brazo y como el número de brazos es 0, esto nos dará como resultado -3. Y todo esto sin que yo le pase ningún valor a la función. Y por que sucede esto por que en Java los objetos funcionan por debajo con punteros, y que son los punteros, bueno muy simple, los punteros son referencias a una posición en memoria.

##### Nota:
Los pasos de parámetros por referencia tienen una ventaja sobre los pasos por valor, en términos de optimización. Ya que cuando le pasamos a una función un parámetro por valor duplicamos el uso en memoria, en el paso por referencia no, ya que es el mismo espacio en memoria el que se va a modificar y no se crea una copia.
Luego tenemos dos tipos de funciones que se deben mencionar, las funciones recursivas y los talbacks.

### Que es una función recursiva?

Es una función que devuelve un valor y se llama así misma.

Ejemplo:

~~~
public static int suma(int a, int b) {
    int resultado = a + b;
    System.out.println(resultado);
    return suma (a, b);
}
~~~
Esto es una función recursiva, a demás es un bucle infinito, donde se llama a la función suma y se imprime un resultado y se vuelve a llamar asi misma una y otra vez, pero como ejemplo esta genial.

### Y que es un Talback?

Es asignarle a una función a una variable.

ejemplo:
~~~
variable = función ();

// para invocar la función
variable ();
~~~

###### Nota:
 Los Talbacks en Java no existen como tal se pueden seudo implementar, pero ya estaríamos dentrando al terreno de las interfases, y eso lo veremos más adelante.


## Sobre carga de funciones.

La sobrecarga de funciones es un concepto en programación que permite definir múltiples funciones con el mismo nombre pero con diferentes parámetros. Esto significa que puedes tener varias funciones con el mismo nombre pero que aceptan diferentes tipos de argumentos o un número diferente de argumentos. 
 
La sobrecarga de funciones te permite utilizar un nombre de función intuitivo y descriptivo para diferentes variantes de una operación o acción similar. Al llamar a la función, el compilador o intérprete determinará automáticamente cuál de las funciones sobrecargadas debe ejecutarse en función de los argumentos proporcionados. 
 
Por ejemplo, puedes tener una función llamada "suma" que acepta dos enteros como argumentos y devuelve la suma de esos números. Luego, puedes sobrecargar la función "suma" para que también acepte dos números decimales y devuelva la suma de esos números. 
 
La sobrecarga de funciones es una forma eficiente de escribir código más legible y reutilizable, ya que puedes utilizar el mismo nombre de función para realizar operaciones similares pero con diferentes tipos o cantidades de datos.