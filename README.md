# Reto Web Serenity Screenplay

## Descripción

Proyecto de automatización web desarrollado con Serenity BDD, Screenplay Pattern y Cucumber.

La solución automatiza flujos funcionales sobre la aplicación SauceDemo.

Sitio utilizado:

https://www.saucedemo.com/

---

## Tecnologías utilizadas

- Java 21
- Maven
- Serenity BDD
- Screenplay Pattern
- Cucumber
- Selenium WebDriver

---

## Escenarios automatizados

### Escenario 1 - Login exitoso

Valida:

- Apertura de la aplicación.
- Ingreso de credenciales válidas.
- Acceso al catálogo de productos.

Usuario:

standard_user

Contraseña:

secret_sauce

---

### Escenario 2 - Compra completa

Valida:

- Login exitoso.
- Selección de producto.
- Adición al carrito.
- Checkout.
- Finalización de compra.
- Confirmación de compra exitosa.

---

## Estructura del proyecto

src/test/java

- models
- questions
- runners
- stepdefinitions
- tasks
- userinterfaces

---

## Ejecución

Ejecutar todos los escenarios:

```bash
mvn clean verify
```

Ejecutar Login:

```bash
LoginTest
```

Ejecutar Compra:

```bash
PurchaseTest
```

---

## Reportes

Los reportes Serenity se generan en:

```text
target/site/serenity
```

Abrir:

```text
index.html
```

---

## Observaciones

Durante la ejecución en entornos corporativos puede aparecer una advertencia de seguridad de Google Chrome relacionada con credenciales comprometidas.

Este comportamiento corresponde al navegador y no a la aplicación SauceDemo ni a la automatización implementada.

