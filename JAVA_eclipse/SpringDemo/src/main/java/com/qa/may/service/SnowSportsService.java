package com.qa.may.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.qa.may.springprac.PracSnowSports;

@Service
public class SnowSportsService {

	private List<PracSnowSports> snsp = new ArrayList<>();
	
	// get Snowsport - just 1
	public PracSnowSports getSnsp() {
		return new PracSnowSports(2, "Snowboarding", "On a board, got down slope", 15);
		
	}
	
	
	
	//@GetMapping("/getDemo")
	//public PracSnowSports getDemoSnsp() {
//		return new PracSnowSports(1, "Adi", "Adi2", 3);
	//}
	
	
	// get by Id
	public PracSnowSports getById(@PathVariable ("sportId") int sportId) {
		return this.snsp.get(sportId);
		
	}
	
	// Get all
	public List<PracSnowSports> getAllSnsp(){
		return snsp;
	}
	
	
	// "/createSS2" 
	public PracSnowSports createSnsp2(@RequestBody PracSnowSports sports) {
		this.snsp.add(sports);
		return this.snsp.get(this.snsp.size()-1);
	}
	
	
	
	//
	//
	//
	//// for response entity --- to set / create return a status code!
	//@PostMapping ("/createSS2")
	//public ResponseEntity<PracSnowSports> createSnsp2(@RequestBody PracSnowSports sports) {
//		System.out.println("Created: "+ sports);
//		this.snsp.add(sports);
	//	
//		PracSnowSports created = this.snsp.get(this.snsp.size() - 1);
//		return new ResponseEntity<PracSnowSports>(created, HttpStatus.CREATED);
	//}
	//
	//
	//
	//
	//@PatchMapping("/updateSs/{sportId}")
	//public void update(@PathVariable ("sportId") int sportId, @PathParam ("Name") String name, @PathParam ("sportDescription") String sportDescription, @PathParam("Participants") int parNumbers ) {
//		System.out.println("sportId: "+ sportId);
//		System.out.println("Name: "+ name);
//		System.out.println("sportDescription: "+ sportDescription);
//		System.out.println("Participants: "+ parNumbers);
	//	
	//	
////		PracSnowSport toUpdate = this.snsp.get(sportId);
////		toUpdate.setName(name);
////		toUpdate.setSportDescription(sportDescription);
////		toUpdate.setParNumbers(parNumbers);
////		return toUpdate;
	////	
	//}
	//
	//
	//
	//// 2 ways to update 
	//@PatchMapping("/updateSs2/{sportId}")
	//public PracSnowSports update2(@PathVariable ("sportId") int sportId, @PathParam ("Name") String name, @PathParam ("sportDescription") String sportDescription, @PathParam("Participants") Integer parNumbers ) {
//		System.out.println("sportId: "+ sportId);
//		System.out.println("Name: "+ name);
//		System.out.println("sportDescription: "+ sportDescription);
//		System.out.println("Participants: "+ parNumbers);
	//	
	//	
//		PracSnowSports toUpdate = this.snsp.get(sportId);
	//	
//		// if (name != null) --> if you want to update just one at a time
//		toUpdate.setName(name);
//		//  if (sportDescription != null)  --> if you want to update just one at a time
//		toUpdate.setSportDescription(sportDescription);
//		// if (parNumbers != null)
//		toUpdate.setParNumbers(parNumbers);
//		return toUpdate;
	//}
	//
	//
	//
	//
	//
	//@DeleteMapping("/deleteSS/{sportId}")
	//public void delete(@PathVariable int sportId) {
//		System.out.println("Delete: "+ sportId);
	//}
	//
	//
	//@DeleteMapping("/deleteSS2/{sportId}")
	//public ResponseEntity<?> delete2(@PathVariable int sportId) {
//		System.out.println("Delete: "+ sportId);
	//	
//		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	
	
	
}
