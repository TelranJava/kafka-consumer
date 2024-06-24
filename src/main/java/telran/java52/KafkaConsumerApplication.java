package telran.java52;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerApplication {// implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

}

// less 64 bean into main
//	@Bean
//	Consumer<String> log() {
//		return ( data) -> {
//			System.out.println("\nReceived: " + data+"\n");
//		};
//	}

// hw 64	решение Едуарда
//	@Bean
//	Consumer<PulseDto> log() {
//		return ( data) -> {
//			System.out.println( data);
//		};
//	}
