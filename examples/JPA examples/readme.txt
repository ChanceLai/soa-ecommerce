example1里的是持久化单元（PU）的定义；
关键点：
1、持久化单元（PU)定义（persistence.xml)；
2、数据源（Datasource）：采用apache的dbcp；
3、blueprint通过placeholder配置DataSource，并发布DataSource服务，并注册到JNDI ；
4、PU通过jndi引用Datasource；
5、部署时，karaf通过configAdmin服务将etc/com.ponder.examples.jpa01.cfg的配置信息读入到blueprint的placeholder处。

example2里的是引用example1里的PU发布出来的EntityManagerFactory的例子。