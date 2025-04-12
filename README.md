# Sistema de Gestión de Emergencias

Este proyecto es un sistema de gestión de emergencias que permite registrar, atender y monitorear diferentes tipos de emergencias, como incendios, accidentes vehiculares y robos. El sistema utiliza patrones de diseño como **Strategy**, **Observer** y **Factory** para garantizar flexibilidad y escalabilidad.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- **controller/**: Contiene la lógica principal del sistema, como la clase [`SistemaEmergencias`](controller/SistemaEmergencias.java).
- **model/**: Contiene las clases que representan las emergencias, servicios y patrones de diseño utilizados.
  - **interfaces/**: Define interfaces como [`IServicioEmergencia`](model/interfaces/IServicioEmergencia.java).
  - **observer/**: Implementa el patrón Observer con [`ObserverEmergencias`](model/observer/ObserverEmergencias.java) y [`SujetoEmergencias`](model/observer/SujetoEmergencias.java).
  - **services/**: Define los servicios de emergencia como [`Ambulancia`](model/services/Ambulancia.java), [`Bomberos`](model/services/Bomberos.java) y [`Policia`](model/services/Policia.java).
  - **strategy/**: Implementa estrategias de prioridad como [`StrategyPrioridadGravedad`](model/strategy/StrategyPrioridadGravedad.java) y [`StrategyPrioridadCercania`](model/strategy/StrategyPrioridadCercania.java).
- **utils/**: Contiene utilidades como los enumeradores [`NivelGravedad`](utils/NivelGravedad.java) y [`TipoEmergencia`](utils/TipoEmergencia.java).
- **view/**: Contiene la clase [`Main`](view/Main.java), que actúa como punto de entrada del sistema.

## Características

- **Registro de Emergencias**: Permite registrar emergencias de diferentes tipos con su ubicación, nivel de gravedad y tiempo estimado de atención.
- **Asignación Automática de Recursos**: Asigna automáticamente recursos disponibles según el tipo de emergencia.
- **Atención de Emergencias**: Simula la atención de emergencias y calcula estadísticas como el tiempo promedio de respuesta.
- **Patrones de Diseño**:
  - **Factory**: Para crear instancias de emergencias mediante [`FactoryEmergencias`](model/FactoryEmergencias.java).
  - **Strategy**: Para calcular prioridades de atención con diferentes estrategias.
  - **Observer**: Para notificar a observadores sobre nuevas emergencias.

## Requisitos

- **Java 8 o superior**.
- Un entorno de desarrollo como **Visual Studio Code** o **IntelliJ IDEA**.

## Ejecución

1. Clona este repositorio en tu máquina local.
2. Compila el proyecto:
   ```bash
   javac -d bin $(find . -name "*.java")
