package in.praveenit.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	
	@Autowired
	private Engine engine;
	
	public void showEngine() {
		System.out.println("Car Using :"+engine.getType());
	}

}
