/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.facebookoauth.access;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

/**
 *
 * @author aishwarya
 */
public class Executer {
    
    private static final String CLIENT_TOKEN="xxx";
    private static final String APP_SECRET="yyyy";
    private static final String APP_ID="12313";
    
    public static void main(String[] args){
        FacebookClient fbClient=new DefaultFacebookClient(CLIENT_TOKEN,APP_SECRET);
        User user=fbClient.fetchObject("me", User.class);
        System.out.println(user);
    }
    
    
    
}
