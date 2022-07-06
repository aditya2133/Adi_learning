package com.qa.may.springprac;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.may.service.SnowSportsService;

@RestController
public class SnowSportController {
	
	
	@Autowired
private SnowSportsService service; //dependancy injection

//Demo
@GetMapping("/getDemo")
public PracSnowSports getDemoSnsp() {
	return new PracSnowSports(1, "Adi", "Adi2", 3);
}
	
	
	@GetMapping("/getSS")
	public PracSnowSports getSnsp() {
		return new PracSnowSports(2, "Snowboarding", "On a board, got down slope", 15);
	}
	
	
	// get by id
	@GetMapping("/getSSSpec/{sportId}")
	public PracSnowSports getById(@PathVariable int sportId) {
		return this.service.getById(sportId);
	}
	
	
	//get all
	@GetMapping("/snspGetAll")
	public List<PracSnowSports> getAllSnsp(){
		return service.getAllSnsp();
	}
	
	
	//create ss 2
	@PostMapping ("/createSS2")
public ResponseEntity<PracSnowSports> createSnsp2(@RequestBody PracSnowSports sports) {
	System.out.println("Created: "+ sports);
		
	PracSnowSports created = this.service.createSnsp2(sports);
	return new ResponseEntity<PracSnowSports>(created, HttpStatus.CREATED);
	}
	
}

//
//
////EVERY THING HERE NOW GOES INTO THE SERVICES
////THE CONTROLLER ONLY HAS CONNECTION TO THE WEB SERVER -- 
////THE FUNCTIONS GO BACK INTO THE PROGRAM
////	private List<Dinosaurs> dinos= new ArrayList<>();
//
//
//private List<PracSnowSports> snsp = new ArrayList<>();
//
////public SnowSsportController() {
////	// TODO Auto-generated constructor stub
////		new snsp(1, "Ski", "Down a slope on two long pieces of plastic", 15);
//////this.snsp.add(1, "Ski", "Down a slope on two long pieces of plastic", 15);
//
//// snsp [0] = new PracSnowSports();
//// this.snsp.add(1, "Ski", "Down a slope on two long pieces of plastic", 15);
////}	
//
//
//@GetMapping("/getSS")
//public PracSnowSports getSnsp() {
//	return new PracSnowSports(2, "Snowboarding", "On a board, got down slope", 15);
//	
//}
//@GetMapping("/getDemo")
//public PracSnowSports getDemoSnsp() {
//	return new PracSnowSports(1, "Adi", "Adi2", 3);
//}
//
//Get by id
//@GetMapping("/getSSSpec/{sportId}")
//public PracSnowSports getById(@PathVariable ("sportId") int sportId) {
//	System.out.println("sportId "+ sportId);
//	return this.snsp.get(sportId);
//	
//}
//
//@GetMapping("/snspGetAll")
//public List<PracSnowSports> getAllSnsp(){
//	return snsp;
//}
//
//@PostMapping ("/createSS")
//public void createSnsp(@RequestBody PracSnowSports sports) {
//	System.out.println("Created: "+ sports);
//	this.snsp.add(sports);
//}
//
//
//
//// for response entity --- to set / create return a status code!
//@PostMapping ("/createSS2")
//public ResponseEntity<PracSnowSports> createSnsp2(@RequestBody PracSnowSports sports) {
//	System.out.println("Created: "+ sports);
//	this.snsp.add(sports);
//	
//	PracSnowSports created = this.snsp.get(this.snsp.size() - 1);
//	return new ResponseEntity<PracSnowSports>(created, HttpStatus.CREATED);
//}
//
//
//
//
//@PatchMapping("/updateSs/{sportId}")
//public void update(@PathVariable ("sportId") int sportId, @PathParam ("Name") String name, @PathParam ("sportDescription") String sportDescription, @PathParam("Participants") int parNumbers ) {
//	System.out.println("sportId: "+ sportId);
//	System.out.println("Name: "+ name);
//	System.out.println("sportDescription: "+ sportDescription);
//	System.out.println("Participants: "+ parNumbers);
//	
//	
////	PracSnowSport toUpdate = this.snsp.get(sportId);
////	toUpdate.setName(name);
////	toUpdate.setSportDescription(sportDescription);
////	toUpdate.setParNumbers(parNumbers);
////	return toUpdate;
////	
//}
//
//
//
//// 2 ways to update 
//@PatchMapping("/updateSs2/{sportId}")
//public PracSnowSports update2(@PathVariable ("sportId") int sportId, @PathParam ("Name") String name, @PathParam ("sportDescription") String sportDescription, @PathParam("Participants") Integer parNumbers ) {
//	System.out.println("sportId: "+ sportId);
//	System.out.println("Name: "+ name);
//	System.out.println("sportDescription: "+ sportDescription);
//	System.out.println("Participants: "+ parNumbers);
//	
//	
//	PracSnowSports toUpdate = this.snsp.get(sportId);
//	
//	// if (name != null) --> if you want to update just one at a time
//	toUpdate.setName(name);
//	//  if (sportDescription != null)  --> if you want to update just one at a time
//	toUpdate.setSportDescription(sportDescription);
//	// if (parNumbers != null)
//	toUpdate.setParNumbers(parNumbers);
//	return toUpdate;
//}
//
//
//
//
//
//@DeleteMapping("/deleteSS/{sportId}")
//public void delete(@PathVariable int sportId) {
//	System.out.println("Delete: "+ sportId);
//}
//
//
//@DeleteMapping("/deleteSS2/{sportId}")
//public ResponseEntity<?> delete2(@PathVariable int sportId) {
//	System.out.println("Delete: "+ sportId);
//	
//	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//}