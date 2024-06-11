package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.CitizenPlanRepository;
import com.example.demo.entity.CitizenPlan;
import com.example.demo.request.SearchRequest;


@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;
	
	
	@Override
	public List<String> getPlanNames() {
		return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatuses() {
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		return planRepo.findAll();
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
