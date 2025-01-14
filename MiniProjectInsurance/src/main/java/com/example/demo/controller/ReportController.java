package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.CitizenPlan;
import com.example.demo.request.SearchRequest;
import com.example.demo.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService service;

	@PostMapping("/search")
	public String handleSearch(SearchRequest request, Model model) {

		System.out.println(request);
		List<CitizenPlan> plans = service.search(request);
		model.addAttribute("plans",plans);
		init(model);

		return "index";

	}

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("search", new SearchRequest());

		init(model);

		return "index";
	}

	private void init(Model model) {
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatuses());
		
	}

}
