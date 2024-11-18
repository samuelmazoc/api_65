package com.example.Servidor.sura5.SERVICIOS;

import com.example.Servidor.sura5.MODELOS.ENFERMEDAD;
import com.example.Servidor.sura5.MODELOS.MEDICAMENTO;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioEnfermedad;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedicamento {
    //paso 1 - llamar al repositorio respectivo
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;
    //paso 2 - se progaman las funciones para las distintas operaciones en la BD

    //funcion para gardar datos
    public MEDICAMENTO guardarMedicamento(MEDICAMENTO datosMedicamento)throws  Exception{
        try{
            return iRepositorioMedicamento.save(datosMedicamento);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}