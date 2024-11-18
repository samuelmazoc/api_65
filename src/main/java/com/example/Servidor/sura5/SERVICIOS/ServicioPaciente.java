package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaciente {
    //paso 1 - llamar al repositorio respectivo
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;
    //paso 2 - se progaman las funciones para las distintas operaciones en la BD

    //funcion para gardar datos
    public PACIENTE guardarPaciente(PACIENTE datosPaciente)throws  Exception{
        try{
            return iRepositorioPaciente.save(datosPaciente);

        }catch(Exception error){
        throw new Exception(error.getMessage());
        }
    }
}
