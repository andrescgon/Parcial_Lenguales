
markdown
Copy code
# Parcial 1. Grupo B 2024-1 - Lenguajes de Programación

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

```bash
SUMA
```
2. Gramática regular en LEX para expresiones lambda en Python
Descripción
Se implementa una gramática regular en LEX que reconoce expresiones lambda en Python, como:

python
```bash
square = lambda x: x ** 2
print(square(3))
```
El programa recibe un archivo de texto como parámetro y verifica si la expresión es válida.

Ejecución
Asegúrate de tener flex instalado.
Compila el programa:
```bash

flex lambda.l
gcc lex.yy.c -o a.out
```
Ejecuta el programa con un archivo de texto como entrada:
