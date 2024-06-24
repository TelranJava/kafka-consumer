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
			System.out.println(data);
		};
	}
}
