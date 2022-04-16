package cpf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;


public class ValidaCPFTeste {


    private validaCPF app;

    @Before
    public void setup(){
        app = new validaCPF();
    }

    @Test
    public void validaTamanhoMenorTres() {
    	//CT01 - Testa se o cpf com menos de 3 digitos não é valido
        assertFalse(app.isCPF("98"));
    }

    @Test
    public void validaTamanhoMaiorOnze() {
    	//CT02 - Testa se o cpf com mais de 11 digitos não é valido
        assertFalse(app.isCPF("123456789101"));
    }

    @Test
    public void validaValido() {
    	//CT03 - Testa se o cpf entre 3 e 11 digitos é valido
        assertTrue(app.isCPF("191"));
    }
    
    @Test
    public void validaSomenteDigitosInvalido() {
    	//CT04 - Testa se o cpf com letra no CPF não é valido
        assertFalse(app.isCPF("10110f53683"));
    }
    
    @Test
    public void preencheZero() {
    	//CT04 - Testa se o cpf com letra no CPF não é valido
        assertTrue(app.isCPF("191"));
    }

    @Test
    public void validaNumerosIguais() {
    	//CT04 - Testa se o cpf com letra no CPF não é valido
        assertFalse(app.isCPF("22222222222"));
    }
    
    
}
