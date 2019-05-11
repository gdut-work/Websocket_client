# 参考资料
- https://www.cnblogs.com/jieerma666/p/10342435.html
- https://github.com/TooTallNate/Java-WebSocket/tree/master/src
- https://blog.csdn.net/qq_28859405/article/details/73656920

websocket客户端发往服务端的注册数据结构:
````
{
    "type": 1,
	"clientInfo": {
		"phone": "138001380000",
		"name1": "1",
		"name2": "2",
		"name3": "3",
		"name4": "4"
	}
}
````
websocket客户端发往服务端的响应数据结构:
````
{
    "type": 2,
	"clientInfo": {
		"context": "138001380000"
	}
}
````
