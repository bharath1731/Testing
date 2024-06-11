package com.example.demo.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Repo.CitizenPlanRepository;
import com.example.demo.entity.CitizenPlan;



@Component
public class DataLoader implements ApplicationRunner{
	
    @Autowired
    private CitizenPlanRepository repo; 
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		// cash plan data  //
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("lucky");
		c1.setGender("male");
		c1.setPlanName("cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00); 
		
		
		

		// cash plan data  //
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("bharath");
		c2.setGender("male");
		c2.setPlanName("cash");
		c2.setPlanStatus("Denied");
		c2.setDenailreason("Rental income"); 
		
		
		// cash plan data  //
				CitizenPlan c3=new CitizenPlan();
				c3.setCitizenName("niha");
				c3.setGender("female");
				c3.setPlanName("cash");
				c3.setPlanStatus("Terminated");
				c3.setPlanStartDate(LocalDate.now().minusMonths(4));
				c3.setPlanEndDate(LocalDate.now().plusMonths(6));
				c3.setBenefitAmt(5000.00);
				c3.setTerminatedDate(LocalDate.now());
				c3.setTerminationReason("Employee");
				
				
				
				
				// food plan data  //
				CitizenPlan c4=new CitizenPlan();
				c4.setCitizenName("madhu");
				c4.setGender("male");
				c4.setPlanName("food");
				c4.setPlanStatus("Approved");
				c4.setPlanStartDate(LocalDate.now());
				c4.setPlanEndDate(LocalDate.now().plusMonths(6));
				c4.setBenefitAmt(3000.00); 
				
				
				

				// food plan data  //
				CitizenPlan c5=new CitizenPlan();
				c5.setCitizenName("kumar");
				c5.setGender("male");
				c5.setPlanName("food");
				c5.setPlanStatus("Denied");
				c5.setDenailreason("Salaried Person"); 
				
				
				// food plan data  //
						CitizenPlan c6=new CitizenPlan();
						c6.setCitizenName("niharika");
						c6.setGender("female");
						c6.setPlanName("food");
						c6.setPlanStatus("Terminated");
						c6.setPlanStartDate(LocalDate.now().minusMonths(4));
						c6.setPlanEndDate(LocalDate.now().plusMonths(6));
						c6.setBenefitAmt(5000.00);
						c6.setTerminatedDate(LocalDate.now());
						c6.setTerminationReason("Employee");
						
						
						
						// medical plan data  //
						CitizenPlan c7=new CitizenPlan();
						c7.setCitizenName("kasim");
						c7.setGender("male");
						c7.setPlanName("medical");
						c7.setPlanStatus("Approved");
						c7.setPlanStartDate(LocalDate.now());
						c7.setPlanEndDate(LocalDate.now().plusMonths(6));
						c7.setBenefitAmt(5000.00); 
						
						
						

						// medical plan data  //
						CitizenPlan c8=new CitizenPlan();
						c8.setCitizenName("khan");
						c8.setGender("male");
						c8.setPlanName("medical");
						c8.setPlanStatus("Denied");
						c8.setDenailreason("property income"); 
						
						
						// medical plan data  //
								CitizenPlan c9=new CitizenPlan();
								c9.setCitizenName("nihanshika");
								c9.setGender("female");
								c9.setPlanName("medical");
								c9.setPlanStatus("Terminated");
								c9.setPlanStartDate(LocalDate.now().minusMonths(4));
								c9.setPlanEndDate(LocalDate.now().plusMonths(6));
								c9.setBenefitAmt(5000.00);
								c9.setTerminatedDate(LocalDate.now());
								c9.setTerminationReason("job");
								
								
								
								// employee plan data  //
								CitizenPlan c10=new CitizenPlan();
								c10.setCitizenName("arjun");
								c10.setGender("male");
								c10.setPlanName("employee");
								c10.setPlanStatus("Approved");
								c10.setPlanStartDate(LocalDate.now());
								c10.setPlanEndDate(LocalDate.now().plusMonths(6));
								c10.setBenefitAmt(5000.00); 
								
								
								

								// employee plan data  //
								CitizenPlan c11=new CitizenPlan();
								c11.setCitizenName("kharna");
								c11.setGender("male");
								c11.setPlanName("employee");
								c11.setPlanStatus("Denied");
								c11.setDenailreason("property income"); 
								
								
								// employee plan data  //
										CitizenPlan c12=new CitizenPlan();
										c12.setCitizenName("mrunal");
										c12.setGender("female");
										c12.setPlanName("employee");
										c12.setPlanStatus("Terminated");
										c12.setPlanStartDate(LocalDate.now().minusMonths(4));
										c12.setPlanEndDate(LocalDate.now().plusMonths(6));
										c12.setBenefitAmt(5000.00);
										c12.setTerminatedDate(LocalDate.now());
										c12.setTerminationReason("job");
										
										List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
										
										repo.saveAll(list);
										
	}		
										
										
	}

	

