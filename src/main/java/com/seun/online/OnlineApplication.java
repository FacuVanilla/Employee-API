package com.seun.online;

import com.seun.online.entity.Employee;
import com.seun.online.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnlineApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		employeeRepository.save(new Employee
				("Brad", "Java, C++", "brad@abcmail.com"));
		employeeRepository.save(new Employee
				("Roy", "Cryptography", "roy@xyzmail.com"));
		employeeRepository.save(new Employee
				("Henry", "Algorithm", "henry@xyzmail.com"));
		employeeRepository.save(new Employee
				("Neel", "AI", "neel@xyzmail.com"));
		employeeRepository.save(new Employee
				("Maya", "PR", "maya@xyzmail.com"));

	}


}
