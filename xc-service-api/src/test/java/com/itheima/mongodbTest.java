package com.itheima;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

/**
 * @author Black
 * @version 1.0
 * @description com.itheima
 * @date 2018/12/1
 */
public class mongodbTest {

    @Test
    public void testConnection(){
        MongoClient mongoClient = new MongoClient("127.0.0.1",27017);

        MongoDatabase dbTest = mongoClient.getDatabase("test");

        MongoCollection<Document> firstCollection = dbTest.getCollection("first");

        Document document = firstCollection.find().first();

        String json = document.toJson();
        System.out.println(json);
    }
}
