<h1 align="center">
  <br>
  <a href="http://www.amitmerchant.com/electron-markdownify"><img src="https://f.hubspotusercontent20.net/hubfs/2829524/Copia%20de%20LOGOTIPO_original-2.png"></a>
  <br>
  qa-mobile-appium-screenplaybdd-interaccions-hybrid-apps
  <br>
</h1>

<h4 align="center">Proyecto base de <a href="https://github.com/karatelabs/karate" target="_blank">Pragma</a>.</h4>


<p align="center">
  <a href="https://www.oracle.com/java/technologies/javase-downloads.html">
    <img src="https://img.shields.io/badge/Java-11_or_later-orange.svg" alt="Java 11 o posterior">
  </a>
  <a href="https://gradle.org/">
    <img src="https://img.shields.io/badge/Gradle-Build_Tool-green.svg" alt="Gradle">
  </a>
  <a href="https://cucumber.io/">
    <img src="https://img.shields.io/badge/Cucumber-BDD-green.svg" alt="Cucumber">
  </a>
  <a href="https://serenity-bdd.info/">
    <img src="https://img.shields.io/badge/Serenity-BDD-blueviolet.svg" alt="Serenity BDD">
  </a>
  <a href="https://appium.io/">
    <img src="https://img.shields.io/badge/Appium-EE376D?logo=appium&logoColor=fff&style=flat" alt="Appium 2">
  </a>
  <a href="https://serenity-js.org/handbook/design/screenplay-pattern/">
    <img src="https://img.shields.io/badge/Screenplay-Pattern-yellow.svg" alt="Screenplay">
  </a>
  <a href="https://appium.github.io/appium.io/docs/en/commands/interactions/actions/">
    <img src="https://img.shields.io/badge/Mobile_Testing-W3C_Actions-lightgrey.svg" alt="Mobile Testing W3C actions">
  </a>
</p>

Proyecto de automatizacion mobiles con screenplay y appium de app desarrollada con flutter. Adiccionalmente se integran algunas interacciones (Scroll, Drag, entre otras) personalizadas creadas con W3C actions (Anteriormente realizadas con Touch Actions ya deprecado)

<p align="center">
  <a href="#topicos">Topicos</a> •
  <a href="#tecnologias">Tecnologias</a> •
  <a href="#consideraciones">Consideraciones</a> •
  <a href="#descarga">Descarga</a> •
  <a href="#instalación-y-ejecución">Instalación y ejecución</a> •
  <a href="#autores">Autores</a> •
  <a href="#relacionados">Relacionados</a> •
  <a href="#roadmap">Roadmap</a>
</p>


## Topicos

* Java 11 o posterior
* Gradle
* Cucumber
* Serenity BDD
* Appium 2
* Screenplay
* Mobile Testing
* W3C actions

## Tecnologias
### This project required:
* [Gradle]: version 7.4 
* [JDk]: version 11
* [Android SDK]: lastVersion
* [Serenity]: version 3.9.1
* [Appium_java_client]: version 8.3.0
* [Appium]: version 2.0.1
  
## Consideraciones
* Para que el proyecto funcione debe preparar el entorno de ejecución, lo cual incluye tener instalados y en las variables de entorno de la maquina el SDK de JAVA, el SDK de Android, Appium

## Descarga
Para clonar está aplicación desde la linea de comando:

```bash
git clone https://github.com/somospragma/qa-mobile-appium-screenplaybdd-interaccions-hybrid-apps.git
cd qa-mobile-appium-screenplaybdd-interaccions-hybrid-apps
git remote remove origin
git remote add origin URL_DE_TU_NUEVO_REPOSITORIO
git push -u origin master
```
Nota: Asegúrate de reemplazar URL_DE_TU_NUEVO_REPOSITORIO con la URL del repositorio que creaste en tu cuenta de GitHub.

Puedes descargar el proyecto en el enlace [download](https://github.com/somospragma/qa-mobile-appium-screenplaybdd-interaccions-hybrid-apps/archive/refs/heads/main.zip)

## 🛠️ Instalación

* Clone el repositorio
* Instale las dependencias con `gradle clean build`


##   Run tests :

```
gradle clean test
gradle clean test --info --stacktrace --tests "ruta.nameRunner" 
gradle clean test -Dcucumber.options="--tags @someTag" 
gradle clean test -Dcucumber.options="--tags '@someTag or @someTag'" 
```

Nota:

*   Si ejecuta en la consola de gradle no debe usar comillas simples '...' para encerrar '-Dvariable=valor'
*   Si ejecuta en la consola estándar de la máquina quizás si deba utilizar '...' en las porciones del comando que incluyan puntos
*   Con "./gradlew test ..." ejecuta el gradle compilado del proyecto
*   Con "gradle test ..." ejecuta el gradle de su maquina, el configurado en las variables de entorno de su sistema operativo



#### Notes:
* Reemplace las capabilities necesarias en el archivo de configuración ubicado en src/test/resources/serenity.conf
  

## Reports
* Puede visualizar los reportes de Serenity de la prueba en la ruta Target en el directorio raiz despues de ejecutadas las pruebas
  
  
## Autores

| [<img src="https://gitlab.com/uploads/-/system/user/avatar/13437423/avatar.png?width=400" width=115><br><sub>Mauro L. Ibarra P.</sub>](https://gitlab.com/mauro.ibarrap) <br/> |
:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|


## Relacionados

- [proyecto-base-serenity-bdd-screenplay-browsers-and-utilities](https://github.com/somospragma/qa-web-proyecto-base-serenity-bdd-screenplay-browsers-and-utilities)
- [qa-mobile-proyectobase-appium-screenplay](https://github.com/somospragma/qa-mobile-proyectobase-appium-screenplay)
