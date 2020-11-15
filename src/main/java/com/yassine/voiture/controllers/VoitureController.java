package com.yassine.voiture.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yassine.voiture.entities.Voiture;
import com.yassine.voiture.service.VoitureService;


@Controller
public class VoitureController {
	@Autowired
	VoitureService voitureService;
	
	
	@RequestMapping("/showCreate")
	public String showCreate(){
		
		return "createVoiture";
	}


	@RequestMapping("/saveVoiture")
	public String saveVoiture(@ModelAttribute("voiture") Voiture voiture,
							  @RequestParam("date") String date,
							  ModelMap modelMap) throws ParseException
	{
		//conversion de la date
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date date_creation_voiture = dateformat.parse(String.valueOf(date));
		
		voiture.setDate_creation_voiture(date_creation_voiture);
		
		Voiture saveVoiture = VoitureService.saveVoiture(voiture);
		
		String msg ="voiture enregistré avec Id "+saveVoiture.getIdvoiture();
		modelMap.addAttribute("msg", msg);
		return "createVoiture";
		}
	

	  @RequestMapping("/listeVoiture")
	  public String ListeVoiture(ModelMap modelMap){
	  List<Voiture> v = voitureService.getAllVoiture();
	  modelMap.addAttribute("voiture", v);
	  return "listeVoiture";
	  }
	  
	  
	   
	   @RequestMapping({"/supprimerVoiture"})
	   public String supprimerVoiture(@RequestParam("id") Long id,
	   ModelMap modelMap)
	   {
		   voitureService.deleteVoitureById(id);
	   List<Voiture> v = voitureService.getAllVoiture();
	   modelMap.addAttribute("voiture", v);
	   return "listeVoiture";
	   }
	   
	   
	    @RequestMapping({"/modifierVoiture"})
	    public String editerVoiture(@RequestParam("id") Long id, ModelMap modelMap) {
	        Voiture v = voitureService.getVoiture(id);
	        modelMap.addAttribute("voiture",v);
	        return "editerVoiture";
	    }
	    
	    @RequestMapping({"/updateVoiture"})
	    public String updateVoiture(@ModelAttribute("voiture") Voiture voiture,
	    							@RequestParam("date") String date,
	    							ModelMap modelMap) throws ParseException {
	    	
	        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	        Date date_creation_voiture = dateformat.parse(String.valueOf(date));
	        voiture.setDate_creation_voiture(date_creation_voiture);
	        
	        voitureService.updateVoiture(voiture);
	        List<Voiture> v = voitureService.getAllVoiture();
	        modelMap.addAttribute("Voiture", v);
	        return "listeVoiture";
	    }
	    


	    
	
}
