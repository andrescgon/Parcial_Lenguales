Andres Castro Gonzalez

# Parcial 1. Lenguajes de Programación

Este repositorio contiene las soluciones para el parcial de la asignatura **Lenguajes de Programación**. A continuación, se describen los pasos para ejecutar cada uno de los programas requeridos.

## 1. AFD en Python para expresiones regulares

### Descripción
Este programa implementa un Autómata Finito Determinista (AFD) para aceptar y reconocer las siguientes expresiones regulares:

- `+`
- `++`
- `[0-9]+`
- `([0-9]+) "." ([0-9])+`

El programa debe recibir como parámetro una expresión regular y devolver el token correspondiente. Por ejemplo:

- `+` → SUMA
- `++` → INCREMENTO
- `123` → ENTERO
- `12.34` → FLOTANTE

### Ejecución
Para ejecutar el programa, sigue estos pasos:

1. Asegúrate de tener Python instalado.
2. Ejecuta el archivo `AFD.py` desde la consola, pasando la expresión regular como parámetro:

```bash
python AFD.py +
```
El programa imprimirá el token correspondiente:
```
bash
Copy code
SUMA```
2. Gramática regular en LEX para expresiones lambda en Python
Descripción
Se implementa una gramática regular en LEX que reconoce expresiones lambda en Python, como:

python
Copy code
square = lambda x: x ** 2
print(square(3))
El programa recibe un archivo de texto como parámetro y verifica si la expresión es válida.

Ejecución
Asegúrate de tener flex instalado.
Compila el programa:
bash
Copy code
flex lambda.l
gcc lex.yy.c -o a.out
Ejecuta el programa con un archivo de texto como entrada:
bash
Copy code
./a.out archivo.txt
El programa devolverá:

ACEPTA si la expresión es válida.
NO ACEPTA si no lo es.
3. Programa en C para contar palabras clave en un archivo de texto
Descripción
Este programa en C recibe dos parámetros: un archivo de texto y una palabra clave. Cuenta cuántas veces aparece la palabra clave en el archivo.

Ejecución
Compila el programa:
bash
Copy code
gcc miprograma.c -o miprograma
Ejecuta el programa con los parámetros correspondientes:
bash
Copy code
./miprograma archivo.txt palabra_clave
El programa imprimirá cuántas veces aparece la palabra clave en el archivo:

bash
Copy code
arroz se repite 10 veces en el texto.
4. Programa en AWK para identificar números primos
Descripción
Este programa en AWK analiza un archivo de texto que contiene 1000 números enteros aleatorios entre 1 y 1000 y muestra cuáles son primos.

Ejecución
Asegúrate de tener AWK instalado.
Ejecuta el programa pasándole el archivo de texto:
bash
Copy code
awk -f primos.awk numeros.txt
El programa imprimirá los números primos.

5. Programa en ANTLR para calcular funciones trigonométricas
Descripción
Este programa implementa un parser en ANTLR que calcula las funciones trigonométricas Sin(x), Cos(x), y Tan(x) a partir de expresiones en un archivo de texto. Los valores de las funciones deben calcularse en radianes.

Ejecución
Asegúrate de tener ANTLR instalado y configurado.
Ejecuta el programa con el archivo de expresiones como parámetro:
bash
Copy code
java org.antlr.v4.gui.TestRig MiGramatica expr -tokens expr.in
El programa imprimirá los resultados de las funciones trigonométricas.

Ejemplo de salida
Para el archivo expr.in con las siguientes expresiones:

scss
Copy code
Sin(90)
Cos(0)
Cos(180)
Sin(45)
El resultado será:

diff
Copy code
1
1
-1
0
Notas
Revisa los requisitos de instalación de cada lenguaje y herramienta antes de ejecutar los programas.
Asegúrate de tener configuradas correctamente las variables de entorno para flex y ANTLR.
Copy code

Este README proporciona instrucciones claras para ejecutar cada uno de los programas requeridos en el p
