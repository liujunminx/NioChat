# Java基于多线程和NIO实现聊天室

- 涉及到的技术点
   - 线程池ThreadPoolExecutor
   - 阻塞队列BlockingQueue，生产者消费者模式
   - Selector
   - Channel
   - ByteBuffer
   - ProtoStuff 高性能序列化
   - HttpClient连接池
   - Spring依赖注入
   - lombok简化POJO开发
   - 原子变量
   - 内置锁
   
- 实现的功能
   - 登录注销
   - 单聊
   - 群聊
   - 客户端提交任务,下载图片并显示
   - 上线下线公告
   - 在线用户记录

- 客户端使用方式：
   - 登录：默认用户名是user1-user5，密码分别是pwd1-pwd5
   - 注销：关闭客户端即可
   - 单聊：@username:message
        - 例：@user2:hello
   - 群聊：message
        -  例：hello,everyone
