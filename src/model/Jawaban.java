/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Jawaban {
    private String id;
    private String nim;
    private String id_soal;
    private String soal;
    private String jawaban;
    
    public String getId()
    {
        return this.id;
    } 
    public String getNim()
    {
        return this.nim;
    }
    public String getId_soal()
    {
        return this.id_soal;
    }
    public String getSoal()
    {
        return this.soal;
    }
    public String getJawaban()
    {
        return this.jawaban;
    }
    
    public void setId(String id)
    {
        this.id = id;
    } 
    public void setNim(String nim)
    {
        this.nim = nim;
    } 
    public void setId_soal(String id_soal)
    {
        this.id_soal = id_soal;
    } 
    public void setSoal(String soal)
    {
        this.soal = soal;
    } 
    public void setJawaban(String jawaban)
    {
        this.jawaban = jawaban;
    } 
 
}
