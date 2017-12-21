/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaka_rplmart;

/**
 *
 * @author nindra
 */
public class Session {
    
    static private String user     = "";
    static private String nama     = "";
    static private String level    = "";
    
    
    //set method
    
    static public void set_user(String user)
    {
        Session.user = user;
    }
    
    static public void set_nama(String nama)
    {
        Session.nama = nama;
    }
    
    static public void set_level(String level)
    {
        Session.level = level;
    }
    
    
    //get method
    
    static public String get_user()
    {
        return Session.user;
    }
    
    static public String get_nama()
    {
        return Session.nama;
    }
    
    static public String get_level()
    {
        return Session.level;
    }
}
