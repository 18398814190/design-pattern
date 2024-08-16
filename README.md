# design-pattern
java设计模式学习
### 1.adapter 适配器模式
用于在不改变原函数调用入口的前提下，新增接口实现类，接口实现类里扩展功能，然后原接口实现类里使用它进行功能扩展

### 2.builder 建造者模式
用于创建一个具有复杂依赖，并且依赖结构改变不大的对象。比如麦当套套餐对象

### 3.decorator 装饰器模式
用于增强原有类方法的功能，新增接口实现类，把原接口实现类放在新接口里做为属性，在新同名重写方法中增强

### 4.factory 工厂模式
创建一个工厂类，该工厂类通过入参来决定创建实现同一个接口的某个类对象。

### 5.iterator 迭代器模式
这个模式主要是在java中对集合遍历迭代器的解释，在集合类中创建内部类，使用hasNext和next方法进行遍历

### 6.observer 观察者模式
这个模式主要是用来在一个主题（被观察者）改变状态后，通知观察者做出改变的逻辑。

### 7.proxy 代理模式
这个模式和装饰器类似，但不同的是它主要体现在通过代理对具体对象的调用和控制，装饰器主要目的是增强功能

### 8.responsibility 责任链模式
这个模式可以在调用方法时，一层层的传递，让所有对象都调用到。类似于前端事件的冒泡机制，或者日志类的打印机制

### 9.singleton 单例模式
这个模式是重点，主要是用于控制只能创建一个对象。避免在创建多个复杂对象时消耗过多的内存

### 10.strategy 策略模式
这个模式可以通过改变构造参数，来使用不同的逻辑。很多场景都会用到，比如数据库的切换多个连接池实现

### 11.template 模板模式
这个模式是使用接口或者抽象类固定某些具体的逻辑，后面的实现类重写不同的部分，但是固定逻辑还是调用接口或抽象类的方法。
