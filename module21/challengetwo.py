# Step 1
responses = {
    "hello": "Hello! How can I assist you today?",
    "tell me about [place]": "I can provide information about places. Please specify the place you're interested in.",
    "bye": "Goodbye! Have a great day!",
    "default": "I'm sorry, I don't understand that. Can you please rephrase?"
}

def get_bot_response(user_message):
    user_message = user_message.lower()
    if user_message in responses:
        return responses[user_message]
    elif "tell me about" in user_message:
        return responses["tell me about [place]"]
    else:
        return responses["default"]


def main():
    # Step 4
    print("Welcome to the Chatbot! I can help you with information about places. Type 'bye' to exit.")

    while True:
        user_input = input("You: ")
        if user_input.lower() == "bye":
            print("Chatbot: " + responses["bye"])
            break
        bot_response = get_bot_response(user_input)
        print("Chatbot: " + bot_response)

    # Step 5
    print("Thank you for using the Chatbot. See you next time!")

# Step 6
if __name__ == "__main__":
    main()