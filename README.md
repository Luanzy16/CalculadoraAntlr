# Calculadora con ANTLR4 y Java

### Integrentes

- Luis Sánchez
- Santiago Ospina 
- David Bermudez



Este proyecto implementa una calculadora que evalúa expresiones matemáticas utilizando **ANTLR4** y **Java**. Se basa en la gramática `calculadora.g4`, que define las reglas de expresión aritmética.

## **Requerimientos**

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java 8 o superior** ([Descargar](https://www.oracle.com/java/technologies/javase-downloads.html))
- **ANTLR4** ([Instrucciones de instalación](https://www.antlr.org/download.html))

Para verificar la instalación de Java y ANTLR4, ejecuta:
```sh
java -version
antlr4 -version
```

## **Configurar ANTLR**

Asegúrate de que el archivo JAR de ANTLR esté en tu CLASSPATH. Puedes hacer esto añadiendo lo siguiente a tu archivo `.bashrc` o `.zshrc` (ajusta la ruta a donde hayas descargado ANTLR):

```sh
export CLASSPATH=".:/path/to/antlr-4.x-complete.jar"
alias antlr4='java -jar /path/to/antlr-4.x-complete.jar'
alias grun='java org.antlr.v4.runtime.misc.TestRig'
```

## **Generar Código a partir de la Gramática**

Ejecuta los siguientes comandos para generar los archivos necesarios:

```sh
antlr4 -visitor -Dlanguage=Java calculadora.g4
javac *.java
```

Estos comandos generarán clases como:
- `calculadoraLexer.java`
- `calculadoraParser.java`
- `calculadoraBaseVisitor.java`

## **Ejecutar la Calculadora**

Después de compilar, ejecuta:
```sh
java Main
```

El programa pedirá una expresión matemática. Ingresa una operación y obtendrás el resultado.

## **Ejemplos de Uso**

### **Entrada:**
```sh
Ingrese una expresión: 3 + 5 * (2 - 8)
```

### **Salida:**
```sh
Resultado: -13.0
```

### **Entrada:**
```sh
Ingrese una expresión: 10 / 2 + 3 * 4
```

### **Salida:**
```sh
Resultado: 17.0
```



## **Notas**
- Soporta operaciones básicas: `+`, `-`, `*`, `/`.
-Soporta operaciones con numeros decimales (importante que sea con ".")
- Respeta la jerarquía de operaciones (paréntesis, multiplicación y división antes que suma y resta).
- Ignora espacios en blanco en la entrada.


