# redis

To run this example using Java main method you need to install Redis
1. Download and unzip Redis from their website
2. Build Redis
3. Start Redis

You can run the following commands:

wget http://download.redis.io/redis-stable.tar.gz
tar xvzf redis-stable.tar.gz
cd redis-stable
make

To start Redis:
$redis-server

To check if Redis is running:
$redis-cli                                                                
redis 127.0.0.1:6379> ping
PONG
redis 127.0.0.1:6379> set mykey somevalue
OK
redis 127.0.0.1:6379> get mykey
"somevalue"
