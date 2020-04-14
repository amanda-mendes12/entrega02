import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, paisCopia;
	static int id = 0;
	
	@Before
	public void insert() throws Exception  {
		System.out.println("Insert");
		pais = new Pais (id, "Jap�o", 126440000, 377975);
		paisCopia = new Pais (id, "Jap�o", 126440000, 377975);
		System.out.println(pais);
		System.out.println(paisCopia);
		System.out.println("id: " + pais.getId());
	}
	
	@Test
	public void select() {
		System.out.println("Select");
		Pais esperado = new Pais(1, "Jap�o", 126440000, 377975);
		Pais retorno = new Pais(1);
		retorno.selectPaises();
		assertEquals("Test Insert", esperado, retorno);
	}
	
}