package teste;

import org.junit.Before;
import org.junit.Test;

import entidade.Animal;
import entidade.Veterinario;

import static org.junit.Assert.*;

public class VeterinarioTeste {
    Veterinario vet;
    Animal animal;

    @Before
    public void setup(){
        vet = new Veterinario();
    }
    
    @Test
    public void teste() {
    	assertTrue(true);
    }


}
