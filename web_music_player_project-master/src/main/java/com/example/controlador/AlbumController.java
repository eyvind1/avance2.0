package com.example.controlador;

import java.util.Collection;

import com.example.servicio.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.servicio.SongService;
import com.example.dominio.Song;

import com.example.servicio.AlbumService;
import com.example.dominio.Album;

@Controller
public class AlbumController {

	@Autowired
	CancionService songService;
	
	@Autowired
	AlbumService albumService;

	@RequestMapping(value = "/album", method = RequestMethod.POST)
	String saveAlbum(@ModelAttribute Album album, ModelMap model) {
		System.out.println("saving: " + album.getId());
		albumService.save(album);
		return showalbum(album.getId(), model);
	}
	@RequestMapping(value = "/add-album", method = RequestMethod.GET)
	String addNewAlbum(@RequestParam(required = false) Integer id, ModelMap model) {
		Album album = id == null ? new Album() : albumService.get(id);
		model.addAttribute("album", album);
		return "add-album";
	}

	@RequestMapping(value = "/album", method = RequestMethod.GET)
	String showalbum(@RequestParam(required = false) Integer id, ModelMap model) {
		if (id != null) {
			Album album = albumService.get(id);
			model.addAttribute("album", album);
			return "album";
		} else {
			Collection<Album> albums = albumService.getAll();
			model.addAttribute("albums", albums);
			return "albums";
		}
	}
	
	@RequestMapping(value = "/albums", method = RequestMethod.GET)
	String showalbums(@RequestParam(required = false) Integer id, ModelMap model) {

		if (id != null) {
			Album album = albumService.get(id);
			model.addAttribute("album", album);
			return "album";
		} else {
			Collection<Album> albums = albumService.getAll();		
			
			model.addAttribute("albums", albums);
			return "albums";
			
		}
		
	}
	

}
