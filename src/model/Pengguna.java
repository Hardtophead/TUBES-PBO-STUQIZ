/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Pengguna {
    private String id;
    private String nama;
    private String email;
    private String password;
    private String role;
    
    public String getId()
    {
        return this.id;
    } 
    public String getNama()
    {
        return this.nama;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getRole()
    {
        return this.role;
    }
    public void setId(String id)
    {
        this.id = id;
    } 
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setRole(String role)
    {
        this.role = role;
    }
}
