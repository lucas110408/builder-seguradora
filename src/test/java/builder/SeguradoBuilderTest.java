package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguradoBuilderTest {

    @Test
    void deveRetornarExcecaoParaSeguradoSemCpf() {
        try {
            SeguradoBuilder seguradoBuilder = new SeguradoBuilder();
            Segurado segurado = seguradoBuilder
                    .setNome("Segurado 1")
                    .setEmail("segurado1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSeguradoSemNome() {
        try {
            SeguradoBuilder seguradoBuilder = new SeguradoBuilder();
            Segurado segurado = seguradoBuilder
                    .setCpf("123.456.789-00")
                    .setEmail("segurado1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSeguradoValido() {
        SeguradoBuilder seguradoBuilder = new SeguradoBuilder();
        Segurado segurado = seguradoBuilder
                .setCpf("123.456.789-00")
                .setNome("Segurado 1")
                .setEmail("segurado1@email.com")
                .build();

        assertNotNull(segurado);
    }
}
