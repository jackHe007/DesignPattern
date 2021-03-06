
  #创建型模式--单例模式
 
   模式简介
   
    确保某个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
    要点：一是某个类只能有一个实例；二是它必须自行创建这个实例；三是它必须自行向这个系统提供这个实例
    
   设计理念
   
    不关心对象创建的细节，只需要传入正确的参数就可以得到想要的对象实例
    
   相关角色
   
    1、单例角色，在单例类的内部实现只生成一个实例，同时它提供一个静态的方法，
    让客户可以访问它的唯一实例；为了防止在外部对其实例化，将其构造函数设计为私有；
    在单例类内部定义了一个Singleton类型的静态对象，作为外部共享的唯一实例。
    
   优劣分析
   
    优势：
        1、单例模式提供了对唯一对象的受控访问
        2、节约系统资源，对于需要频繁创建和销毁的对象单例模式无疑提高系统的性能
        3、允许可变数目的实例。基于单例模式我们可以进行扩展，使用与单例控制相似的方法来获
          得指定个数的对象实例，既节省系统资源，又解决了单例对象共享过多有损性能的问
          题
    劣势：
        1、单例类扩展困难
        2、单例类职责过重，一定程度上违背“单一职责原则”。既充当工厂角色，提供工厂方法，
        又充当产品角色，包含一些业务方法，将产品的创建和功能融合在一起
        3、共享对象长时间不用，会被回收机制销毁和释放资源，下次使用又需要重新实例化，导致共享对象状态丢失
    
   适用场景
    
    1、系统只需要创建一个实例对象
    2、调用类单个实例只允许一个公共访问点
   
   Demo介绍
   
    1、懒汉式类，LazySingletonPattern,2、饿汉式类，HungrySingletonPattern，
    3、IoDh技术类，既包含静态内部类的类StaticInternalSingleton

   
   

   
