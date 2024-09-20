# Java-OCR
**Autor:** [@WilmerOcampo](https://github.com/WilmerOcampo)

## Descripción

**Java-OCR** es un proyecto en Java 21 con Maven que utiliza la biblioteca **Tess4J** para realizar reconocimiento óptico de caracteres (OCR) en imágenes. El objetivo principal del proyecto es extraer texto de imágenes utilizando el motor **Tesseract** y guardar el texto en archivos de texto.

El proyecto está configurado para trabajar con el motor **Tesseract** mediante el uso de archivos de datos entrenados (`traineddata`) específicos para los idiomas que se deseen procesar.

## Características

- Extracción de texto de imágenes utilizando la biblioteca **Tess4J**.
- Soporte para múltiples idiomas mediante el uso de archivos de datos entrenados (`tessdata`).
- Guardado del texto extraído en archivos de texto.

## Requisitos

- Java 21
- Maven
- Biblioteca **Tess4J**
- Archivos de datos entrenados de Tesseract (`tessdata`)

## Configuración del Proyecto

### 1. Crear el proyecto Java 21 con Maven

Utiliza Maven para gestionar las dependencias del proyecto.

### 2. Añadir la Biblioteca Tess4J

Se puede añadir la biblioteca **Tess4J** a tu proyecto a través de Maven. Para ello, agrega la siguiente dependencia en tu archivo `pom.xml`: [Tess4J Tesseract For Java](https://mvnrepository.com/artifact/net.sourceforge.tess4j/tess4j)

```xml
<dependency>
    <groupId>net.sourceforge.tess4j</groupId>
    <artifactId>tess4j</artifactId>
    <version>5.13.0</version>
</dependency>
```

### 3. Descargar `tessdata`

Descarga los archivos `traineddata` necesarios para los idiomas que deseas utilizar. Por ejemplo:

- **Inglés**: `eng.traineddata`
- **Español**: `spa.traineddata`

Puedes descargar estos archivos desde el repositorio oficial de Tesseract: [Tesseract tessdata](https://github.com/tesseract-ocr/tessdata)

Coloca los archivos descargados dentro de la carpeta `src/main/resources/tesseract/tessdata` de tu proyecto.

### 4. Otras opciones de instalación

Si prefieres, puedes instalar **Tesseract-OCR** en tu sistema operativo en lugar de utilizar los archivos `tessdata` localmente. Para más información, consulta los siguientes recursos:

- [Cómo extraer texto de imágenes usando Java OCR](https://javatechonline.com/how-to-extract-text-from-image-using-java-ocr/)
- [Wiki de Tesseract en GitHub](https://github.com/UB-Mannheim/tesseract/wiki)

## Uso del Proyecto

El proyecto implementa la primera opción, donde se descargan y colocan los archivos `traineddata` directamente en la carpeta del proyecto, sin necesidad de instalar **Tesseract-OCR** en el sistema operativo.

Puedes ejecutar el proyecto para extraer texto de una imagen especificada y guardar el resultado en un archivo de texto.
