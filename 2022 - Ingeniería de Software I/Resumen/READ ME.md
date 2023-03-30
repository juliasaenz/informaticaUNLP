# resumen/ Ingeniería de Software

# 1. Conceptos de Software

<aside>
🤖 El ******************software****************** refiere a instrucciones (programas de cómputo), procedimientos, reglas, documentación y datos asociados que forman parte de las operaciones de un sistema de computación

</aside>

---

## **1.1. Características del software**

- Es un elemento lógico
- Se desarrolla, no se fabrica
- No envejece ni se desgasta
- No sigue una curva de envejecimiento clásica

******Envejecimiento del Software****** 

![Untitled](Untitled.png)

## 1.2. Tipos de productos de software

Los productos **************************generalizados************************** son sistemas aislados producidos por organizaciones desarrolladoras de software que se venden a un mercado abierto

Los productos ****************************personalizados**************************** son sistemas requeridos por un cliente en particular, con necesidades específicas

---

Cada vez más los sistemas se construyen como productos personalizados que parten de un producto generalizado

## 1.3. Participantes en el desarrollo de software

1. **Clientes ejecutivos**: patrocinan el desarrollo del sistema
    1. Proporciona financiamiento a Desarrolladores
2. **Usuarios**: utilizan el sistema
    1. Tiene necesidades 
3. **Desarrolladores**: construyen el sistema
    1. Tiene obligaciones contractuales con Clientes
    2. Proporciona el sistema de software a Usuarios

## 1.4. Ingeniería de software

<aside>
🤖 La **********************************************ingeniería de software********************************************** es una disciplina de la ingeniería que comprende todos los aspectos de la producción de software, desde las etapas iniciales de la especificación del sistema incluyendo la evolución de este luego de que se comienza a ejecutar

</aside>

Que sea una disciplina de la ingeniería significa que se aplican teorías, métodos y herramientas para que las cosas funciones

Que incluya todos los aspectos de la producción de software significa que, además de los procesos técnicos de desarrollo de software, comprende actividades de gestión de proyectos y herramientas y la aplicación de técnicas y métodos de apoyo

******************************Características******************************

- Usa métodos sistemáticos cuantificables
    - La cuantificación rigurosa de recursos, procesos y productos es una precondición para optimizar productividad y calidad. La “metrificación” y el control estadístico de procesos son claves en Ingeniería de Software.
- Dentro de tiempos y costos estimádos
    - Un Ingeniero de Software debe cumplir contratos en tiempo y costos como es normal en obras de Ingeniería. Ello presupone la capacidad de medir, estimar, planificar y administrar proyectos
- Para el desarrollo, operación y mantenimiento
    - La Ingeniería de Software se ocupa de todo el ciclo de vida de un producto, desde su etapa inicial de planificación y análisis de requerimientos hasta la estrategia para determinar cuándo y cómo debe ser retirado de servicio

## 1.5. El ingeniero de software

¿Qué conocimientos debe tener?

- **********************************************Tecnologías y productos**********************************************
    - Sistemas operativos, lenguajes, bases de datos, sistemas generadores de interfaces, etc
- ******************************************************************************Técnicas de administración de proyectos******************************************************************************
    - Planificación, análisis de riesgo, control de calidad, seguimiento de proyectos, etc

********************************************************************Responsabilidad profecional y ética********************************************************************

La Ingeniería de Software se desarrolla en un marco económico, social y legal, por lo tanto, los IS deben aceptar responsabilidades más amplias que las responsabilidades técnicas. No debe utilizar su capacidad y habilidades de forma deshonesta, o de forma que deshonre la profesión

- ********************************Confidencialidad********************************: Respetar la confidencialidad de sus empleados y clientes
- **********************Competencia**********************: No falsificar el nivel de competencia y aceptar responsabilidades fuera de su capacidad
- ********************Derechos de propiedad intelectual********************: Conocer la leyes vigentes sobre las patentes y copyright
- ****Uso inapropiado de las computadoras:**** No debe utilizar sus habilidades técnicas para utilizar de forma inapropiada otras computadoras

# 2. Proceso de Software

<aside>
🤖 Un **************************************proceso de software************************************** es un conjunto de actividades y resultados asociados que definen un producto de software

</aside>

Las actividades fundamentales en el proceso de software son la especificación, el desarrollo, la validación y la evolución

<aside>
🤖 Un ******modelo de proceso de software****** es una representación simplificada de un proceso de software que presenta una visión de ese proceso. Puede incluir actividades, productos y roles involucrados

</aside>

Es un marco de referencia que contiene los procesos, actividades y tareas involucradas en el desarrollo, explotación y mantenimiento de un producto de software, abarcando la vida del sistema desde la definición de requisitos hasta la finalización de su uso

---

> Modelo de proceso = Paradigma de software = Ciclo de vida del software
> 

El **************************************************ciclo de vida del software************************************************** describe la vida del producto desde su concepción hasta su implementación, entrega, uso y mantenimiento

**************************************Características del modelo de proceso**************************************

- Establece todas las actividades
- Usa recursos, está sujeto a restricciones y genera productos intermedios y finales
- Puede estar compuesto por subprocesos
- Cada actividad tiene entradas y salidas definidas
- Las actividades se organizan en una secuencia
- Existen principios que orientan sobre las metas de cada actividad
- Las restricciones pueden aplicarse a una actividad, recurso o producto

## 2.1. Tipos de modelos - Según el nivel de información

### 2.1.1. Modelos prescriptivos

Prescriben un conjunto de elementos del proceso, se detallan todos los procesos

- Actividades del marco de trabajo
- Acciones de la ingeniería de software
- Tareas
- Aseguramiento de calidad
- Mecanismos de control

Cada modelo de proceso preescribe también un ********************************flujo de trabajo********************************, es decir, cómo se interrelacionan los elementos del proceso

### 2.1.2. Modelos descriptivos

Descipción de la forma en que se realizan en realidad. Es un lineamiento general

## 2.2. Tipos de modelos - Según la organización

### 2.2.1. Modelos tradicionales

Están formados por un conjunto de **************************************fases o actividades************************************** en las que no tienen en cuenta la naturaleza evolutiva del sofware. Los más conocidos son:

************************************************************Modelo clásico, líneal o en cascada************************************************************ 

![https://okhosting.com/wp-content/uploads/2015/12/ciclo-de-vida-en-cascada.png](https://okhosting.com/wp-content/uploads/2015/12/ciclo-de-vida-en-cascada.png)

Las etapas se presentan en forma de cascada y cada etapa de desarrollo se debe completar antes de que empiece la siguiente. Es simple de explicar a clientes y útil para diagramar lo que se tiene que hacer

Dificultades: No existen resultados concretos hasta que se termine todo el sistema, por lo que las fallas más graves se encuentran al final y necesita más pruebas en las últimas etapas. Tampoco se adapta fácilmente a cambios en el ambiente

**********************Modelo en V**********************

![Untitled](Untitled%201.png)

Demuestra cómo se relacionan las actividades de prueba con las de análisis y diseño. Sigiere que la prueba unitaria y de integración se use también para verificar el diseño

La vinculación entre los lados derecho e izquierdo hace que si se encuentran problemas durante la verificación y validación, se pueda volver a ejecutar el lado izquierdo para solucionar el problema

****************************************Modelo basado en prototipos****************************************

![Untitled](Untitled%202.png)

Un **********prototipo********** es un producto parcialmente desarrollado que permite a clientes y desarrolladores examinar aspectos del sistema y tomar decisiones al respecto. Es una alternativa a la especificación para tratar de reducir la incertidumbre, ambigüedad y volubilidad de los proyectos reales

Se pueden usar ******************************************prototipos evolutivos****************************************** (funcionales) o ************************descartables************************ (no funcionales, usados para modelar)

![Untitled](Untitled%203.png)

Para asegurar el éxito, debe ser un sistema con el que se pueda experimentar, barato, de desarrollo rápido, que haga énfasis en la interfaz del usuario y use las herramientas y lenguajes adecuados

### 2.2.2. Modelos evolutivos

Son modelos que se adaptan a la evolución que sufren los requisitos del sistema en función del tiempo. 

****************************************Desarrollo por fases****************************************

Se desarrolla el sistema de tal manera que pueda ser entregado en piezas. Esto implica que existen dos sistemas funcionando en paralelo: el **************************************sistema operacional************************************** y el ******************************************sistema en desarrollo******************************************

![Untitled](Untitled%204.png)

Hay varios tipos de modelos de desarrollo por fases:

**********************Incremental**********************

El sistema es particionado en subsistemas de acuerdo con su funcionalidad. Cada entrega agrega un subsistema

---

******************Iterativo******************

Entrega un sistema completo desde el principio y luego aumenta la funcionalidad de cada subsistema con las nuevas versiones

---

******************En espiral******************

Trata de mejorar los ciclos de vida clásicos y prototipos, incorpora objetivos de calidad, elimina errores y alternativas al comienzo, permite iteraciones y finalizaciones rápidas

Cada ciclo se completa con una revisión que incluye el ciclo anterior y el plan para el siguiente

![Untitled](Untitled%205.png)

**Basado en componentes** 

Esta técnica supone que las partes ya existen, el proceso se enfoca entonces en la integración de esas partes

![Untitled](Untitled%206.png)

### 2.2.3. Modelos intermedios

**************************************Desarrollo Basado en Modelos MBD**************************************

Un ************************************modelo del sistema************************************ consiste en una conceptualización del dominio del problema y actúa como una especificación precisa de los requerimientos que el sistema de software debe satisfacer (abstracción de elementos del problema, comunicación, negociación con el usuario)

![Untitled](Untitled%207.png)

**************************************Desarrollo Dirigido por Modelos MDD**************************************

El adjetivo ********dirigido******** enfatiza que el paradigma asigna a los modelos un rol central y activo: son al menos tan importantes como el código fuente

El **Model Driven Development** (MDD) enfatiza en:

- Mayor nivel de abstracción en la especificación del problema y la solución
- Aumento de confianza en la automatización asistida por computadora para el análisis, diseño y ejecución
- Uso de estándares industriales para facilitar comunicaciones, interacción entre aplicaciones y productos y especialización tecnológica
- Los modelos son los conductores primarios en todos los arpectos del desarrollo de software

---

Los **************modelos************** pasan a ser entidades contemplativas a entidades productivas a partir de las cuales se deriva la implementación en forma automática

![Untitled](Untitled%208.png)

---

**********************************************************************************************Ciclo de vida del software dirigido por modelos********************************************************************************************** 

![Untitled](Untitled%209.png)

---

**************************************************Pasos principales en el proceso de desarrollo MDD************************************************** 

![Untitled](Untitled%2010.png)

- ******PIM (Nivel 1)******: Un modelo de un sistema que no tiene información sobre la plataforma o tecnología a usar
- **************************PSM (Nivel 2)**************************: Un modelo de un sistema que incluye información acerca de la tecnología específica a usar
- **************************************************Transformación de modelos**************************************************: Especifica el proceso de conversión de un modelo a otro
Cada transformación incluye:
    - un PIM
    - un Modelo de la Plataforma
    - una Transformación
    - un PSM

---

********************************Transformaciones******************************** 

<aside>
🤖 Una ********transformación******** consiste en una colección de reglas específicas de las formas en que un modelo puede ser usado para crear otro modelo

</aside>

![Untitled](Untitled%2011.png)

---

****************************Ejemplo de una transformación****************************

![Untitled](Untitled%2012.png)

---

**********************************Beneficios de MDD********************************** 

- Incremento en la productividad
- Adaptación a los cambios tecnológicos
- Adaptación a los cambios de requisitos
- Consistencia (automatización)
- Re-uso de modelos y transformaciones
- Mejoras en la comunicación con los usuarios y entre desarrolladores
- Captura de la experiencia
- Los modelos son productos de larga duración
- Posibilidad de demorar decisiones tecnológicas

### 2.2.4. Procesos ágiles

********ver en [5. Metodologías Ágiles](https://www.notion.so/5-Metodolog-as-giles-203bd4dcd719429591d5596029c1678e)* 

## 2.3. Análisis Estructurado

Es un **************************modelo de procesos tradicional y completo************************** porque incluye una técnica de especificación específica

Para entender los requerimientos, hay que poder entender cómo se mueven los datos, procesos y transformaciones que sufren los datos y sus resultados. La **********************elicitación********************** proporciona una descripción verbal del sistema, pero una descripción visual ayuda a consolidar la información

<aside>
🤖 El ************************************análisis estructurado************************************ define una representación gráfica que permite lograr una comprensión más profunda del sistema a construir y comunicarlo a los usuarios

</aside>

Hace enfásis en la transformación de los datos a medida que pasan por distintos procesos y la notación no específica de aspectos físicos de implementación

### 2.3.1. Diagrama de flujo de datos (DFD)

El ****************************************************diagrama de flujo de datos**************************************************** es una herramienta que permite ver un sistema como una red de procesos funcionales, conectados entre si por conductos y almacenamiento de datos

También se llama “diagrama de burbújas”

- Uso común: sistemas operacionales con funciones complejas

********Componentes********

- ******************************Entidad externa [******************************rectángulo]: Un elemento del sistema (hardware, persona, otro programa) que produce o recibe información
- ******************************************************************Proceso o transformación de datos****************************************************************** [cículo o burbuja]
- **********************************Elemento de datos********************************** [flecha]
- ********************************Almacén de datos******************************** [rectángulo abierto]

![Ejemplo de DFD](Untitled%2013.png)

Ejemplo de DFD

************************************Desarrollo de DFDs************************************

Se debe ver desde una perspectiva jerárquica de arriba hacia abajo.

Pasos:

1. Redactar la ****************************************lista de actividades**************************************** de la organización para determinar entidades externas, flujos de datos, procesos y almacenes de datos
2. Crear un ****************************************diagrama de contexto**************************************** que muestre las entidades externas y los flujos de datos desde y hacia el sistema
3. Dibujar el ********************diagrama 0******************** (siguiente nivel) con procesos generales y almacenes correspondientes
4. Dibujar un **************************diagrama hijo************************** por cada uno de los procesos del diagrama 0

****************************************Diagrama en contexto****************************************

Muestra un panorama global con las entradas y salidas básicas, es el nivel más alto de un DFD y contiene un solo proceso que representa todo el sistema

![Untitled](Untitled%2014.png)

**************Nivel 0**************

Es la ampliación del diagrama de contexto, las entradas y salidas permanecen pero se amplía hasta incluir 9 procesos y mostrar almacenes de datos y nuevos flujos

![Untitled](Untitled%2015.png)

****************************************Nivelación de un DFD****************************************

Cada proceso se puede ampliar apra crear un diagrama hijo más detallado; permaneciendo las entradas y salidas del proceso padre pero pudiendo aparecer nuevos almacenes y flujos.

![Untitled](Untitled%2016.png)

# 3. Ingeniería de Requerimientos

Al iniciar un proyecto, la primera actividad es saber lo que el usuario quiere, cómo, cuándo y por qué. La ************************comunicación************************ es la base para la obtención de necesidades del cliente. En términos más técnicos, cuando hablamos de necesidades en realidad hablamos de ****************************requerimientos****************************

<aside>
🤖 La ********************************************************ingeniería de requerimientos******************************************************** es el proceso por el cual se transforman los requerimientos del cliente a especificaciones precisas, consistentes y completas del comportamiento del sistema

</aside>

También es el proceso mediante el cual se intercambian diferentes puntos de vista para recopilar y modelar lo que el sistema va a hacer. Este proceso usa una combinación de métodos, herramientas y actores cuyo producto es un modelo a partir del cual se crea un ******************************************************documento de requerimientos******************************************************

Es un enfoque sistemático para recolectar, organizar y documentar los requerimientos del sistema; es también el proceso que establece y mantiene acuerdos sobre los cambios de requerimientos entre los clientes y el equipo del proyecto

******************************************************************************************Importancia de la ingeniería de requerimientos******************************************************************************************

- Permite gestionar las necesidades del proyecto de forma estructurada
- Mejora la capacidad de predecir el cronograma del proyecto
- Disminuye costos y retrasos
- Mejora la calidad del software
- Mejora la comunicación entre equipos
- Evita rechazos de usuarios finales

## 3.1. Requerimientos

<aside>
🤖 Un requerimiento (o requisito) es una característica del sistema o una descripción de algo que el sistema es capaz de hacer con el objeto de satisfacer el propósito del sistema

</aside>

**********************************************Definición IEEE-Std-610**********************************************

- Condición o capacidad que necesita el usuario para resolver un problema o alcanzar un objetivo
- Condición o capacidad que debe satisfacer un sistema para satisfacer un contrato, estándar, especificación o documento formal
- Representación documentada de una condición o capacidad

******************Objetivos******************

- Permitir que los desarrolladores expliquen cómo han entendido lo que el cliente pretende del sistema
- Indicar a los diseñadores qué funcionalidades y características va a tener el sistema resultante
- Indicar al equipo de pruebas qué demostraciones llevar a cabo para convencer al cliente de que el sistema que se le entrega es acorde a lo pedido

************************************************************************************************Impacto de errores en la etapa de requerimientos************************************************************************************************

- El software resultante puede no satisfacer a los usuarios
- Las interpretaciones de los requerimientos pueden causar desacuerdos entre clientes y desarrolladores
- Puede gastarse tiempo y dinero construyendo un sistema erroneo

********************************************Fuentes de requerimientos******************************************** 

- Documentación
- ************************Stakeholders************************: Cualquier persona o grupo que se verá afectado directa o indirectamente por el sistema
- Especificaciones de sistemas similares

### **********************************************3.1.1. Tipos de requerimientos**********************************************

Los ****************************************************requerimientos funcionales**************************************************** describen una interacción entre el sistema y su ambiente, cómo debe comportarse ante determinados estímulos. Describen lo que el sistema debe hacer o como no debe comportarse.

Describen en detalle la funcionalidad del mismo, son independientes de la implementación de la solución y como tal, pueden expresarse en formas distintas

---

Los ****************************requerimientos**************************** ****************************no funcionales**************************** describen una restricción sobre el sistema que limita nuestras elecciones en la construcción de la solución al problema. Dentro de este tipo existen varias categorías:

- ******Requerimientos del producto******, que especifican el comportamiento del producto (usabilidad, eficiencia, rendimiento, espacio, fiabilidad, portabilidad)
- **************************************************************Requerimientos organicacionales**************************************************************, que se derivan de las políticas y procedimientos existentes en la organización del cliente y en la del desarrollador (entrega, implementación, estándares)
- **********************************************Requerimientos externos**********************************************, que pueden referir a requerimientos de interoperabilidad, legales, de privacidad, seguridad o éticos

![Árbol de requerimientos no funcionales y sus sub categorías](Untitled%2017.png)

Árbol de requerimientos no funcionales y sus sub categorías

Existen también otras clasificaciones que no se adhieren estrictamente a las categorías anteriores: 

- ************************************Requerimientos del dominio************************************, que reflejan las características y restricciones del dominio de la aplicación del sistema.  Pueden ser funcionales o no y pueden restringir anteriores requerimientos
- ******Requerimientos por prioridad******, según si un requerimiento debe ser satisfecho, si es deseable pero no necesario o si es posible pero descartable
- ****************************************************Requerimientos del usuario****************************************************, refiere a declaraciones en lenguaje natural y en diagramas de los servicios que se espera que el sistema provea y de las restricciones bajo las cuales debe operar
- ****************************************************Requerimientos del sistema****************************************************, que establecen con detalle los servicios y restricciones del sistema.

---

## 3.2. Puntos de vista

Existen 3 tipos genéricos de puntos de vista

El punto de vista de los ******************************interactuadores****************************** representa a las personas o sistemas que interactuan directamente con el sistema

El punto de vista ******************indirecto****************** representa a los stakeholders que no usan el sistema directamente pero influyen en sus requerimientos

El punto de vista del **************dominio************** representa las características y restricciones del dominio que influyen en los requerimientos del sistema

---

La identificación de un punto de vista puede ser difícil, algunos de los más específicos son:

- Proveedores y receptores de servicios del sist.
- Desarrolladores y  administradores del sistema
- Marketing
- Los sist. que interactuan con el nuestro
- Las regulaciones y estándares
- Las fuentes de requerimientos

## 3.3. Elicitación de requerimientos

<aside>
🤖 La **********************************************************elicitación de requerimientos********************************************************** es el proceso de adquirir todo el conocimiento relevante para producir un modelo de los requerimientos de un dominio de problema

</aside>

La elicitación busca conocer el dominio del problema para poder comunicarse con clientes y usuarios; conocer el sistema actual; e identificar las necesidades tanto implícitas como explícitas de los usuarios

En el proceso pueden aparecer **************************************************problemas de comunicación************************************************** según las limitaciones cognitivas del desarrollador, por cuestiones de conducta humana o técnicos

## 3.4. Técnicas de elicitación

### ************************************************3.4.1. Métodos discretos************************************************

**********************************Muestreo**********************************

Muestreo de la documentación, formularios y datos existentes. Recolección de los hechos a partir de la documentación disponible. Permite reconocer el historial del proyecto

---

**********Investigación y visitas al lugar**********

Investigar el dominio, patrones de soluciones y problemas similares

---

****************************************************************Observación del ambiente de trabajo****************************************************************

Con consentimiento, tomando nota y sin interrumpir el flujo normal de trabajo

### ******************************************************3.4.2. Métodos interactivos******************************************************

**************************Cuestionarios**************************

Recolectar datos de muchas personas, sentimientos generalizados y problemas entre usuarios

---

**********************Entrevistas**********************

Una conversación con propósito específico basado en preguntas y respuestas

---

**************************************************************************Planeación conjunta de requerimientos**************************************************************************

JRP → proceso mediante el cual se conducen reuniones de grupo altamente estructuradas con el propósito de analizar problemas y definir requerimientos

---

********Branistorming********

Técnica para generar ideas que alienta a los participantes a ofrecer tantas ideas como sea posible en poco tiempo, sin importar la calidad 

## 3.5. Estudio de viabilidad

***********************************Principalmente para sistemas nuevos***********************************

A partir de una descripción resumida del sistema, se elabora un informe que recomienda la conveniencia o no de realizar el proceso de desarrollo. Responde a las preguntas:

- ¿El sistema contribute a los objetivos generales de la organización?
- ¿El sistema se puede implementar con la tecnología actual?
- ¿El sistema se puede implementar con las restriccioens de costo y tiempo?
- ¿El sistema puede integrarse a otros que existen en la organización?

## 3.6. Especificación de requerimientos

Algunas propiedades que deben tener los requerimientos (hay más):

- **Necesarios**: Su omisión provoca deficiencia
- **Consisos**: Fáciles de leer y entender
- **Completos**: No necesitan ampliarse
- ******************No ambiguo******************: Tiene una sola interpretación
- **********************Verificable**********************: Puede testearse a través de inspecciones o pruebas

********************Documentos********************

El **********************************************************************************documento de definición de requerimientos********************************************************************************** es un listado completo de todas las cosa que el cliente espera que haga el sistema

El ******************************************************************************************documento de especificación de requerimientos****************************************************************************************** es la definición en términos técnicos de lo planteado en el documento de definición

El ******************************************************************************************************************************************************************documento de especificación de requerimientos de software IEEE Std 830-1998 (SRS)****************************************************************************************************************************************************************** busca brindar una colección de buenas prácticas para escribir especificaciones de requerimientos de software. Se describen los contenidos y las cualidades de una buena especificación de requerimientos

****************************************************************************************************************Aspectos básicos de una especificación de requerimientos****************************************************************************************************************

- **************************Funcionalidad**************************: Qué debería hacer el software
- **************************************Interfaces externas**************************************: Cómo interactua el software con el medio externo (gente, hardware, otros softwares)
- **********************Rendimiento**********************: La velocidad, disponibilidad, tiempo de respuesta, etc
- ******************Atributos******************: Portabilidad, seguridad, mantenibilidad, eficiencia
- **********************************************Restricciones de diseño**********************************************: Estándares requeridos, lenguaje, límite de recursos, etc

### 3.6.1. Usuarios de un documento de requerimientos

- ****************************************Clientes del sistema****************************************: Especifican los requerimientos y los leen para comprobar que cubren sus necesidades. Los clientes especifican los cambios a los requisitos
- ******************************Administradores******************************: Usan el documento de requerimientos para plantear una cotización para el sistema y el proceso del desarrollo del sistema
- ********************************************Ingenieros del sistema********************************************: Usan los requerimientos para entender qué sistema debe desarrollarse
- ****************************************************************Ingenieros de prueba del sistema****************************************************************: Usan los requerimienos para desarrollar pruebas de validación para el sistema
- ******************************************************************************Ingenieros de mantenimiento del sistema******************************************************************************: Usan los requerimientos para comprender el sistema y las relaciones entre sus componentes

## 3.7. Validación de requerimientos

<aside>
🤖 La ****************************************************validación de requerimientos**************************************************** es el proceso de certificar la corrección del modelo de requerimientos contra las intenciones del usuario. Trata de mostrar que los requerimientos definidos están en el sistema

</aside>

- ********************Validación********************: Al final del desarrollo evaluar el software para asegurar que cumple con los requerimientos
- ************************Verificación************************: El software cumple con los requerimientos correctamente

---

La validación de requerimientos comprende verificar la validez para todos los usuarios, la consistencia del sistema, la completitud de los requerimientos, el realismo y la verificabilidad

### 3.7.1. Técnicas de validación

***********************************Pueden ser manuales o automatizadas***********************************

- Revisiones de requerimientos
    - Informales: los desarrolladores deben tratar los requerimientos con tantos stakeholders como sea posible
    - Formales: el equipo de desarrollo debe conducir al cliente, explicándole las implicaciones de cada requerimiento
- Construcción de prototipos
- Generación de casos de prueba

# 4. Técnicas de Especificación de Requerimientos

Las técnicas de especificación de requerimientos pueden dividirse en dos tipos: estáticas y dinámicas.

Las ******************estáticas****************** describen el sistema a través de entidades u objetos, sus atributos y sus relaciones con otros. No describe cómo las relaciones cambian con el tiempo. Se suelen usar cuando el tiempo no es un factor relevante en la operación del sistema

***[ Ejemplos: Referencia indirecta, relaciones de recurrencia, definición axiomática, expresiones regulares, abstracciones de datos, etc ]***

- Historias de usuario
- Casos de uso

Las ******************dinámicas****************** consideran un sistema en función de los cambios que ocurren a lo largo del tiempo. Se considera que el sistema está en un estado particular hasta que un estímulo lo obliga a cambiar de estado

***********[ Ejemplos: Tablas de decisión, diagramas de transición de estados, tablas de transición de estados, diagramas de persianas, diagramas de transición extendidos, redes de petri, etc ]***********

- Diagrama de transición de estados
- Redes de petri

## 4.1. Historias de Usuario

<aside>
🤖 Una **historia de usuario** es una representación de un requisito de software escrito en una o dos fases utilizando el lenguaje común del usuario

</aside>

Debe ser **limitada**, debe poder escribirse sobre una nota adhesiva pequeña, ya que son una forma rápida de amdministrar los requisitos de los usuarios sin tener que elaborar una gran cantidad de documentos formales

Permiten responder rápidamente a los requisitos cambiantes

Al momento de implementar las historias, los desarrolladores deben poder discutirlas con los clientes. Generalmente se estima el tiempo de cada historia entre 10 horas y un par de semanas; estimaciones mayores a 2 semanas son indicativo que la historia es muy compleja y debe ser dividida

******************************Características******************************

- Son **independientes unas de otras**
- Son **negociables**: si la historia no es lo suficientemente explícita, se debe esclarecer mediante discusión con usuarios
- Son **valoradas por los clientes o usuarios**: cada historia debe ser importante para alguno de ellos
- Son **estimables**: la discusión de una historia de usuario es la estimación del tiempo que tomará completarla
- Son **pequeñas**
- Son **verificables**: cubren requerimientos funcionales, por lo que pueden verificarse. Cuando sea posible la verificación debe automatizarse

![Untitled](Untitled%2018.png)

![Untitled](Untitled%2019.png)

**Beneficios** 

- Representa requisitos del modelo de negocio que pueden implementarse rápidamente
- Necesitan poco mantenimiento
- Mantienen una relación cercana con el cliente
- Permite dividir los proyectos en pequeñas entregas
- Permite estimar fácilmente el esfuerzo de desarrollo
- Es ideal para proyectos con requisitos volátiles o no muy claros

**Limitaciones** 

- Sin criterios de aceptación pueden quedar abiertas a diferentes interpretaciones
- Se requiere un contrato permanente con el cliente durante el proyecto
- Puede resultar difícil escalar a proyectos grandes
- Requiere desarrolladores muy competentes

## 4.2. Casos de Uso

<aside>
🤖 Un **********************caso de uso********************** es un proceso de modelado de las “funcionalidades” del sistema en término de los eventos que interactúan entre los usuarios y el sistema

</aside>

********************Beneficios********************

- Herramienta para caturar requerimientos funcionales
- Descompone el alcance del sistema en piezas más manejables
- Medio de comunicación con los usuarios
- Usa el lenguaje común
- Permite estimar el alcance del proyecto y el esfuerzo a realizar
- Define una línea base para la definición de los planes de prueba
- Define una línea base para toda la documentación del sistema
- Proporciona una herramienta para el seguimiento de los requisitos

**********************Componentes**********************

- ****************Diagrama****************
    - **Casos de uso**
        - El CU representa un objetivo (funcionalidad) individual del sistema y describe la secuencia de actividades y de interacciones para alcanzarlo.
        - Para que el CU sea considerado un requerimiento debe estar acompañado de su respectivo escenario
    - **Actores**
        - Un actor inicia una actividad (CU) en el sistema
        - Representa un papel desempeñado por un usuario que interactúa (rol)
        - Puede ser una persona, sistema externo o dispositivo externo que dispare un evento (sensor, reloj, etc)
    - **Relaciones**
        - Asociaciones
            - Relación entre un actor y un CU en el que interactuan entre sí
        - Extensiones (*Extends)*
            - Un CU entiende la funcionalidad de otro CU
            - Un CU puede tener muchos CU extensiones
            - Los CU extensiones sólo son iniciados por un CU
        - Uso o inclusión (*Uses)*
            - Reduce la redundancia entre dos o más CU al combinar los pasos comúnes de los CU
        - Dependencia (*Depends)*
            - Relación entre CU que indica que un CU no puede realizarse hasta que se haya realizado otro CU
        - Herencia
            - Relación entre actores donde un actor hereda las funcionalidades de uno o varios actores
- ******************Escenario******************
    - **Nombre del CU**
        - <verbo> — Debe representar la meta del CU
    - **ID del CU**
    - **Otros actores participantes**
        - Actor principal que se beneficia del CU
        - Otros actores que intervienen en el CU
    - **Descripción**
        - Una descripción corta y precisa del propósito del CU
    - **Precondición**
        - Una restricción del estado del sistema antes de la ejecución del CU
    - **Curso típico de eventos**
        - Secuencia normal realizada por los actores y el sistema
        - Debe representar la interacción entre el actor y el sistema
    - **Cursos alternos**
        - Describen el comportamiento si ocurra una excepción o variación del curso típico
    - **Postcondición**
        - Restricción del estado del sistema después de la finalización exitosa del CU

******************************************************Características importantes******************************************************

- Un CU debe representar una funcionalidad concreta
- La descripción de los pasos en los escenarios debe contener más de un paso, para representar la interacción entre los componentes
- El uso de condicionales en el curso normal, es limitado a la invocación de excepciones, ya que este flujo representa la ejecución del caso sin alteraciones
- Las pre-condiciones no deben representarse en los cursos alternativos, ya que al ser una pre-condición no va a ocurrir
- Los “uses” deben ser accedidos por lo menos desde dos CU

## 4.3. Diagrama de Transición de Estados

<aside>
🤖 Un ******************************************************************diagrama de transición de estados****************************************************************** describe al sistema como un conjunto de estados donde el sist. reacciona a ciertos eventos posibles

</aside>

![Untitled](Untitled%2020.png)

**Construcción de un DTE** 

1. Identificar los estados
2. Si hay un estado complejo se puede explotar
3. Desde el estado inicial, se identifican los cambios de estado con flechas
4. Se analizan las condiciones y las accones para pasar de un estado a otro
5. Se verifica la consistencia
    1. Se han definido todos los estados
    2. Se pueden alcanzar todos los estados
    3. Se pueden salir de todos los estados
    4. En cada estado, el sistema responde a todas las condiciones posibles (normales y anormales)

## 4.4. Redes de Petri

Se usan para especificar sistemas de tiempo real en los que son necesarios representar aspectos de **concurrencia**

Los **sistemas concurrentes** se diseñan para permitir la ejecución simultánea de componentes de programación, llamadas tareas o procesos, en varios procesadores o intercalados en un solo procesador

Las **tareas concurrentes** deben estar sincronizadas para permitir la comunicación entre ellas; pueden operar a distintas velocidades, deben prevenir la modificación de datos compartidos o condiciones de bloqueo. Pueden realizarse varias tareas en paralelo pero ejecutarse en orden impredecible, por lo que no son secuenciales

**Elementos de una Red de Petri** 

Definición formal: una estructura de Red de Petri es un 4-upla:

$$
C = (P, T,I,O)
$$

**P (*Places) —* Lugares**

- Estados o condiciones

**T (*Transitions) —* Transiciones**

- Eventos o acciones

**I (*Input Function) —* Función de Entrada**

- I: T → P

**O *(Output Function) —* Función de Salida**

- O: T → P

**→ Relaciones**

- Los arcos indican la relación entre lugares y transiciones

**◍ (*Tokens) —* Fichas**

- A los lugares se les asignan *tokens* que se representan mediante un número o puntos dentro de un sitio
- Esta asignación de *tokens* a lugares constituye la marcación
- Luego de una marcación inicial se puede simular la ejecución de red
- El número de *tokens* asignados a un sitio es ilimitado ****

---

El conjunto de ***tokens*** asociado a cada estado sirve para manejar la coordinación de eventos y estados. Una vez que ocurre un evento, un token puede “viajar” de uno de los estados a otro, si es que se cumplen las condiciones adecuadas, las cuales son controladas por el número y distribución de los *tokens.*

La **ejecución** se realiza disparando **transiciones habilitadas**. Una transición está habilitada cuando cada lugar de entrada tiene al menos tantos *tokens* como arcos hacia la transición

**Disparar una transición habilitada** implica remover *tokens* de los lugares de entrada y distribuir *tokens* en los lugares de salida. La ocurrencia de los eventos (**transiciones**) depende del estado del sistema. Una **condición** puede ser V (con *token*) o F (*sin token*). 

La **ocurrencia de un evento** está sujeta a que se den ciertas pre-condiciones y al ocurrir un evento causa que se hagan verdaderas las post-condiciones

****Características****

- Es importante desarrollar modelos de los sistemas de eventosdiscretos para estudiarlos y comprender su comportamiento
- Existen herramientas computacionales que permiten analizar estetipo de sistemas, las cuales están basadas en análisis estadísticos y ofrecen soluciones con cierts grados de incertidumbre
- Por otro lado, las RdP peuden ser aplicadas para la modelación de sistemas de eventos discretos, las cuales ofrecen una forma de representación gráfica y matemática de los sistemas modelados
- La formalidad matemática de la RdP proporciona herramientas de análisis para los posibles estados a los que el sistema modelado pudiese alcanzar

## 4.5. Tablas de Decisión

<aside>
🤖 Una **************************tabla de decisión************************** es una herramienta para mostrar las reglas lógicas que definen las acciones a ejecutar en función de las condiciones y lógica de decisión de un problema específico

</aside>

Se describe el sistema como un conjunto de posibles **********************condiciones********************** satisfechas por el sistema en un momento dado, ************reglas************ para reaccionar ante los estímulos que ocurren cuando se reúnen determinadas condiciones y ************acciones************ a ser tomadas como resultado

| Condiciones y acciones |  | Reglas |  |  |
| --- | --- | --- | --- | --- |
| Es cliente | V | V | F | F |
| Hay stock | V | F | V | F |
| Imprime mensaje de aviso |  |  | X | X |
| Se remite | X |  |  |  |

************************Construcción de una tabla************************

1. Se identifican las condiciones y acciones a partir del enunciado
2. Se completa la tabla teniendo en cuenta
    1. Si hay condiciones opuestas, colocar solo una
    2. Si hay n condiciones excluyentes, anotar n-1
    3. Las condiciones deben ser atómicas
3. Se construyen las reglas

**************************************************Tipos de especificaciones**************************************************

Las ********especificaciones completas******** son aquellas que determinan acciones para todas las reglas posibles (así tiene que ser la tabla)

Las ********************************************************especificaciones redundantes******************************************************** son aquellas que marcan para condiciones iguales las mismas reglas

Las **************especificaciones contradictorias************** son quellas que para reglas con las mismas condiciones, marcan acciones distintas

************************************************Reducción de complejidad************************************************

Cuando la alternativa de una condición no representa una diferencia en el resultado, se pueden combinar las reglas, marcando el campo irrelevante con “_” (guión)

![Untitled](Untitled%2021.png)

![Untitled](Untitled%2022.png)

# 5. Metodologías Ágiles

<aside>
🤖 Una ********************************metodología ágil******************************** es aquella en la que se da prioridad a las tareas que dan resultados directos y que reducen la burocracia tanto como sea posible, adaptándose rápidamente al cambio de los proyectos

</aside>

Es un enfoque iterativo e incremental (evolutivo) de desarrollo de software

******************Objetivos******************

- Producir software de alta calidad con un costo efectivo y en tiempo apropiado
- Responder rápidamente a los cambios que puedan surgir a lo largo del proyecto
- Ofrecer un proceso flexible de desarrollo

**************Valores**************

- ************Individuos e interacciones************ más que procesos y herramientas
- ************************Software******** operante** más que documentaciones completas
- ******************************************************Colaboración con el cliente****************************************************** más que negociaciones contractuales
- **************************************Respuesta al cambio************************************** más que apegarse a una rigurosa planificación

*No porque se valoren más los conceptos de la izquierda debemos ignorar los de la derecha. Es una definición de preferencias, no alternativas*

********************Principios********************

1. Nuestra mayor prioridad es satisfacer al cliente a través de **fáciles y continuas entregas** de software valuable.
2. Los **cambios de requerimientos son bienvenidos**, aún tardíos, en el desarrollo. Los procesos Ágiles capturan los cambios para que el cliente obtenga ventajas competitivas.
3. **Entregas frecuentes** de software, desde un par de semanas a un par de meses, con el menor intervalo de tiempo posible entre una entrega y la siguiente.
4. **Usuarios y desarrolladores deben trabajar juntos** durante todo el proyecto.
5. Construir proyectos alrededor de **motivaciones individuales**.
6. Darles el ambiente y el soporte que ellos necesitan y confiar el trabajo dado. El **diálogo cara a cara** es el método más eficiente y efectivo de intercambiar información entre el equipo de desarrolladores.
7. El **software que funciona** es la medida clave de progreso.
8. Los procesos ágiles promueven un **desarrollo sostenible**. Los stakeholders, desarrolladores y usuarios deberían ser capaces de mantener un paso constante indefinidamente.
9. **Atención** continua a la excelencia técnica y buen diseño incrementa la agilidad.
10. **Simplicidad** (el arte de maximizar la cantidad de trabajo no dado) es esencial.
11. Las mejores arquitecturas, requerimientos y diseños surgen de la propia **organización de los equipos**.
12. A intervalos regulares, el equipo **reflexiona sobre cómo volverse más efectivo,** entonces afina y ajusta su comportamiento en consecuencia.

******************************************************Comparación ágil vs no ágil******************************************************

| Metodología Ágil | Metodología No Ágil |
| --- | --- |
| Pocos artefactos | Más artefactos |
| Pocos roles | Más roles |
| No existe un contrato tradicional o al menos es flexible | Existe un contrato prefijado |
| El cliente es parte del equipo de desarrollo | El cliente interactúa con el equipo de desarrollo mediante reuniones |
| Grupos pequeños ( <10 integrantes) y trabajando en el mismo sitio | Grupos grandes |
| Menos énfasis en la arquitectura | La arquitectura es escencial |

**********************Desventajas**********************

- Dificultad de integrar al cliente al equipo
- Dificultad para priorizar cambios
- Dificultad para mantener la simplicidad del sistema
- Para organizaciones grandes, es complejo realizar un cambio de metodología de desarrollo
- Complejidad para reglamentar eldocumento de requerimientosdel ********software********
- Es complejo implementarlo para la actualización y mantenimiento de sistemas, en lugar de para el desarrollo

## 5.1. Principales metodologías ágiles

- XP (*eXtremme Programming)*
- Scrum
- DSDM (***Dynamic Systems Development Method***)
- *********Crystal Methods*********
- ASD (******************************Adaptative Software Development)******************************
- FDD (*******Feature-Driven Development*******)

### 5.1.1. eXtreme Programming

Disciplina de desarrollo de software basada en los valores de la sencillez, la comunicación, la retroalimentación, la valentía y el respeto

![Untitled](Untitled%2023.png)

******************************************************Características escenciales****************************************************** 

- Historias de usuario
- Roles
    - Programador
    - Jefe de proyecto
    - Cliente
    - Entrenador
    - Encargado de pruebas
    - Rastreador
- Proceso
- Prácticas

********************Ciclo de vida******************** 

![Untitled](Untitled%2024.png)

1. **Exploración**
    1. Los clientes plantean las historias de usuario de interés
    2. El equipo de desarrollo se familiariza con las herramientas, tecnologías y prácticas a usar
    3. Se construye un prototipo
    
    Duración: Entre pocas semanas a pocos meses
    
2. **Planificación**
    1. El cliente establece la prioridad de cada historia de usuario
    2. Los programadores realizan una estimación del esfuerzo
    3. Se toman acuerdos sobre el contenido de la primera entrega y se determinaun cronograma conjunto con el cliente
    
    Duración: Unos pocos días
    
3. **Iteraciones**
    1. El Plan de Entrega está compuesto por iteraciones de no más de tres semanas
    2. El cliente es quien decide qué historias se implementan en cada iteración
    3. Al final de la última iteración el sistema está listo para la producción
    
    Duración: tres semanas por iteración x cantidad de iteraciones
    
4. **Producción**
    1. Requiere de pruebas adicionales y revisiones de rendimiento antes de trasladar el sistema al entorno del cliente
    2. Se deben tomar decisiones sobre la inclusión de nuevas características a la versión actual
5. **Mantenimiento**
    1. Mientras la primera versión se encuentra en producción, el proyecto debe mantener el sistema funcionando al mismo tiempo que desarrolla nuevas iteraciones
    2. La fase de mantenimiento puede requerir nuevo personal
6. **Muerte**
    1. Es cuando el cliente no tiene más historias para ser incluidas
    2. Se genera la documentación final del sistema
    3. También ocurre cuando el sistema no genera los beneficios esperados o no hay presupuesto

******************Prácticas****************** 

- **Testing:** Los programadores continuamente escriben pruebas unitarias
- **Refractoring**: Actividad constante de reestructuración del código para remover duplicaciones, simplificar, mejorar legibilidad y hacerlo más flexible a nuevos cambios
- **Programación de a pares**: Todo el código de producción es escrito por dos programadores en una máquina
- **Propiedad colectiva del código**: Cualquiera puede cambiar el código en cualquier momento
- **Integración continua**: Cada pieza de código es integrada en el sistema una vez que está lista. Reduce la fragmentación de los esfuerzos de los desarrolladores por falta de comunicación sobre lo que puede ser reutilizado o compartido
- **Semana de 40 horas**: Se debe trabajar un máximo de 40 horas por semana
- **Cliente en lugar de desarrollo**: El cliente tiene que estar presente y disponible todo el tiempo para el equipo
- **Estándares de codificación**: Los programadores escriben todo el código de acuerdo con reglas que enfatizan la comunicación a través del mismo

### 5.1.2. Scrum

Es un proceso en el que se aplican, de manera regular, un conjunto de mejores prácticas para trabajar en equipo y obtener el mejor resultado posible de un proyecto

Se basa en ************************************************************entregas parciales y regulares************************************************************ del resultado final del proyecto, priorizadas por el beneficio que aportan al receptor del proyecto

********************Principios******************** 

- **Eliminar desperdicio:** No generar artefactos o perder tiempo con cosas que no suman valor
- **Construir la calidad con el producto:** Inyectar la calidad al código desde el inicio
- **Crear conocimiento:** En la práctica no se puede tener conocimiento antes de desarrollar
- **Diferir las decisiones:** Tomar decisiones en el momento adecuado, si se puede esperar mejor
- **Entregar rápido:** Una de las ventajas más importantes
- **Respetar a las personas**
- **Optimizar el todo**

**********Roles********** 

- **Product Owner**: Conoce y marca las prioridades del proyecto
- **Scrum Master**: Se asegura del seguimiento de la metodología guiando las reuniones y ayudando al equipo
- **Scrum Team**: Responsables de implementar la funcionalidad elegida por el Product Owner
- **Usuarios o cliente**: Beneficiarios finalesdel producto, pueden aportar ideas o necesidades

********************Artefactos******************** 

![Untitled](Untitled%2025.png)

- **Product Backlog**: Una lista maestra que tiene todas las funcionalidades deseadas del producto ordenadas por prioridad
- **Sprint Backlog**: Una lista que tiene todas las funcionalidades que el equipo se comprometió a desarrollar en un Sprint determinado
- **Burndown Chart**: Muestra un acumulativo del trabajo hecho día a día
- etc

**************Proceso**************

Es iterativo e incremental, se busca poder atacar todos los problemas que surgen durante el desarrollo del proyecto

El nombre **********Scrum********** se debe a que los Sprints se solapan, de manera que no es un proceso en cascada, sino un montón de etapas juntas que se ejecutan una y otra vez

Está pensado para ser aplicado en proyectos donde el caos es una constante, con requerimientos dinámicos e implementación de tecnología de punta

# 6. Calidad

La **************calidad**************es una propiedad mensurable que puede ser juzgada; sin embargo, su significado es ambigüo y su uso depende de lo que cada uno entiende por calidad. No necesariamente refiere a un producto de lujo, ni se origina en el departamento de calidad

<aside>
🤖 Las principales normas internacionales definen la **calidad** como el grado en el que un conjunto de características inherentes cumple con los requisitos (ISO 9000)

</aside>

> “Conjunto de propiedades o características de un producto o servicio que le confieren aptitud para satisfacer unas necesidades expresadas o implícitas” (ISO 8402)
> 

---

Una **norma** es un documento establecido por conseso y aprobado por un organismo reconocido que proporciona un uso común y repetido, una serie de reglas, directrices o características.

La **Organización Internacional de Normalización** (ISO) es una organización para la creación de estándares o normas internacionales compuesta por dversas organizaciones nacionales de normalización.

## 6.1. Calidad de los sistemas de información

La importancia de los sist. de información (SI) en la actualidad hace necesario que las empresas de tecnología hagan hincapié en los estándares (o normas) de calidad. Se debe apreciar la calidad desde un todo, donde cada parte que la compone debe tener su propio análisis de calidad

************************Componentes************************

![Visión Holística de la calidad - Stylianou y Kumar (200)](Untitled%2026.png)

Visión Holística de la calidad - Stylianou y Kumar (200)

******************************************Calidad de la empresa******************************************

- Calidad de los procesos de negocio soportados por SI
- **Calidad de SI**
    - **Calidad de la infraestructura**: incluye la calidad de las redes y sistemas de sw.
    - **Calidad de la gestión**: incluye el presupuesto, planificación y programación
    - **Calidad del software**: incluye los procesos de atención al cliente
    - **Calidad de la información**: está relacionada con la calidad de los datos
    - **Calidad de datos**: los datos que ingresan en el sistema de información
    - **Calidad del servicio**: de las aplicaciones de sw. construidas o mantenidas, con el apoyo de IS

## 6.2. Calidad de software

La **calidiad de software** se ha mejorado en los últimos años, en particular por una mayor conciencia de la gestión de la calidad y la adopción de técnicas de gestión de calidad para el desarrollo en la insdustria de software.

Se divide en dos partes dependientes entre ellas:

- **Calidad del producto obtenido**: la estandarización del producto define las propiedades que debe satisfacer el producto de software resultante
- **Calidad del proceso de desarrollo**: la estandaricación del proceso define la manera de desarrollar el producto de software

---

********Sin un buen proceso de desarrollo es casi imposible obtener un buen producto********

## 6.3. Norma/Modelo de calidad

### 6.3.1. **Norma de Calidad SQuaRE ISO/IEC 25000**

*ISO/IEC 25000 SQuaRE Software product Quality Requeriment and Evaluation*

SQuaRE cubre tres procesos de calidad complementarios:

- Especificación de requisitos
- Metricas
- Evaluación

![Untitled](Untitled%2027.png)

- **División de Modelos de Calidad (2501n):** Modelo de calidad detallado incluyendo características para calidad interna y externa y la calidad de datos
- **División de Gestión de Calidad (2500n):** Las normas que forman este apartado definen todos los modelos, términos y definiciones comunes referenciados por toda la serie SQuaRE
- **División de Medición de Calidad (2502n):** Modelo de referencia de la medición de calidad del producto, definiciones de medidas de calidad y guías prácticas de su uso
- **División de Requisitos de calidad (2503n):** Ayuda a especificar los requisitos de calidad que pueden ser usados en el proceso de elicitación
- **División de Evaluación de Calidad (2504n):** Requisitos, recomendaciones y guías para la evaluación de producto

### 6.3.2. Norma de Calidad de software

![Untitled](Untitled%2028.png)

- **ISO/IEC 12207** — Establece un modelo de procesos para el ciclo de vida del software
- **IDO/IEC 15504** — Es una norma internacional para establecer y mejorar la capacidad y madurez de los procesos de las organizaciones en la adquisición, desarrollo, evolución y soporte de productos y servicios

### 6.3.3. CMM (1993) — CMMI (2000)

- Modelo de evaluación de los procesos de una organización
- Marco de referencia para desarrollar procesos efectivos
- Proporciona un marco estructurado para evaluar los procesos actuales de la organización, establecer prioridades de mejora e implementarlas
- En el 2000, el SEI publicó un nuevo modelo CMMI o “Modelo de Capacidad y Madurez - Integración” con el objetivo de integrar distintos modelos

********CMMI********

Posee dos vistas que permiten un enfoque diferente según las necesidades de quién vaya a implementarlo:

**Escalonado**: Se centra en la madurez de la organización, al igual que CMM

![Untitled](Untitled%2029.png)

**Continuo**: Enfoca las actividades de mejora y evaluación en la capacidad de los diferentes procesos. Presenta 6 niveles de capacidad, los cuales indican qué tan bien se desempeña la organización en un área del proceso individual

![Untitled](Untitled%2030.png)

- Niveles de madurez
    1. **Inicial**: proceso impredecible, poco controlado y reactivo
    2. **Gestionado**: proceso caracterizado por proyectos y frecuentemente reactivo
    3. **Definido**: proceso caracterizado por la organización y proactivo
    4. **Gestionado Cuantitativamente**: el proceso es controlado cuantitativamente
    5. **Optimizado**: enfoque en la mejora del proceso

![Untitled](Untitled%2031.png)

## 6.4. Familia de las ISO 9000

- **ISO — 900:2015** — Quality managment system — Requirements
    - Norma publicada por ISO en el año 2015
- **IRAM — ISO 9001:2015** — Sistema de gestión de la calidad — Requisitos
    - Norma publicada por ISO y traducida por IRAM
- **ISO 90003:2004**
    - Basada en ISO 9001:2000 (se espera una actualización para el próximo año)
    - Directrices para la interpretación en el proceso de software.
        - Proporciona una guía para identificar las evidencias dentro del proceso de software para satisfacer los requisitos de la ISO 9001

### 6.4.1. Beneficios de trabajar con un sistema de gestión de calidad (SGC)

- ISO 9001 adegura que su negocio cumpla con los requisitos legales y del cliente
- Aumenta el rendimiento de su organización. El Sistema de Gestión de la Calidad ayuda a implementar procesos simplificados y mejorar la eficiencia operacional
- Asegura la toma de decisiones y mejora la satisfacción del cliente
- Optimiza sus operaciones para así cumplir y superar los requisitos de sus clientes
- Mejora su rendimiento financiero

### 6.4.2. SGC — IRAM — ISO 9001

SGC — Mejora Continua

![Untitled](Untitled%2032.png)

## 6.5. Resumiendo

**Calidad de producto de software**

Se evalua la calidad mediante 

- ISO/IEC 25000
    - Está compuesto por distintos modelos.
    - Define características que pueden estar presentes o no el el producto.
    - La norma nos permite evaluar si están presentes o no y cómo evaluarlas
    - *Ej: seguridad, compatibilidad, etc*

**Calidad del proceso de desarrollo**

Se evalúa la calidad mediante:

- ISO/IEC 12207
    - Establece un modelo de procesos para el ciclo de vida del software
    - Define cómo debería ser el modelo de proceso para ser completo y con calidad
    - Actividades, tareas, etc
- ISO/IEC 15504
    - Es una norma internacional para establecer y mejorar la capacidad y madurex de los procesos
    - Define qué se debe tener en cuanta para evaluar el modelo de proceso y concluir si es completo y con calidad
- ISO/IEC 90003
    - Proporciona una guía sobre cómo aplicar la ISO 9001 en procesos de software
- CMMI
    - Proporciona un marco estructurado para evaluar procesos actuales de la organización, establecer prioridades de mejora e implementarlas
    - Se usa para organizaciones desarrolladoras de software de medianas a grandes dimensiones

**Calidad de Procesos/Servicios/Productos en general**

Se evalúa mediante

- ISO 9001
    - Determina los requisitos para establecer un Sistema de Gestión de la Calidad, de producto y/o servicio
    - Forma parte de la familia ISO 9000, que es un conjunto de normas de “gestión de la calidad” aplicables a cualqueir tipo de organización con el objetivo de obtener mejoras en la organización y, eventualmente, arribar a una certificación