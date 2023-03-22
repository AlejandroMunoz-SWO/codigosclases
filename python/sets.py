# Set ( colección desordenada de elementos únicos, sin índices )

colors = {'Rojo','Amarillo','Verde'}
# print(colors)

# Recorrer el set con un bucle
# for color in colors:
#     print(color)
    
# Ver si un elemento pertenece al set
# print('Verde' in colors)
# print('Azul' in colors)

# Agregar elementos al set
# colors.add('Gris')
# print(colors)

# Eliminar elementos del set
# colors.remove('Rojo')
# print(colors)

# Vaciar el set
# colors.clear()
# print(colors)

# Eliminar elementos del set
# del colors
# print(colors)

# Sets inmutables ( no podemos agregar, modifcar, eiminar elementos)
animales = frozenset('Vaca','Perror')
animales.add('Gato')
print(animales)