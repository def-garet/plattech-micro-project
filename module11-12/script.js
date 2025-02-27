document.addEventListener("DOMContentLoaded", function() {
    const chatMessages = document.getElementById("chat-messages");
    const messageInput = document.getElementById("message-input");

    function sendMessage() {
        const messageText = messageInput.value.trim();
        if (messageText === "") return;

        const userMessage = document.createElement("div");
        userMessage.classList.add("message", "user-message");
        userMessage.textContent = messageText;
        chatMessages.appendChild(userMessage);

        messageInput.value = "";
        chatMessages.scrollTop = chatMessages.scrollHeight;

        
        setTimeout(() => {
            const botMessage = document.createElement("div");
            botMessage.classList.add("message", "bot-message");
            botMessage.textContent = "Hatdog bot response ni";
            chatMessages.appendChild(botMessage);
            chatMessages.scrollTop = chatMessages.scrollHeight;
        }, 1000);
    }

  
    document.querySelector("button").addEventListener("click", sendMessage);

    messageInput.addEventListener("keypress", function(event) {
        if (event.key === "Enter") {
            sendMessage();
        }
    });
});
