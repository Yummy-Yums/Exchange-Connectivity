package com.kepf.Exchangeconnectivity.utility_and_connection;

import redis.clients.jedis.Jedis;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.net.URI;
import java.net.URISyntaxException;



public class RedisConnection {

    private static final int PORT = 6379;

    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost",6379);
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());


        //store data in redis list
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // Get the stored data and print it
        List<String> list = jedis.lrange("tutorial-list", 0 ,5);

        for(int i = 0; i<list.size(); i++) {
            System.out.println("Stored string in redis:: "+list.get(i));
        }
    }




}
