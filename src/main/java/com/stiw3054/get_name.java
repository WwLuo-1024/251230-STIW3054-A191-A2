/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author WANG LUO
 */
//This class is for collecting each follower name,because i need to get each follower link,and all user link are organized with their name(logid). 
//Such as:https://github.com/zhamri?&tab=followers and https://github.com/WangLuo-1408?&tab=followers These two link are just different from the logid
//So we just need to change the logid in each link,then we can get each follower link.
//It is convenient for me to collect each follower link and to read their information
public class get_Name { 
    String url,divContent;
    public get_Name(String url,String divContent){
        this.url = url;
        this.divContent = divContent;
    }

public  List<String> getNameByJsoup(){  
        Document doc = Jsoup.parse(divContent,url);  
        List<String> nameList=new ArrayList<String>();
        Elements linkStrs = doc.getElementsByClass("position-relative");  
        linkStrs.toString();
        for(Element linkStr:linkStrs){  
            List<String> url=linkStr.getElementsByClass("link-gray pl-1").eachText();
                for(int i = 0;i<url.size();i++){
                    String name = url.get(i);
                    nameList.add(name);
            }         
        }
        return nameList;
    }
}
