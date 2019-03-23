package com.esteban.peliculainfoservice.recursos;

import com.esteban.peliculainfoservice.modelos.Pelicula;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peliculas")
public class PeliculaRecurso {

    @GetMapping("/{idPelicula}")
    public Pelicula getPeliculaInfo(@PathVariable String idPelicula){

        if(idPelicula.equals("123")){
            return new Pelicula("123","Tonto y Retonto", "Risa");
        }
        if(idPelicula.equals("124")){
            return new Pelicula("124","Shrek", "Niño");
        }

        return new Pelicula();
    }

}
