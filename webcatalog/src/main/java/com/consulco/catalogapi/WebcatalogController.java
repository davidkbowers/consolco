package com.consulco.catalogapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
//@RequestMapping("/api")
public class WebcatalogController {

	//@Autowired
	WebcatalogDao webcatalogDao;
	
	@GetMapping("/decking")
	public String decking(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "decking";
	}
	
	@GetMapping("/products")
	public String products(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "products";
	}

	@GetMapping("/categories")
	public String categories(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "categories";
	}
	
	
	
	
/*
	@GetMapping("/decking")
	public ResponseEntity<List<Decking>> getAllDecking(@RequestParam(required = false) String deckDesc) {
		try {
			List<Decking> deckings = new ArrayList<Decking>();

			if (deckDesc == null)
				deckingRepository.findAll().forEach(deckings::add);
			else
				deckingRepository.findByDeckDesc(deckDesc).forEach(deckings::add);

			if (deckings.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(deckings, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/deckings/{id}")
	public ResponseEntity<Decking> getDeckingById(@PathVariable("id") long id) {
		Optional<Decking> deckingData = deckingRepository.findById(id);

		if (deckingData.isPresent()) {
			return new ResponseEntity<>(deckingData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
//	@PostMapping("/deckings")
//	public ResponseEntity<Decking> createDecking(@RequestBody Decking decking) {
//		try {
//			Decking _decking = deckingRepository
//					.save(new Decking(decking.getDeckingCatId(), decking.getsKU(), decking.getSize(), decking.getDeckDesc(), decking.getPrice(), decking.getUnit(), decking.isViewOnWeb()));
//			return new ResponseEntity<>(_decking, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}

	@PutMapping("/deckings/{id}")
	public ResponseEntity<Decking> updateDecking(@PathVariable("id") long id, @RequestBody Decking decking) {
		Optional<Decking> deckingData = deckingRepository.findById(id);

		if (deckingData.isPresent()) {
			Decking _decking = deckingData.get();
			_decking.setDeckDesc(decking.getDeckDesc());
			_decking.setDeckingCatId(decking.getDeckingCatId());
			_decking.setPrice(decking.getPrice());
			_decking.setSize(decking.getSize());
			_decking.setsKU(decking.getsKU());
			_decking.setUnit(decking.getUnit());
			_decking.setViewOnWeb(decking.isViewOnWeb());
			return new ResponseEntity<>(deckingRepository.save(_decking), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deckings/{id}")
	public ResponseEntity<HttpStatus> deleteDecking(@PathVariable("id") long id) {
		try {
			deckingRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/deckings")
	public ResponseEntity<HttpStatus> deleteAllDeckings() {
		try {
			deckingRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/deckings/published")
	public ResponseEntity<List<Decking>> findByDeckDesc(String deckDesk) {
		try {
			List<Decking> deckings = deckingRepository.findByDeckDesc(deckDesk);

			if (deckings.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(deckings, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
*/
}
