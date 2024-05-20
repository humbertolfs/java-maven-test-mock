package com.example.testemock.dominio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DevTest {

    @Mock
    private Curso curso;

    @InjectMocks
    private Bootcamp bootcamp;

    @Test
    public void testInscricaoBootcamp() {

        Dev dev = new Dev();
        bootcamp.getConteudos().add(curso);
        dev.inscreverBootcamp(bootcamp);
        assertEquals(bootcamp.getConteudos(), dev.getConteudosInscritos());
    }

    @Test
    public void testProgredir() {

        bootcamp.getConteudos().add(curso);

        Dev dev = new Dev();
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        assertTrue(dev.getConteudosConcluidos().contains(curso));
    }

    @Test
    public void testCalcularTotalXp() {

        bootcamp.getConteudos().add(curso);

        Dev dev = new Dev();
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        assertEquals(curso.calcularXp(), dev.calcularTotalXp());
    }

}
