package com.example.controlador;

import java.util.Collection;

import com.example.servicio.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.dominio.Playlist;

@Controller
public class PlayListController {

	@Autowired
	PlaylistService playlistService;
	
	@RequestMapping(value = "/playlist/", method = RequestMethod.GET)
	String showplaylist(@RequestParam(required = false) Long id, ModelMap model) {
		if (id != null) {
			Playlist playlist = playlistService.get(id);
			model.addAttribute("playlist", playlist);
			
			return "playlist";
		} else {
			Collection<Playlist> playlists = playlistService.getAll();
			model.addAttribute("playlists", playlists);
			
			return "playlists";
			}
	}
	@RequestMapping(value = "/playlists/", method = RequestMethod.GET)
	String showplaylists(@RequestParam(required = false) Long id, ModelMap model) {
		if (id != null) {
			Playlist playlist = playlistService.get(id);
			model.addAttribute("playlist", playlist);			
			return "playlist";
		} else {
			Collection<Playlist> playlists = playlistService.getAll();
			model.addAttribute("playlists", playlists);
			
			return "playlists";
			}
	}
	

	
}