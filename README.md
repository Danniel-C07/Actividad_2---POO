# Ejercicios POO Java — 2.1 a 2.5

Soluciones independientes de los ejercicios 2.1–2.5 de *Ejercicios de programación orientada a objetos con Java y UML*. Se usa Java y cada ejercicio tiene sus propias clases y su propio `Main`.
### Daniel Libardo Cardenas Valbuena
## Contenido

- `Ejercicio_2_1_Persona`: atributos y constructor de Persona.
- `Ejercicio_2_2_Planeta`: tipos enumerados, densidad y planeta exterior.
- `Ejercicio_2_3_Automovil`: encapsulación, getters/setters y cambios de velocidad.
- `Ejercicio_2_4_Figuras`: áreas y perímetros de cuatro figuras.
- `Ejercicio_2_5_CuentaBancaria`: consulta, consignación y retiro.

## Abrir y ejecutar en IntelliJ IDEA

1. Descomprime el ZIP.
2. En IntelliJ IDEA, elige **File → Open** y abre la carpeta `Ejercicios_POO_Java`.
3. Si IntelliJ pregunta cómo tratar el proyecto, ábrelo como proyecto Java. Se recomienda un JDK 17 o posterior.
4. En la carpeta del ejercicio que quieras probar, abre `src/ejercicioXX/Main.java` y pulsa el triángulo verde junto a `main`.
5. Repite con el `Main.java` de cada carpeta para ejecutar otro ejercicio.

Cada clase está declarada en un paquete distinto (`ejercicio21`, `ejercicio22`, etc.), por lo que no chocan los nombres `Main` al abrir el conjunto. No se incluyen diagramas UML ni ejercicios propuestos adicionales, según las especificaciones confirmadas.

## Compilar todos los ejercicios desde Terminal (opcional)

Desde esta carpeta, puedes compilar las clases con:

```bash
find . -path '*/src/*.java' -o -path '*/src/*/*.java' -o -path '*/src/*/*/*.java'
```

En IntelliJ basta con ejecutar el `Main` de cada ejercicio; no es necesario compilar manualmente.
