import java.util.Scanner
fun main() {
  val scanner = Scanner(System.`in`)
  println("Welcome to the Phinma Online Product Feedback Survey!")
  println("Please provide your feedback by answering a few questions.")

  // get user info
  print("Name: ")
  val name = scanner.nextLine()

  print("Email: ")
  val email = scanner.nextLine()

  println("\nThank you, $name!")

  // Get feedback ratings

println("\nPlease rate the following aspects from 1 to 5 (1 = Strongly Disagree, 5 = Strongly Agree)")

print("\nUser Interface: ")

val userInterface Rating = scanner.nextInt()

print("Product Selection: ")

val productSelectionRating = scanner.nextInt()

print("Delivery Speed: ")

val deliverySpeedRating = scanner.nextInt()

print("Customer Support: ")

val customerSupportRating = scanner.nextInt()

// Get additional comments

print("\nAny additional comments? (Press Enter to skip)\n")

scanner.nextLine() // Clear the newline character

val comments = scanner.nextLine()

// Display summary

println("\nThank you for your feedback, $name!")

println("Summary of Your Feedback:")

println("Email: $email")

println("User Interface Rating: $userInterface Rating")

println("Product Selection Rating: $productSelectionRating")
println("Delivery Speed Rating: $deliverySpeedRating") println("Customer Support Rating: $customerSupportRating")

println("Additional Comments: $comments")

}
}
