package com.qa.service;

public class CarService {
	
	
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
		public Car getVehicle(Long id) {
			optional<Car> c = this.repo.findBYID(id);
			return c.get();
			
			
	////  optional<Car> c = this.repo.findBYID(id);
			//if(c != null) {
					//return c;
			//} else {
				//return null;
			}
		
		}
		
		// DELETE 
		public boolean renoveVehicle(long id) {
			this.repo.deleteByID(id);
			return this.repo.exist
		
		
		}
	}
	

}
