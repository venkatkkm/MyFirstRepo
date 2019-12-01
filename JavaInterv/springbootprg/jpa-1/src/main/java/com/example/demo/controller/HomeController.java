package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class HomeController {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/home")
	public String home() {
		ModelAndView mv = new ModelAndView();
		
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Optional<Alien> alien = repo.findById(aid);
		System.out.println(repo.findByTech("java"));
		System.out.println(repo.findByIdGreaterThan(101));
		System.out.println(repo.findByTechSorted("java"));
		mv.addObject(alien);
		return mv;
	}
	//rest svc
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens() {
		return repo.findAll().toString();//it will return view if u not specified response body annotation
	}
	
	@RequestMapping("/alien/{aid}")//to get particular record
	@ResponseBody
	public String getSingleAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid).toString();//it will return view if u not specified response body annotation
	}
	//Json format=======
	@RequestMapping(path="/aliens")
	@ResponseBody
	public List<Alien> getAliens1() {
		return repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getSingleAlien1(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	@PostMapping(path="/alien", consumes= {"application/json"})
	public Alien getSingleAlien2(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
		//@RequestBody --for to accept the raw data from client
	}
	
	@DeleteMapping(path="/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@PutMapping(path="/alien")
	public Alien updateAlien(@RequestBody Alien ali) {
		repo.save(ali);
		return ali;
	}
}
