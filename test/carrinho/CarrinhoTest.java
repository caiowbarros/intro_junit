package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;

public class CarrinhoTest {
    
    private Carrinho cart;

    @BeforeEach
    public void inicializa() {
        cart = new Carrinho();

        Produto produto1 = new Produto("Produto 1", 100);
        Produto produto2 = new Produto("Produto 2", 100);
        Produto produto3 = new Produto("Produto 3", 100);

        cart.addItem(produto1);
        cart.addItem(produto2);
        cart.addItem(produto3);
    }

    @Test 
    public void testGetValorTotal() {
        int valorTotal = cart.getValorTotal();
        assertEquals(300, valorTotal);
    }

    @Test 
    public void testGetQtdeItems() {
        int qtdeItems = cart.getQtdeItems();
        assertTrue(qtdeItems == 3);
    }

    @Test 
    public void testEsvazia() {
        cart.esvazia();
        int qtdeItems = cart.getQtdeItems();
        assertTrue(qtdeItems == 0);
    }

}
