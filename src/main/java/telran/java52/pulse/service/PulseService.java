package telran.java52.pulse.service;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.java52.pulse.dto.PulseDto;

@Configuration
public class PulseService {

	@Bean
	Consumer<PulseDto> log() {
		return (data) -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long delay = System.currentTimeMillis() - data.getTimestamp();
			System.out.println("delay: " + delay + ",id: " + data.getId() + ", pulse: " + data.getPayload());
		};
	}
}
