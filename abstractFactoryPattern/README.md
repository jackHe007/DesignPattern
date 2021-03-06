
  #创建型模式--抽象工厂模式
 
   模式简介
   
    这种设计模式并不在GoF 23种设计模式之中，提供一个创建一些列相关或相互依赖对象的接口，而无须指定他们具体的类
    
   设计理念
   
    不再由同一个工厂创建所有对象，针对不同产品，提供与之对应的工厂来生成产品的对象实例
    
   相关角色
   
    1、抽象工厂角色，它声明了一组用于创建一系列产品（属于同一个父类下的多个子类）的方法，每一个方法对应一个产品
    2、具体工厂角色，实现了抽象工厂中声明创建产品的方法，生成一系列产品，这些产品构成了一个产品族，每个产品都位于某一个产品等级中
    3、抽象产品角色，它为每种产品声明接口，在抽象产品中声明了产品所具有的业务方法
    4、具体产品角色，它定义具体工厂生产的具体产品对象，实现抽象产品接口中声明的业务方法
    
   优劣分析
   
    优势：
        1、抽象工厂模式隔离了具体类的生成，使得客户并不需要知道什么被创建
        2、当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象，例如一个工厂可以生成不同品牌的手机
        3、增加新的产品族很方便，无须修改已有系统
    劣势：
        1、增加新的产品等级结构麻烦，需要对原有系统进行较大的修改，甚至需要修改抽象层代码，
          这显然会带来较大的不便，违背了“开闭原则”。例如，当前抽象工厂只能生成手机和平板，现需要支持电脑的生产，此时，
          包括抽象工厂，具体工厂在内所有相关类都需要修改
    
   适用场景
   
    1、用户无须关心对象的创建过程，将对象的创建和使用解耦
    2、系统中有多于一个的产品族，而每次只使用其中某一产品族。即一个品牌的不同产品
    3、属于同一个产品族的产品将在一起使用，这一约束必须在系统的设计中体现出来，例如，房间里摆放的不同的顾家家居的家具
    4、产品等级结构稳定，设计完成之后，不会向系统中增加新的产品等级结构或者删除已有的产品等级结构，例如，只生成sony，akg的设备
   
   Demo介绍
   
    设计一个抽象工厂类AbstractSystemFactory，三个具体工厂类(AndroidSystemFactory,SymbianSystemFactory,WindowsMobileSystemFactory)，
    两个接口父类(PlayGame,PlayMusic)，分别有三个子类
    
   
   

   
