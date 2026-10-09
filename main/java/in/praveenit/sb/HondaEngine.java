package in.praveenit.sb;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HondaEngine implements Engine{

	@Override
	public String getType() {
		return "Honda Engine";
	}

}
