package com.phanimax.chat.config;

import com.phanimax.chat.chat.ChatMessage;
import com.phanimax.chat.chat.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component  // Registers this as a Spring bean so it runs automatically.
@RequiredArgsConstructor   // Lombok creates constructor automatically and injects them. Ex:- Injection of object for this below-> SimpMessageSendingOperations
@Slf4j  // Gives you logger object
public class WebSocketEventListener {

    private final SimpMessageSendingOperations messagingTemplate;   // This is used to send messages from backend to frontend.

    @EventListener  // This means whenever this event happens: SessionDisconnectEvent
    public void HandleWebSocketDisconnectListener(SessionDisconnectEvent event){
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
        String username = headerAccessor.getSessionAttributes().get("username").toString();
        if(username != null){
            log.info("User disconnected from socket :{}", username);
            var chatMessage = ChatMessage.builder()
                                    .type(MessageType.LEAVE)
                                    .sender(username)
                                    .build();

            messagingTemplate.convertAndSend("/topic/public",chatMessage);
            //  convertAndSend() is used to send (broadcast) a message from the Spring backend to all clients subscribed to a specific WebSocket destination like /topic/messages.
        }
    }
}
