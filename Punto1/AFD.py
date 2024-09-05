def afd(expresion):
    estado = 0  # Estado inicial
    
    for i, char in enumerate(expresion):
        if estado == 0:
            if char == '+':
                estado = 1  # Vamos al estado 1 si encontramos un '+'
            elif char.isdigit():
                estado = 3  # Vamos al estado 3 si es un dígito
            else:
                return 'Expresión no válida'
        
        elif estado == 1:
            if char == '+':
                estado = 2  # Si encontramos un segundo '+', vamos al estado 2
            else:
                return 'Expresión no válida'
        
        elif estado == 2:
            if char == '+':
            	return 'Expresion no válida'  # Estado final para incremento ('++')
        
        elif estado == 3:
            if char.isdigit():
                continue  # Permanece en el estado 3 si son dígitos adicionales
            elif char == '.':
                estado = 4  # Transición al estado 4 si encontramos un '.'
            else:
                return 'Expresión no válida'
        
        elif estado == 4:
            if char.isdigit():
                estado = 5  # Vamos al estado 5 si encontramos un dígito después del '.'
            else:
                return 'Expresión no válida'
        
        elif estado == 5:
            if char.isdigit():
                continue  # Permanece en el estado 5 si hay más dígitos
            else:
                return 'Expresión no válida'

    # Verificamos en qué estado terminamos
    if estado == 1:
        return 'SUMA'  # Si terminó en el estado 1, es una suma ('+')
    elif estado == 2:
    	return 'INCREMENTO'
    elif estado == 3:
        return 'ENTERO'  # Si terminó en el estado 3, es un número entero
    elif estado == 5:
        return 'REAL'  # Si terminó en el estado 5, es un número real
    else:
        return 'Expresión no válida'

# Ejemplo de uso
if __name__ == "__main__":
    expresion = input("Ingrese una expresión: ")
    token = afd(expresion)
    print(f'Token: {token}')
