### 生产实例--通过复制生产实例
**使用场景：**   
1、对象种类繁多，无法将他们整合到一个类时  
2、难以根据类生产实例  
3、想解耦框架与生成实例时  
将框架从类名地束缚中解脱出来（作为组件复用）   
  
**注意点：**   
1、Cloneable称为标识接口  
2、clone方法进行的是浅复制：只是将复制实例的字段值直接复制到到新的实例中  
3、可以重写满足新需求