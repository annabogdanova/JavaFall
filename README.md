# JavaFall
ФИО
1) Укажите Ваши фамилию, имя и отчество
 богданова анна вадимовна

2) Какова разница между абстрактным классом и интерфейсом?
 Абстрактный класс — это класс, объявленный с модификатором abstract. Он может иметь тот же набор полей, что и обычный класс, плюс методы (также объявленные с модификатором abstract) без реализации. Ее должны предоставить не-abstract наследники - void abstract doSomething(); на основе абстрактного класса нельзя создавать объекты. Реализация абстрактного класса - через ключевое слово abstract
Интерфейс — это абстрактный тип, описывающий поведение, которое должны реализовать классы, реализующие его. В рамках интерфейса можно описывать abstract final методы и static final свойства. Реализация интерфейса - через ключевое слово implements
 
3) Как «насильно» вызвать сборку мусора?
 вызвать у него метод gc(). Например -
 Runtime rt = Runtime.getRuntime();
 rt.gc();
 метод пытается удалить те объекты, на которые потеряна ссылка и которые больше не могут быть использованы

4) Когда требуется явное приведение классов?
 если переменной суперкласса присваевается объект подкласса, то все в порядке (приводим к объекту более универсального типа), если наоборот - требуется приведение типов (после приведения возможности класса расширяются)

5) Чем конструкторы отличаются от других методов?
 конструкторы используются для создания экземпляров класса и вызываются с ключевым словом new. Не имеют возвращаемого значения и называются так же, как класс.

6) Можно ли вызывать конструкторы один из другого, если их в классе несколько?
 да, можно. Для этого используется ключевое слово this(parametr1, parametr2) - с указанием параметров. Конструктор без параметров - конструктор по умолчанию.

7) В чем разница между JDK и JRE?
 JDK - java development kit - набор библиотек и инструментов для создания программ и разработки сервлетов. Включает в себя JRE. JRE - java runtime enviroment - минимальный набор библиотек и jvm и плагин, где будут выполняться апплеты. jvm - виртуальная среда, где выполняется скомпилированный код. Сервлет - компонент приложения, выполняющийся на стороне сервера и умеющий обрабатывать клиентские запросы и динамически генерировать ответы на них.

8) Имеет ли значение в каком порядке перехватывать исключения FileNotFoundException и IOExceptipon?
 FileNotFoundException - подкласс IOExceptipon. Обработчик IOExceptipon обработает также и все подклассы. Т.е. обработчик FileNotFoundException не будет вызван.

9) Могут ли внутренние классы, описанные внутри метода, иметь доступ к локальным переменным этого метода?
 static nested classes - не имеют доступа к нестатическим полям и методам, но имеют доступ к статическим полям, даже приватным внешнего класса
 member inner classes - внутренние классы-члены делятся на внутренние классы-члены (ассоциируется с объектом класса и имеют доступ ко всем полям и методам), локальные (то же самое + может обращаться к final полям и элементам, не могут быть объявлены как private, public, protected, static, не могут иметь статических объявлений кроме констант - static final) и анонимные (локальные классы без имени, невозможно описать конструктор)

10) Как подкласс может обратиться к методу или конструктору из суперкласса?
 через метод super.doSmth() - для метода или ClassName(){super(param)} - для конструктора

11) В чем разница между очередью и стеком?
 стек реализует механизм FILO (first in - last out), а очередь - FIFO (first in - first out)

12) Что вам приходит в голову, когда вы слышите о новом поколении (young generation) в Java?
 young generation - раздел памяти в java-машине, в который попадают объекты, не удаленные после сборки мусора

13) Есть два класса: A и B. Класс B должен информировать класс A когда случается некое важное событие. Какой design-pattern вы должны реализовать?
 Event agregator - оповещает класс-клиент о действии, о котором тот должен знать 

14) Какой модификатор доступа надо указать в классе, чтобы доступ к нему имели только классы из того же пакета?
 default - (можно не писать) члены класса видны только внутри пакета,  protected - члены класса видны внутри пакета и в наследниках

15) Чем отличается статический внутренний класс от просто внутреннего класса?
 внутренний статический класс полностью независим от своего внешнего класса. Чтобы он имел доступ к полям внешнего класса нужно создать объект этого класса. Если класс не статический, он имеет неявную ссылку на внешний класс.

16) можно ли обратиться к не-статической переменной из статического метода?
 нельзя напрямую. Но можно, как к переменной объекта.

17) какие типы данных есть в Java?
 ссылочные (классовые типы. интерфейсные, типы массивов) и примитивные (boolean, char, int, long, short, byte, float,double). И ссыльные типы для примитивных (Integer, Boolean…).

18) Чем отличаются переопределение (Override) и перегрузка (Overload)
 переопределение нужно для изменения некоторого метода, имеющего то же название и сигнатуру, что и метод в родительском классе - например run() интерфейса Runnable. Перегрузка - определение нового метода в том же классе, с уже существующим названием, но отличной сигнатурой - например getStudent(name) и getStudent(faculty) - для выбора студентов университета по имени или по факультету.

19) Что такое итератор?
 итератор - объект, позволяющий перебирать объекты коллекции
 коллекция - хранилище, поддерживающее различные способы  накопления и упорядочивания объектов с целью обеспечения возможностей эффективного доступа к ним

20) Перечислите основные категории исключительных ситуаций
 Exception(runtimeException) - состояния, которые должны перехватывать программы пользователя, Error - состояния, обработка которых пользователем не ожидается. Подклассы проверяемых исключений - IllegalAccess, ClassNotFoundException, CloneNotSupportedException…

21) Какая разница между throw и throws?
 throw - программа явно выбрасывает исключение - throw ThrowbleException
 throws - перечисляет типы исключений, которые может выбрасывать метод

22) Зачем нужен блок finally?
 если в процессе работы программы возникает ошибка, то это изменяет нормальный путь прохождения потока через метод. Блок finally выполняется в любом случае. Например, потребовалось открыть некий файл. В процессе работы над ним произошла ошибка и команда закрытия файла осталась невыполненной. Чтобы избежать подобного инструкцию закрытия файла следует поместить в блок  finally.
 
23) Что такое finalize?
 метод, в котором можно определить действия, которые будут выполняться, когда объект будет использоваться сборщиком мусора.
 
24)Перечислите все виды внутренних классов
 static nested classes - статические вложенные. Не имеют доступа к нестатическим полям и методам, но имеют доступ к статическим полям, даже приватным внешнего класса
 member inner classes - внутренние классы-члены делятся на внутренние классы-члены (ассоциируется с объектом класса и имеют доступ ко всем полям и методам), локальные (то же самое, но работает только в том блоке, в котором определен + может обращаться к final полям и элементам, не могут быть объявлены как private, public, protected, static, не могут иметь статических объявлений кроме констант - static final) и анонимные (локальные классы без имени, невозможно описать конструктор)
