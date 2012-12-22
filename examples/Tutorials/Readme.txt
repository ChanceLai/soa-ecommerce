例子假设运行在karaf上:

app01项目编译后，生成Calculator-1.0.jar、AddModule-1.0.jar、SubModule-1.0.jar三个bundle。
放到karaf/deploy文件夹下，启动karaf，输入list，可以看到三个bundle状态均为ACTIVE，而且blueprint
也是CREATE的状态。
这时就可以输入
karaf> calc:add 1 2
1 + 2 = 3
karaf> calc:sub 10 3
10 - 3 = 7

可尝试停了AddModule或SubModule后,输入以上命令，看结果如何。
