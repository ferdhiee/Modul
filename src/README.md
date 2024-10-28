# Cinema Ticket Booking System
This project is a Cinema Ticket Booking System written in Java. It allows users to select different types of tickets (Reguler, VIP, VVIP) and calculate the total price based on the quantity ordered. It showcases basic Java concepts, such as exception handling, static initializers, and user input handling, while also improving maintainability through refactored code.

# Features
Multiple Ticket Types: Reguler, VIP, VVIP with predefined prices.
Price Calculation: Calculates total cost based on ticket type and quantity.
Input Validation: Handles invalid ticket types gracefully with error messages.
User Interaction: Accepts input via console.

# Requirements
Java Development Kit (JDK): Version 8 or higher
IDE/Text Editor: (Optional) IntelliJ IDEA, Eclipse, or Visual Studio Code
Command Line/Terminal: To compile and run the program

# How to Run the Program
Clone the repository or download the project files.

bash
Salin kode
git clone <repository-url>
cd cinema-ticket-booking-system
Compile the Java file.

bash
Salin kode
javac TiketBioskopRefactored.java
Run the program.

bash
Salin kode
java TiketBioskopRefactored
Input Examples:

yaml
Salin kode
Masukkan jenis tiket: Reguler  
Masukkan jumlah tiket: 2
Expected Output:

yaml
Salin kode
Pesanan: 2 Tiket Reguler  
Total Harga: Rp100000
Error Handling:
If the user enters an invalid ticket type, the system will display:

arduino
Salin kode
Jenis tiket 'InvalidType' tidak valid.
Project Structure
perl
Salin kode
cinema-ticket-booking-system/
│
├── TiketBioskopRefactored.java  # Main source code
└── README.md                    # Project documentation

# Refactoring Details
The code has been refactored to enhance readability and maintainability by:

Using a static initializer block for predefined ticket types and prices.
Handling input exceptions to ensure valid ticket types.
Modularizing logic into separate methods for better reusability.

# Future Enhancements
GUI Integration: Add a graphical user interface for easier interaction.
Database Support: Store ticket and customer information in a database.
Discount System: Implement discounts for bulk bookings or promotions.

# License
This project is licensed under the MIT License. Feel free to use and modify it.