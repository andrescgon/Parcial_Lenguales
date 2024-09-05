%{
#include <stdio.h>
#include <stdlib.h>
%}

%%

lambda               { /* Encuentra la palabra clave 'lambda' */ }
[ \t\n]+             { /* Ignora espacios en blanco */ }
x                    { /* Encuentra el parámetro 'x' */ }
\*\*                 { /* Encuentra el operador '**' */ }
[0-9]+               { /* Encuentra números enteros */ }
print                { /* Encuentra la palabra clave 'print' */ }
\(                   { /* Encuentra el paréntesis '(' */ }
\)                   { /* Encuentra el paréntesis ')' */ }
:=                   { /* Encuentra el operador ':=' */ }
.                    { /* Ignora otros caracteres */ }

%%

int main(int argc, char **argv) {
    if (argc != 2) {
        fprintf(stderr, "Uso: %s archivo.txt\n", argv[0]);
        return 1;
    }

    FILE *file = fopen(argv[1], "r");
    if (!file) {
        perror("Error al abrir el archivo");
        return 1;
    }

    yylex();
    fclose(file);

    printf("ACEPTA\n"); // Asumimos que acepta si no hay errores
    return 0;
}

void yyerror(char *s) {
    fprintf(stderr, "Error: %s\n", s);
    printf("NO ACEPTA\n");
    exit(1);
}

