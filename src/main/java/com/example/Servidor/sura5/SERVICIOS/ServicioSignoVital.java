package com.example.Servidor.sura5.SERVICIOS;


import com.example.Servidor.sura5.MODELOS.SIGNO_VITAL;
import com.example.Servidor.sura5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioSignoVital {
    //paso 1 - llamar al repositorio respectivo
    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;
    //paso 2 - se progaman las funciones para las distintas operaciones en la BD

    //funcion para gardar datos
    public SIGNO_VITAL guardarSignoVital(SIGNO_VITAL datosSignoVital)throws  Exception{
        try{
            return iRepositorioSignoVital.save(datosSignoVital);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
