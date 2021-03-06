# DesignPattern(设计模式)
**Java设计模式概念与案例学习**

**1)工厂模式**

工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

概念详情参考：http://www.runoob.com/design-pattern/factory-pattern.html

**2)抽象工厂模式**

抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

概念详情参考：http://www.runoob.com/design-pattern/abstract-factory-pattern.html

**3)单例模式**

单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

概念详情参考：http://www.runoob.com/design-pattern/singleton-pattern.html

**4)建造者模式**

建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。

概念详情参考：http://www.runoob.com/design-pattern/builder-pattern.html

**5)原型模型**

原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。

概念详情参考：http://www.runoob.com/design-pattern/prototype-pattern.html

**6)适配器模型**

适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。

概念详情参考：http://www.runoob.com/design-pattern/adapter-pattern.html

**7)桥接模式**

桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。

概念详情参考：http://www.runoob.com/design-pattern/bridge-pattern.html

**8）过滤模式**

过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。

概念详情参考： http://www.runoob.com/design-pattern/filter-pattern.html

**9)组合模式（部分整体模式）**

组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

概念详情参考：http://www.runoob.com/design-pattern/composite-pattern.html

**10)装饰模式**

装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。

概念详情参考：http://www.runoob.com/design-pattern/decorator-pattern.html

**11)外观模式**

外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
   
概念详情参考：http://www.runoob.com/design-pattern/facade-pattern.html

**12)享元模式**
   
享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
   
概念详情参考：http://www.runoob.com/design-pattern/flyweight-pattern.html

**13)代理模式**

在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。

概念详情参考：http://www.runoob.com/design-pattern/proxy-pattern.html

**14)责任链模式**

顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。

概念详情参考：http://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html

**15)命令模式**

命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

概念详情参考：http://www.runoob.com/design-pattern/command-pattern.html

**16)解释器模式**

解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。

概念详情参考:http://www.runoob.com/design-pattern/interpreter-pattern.html

**17)迭代器模式**

迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。

概念详情参考：http://www.runoob.com/design-pattern/iterator-pattern.html

**18)中介者模型**

中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。

概念详情参考：http://www.runoob.com/design-pattern/mediator-pattern.html

**19)备忘录模型**

备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。

概念详情参考：http://www.runoob.com/design-pattern/memento-pattern.html

**20)观察者模式**
   
当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。
   
概念详情参考：http://www.runoob.com/design-pattern/observer-pattern.html

**21)状态模式**
   
在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
   
概念详情参考：http://www.runoob.com/design-pattern/state-pattern.html

**22)空对象模型**
   
在空对象模式（Null Object Pattern）中，一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方。
   
概念详情参考：http://www.runoob.com/design-pattern/null-object-pattern.html

**23)策略模式**
   
在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
   
概念详情参考：http://www.runoob.com/design-pattern/strategy-pattern.html

**24)模板模式**
   
在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
   
概念详情参考：http://www.runoob.com/design-pattern/template-pattern.html

**25)访问者模式**
   
在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
   
概念详情参考：http://www.runoob.com/design-pattern/visitor-pattern.html

26）**MVC 模式**
   
MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。这种模式用于应用程序的分层开发。

**_Model（模型）_** - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。<br>
**_View（视图）_** - 视图代表模型包含的数据的可视化。<br>
**_Controller（控制器）_** - 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。
   
概念详情参考：http://www.runoob.com/design-pattern/mvc-pattern.html   

**27)业务代表模式**

业务代表模式（Business Delegate Pattern）用于对表示层和业务层解耦。它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能。在业务层中我们有以下实体。
  
**_客户端（Client）_** - 表示层代码可以是 JSP、servlet 或 UI java 代码。<br>
**_业务代表（Business Delegate）_** - 一个为客户端实体提供的入口类，它提供了对业务服务方法的访问。<br>
**_查询服务（LookUp Service）_** - 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问。<br>
**_业务服务（Business Service）_** - 业务服务接口。实现了该业务服务的实体类，提供了实际的业务实现逻辑。

概念详情参考：http://www.runoob.com/design-pattern/business-delegate-pattern.html  

**28)组合实体模式**

组合实体模式（Composite Entity Pattern）用在 EJB 持久化机制中。一个组合实体是一个 EJB 实体 bean，代表了对象的图解。当更新一个组合实体时，内部依赖对象 beans 会自动更新，因为它们是由 EJB 实体 bean 管理的。以下是组合实体 bean 的参与者。
   
**_组合实体（Composite Entity）_** - 它是主要的实体 bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。
**_粗粒度对象（Coarse-Grained Object）_** - 该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。
**_依赖对象（Dependent Object）_** - 依赖对象是一个持续生命周期依赖于粗粒度对象的对象。
**_策略（Strategies）_** - 策略表示如何实现组合实体。

概念详情参考：http://www.runoob.com/design-pattern/composite-entity-pattern.html

**29）数据访问对象模式**
   
数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来。以下是数据访问对象模式的参与者。
   
**_数据访问对象接口（Data Access Object Interface）_** - 该接口定义了在一个模型对象上要执行的标准操作。<br>
**_数据访问对象实体类（Data Access Object concrete class）_** - 该类实现了上述的接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是 xml，或者是其他的存储机制。<br>
**_模型对象/数值对象（Model Object/Value Object）_** - 该对象是简单的 POJO，包含了 get/set 方法来存储通过使用 DAO 类检索到的数据。

概念详情参考：http://www.runoob.com/design-pattern/data-access-object-pattern.html

**30)前端控制器模式**
前端控制器模式（Front Controller Pattern）是用来提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。以下是这种设计模式的实体。
   
**_前端控制器（Front Controller）_** - 处理应用程序所有类型请求的单个处理程序，应用程序可以是基于 web 的应用程序，也可以是基于桌面的应用程序。
**_调度器（Dispatcher）_** - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。
**_视图（View）_** - 视图是为请求而创建的对象。

概念详情参考：http://www.runoob.com/design-pattern/front-controller-pattern.html

**31)拦截过滤器模式**
拦截过滤器模式（Intercepting Filter Pattern）用于对应用程序的请求或响应做一些预处理/后处理。定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上。过滤器可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。以下是这种设计模式的实体。
   
**_过滤器（Filter）_** - 过滤器在请求处理程序执行请求之前或之后，执行某些任务。<br>
**_过滤器链（Filter Chain）_** - 过滤器链带有多个过滤器，并在 Target 上按照定义的顺序执行这些过滤器。<br>
**_Target_** - Target 对象是请求处理程序。<br>
**_过滤管理器（Filter Manager）_** - 过滤管理器管理过滤器和过滤器链。<br>
**_客户端（Client）_** - Client 是向 Target 对象发送请求的对象。

概念详情参考：http://www.runoob.com/design-pattern/intercepting-filter-pattern.html


**32)服务定位器模式**
服务定位器模式（Service Locator Pattern）用在我们想使用 JNDI 查询定位各种服务的时候。考虑到为某个服务查找 JNDI 的代价很高，服务定位器模式充分利用了缓存技术。在首次请求某个服务时，服务定位器在 JNDI 中查找服务，并缓存该服务对象。当再次请求相同的服务时，服务定位器会在它的缓存中查找，这样可以在很大程度上提高应用程序的性能。以下是这种设计模式的实体。
   
**_服务（Service）_** - 实际处理请求的服务。对这种服务的引用可以在 JNDI <br>
**_Context_** / 初始的 Context - JNDI Context 带有对要查找的服务的引用。<br>
**_服务定位器_**（Service Locator - 服务定位器是通过 JNDI 查找和缓存服务来获取服务的单点接触。<br>
**_缓存（Cache）_** - 缓存存储服务的引用，以便复用它们。<br>
**_客户端（Client）_** - Client 是通过 ServiceLocator 调用服务的对象。

概念详情参考：http://www.runoob.com/design-pattern/service-locator-pattern.html


**33)传输对象模式**
传输对象模式（Transfer Object Pattern）用于从客户端向服务器一次性传递带有多个属性的数据。传输对象也被称为数值对象。传输对象是一个具有 getter/setter 方法的简单的 POJO 类，它是可序列化的，所以它可以通过网络传输。它没有任何的行为。服务器端的业务类通常从数据库读取数据，然后填充 POJO，并把它发送到客户端或按值传递它。对于客户端，传输对象是只读的。客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的数值。以下是这种设计模式的实体。
   
**_业务对象（Business Object）_** - 为传输对象填充数据的业务服务。<br>
**_传输对象（Transfer Object）**_ - 简单的 POJO，只有设置/获取属性的方法。<br>
**_客户端（Client）_** - 客户端可以发送请求或者发送传输对象到业务对象。

概念详情参考：http://www.runoob.com/design-pattern/transfer-object-pattern.html
