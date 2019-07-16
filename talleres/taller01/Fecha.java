/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author dcalleg
 */
public class Fecha {
    private final byte mes;
    private final byte dia;
    private final short año;

    public Fecha(byte mes, byte dia, short año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public byte getMes() {
        return mes;
    }

    public byte getDia() {
        return dia;
    }

    public short getAño() {
        return año;
    }
    
    public int comparar(Fecha otra)
    {
        if(this.getAño() == otra.getAño() && this.getMes() == otra.getMes() && this.getDia() == otra.getDia())
        {
            return 0;
        }
        else if(this.getAño() > otra.getAño() || this.getMes() > otra.getMes() || this.getDia() > otra.getDia())
        {
            return 1;
        }
        else
        {
            return -1;
        }
        
    }
   
    @Override
    public String toString()
    {
        return (this.getDia()+ "-" + this.getMes() + "-" + this.getAño());
    }
}
