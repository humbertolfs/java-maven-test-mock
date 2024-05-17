package com.example.testemock.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class MentoriaTest {

    @Test
    public void criarMentoria() {
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setSkill("Java");
        mentoria.setData(LocalDate.now());

        assertEquals("Mentoria{titulo='Mentoria de Java', descricao='Mentoria sobre Java', skill=Java, data="
                + LocalDate.now() + "}", mentoria.toString());
    }

    @Test
    public void calcularXpDeveRetornarXP_PADRAOmais20() {
        Mentoria mentoria = new Mentoria();
        assertEquals(mentoria.calcularXp(), 20d + 10d);
    }

}
