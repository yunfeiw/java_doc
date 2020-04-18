# 方法重载

* 方法重载（overload)是指：
    1. 多个方法的方法名相同
    2. 各自的参数不同：
        - 参数个数不同
        - 参数类型不同
        - 参数位置不同
    3. 方法返回值类型通常都是相同的

## 例：

`
    String类的重载方法indexOf;

    int indexOf(int ch);
    int indexOf(String str)
    int indexOf(int ch,int ftomIndex)
    int indexOf(String str,int fromIndex)

`
## 总结

* 重载方法应该完成相同的动能，参考String的indexOf();
* 重载方法依靠参数类型和数量区分

* 不要去交换参数顺序

* 重载方法返回值类型应该相同