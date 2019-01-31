## spring IOC和AOP的简易实现

### IOC实现步骤

>* 加载 xml 配置文件，遍历其中的标签

>* 获取标签中的 id 和 class 属性，加载 class 属性对应的类，并创建 bean

>* 遍历标签中的标签，获取属性值，并将属性值填充到 bean 中

>* 将 bean 注册到 bean 容器中

### AOP实现步骤

>* 定义一个包含切面逻辑的对象，这里假设叫 MethodInvocation

>* 定义一个 Advice 对象（实现了 InvocationHandler 接口），并将上面的 MethodInvocation 和 目标对象传入

>* 将上面的 Advice 对象和目标对象传给 JDK 动态代理方法，为目标对象生成代理

