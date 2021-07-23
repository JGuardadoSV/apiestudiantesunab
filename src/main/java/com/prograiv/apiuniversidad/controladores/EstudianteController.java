package com.prograiv.apiuniversidad.controladores;

import com.prograiv.apiuniversidad.entidades.Estudiante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController()
public class EstudianteController {


    //htpp://localhost:8080/inicio
    @GetMapping("/inicio")
    @ResponseBody
    public Estudiante home(){
        Estudiante e1 = new Estudiante();
        e1.setId(1);
        e1.setNombre("Josue");
        return e1;
    }
    @GetMapping("/listado")
    @ResponseBody
    public List<Estudiante> listado(){
        List<Estudiante> lista = new ArrayList<>();
        Estudiante e1 = new Estudiante();
        e1.setId(1);
        e1.setNombre("Josue");
        lista.add(e1);

        e1 = new Estudiante();
        e1.setId(2);
        e1.setNombre("Pedro");
        lista.add(e1);

        return lista;
    }

    @PostMapping("/registrar")
    @ResponseBody
    public Estudiante nuevo(@RequestBody Estudiante estudiante) {
        return estudiante;
    }
}
