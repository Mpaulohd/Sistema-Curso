package com.marcos.sistemaCurso.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.sistemaCurso.models.Curso;

import java.util.Random;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @PostMapping
    public Curso criar(@RequestBody Curso curso) {

        System.out.println(curso);

        Random gerador = new Random();
        curso.setId(gerador.nextLong());
        System.out.println("criou");
        return curso;
    }

    @PatchMapping("/{id}")
    public void atualizar(@RequestBody Curso curso, @PathVariable Long id ) {
        System.out.println(curso);
        System.out.println("atualizou id "+ id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        System.out.println("deletou: " + id);
    }

    @GetMapping
    public void listar() {

        System.out.println("listou");
    }

    @GetMapping("/{id}")
    public void obter(@PathVariable long id) {
        System.out.println("obteve "+ id);
    }

}
