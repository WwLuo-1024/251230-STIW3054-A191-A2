/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author WANG LUO
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        followerThread th = new followerThread(0);
        int num = th.getAllName().size();
        try{
        ExecutorService executor = Executors.newFixedThreadPool(num);
        followerThread[] thread = new followerThread[num];
        System.out.println("| No. |      login id      |   Number of respositories    | Number of Follower | Number of Following | Number of Star |");
        for(int i =0;i<thread.length;i++){
            thread[i] = new followerThread(i);           
            executor.execute(thread[i]);
            Thread.sleep(10000);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
            
        }
        }catch(Exception e){
            e.wait();
//            e.printStackTrace();
        }
    }
}
