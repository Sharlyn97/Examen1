/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosAutomovil;
import Vista.FRM_Automovil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Moon
 */
public class Controlador_FRM_Automovil implements ActionListener{

    
    FRM_Automovil frm_automovil;
    MetodosAutomovil metodos;
    
    public Controlador_FRM_Automovil(FRM_Automovil frm_automovil)
    {
        this.frm_automovil=frm_automovil;
        metodos=new MetodosAutomovil();
        frm_automovil.aumentarCodigo(metodos.aumentarCodigo());
    }
    
    public void actionPerformed(ActionEvent e) 
    {
      
        if(e.getActionCommand().equals("Buscar"))  
          {
              if(metodos.buscar(frm_automovil.devolverNumeroRegistro()))
              {
                  frm_automovil.mensaje("Se encontró el registro");
                  frm_automovil.mostrarInformacion(metodos.mostrarInformacion());
                  frm_automovil.encontroBuscar();
                  frm_automovil.encontroBuscarText();
                                    
              }
              else
              {
                  frm_automovil.mensaje("No se encontro el registro");
                  frm_automovil.noEncontroCodigo();
                  frm_automovil.noEncontroCodigotext();
                  
              }
           //System.out.println("buscar");
          }
        if(e.getActionCommand().equals("Agregar"))  
          {
              if(metodos.agregar(frm_automovil.devolverInformacion()))
              {
                  frm_automovil.mensaje("Se agregó el registro");
                  frm_automovil.limpiarText();
                  frm_automovil.aumentarCodigo(metodos.aumentarCodigo());
                  frm_automovil.agrego();
                  
                  
              }
              else
              {
                  frm_automovil.mensaje("No se agregó correctamente");
              }
           //System.out.println("agregar");
          }
        if(e.getActionCommand().equals("Modificar"))  
          {
              if(metodos.modificar(frm_automovil.devolverInformacion()))
              {
                  frm_automovil.mensaje("Se modificó correctamente");
                  frm_automovil.estadoInicial();
                  frm_automovil.estadoInicialText();
                  frm_automovil.limpiarText();
                  frm_automovil.aumentarCodigo(metodos.aumentarCodigo());
                  
              }
              else
              {
                  frm_automovil.mensaje("No se modificó correctamente");
                  frm_automovil.estadoInicial();
                  frm_automovil.estadoInicialText();
                  frm_automovil.limpiarText();
              }
           //System.out.println("modifiar");
          }
        if(e.getActionCommand().equals("Eliminar"))  
          {
              if(metodos.eliminar(frm_automovil.devolverNumeroRegistro()))
              {
                  frm_automovil.mensaje("Se eliminó correctamente");
                  frm_automovil.estadoInicial();
                  frm_automovil.estadoInicialText();
                  frm_automovil.aumentarCodigo(metodos.aumentarCodigo());
                  
              }
              else
              {
                  frm_automovil.mensaje("No se eliminó correctamente");
                  frm_automovil.estadoInicial();
                  frm_automovil.estadoInicialText();
              }
           //System.out.println("eliminar");
          }
    
    }
    
}
