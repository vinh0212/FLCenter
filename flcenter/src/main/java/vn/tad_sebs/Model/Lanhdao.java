/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.tad_sebs.Model;

/**
 *
 * @author ASUS
 */
public class Lanhdao extends Canbo
{
    private String Chucvu;
    public Lanhdao(){}
    public Lanhdao(int Id,String Name,String Date,String Sex,String Address, String Capbacham,String Chucvu)
    {
        super(Id,Name,Date,Sex,Address,Capbacham);
        this.Chucvu=Chucvu;
    }
    public String getChucvu()
    {
        
        return this.Chucvu;
    }
    public void setChucvu()
    {
        this.Chucvu=Chucvu;
    }
}

