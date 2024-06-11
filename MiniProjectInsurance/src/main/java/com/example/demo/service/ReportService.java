package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CitizenPlan;
import com.example.demo.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	
	

}
