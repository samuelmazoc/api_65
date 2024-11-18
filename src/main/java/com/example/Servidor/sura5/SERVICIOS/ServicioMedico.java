package com.example.Servidor.sura5.SERVICIOS;


import com.example.Servidor.sura5.MODELOS.MEDICO;

import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedico {
    //paso 1 - llamar al repositorio respectivo
    @Autowired
    IRepositorioMedico iRepositorioMedico;
    //paso 2 - se progaman las funciones para las distintas operaciones en la BD

    //funcion para gardar datos
    public MEDICO guardarMedico(MEDICO datosMedico)throws  Exception{
        try{
            return iRepositorioMedico.save(datosMedico);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
