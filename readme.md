# Arquitectura de Microservicios - Banco XYZ

## 1. Procesos Clave de Migración
1. **Migración Batch a Spring Batch:** Implementación de jobs estructurados y escalables en `ms-batch`.
2. **Desacoplamiento del Monolito:** División en microservicios Core (`ms-clientes`, `ms-cuentas`, `ms-pagos`).
3. **Patrón BFF (Backend for Frontend):** Capas adaptadas para `bff-web`, `bff-mobile` y `bff-atm`.
4. **Seguridad Distribuida:** Control centralizado con Spring Cloud Security en el API Gateway.
5. **Mensajería Asíncrona:** Eventos desacoplados mediante Apache Kafka.

## 2. Requerimientos Clave del Negocio
* **Omnicanalidad Personalizada:** Adaptación de datos por canal mediante el patrón BFF.
* **Alta Disponibilidad 24/7:** Tolerancia a fallos con Resilience4j y descubrimiento dinámico con Eureka.
* **Procesamiento Nocturno Masivo:** Jobs paralelos con Spring Batch sin afectar las operaciones en tiempo real.