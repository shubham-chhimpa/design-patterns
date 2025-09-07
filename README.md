# Design Patterns in Java

This repository contains Java implementations of various design patterns. Currently, it includes:

- **Observer Pattern** — illustrating how observers can subscribe/unsubscribe to/from a subject and receive updates.

---

## Project Structure

```
design-patterns/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── shubhamchhimpa/
│                   └── observerpattern/
│                       ├── Subject.java
│                       ├── ConcreteSubject.java
│                       ├── Observer.java
│                       ├── ConcreteObserverA.java
│                       └── ConcreteObserverB.java
├── .gitignore
└── pom.xml
```

- **`Subject.java`**  
  Defines the `Subject` interface (methods to register, deregister, and notify observers).

- **`ConcreteSubject.java`**  
  Implements `Subject`. Maintains a list of observers and notifies them of state changes.

- **`Observer.java`**  
  Defines the `Observer` interface (method to update observers).

- **`ConcreteObserverA.java`**, **`ConcreteObserverB.java`**  
  Concrete implementations of `Observer`, responding to updates from the subject.

- **`.gitignore`**  
  Standard Git ignore file for Java/Maven projects.

- **`pom.xml`**  
  Maven project descriptor containing dependencies and build configuration.

---

## Usage Example

```java
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserverA();
        Observer observer2 = new ConcreteObserverB();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState("State #1");

        subject.removeObserver(observer2);

        subject.setState("State #2");
    }
}
```

In this example:

1. A `ConcreteSubject` instance is created.
2. Two observers are registered.
3. Changing the subject's state triggers notifications to both observers.
4. One observer is removed.
5. A subsequent state change only notifies the remaining observer.

---

## Class Diagram (Observer Pattern)

Below is a simple UML-style representation of the Observer pattern classes:

```
┌──────────────────┐           ┌───────────────────────────┐
│    Subject       │ 1     *  │        Observer           │
│──────────────────│──────────│───────────────────────────│
│ + registerObs()  │          │ + update(state: String)   │
│ + removeObs()    │          └───────────────────────────┘
│ + notifyObservers() │
└──────────────────┘
           ▲
           │ implements
           │
┌─────────────────────────┐
│  ConcreteSubject        │
│─────────────────────────│
│ - observers: List<Observer> │
│ - state: String         │
│ + setState(newState)   │
│ + getState(): String    │
└─────────────────────────┘
           │
           │ notifies
           ▼
┌──────────────────────────────┐
│     ConcreteObserverA        │
│──────────────────────────────│
│ + update(state)              │
└──────────────────────────────┘
           ▲
           │ implements
           ▼
┌──────────────────────────────┐
│     ConcreteObserverB        │
│──────────────────────────────│
│ + update(state)              │
└──────────────────────────────┘
```

---

## Contributions

Contributions and additions of other patterns (e.g., Strategy, Factory, Decorator) are welcome! Feel free to fork the repo, contribute your own implementations, and open pull requests.

---

## License

This project is open-source and available under the [MIT License](LICENSE) (if applicable).
