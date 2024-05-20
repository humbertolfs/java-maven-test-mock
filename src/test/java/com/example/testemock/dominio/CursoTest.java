package com.example.testemock.dominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    public void criarCurso() {
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Curso sobre Java");
        curso.setSkill("Java");
        curso.setCargaHoraria(8);

        assertEquals("Curso{titulo='Curso de Java', descricao='Curso sobre Java', skill=Java, cargaHoraria=8}",
                curso.toString());
    }

    @Test
    public void calcularXp() {
        Curso curso = new Curso();
        curso.setCargaHoraria(8);
        assertEquals(curso.calcularXp(), 8 * 10d);
    }

}