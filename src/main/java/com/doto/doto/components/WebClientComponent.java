package com.doto.doto.components;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;



@Component
public class WebClientComponent {

    @Bean
    public WebClient.Builder getWebClientBuilder() {
        return WebClient.builder();
    }


    @Bean
    public ApplicationRunner runner(WebClient.Builder webClientBuilder) {
        return args -> {
            WebClient webClient = webClientBuilder
                    .baseUrl("http://localhost:8282/events/")
                    .build();
            webClient.get()
                    .retrieve()
                    .bodyToMono(String.class)  // this extracts the body to a String
                    .block();  // this will start the request and block until the response is received
        };
    }



}
