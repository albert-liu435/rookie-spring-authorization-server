## 版本v1.0.0



1、运行rookie-authorization-server-demo01

访问： http://127.0.0.1:8080/oauth2/authorize?response_type=code&client_id=messaging-client&scope=message.read&redirect_uri=http://127.0.0.1:8080/authorized

### 授权码模式

会出现如下页面，分别输入用户名user和密码password后，点击Sign in

![e1f33358518f6f0e0fbe040f86cdc3b](pic/demo01/e1f33358518f6f0e0fbe040f86cdc3b.png)

跳转如下：然后点击提交

![image-20230302225214320](pic/demo01/image-20230302225214320.png)

![0d29073076e38647fbc280aeaf91e64](pic/demo01/0d29073076e38647fbc280aeaf91e64.png)

授权码获取token的请求地址是`oauth2/token`，post请求

![c0479834f24ab33881ccc7e89a724e7](pic/demo01/c0479834f24ab33881ccc7e89a724e7.png)

上线这个三个参数是必须的，并且要跟代码中设置完全一直，另外获取token要传递client_id和client_secret参数，默认不支持使用表单传递，要通过header传递。比如在postman中

![05bcfcf622e2f591a75bd66933965e6](pic/demo01/05bcfcf622e2f591a75bd66933965e6.png)

刷新token

![0a83d51fa36ea8d28ad4845f9ad7d96](pic/demo01/0a83d51fa36ea8d28ad4845f9ad7d96.png)

![61c2daa0930a37a186a5277d75ae307](pic/demo01/61c2daa0930a37a186a5277d75ae307.png)

### 客户端模式

客户端模式没有刷新token模式。

![da9f8863a383c60271d58838d278a38](pic/demo01/da9f8863a383c60271d58838d278a38.png)![611202bb6183a0c21e05a60dc2432b1](pic/demo01/611202bb6183a0c21e05a60dc2432b1.png)

## 版本V1.0.1

同上，进行验证即可

