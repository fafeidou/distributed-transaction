# 基于消息队列实现分布式事务
   * 背景：通常电商场景，下订单减库存，订单和库存是两个服务，如何保证两个服务之间的事务。于是想到了消息队列去实现。
   * 实现原理：由于是两个服务，假如减库存是异步的，
   * 思路如下：
     1. 下单，redis预减库存，记录一个task表，两个操作放到一个事务
     2. 订单服务任务轮训task表发消息到库存服务
     3. 库存服务收到消息，减库存，记录一个task表，两个操作放到一个事务
     4. 库存服务轮训自己的task表，发消息给订单服务
     5. 订单服务收到消息，记录task_history表，删除那条task任务
   * 这样是基于消息的不断通知去做的，方法简单，可以保证业务的最终一致性
   
## 创建订单服务

### 用到的脚本

## 创建库存服务

### 用到的脚本
