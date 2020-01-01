/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author WANG LUO
 */
//This class is used for get every follower link,and we just need to replace each log id of link,then we can get each follower page link.
public class get_link {
    String name;
    public get_link(String name){
        this.name = name;
    }
        
        public String getLinksByJsoup(){  
        String full_link;
        String link = "https://github.com/{}?&tab=followers";
        full_link=link.replace("{}", name);       
        return full_link;
    }
}
