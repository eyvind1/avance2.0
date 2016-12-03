package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.repositorio.CancionRepositorio;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

	@Autowired
	CancionRepositorio SongRepositorio;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSonges() {
		
		/*Song Song = new Song("El relajo", "Sala", "...", null, null);
		Assert.assertNull(Song.getId());
		Song c1 = SongRepositorio.save(Song);
		System.out.println("ID = " + c1.getId());
		Assert.assertNotNull(c1.getId());

		Song Song2 = new Song("Fururu Farara", "Salsa", "...", null, null);
		Assert.assertNull(Song2.getId());
		Song c4 = SongRepositorio.save(Song2);
		System.out.println("ID = " + c4.getId());
		Assert.assertNotNull(c4.getId());
		
		Song Song3 = new Song("Prueba", "Reggae", "...", null, null);
		Assert.assertNull(Song3.getId());
		Song c5 = SongRepositorio.save(Song3);
		System.out.println("ID = " + c5.getId());
		Assert.assertNotNull(c5.getId());
		
		Song Song4 = new Song("CUba", "Tecno", "...", null, null);
		Assert.assertNull(Song4.getId());
		Song c6 = SongRepositorio.save(Song4);
		System.out.println("ID = " + c6.getId());
		Assert.assertNotNull(c6.getId());
		
		c1.setGenero("Salsa");
		Song c2 = SongRepositorio.save(c1);
		Song c3 = SongRepositorio.buscarPorId(c1.getId());

		Assert.assertEquals(c2.getNombre(), c3.getNombre());*/
	}
}
