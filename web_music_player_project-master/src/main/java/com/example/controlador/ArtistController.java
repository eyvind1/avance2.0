package com.example.controlador;
import java.util.Collection;

import com.example.repositorio.ArtistaRepositorio;
import com.example.servicio.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.dominio.Artist;
import com.example.dominio.Person;

@Controller
public class ArtistController {

	@Autowired
	ArtistaService artistService;

	@RequestMapping(value = "/artist", method = RequestMethod.POST)
	String saveartist(@ModelAttribute Artist artist, ModelMap model) {
		System.out.println("saving: " + artist.getId());
		artistService.save(artist);
		return showartist(artist.getId(), model);
	}
	@RequestMapping(value = "/add-artist", method = RequestMethod.GET)
	String addNewartist(@RequestParam(required = false) Long id, ModelMap model) {
		Artist artist = id == null ? new Artist() : artistService.get(id);
		model.addAttribute("artist", artist);
		return "add-artist";
	}

	@RequestMapping(value = "/artist", method = RequestMethod.GET)
	String showartist(@RequestParam(required = false) Long id, ModelMap model) {
		if (id != null) {
			Artist artist = artistService.get(id);
			System.out.print(artist.getAlbums());
			model.addAttribute("artist", artist);
			
			return "artist";
		} else {
			Collection<Artist> artists = artistService.getAll();
			model.addAttribute("artists", artists);
			return "artists";
		}
	}
	
	@RequestMapping(value = "/artists", method = RequestMethod.GET)
	String showartists(@RequestParam(required = false) Long id, ModelMap model) {

		if (id != null) {
			Artist artist = artistService.get(id);
			model.addAttribute("artist", artist);

			return "artist";
		} else {
			Collection<Artist> artists = artistService.getAll();
			model.addAttribute("artists", artists);
			return "artists";
		}
		
	}
	
}