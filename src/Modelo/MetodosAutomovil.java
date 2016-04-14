/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Moon
 */
public class MetodosAutomovil {
    
     ArrayList <Automovil> arrayAutomovil;
     String arregloDatos[];
     boolean agregoPrimeraVez=false;
     
    public MetodosAutomovil()
    {
        arrayAutomovil=new ArrayList <Automovil>();
        arregloDatos=new String[3];
        
    }
    
    public boolean agregar(String arreglo[])
    {
        boolean agrego=false;
        Automovil temporal=new Automovil(arreglo[0],arreglo[1],arreglo[2],arreglo[3]);
        
        if(agregoPrimeraVez==false)
        {
            arrayAutomovil.add(temporal);
            agregoPrimeraVez=true;
            agrego=true;
        }
        else
        {
            for(int conta=0; conta<arrayAutomovil.size(); conta++)
            {
                if(arrayAutomovil.get(conta).getNumeroRegistro().equals(arreglo[0]))
                {
                    
                }
                else
                {
                    arrayAutomovil.add(temporal);
                    agrego=true;
                }
            }
        }
        return agrego;
    }
    
    public boolean buscar(String numeroRegistro)
    {
        boolean busco=false;
        
        for(int conta=0; conta<arrayAutomovil.size(); conta++)
        {
            if(arrayAutomovil.get(conta).getNumeroRegistro().equals(numeroRegistro))
            {
                arregloDatos[0]=arrayAutomovil.get(conta).getNombreDuenio();
                arregloDatos[1]=arrayAutomovil.get(conta).getCedulaDuenio();
                arregloDatos[2]=arrayAutomovil.get(conta).getPlaca();
             
                busco=true;
            }
        }
        return busco;
    }
    
    public boolean eliminar(String numeroRegistro)
    {
        boolean elimino=false;
        
        for(int conta=0; conta<arrayAutomovil.size(); conta++)
        {
            if(arrayAutomovil.get(conta).getNumeroRegistro().equals(numeroRegistro))
            {
             arrayAutomovil.remove(conta);
             elimino=true;
             
                if(conta==0)
                {
                agregoPrimeraVez=false;
                }
            }
        }
        return elimino;
    }
    
    public boolean modificar(String arreglo[])
    {
        boolean modifico=false;
        
        for(int conta=0; conta<arrayAutomovil.size(); conta++)
        {
            if(arrayAutomovil.get(conta).getNumeroRegistro().equals(arreglo[0]))
            {
               arrayAutomovil.get(conta).setNombreDuenio(arreglo[1]);
               arrayAutomovil.get(conta).setCedulaDuenio(arreglo[2]);
               arrayAutomovil.get(conta).setPlaca(arreglo[3]);
               modifico=true;
            }
        }
        return modifico;
    }
    
    public String[] mostrarInformacion()
    {
        return this.arregloDatos;
    }
    
    public String aumentarCodigo()
    {
        String codigo="";
        
        if(arrayAutomovil.size()==0)
        {
            codigo="1";
        }
        else
        {
                for(int contador=0;contador<arrayAutomovil.size();contador++)
                {
                    if(arrayAutomovil.get(contador)!=null)
                    {
                        codigo=arrayAutomovil.get(contador).getNumeroRegistro();
                    }
                }
            int numero=Integer.parseInt(codigo);
            numero++;
            codigo=""+numero;
        }
        
       return codigo;
    }
    
}
