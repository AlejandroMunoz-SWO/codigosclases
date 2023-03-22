# Tuplas ( listas inmutables, no la podemos modificar de manera dinámica)

# Se puede poner con o sin paréntesis
mi_tupla = ('Pepe',1,5)
# mi_tupla = 'Pepe',1,5

# Acceder a los elementos de la tupla
# print(mi_tupla[2])

# Eliminar la tupla
# del mi_tupla
# print(mi_tupla)

# Puedo recorrer la tupla con un bucle
# for i in mi_tupla:
#     print(i)

# Comprobar si un elemento pertenece a la tupla
# print('Pepe' in mi_tupla)
# print('Luis' in mi_tupla)

# Comprobar cuantas veces se repite un elemento dentro del  tupla
# print(mi_tupla.count(1))

# Comprobar la longitud de la tupla
# print(len(mi_tupla))

# Convertir una tupla en una lista
# mi_lista = list(mi_tupla)
# print(mi_lista)
# print(mi_tupla)

# Tener tuplas dentro de un diccionario
locations = {
    'Tokio':(23.6734343, 123.342342),
    'Nwe York': (45.8934343, 678.33434)
}

# print(locations.get('Tokio'))

# Desempaquetado de tuplas
cliente = ['Ana', 51, 'ana@es.es']
nombre, edad, email = cliente
print(nombre)












