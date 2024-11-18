package com.example.Servidor.sura5.CONTROLADORES;

import com.example.Servidor.sura5.MODELOS.MEDICAMENTO;
import com.example.Servidor.sura5.MODELOS.MEDICO;
import com.example.Servidor.sura5.SERVICIOS.ServicioMedicamento;
import com.example.Servidor.sura5.SERVICIOS.ServicioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medico")
public class ControladorMedico {
    @Autowired
    ServicioMedico servicioMedico;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestHeader MEDICO datos){

        try{
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioMedico.guardarMedico(datos));

        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
}
