/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycuteblog;

/**
 *
 * @author isaac
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonSimpleWriteExample {

    public static void main(String[] args) {

        FileWriter file = null;
        try {
            JSONObject obj = new JSONObject();
            obj.put("name", "mkyong.com");
            obj.put("age", new Integer(100));
            JSONArray list = new JSONArray();
            list.add("msg 1");
            list.add("msg 2");
            list.add("msg 3");
            obj.put("messages", list);
            /*try (*/
            file = new FileWriter("./test.json")//) {
                    ;           file.write(obj.toJSONString());
                    file.flush();
                    //} catch (IOException e) {
                    //  e.printStackTrace();
                    // }
                    
                    System.out.print(obj);
        } catch (IOException ex) {
            Logger.getLogger(JsonSimpleWriteExample.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(JsonSimpleWriteExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
