package com.client.poli;

import com.client.poli.dto.UserRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import java.util.Scanner;

@SpringBootApplication
public class ClientSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientSocketApplication.class, args);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el teléfono de la persona que va consultar");
            String userInput = scanner.nextLine();
            // Path server socket
            String serverUrl = "ws://localhost:8080/usuario"; // Reemplaza con la URL correcta

            // Configuración del cliente
            WebSocketStompClient stompClient = new WebSocketStompClient(new StandardWebSocketClient());
            stompClient.setMessageConverter(new MappingJackson2MessageConverter());

            // Establece el manejador de sesión
            StompSessionHandler sessionHandler = new StompSessionHandlerAdapter() {
                @Override
                public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
                    UserRequest userRequest = new UserRequest();
                    userRequest.setDirtel(userInput);
                    session.send("/app/usuario", userRequest);
                }
            };

            stompClient.connect(serverUrl, sessionHandler);
        }
    }


}
