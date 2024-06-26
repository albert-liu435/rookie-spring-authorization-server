### 登录
DefaultAuthorizationServerApplicationTests
http://localhost:9000/
输入账号和密码
### 获取code
在浏览器登录成功之后，输入下面的url地址，可以看到换取的code
http://localhost:50463/oauth2/authorize?response_type=code&client_id=messaging-client&scope=openid&state=some-state&redirect_uri=http://127.0.0.1:8080/login/oauth2/code/messaging-client-oidc


### 登录
DefaultAuthorizationServerConsentTests
http://localhost:9000/oauth2/authorize?response_type=code&client_id=messaging-client&scope=openid%20message.read%20message.write&state=state&redirect_uri=http://127.0.0.1/login/oauth2/code/messaging-client-oidc
