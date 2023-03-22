# VARIABLES

# String
nombre = 'Luis'
# print(nombre)

# Integer
numero = 100
# print(numero)

# Float
decimal = 90.90
# print(decimal)

# Boolean
pagado = True

# Definiciones explícitas de variables y conversiones de tipos
num = int(20)
decimal = float(34.67)
nombre = str("Luis")

# print(numero, decimal, nombre)

# Imprimir el tipo de la variable
# print(type(numero))

# Declaración de variables en la misma línea
numero, nombre = 100, 'Pepe'

# Convención de nombres para la declaración de variables

# Snake case   ++
book_name = 'Mi libro'

# Camel case
bookName = 'Otro libro'

# Pascal case
BookName = 'Otro libro más'

# Constantes
PI = 3.1416

# Las variables son dinámicas
mi_libro = 'Libro uno'
mi_libro = 'Libro dos'

# print(mi_libro)

# Ver las funcionalidades asociadas a un determiniado tipo de dato
myString = 'Hola mundo'

# print(dir(myString))

# Métodos de la clase Sring ###########################################

# Convertir a mayúsculas
# print('Texto en mayúsculas ' + myString.upper())

# Convertir a minúsculas
# print('Texto en mayúsculas ' + myString.lower())

# Pasar la primera letra a mayúsculas
# print('Primera letra en mayúsculas ' + myString.capitalize())

# Reemplazar textos
# print('Texto reemplaxado ' + myString.replace('Hola', 'Hello'))

# Contar cuantas veces se repite un determinada caracter
myTexto = 'Este es mi texto'
# print(myTexto.count('E'))
# print(myTexto.count('s'))
# print(myTexto.count(' '))

# Verificar si una palabra empieza por cierta cadena de caracteres
mi_palabra = 'Ana'
# print(mi_palabra.startswith('A'))
# print(mi_palabra.startswith('a'))

# Diviar una palabra por un caracter concreto
mi_palabra = 'Ana,Juan,Luis'
# print(mi_palabra.split(','))

# Buscar caracteres dentro de un String
# print(mi_palabra.find('A'))
# print(mi_palabra.find('n'))

# Imprimir el índice de una cadena de texto
print(mi_palabra[0])
print(mi_palabra[-1])















