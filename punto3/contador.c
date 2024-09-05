#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Función para contar ocurrencias de una palabra en un texto
int contar_ocurrencias(FILE *archivo, const char *palabra_clave) {
    char buffer[1024];
    int contador = 0;
    size_t longitud_palabra = strlen(palabra_clave);

    // Leer cada línea del archivo
    while (fgets(buffer, sizeof(buffer), archivo)) {
        char *pos = buffer;
        // Buscar palabra en la línea
        while ((pos = strstr(pos, palabra_clave)) != NULL) {
            contador++;
            pos += longitud_palabra; // Mover puntero para buscar la siguiente ocurrencia
        }
    }

    return contador;
}

int main(int argc, char *argv[]) {
    if (argc != 3) {
        fprintf(stderr, "Uso: %s <archivo> <palabra_clave>\n", argv[0]);
        return EXIT_FAILURE;
    }

    const char *nombre_archivo = argv[1];
    const char *palabra_clave = argv[2];
    
    FILE *archivo = fopen(nombre_archivo, "r");
    if (archivo == NULL) {
        perror("No se puede abrir el archivo");
        return EXIT_FAILURE;
    }

    int ocurrencias = contar_ocurrencias(archivo, palabra_clave);
    fclose(archivo);

    printf("%s se repite %d veces en el texto.\n", palabra_clave, ocurrencias);

    return EXIT_SUCCESS;
}
