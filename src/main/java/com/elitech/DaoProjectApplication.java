package com.elitech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elitech.model.entities.Agent;
import com.elitech.model.entities.Reuinion;
import com.elitech.model.repositories.AgentRepository;
import com.elitech.model.repositories.ReuinionRepository;

@SpringBootApplication
public class DaoProjectApplication implements CommandLineRunner {
private final AgentRepository agentRepository;

	
	public DaoProjectApplication(AgentRepository agentRepository) {
	super();
	this.agentRepository = agentRepository;
}

	@Autowired
	private ReuinionRepository reuinionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DaoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Agent ag1=new Agent("user", "prenomuser", "adr1", "email1@gmail.com", 30);
		agentRepository.save(ag1);
		Reuinion r1=new Reuinion(null,"teste", "test", "test");
		//reuinionRepository.save(r1);
		
	}

}
