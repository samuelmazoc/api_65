package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.ENFERMEDAD;
import com.example.Servidor.sura5.MODELOS.PACIENTE;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioEnfermedad;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioEnfermedad {
    //paso 1 - llamar al repositorio respectivo
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;
    //paso 2 - se progaman las funciones para las distintas operaciones en la BD

    //funcion para gardar datos
    public ENFERMEDAD guardarEnfermedad(ENFERMEDAD datosEnfemedad)throws  Exception{
        try{
            return iRepositorioEnfermedad.save(datosEnfemedad);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}