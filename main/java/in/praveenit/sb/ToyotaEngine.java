package in.praveenit.sb;

import org.springframework.stereotype.Component;

@Component
public class ToyotaEngine implements Engine {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Toyota Engine";
	}

}
