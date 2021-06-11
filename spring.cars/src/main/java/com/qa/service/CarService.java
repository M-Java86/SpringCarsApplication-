package com.qa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.repo.CarRepo;
import com.qa.springcars.domain.Car;


@Service
public class CarService {
	
	
			private CarRepo repo;
			public CarService(CarRepo repo) {
				this.repo = repo;
			}
			
		// CRUD
		// CREATE
			
		public Car createVehicle(Car c ) {
			return this.repo.save(c);
			//insert into Car values (c.getMake(), c.getModel(), c.getYear(), c.getDoors());
		}
		
		// Read
		public List<Car> getAllVehicles() {
			return this.repo.findAll();
		}
		
		// READ ONE
		public Optional<Car> getVehicle(Long id) {
			Optional<Car> c = this.repo.findById(id);
			return Optional.of(c.get());
		
		}
		
		// DELETE 
		public boolean renoveVehicle(Long id) {
			this.repo.deleteById(id);
			return this.repo.existsById(id);
		
		
		}
		
		//update
		
		public Car updateVehicle(Long id, Car newCar) {
			Car existing = this.getVehicle(id);
			existing.setMake(newCar.getMake());
			existing.setModel(newCar.getModel());
			existing.setYear(newCar.getYear());
			existing.setDoors(newCar.getDoors());
			
			Car updated = this.repo.save(existing); // save it back to overwrite original
			
			return updated;
			
	}
	

}
