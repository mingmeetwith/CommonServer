# CommonServer
A server for learn or job self.
构想：
第一阶段：先实现部分基本功能的开发
1、配置文件的解析（解析成json，然后读取使用，要有小例子）
2、redis方面的操作模块。
3、数据库方面的操作模块。
4、网络通信方面的模块。
5、线程池、定时调度方面的模块。
6、通用排行方面的模块。
7、日志打印方面的配置。

第二阶段：功能模块的开发。
1、功能模块的小例子。
2、对第一阶段基本功能调用的小例子。

第三阶段：通信客户端的开发。
实现客户端与上述服务器之间的连通。

第四阶段：集群方面的构想与示范。

上述基于springboot来开发。

详细：
配置文件的解析：源配置为excel，要解析成json（此json中没有对象类型，字符串类型中没有特殊字符，因为源配置都是配置的一些数据，功能中要用的一些东西），解析中要实现数组的转变，




nginx的用途：可以用作cdn（放置静态资源，如：静态页面、静态图片）。
nginx中自定义的数据结构（有无符号数、字符串、列表、table类似于map、缓冲区）
nginx http上下文的概念


开发一个简单的nginx模块（只有通过实际操作，才能有深刻的见解）

简洁的数据结构，优良的算法设计，高效的通讯方式......
