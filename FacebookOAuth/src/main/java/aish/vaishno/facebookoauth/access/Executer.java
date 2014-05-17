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
    
    private static final String CLIENT_TOKEN="8ef9db2931b2e80e1daebeddcb784093";
    private static final String APP_SECRET="e5f46b0c7e5716de90ae5338b9ca4e1f";
    private static final String APP_ID="1502661543287340";
    
    public static void main(String[] args){
        FacebookClient fbClient=new DefaultFacebookClient(CLIENT_TOKEN,APP_SECRET);
        User user=fbClient.fetchObject("me", User.class);
        System.out.println(user);
    }
    
    
    
}
