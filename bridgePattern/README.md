
  #结构型模式--桥接模式
 
   模式简介
   
    桥接模式是一种很实用的结构型设计模式，如果软件系统中某个类存在两个独立变化的维
    度，通过该模式可以将这两个维度分离出来，使两者可以独立扩展，让系统更加符合“单一职
    责原则”。
    
   设计理念
   
    在软件开发中如果一个类或一个系统有多个变化维度时，都可以尝试使用桥接模式对其进行设计
    
   相关角色
   
    1、Abstraction（抽象类） ：用于定义抽象类的接口，它一般是抽象类而不是接口，其中定义了
    一个Implementor（实现类接口） 类型的对象并可以维护该对象，它与Implementor之间具有关
    联关系，它既可以包含抽象业务方法，也可以包含具体业务方法
    2、RefinedAbstraction（扩充抽象类） ：扩充由Abstraction定义的接口，通常情况下它不再是抽
    象类而是具体类，它实现了在Abstraction中声明的抽象业务方法，在RefinedAbstraction中可以
    调用在Implementor中定义的业务方法
    3、Implementor（实现类接口） ：定义实现类的接口，这个接口不一定要与Abstraction的接口完
    全一致，事实上这两个接口可以完全不同，一般而言，Implementor接口仅提供基本操作，而
    Abstraction定义的接口可能会做更多更复杂的操作。
    4、ConcreteImplementor（具体实现类） ：具体实现Implementor接口，在不同的
    ConcreteImplementor中提供基本操作的不同实现，在程序运行时，ConcreteImplementor对象将
    替换其父类对象，提供给抽象类具体的业务操作方法
    
   优劣分析
   
    优势：
        1、分离抽象接口及其实现部分，使用“对象间的关联关系”解耦了抽象和实现之间固有的绑定关系，
        使得抽象和实现可以沿着各自的维度来变化。所谓抽象和实现沿着各自维度的变化，也就是说
        抽象和实现不再在同一个继承层次结构中，而是“子类化”它们，使它们各自都具有自己的子类，
        以便任何组合子类，从而获得多维度组合对象
        2、在很多情况下，桥接模式可以取代多层继承方案
        3、桥接模式提高了系统的可扩展性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统
    劣势：
        1、桥接模式的使用会增加系统的理解与设计难度，由于关联关系建立在抽象层，要求开发者
        一开始就针对抽象层进行设计与编程
        2、桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性，
        如何正确识别两个独立维度也需要一定的经验积累
    
   适用场景
    
    1、如果一个系统需要在抽象化和具体化之间增加更多的灵活性，避免在两个层次之间建立静态的继承关系，
    通过桥接模式可以使它们在抽象层建立一个关联关系
    2、“抽象部分”和“实现部分”可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个
    抽象化子类的对象和一个实现化子类的对象进行组合，即系统需要对抽象化角色和实现化角色进行动态耦合
    3、一个类存在两个（或多个） 独立变化的维度，且这两个（或多个） 维度都需要独立进行扩展
    4、对于那些不希望使用继承或因为多层继承导致系统类的个数急剧增加的系统，桥接模式尤为适用
   
   Demo介绍
   
    xx软件公司欲开发一个数据转换工具，可以将数据库中的数据转换成多种文件格式，例如txt、xml、pdf等格式，
    同时该工具需要支持多种不同的数据库

   
   

   