| **Home Screen**      | **Detail Screen**       | **Home Screen (Dark Mode)**   | **Detail Screen (Dark Mode)**            |
|-----------------------|-------------------------|-------------------------------|-------------------------------------------|
| <img src="https://github.com/dilarakiraz/CoinApp/blob/main/ss/home.png" alt="Home Screen" width="300"/> | <img src="https://github.com/dilarakiraz/CoinApp/blob/main/ss/detail.png" alt="Detail Screen" width="300"/> | <img src="https://github.com/dilarakiraz/CoinApp/blob/main/ss/darkhome.png" alt="Home Screen (Dark Mode)" width="300"/> | <img src="https://github.com/dilarakiraz/CoinApp/blob/main/ss/darkdetail.png" alt="Detail Screen (Dark Mode)" width="300"/> |

# 📚 Technology Stack & Open-Source Libraries

## 🛠️ **Modular Architecture**
A scalable design approach that organizes code into independent modules, enhancing **maintainability**, **testability**, and **reusability**.

## 📊 **Data Layer**
Manages the application’s data flow and handles core business logic. It serves as the foundation for processing user interactions and external updates, such as **API responses** or **database changes**.


## 🧠 **Domain Layer**
Focused on encapsulating **business rules** and **shared logic**. This layer is particularly useful for handling complex workflows and promoting **code reusability** across the application. Optional but powerful when tackling intricate business requirements.


## 🎨 **UI Layer**
Presents data to users and captures their inputs. The UI ensures a smooth, interactive experience by updating dynamically in response to **state changes** or **user actions**.


## 🔄 **Unidirectional Data Flow (UDF)**
A predictable data flow pattern where:
1. **User interactions** trigger actions.
2. Actions modify the **state**.
3. The state updates the **UI**.

This ensures clear, maintainable, and bug-resistant logic.


## 🖌️ **Jetpack Compose**
Android’s modern toolkit for building native UI with **less code**. Using a **declarative approach**, it accelerates development while offering **rich animations** and customizability.


## ⚡ **Coroutines**
A **Kotlin-first concurrency framework** for executing asynchronous tasks efficiently. It ensures the **main thread** remains unblocked, enabling smooth user experiences.

## 🌊 **StateFlow**
A **hot stream** for state updates built on coroutines. It provides a structured way to observe and react to **real-time state changes**.


## 🔗 **Dependency Injection with Koin**
A lightweight framework that simplifies **dependency management** in Kotlin applications. Koin promotes **clean code** with minimal configuration.


## 🌐 **Networking with Ktor**
A Kotlin-native asynchronous framework for creating **HTTP clients** and **servers**. Ideal for making fast and reliable API requests.

## 📱 **Dynamic Navigation**
A **responsive navigation system** that adapts to different screen sizes and device configurations, ensuring a consistent user experience across all form factors.

---

## 🎨 **Custom Graphics with Canvas**
An API for drawing **custom shapes** and **animations**. With **Compose**, Canvas provides a declarative approach to creating **unique, visually engaging UI components**.

---
