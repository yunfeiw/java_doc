# 继承 （extends)

## 描述
* person 
    - 超类（super),父类，基类
* Student
    - 子类（subclass),扩展类


## protected 
* 父类 extends 子类，子类想获取子类的filed（字段），为该filed（字段）定义为protected(其默认为在 继承的作用域内被访问)

## super
* super关键字表示父类（超类）
* 子类 构造方法的第一行语句必须调用super
* 没有super()时编译器会自动生成是super()
* 如果父类没有默认构造方法（即需要传参），子类就必须显式调用super（）


## 转型语法
* Student s2 = (Student) s1;

## 向上转型
* 可以对实例变量进行向上转型（upcasting)
* 向上转型把一个子类型安全地变为更加抽象的类型
* 通俗点讲， 因为 student类extends于person类，所以student包含person所有的方法，即，student的instance可以是Person类型的独享

## 向下转型
* 可以对实例变量进行向下转型
* 向下转型把抽象的类型变成一个具体的子类型
* 向下转型很可能报错：classCastException

- 例:
`
Person p = new Student();
Student s = (Student) p

person p = new Person();
Student s = {Student} p;// classCastException

`

## 判断类型使用 instanceod判断

`
    p instanceof Stutend === true;
`

## 区分继承和组合

* Student 不宜从Book继承
* Student 可以持有一个Book实例
* 继承是is关系
* 组合是has关系

- 例

`
    public class Student extends person{
        private Book book;
        private in score;
        public int getScore(){

        };

    }

`

# 总结

* 继承是面向对象编程的一种代码复用方式
* java之允许单继承
* protected允许子类访问父类的字段和方法
* 子类的构造方法可以通过super()调用父类的构造方法
* 可以安全的向上转型为更抽象的类型
* 可以强制向下转型，最好借助instanceof 判断
* 子类和父类的关系是is，has关系不能用继承



# 注意
* 一个class没有extends任何类（ public class Person() ）,则其 extends 于 Object

                Object（根类）
                ^
                Person
                ^
                Student


* java 只允许 class extends 一个class
* 一个class且仅有一个parent class （Object除外）

