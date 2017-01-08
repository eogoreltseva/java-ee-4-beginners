# java-ee-4-beginners

---

# Day 01
## Введение в git
- Базовые понятия
- Базовые операции

### Lab: клонирование проекта

## JDK
- Понятие Java-приложения
- Понятие classpath
- Пакеты
- Разбиение классов по пакетам

### Lab: сборка простого приложения

## Введение в сборщик maven
- Цикл сборки
- Зависимости

## Внутренности JVM
- Администрирование JVM
- Выделение памяти для объектов и классов
- Алгоритмы gc
- Мониторинг JVM

### Lab: монторинг простого приложения с JVisualVM

## IDE NetBeans
- Работа с NetBeans — основные операции

## Процедурный стиль
- Парадигмы программирования
- Статический контекст
- Декларация метода
- Примитивные типы
- Операторы
- Управляющие конструкции
- Модификатор final
- Ссылочные типы
- Строки
- Примитивные массивы (+двумерные)
- Перечисления (enums)
- Перегрузка методов

### Lab: простое приложение в процедурном стиле

## ООП 
- Классы и объекты
- Наследование
- Полиморфизм
- Видимость
- Конструкторы

---

# Day 02

- Абстракции
- Принципы проектирования
- Параметризуемые классы (generics)

### Lab: простое приложение в объектном стиле

## Java Core

### Ключевые классы системной библиотеки
- System
- Object
- Строки
- Обертки поверх примитивов
- Работа с регулярными выражениями
- Properties

### Ввод-вывод
- Библиотека классов ввода-вывода
- Кодировки
- Буферизация
- Форматирование вывода (коротко)
#### Lab: Пробуем самостоятельно работать с Apache Commons CSV

---

# Day 03

### Исключения
- Концепция обработки исключений
- Блок try-catch-finally
- Типы исключений
- Выброс исключения из метода
- try-with-resources

### Коллекции
- Обзор collection API
- Коллекции
- Множества (set)
- Отображения (map)
- Сравнение различных структур данных на предмет применимости в различных ситуациях
- Механизм сравнения элементов коллекций

### Механизм Reflection
- Introspection
- Annotations

### Обзор JNI/JNA

## JDBC

### Архитектура JDBC
- Схемы взаимодействия с СУБД 
- Структура JDBC-программы
- Типы JDBC-драйверов 

### Взаимодействие с СУБД посредством JDBC API
- SQL-запросы к СУБД
- Обработка данных из БД, выборки
- Выборки с произвольным доступом 
- Модифицируемые выборки
- Обработка ошибок 

### Дополнительные возможности JDBC API
- Понятие транзакции (+возможность декларативного управления транзакциями)
- DataSources и пулы соединений 

### Обзор JDBC Template

### Обзор JPA

---

# Day 04

## JNDI и изменения данных в сервисе

### Введение в JNDI
- Концепции служб каталога. Схемы именования
- Основные пакеты JNDI

### Naming Operations
- Поиск в каталоге 
- Контексты и связывание

### Directory Operations:
- Работа с аттрибутами
- Поиск по каталогу

### Связываем вместе Naming и Directory Operations:
- String Names и Structured Names
- Composite Names
- Compound Names
- Name Parsers

## Servlet API
- Lifecycle
- Обработка HTTP-запроса, формирование HTTP-ответа
- Параметры, атрибуты, заголовки и cookies (+API)
- Listener и Filter 

### Введение в JSP
- Базовые конструкции
- Custom tags
- JSTL

## WS (REST, SOAP)

### Что такое веб-сервис 
- Протокол SOAP: 
- Структура сообщения
- WSDL + различные варианты биндинга (rpc/encoded, rpc/literal, document/literal) 

### JAX-WS на примере Axis
- WSDL-to-Java 
- Java-to-WSDL 
- Client (sync/async/dispatch)
- Проблемы совместимости

### JAX-RS
- Сравенение с JAX-WS

---

# Day 05

## XML и сериализация объектов
- Работа с XML 
- Понятие схемы и пример XSD
- Способы разбора документа 
- JAXP (DOM/SAX/StAX) 
- JAXB (overview/marshaling/unmarshalling)
- Преобразования XML

## Общие принципы разработки JavaEE приложений с помощью  фреймворков JSF

### Что такое web-приложение, для чего используется

### Структура приложения
- WEB-INF/classes, WEB-INF/lib
- web.xml

### Проектирование JSF web приложений
- Структура
- Макет страниц

### Библиотеки компонентов
- Базовые компоненты
- Валидаторы

### Обработка событий в JSF web приложениях

