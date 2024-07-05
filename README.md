# Java-loginpage

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

## Description

Java loginpage is a simple desktop application designed for user authentication. It provides a user-friendly login interface where users can enter a user ID and password. Upon successful login, users are greeted with a welcome message. This project serves as a learning resource for Java Swing and basic authentication mechanisms.

## Features

- User authentication with a straightforward login interface.
- Password management with basic encryption.
- Clear and user-friendly interface with responsive feedback messages.
- Simple, clean codebase suitable for learning Java Swing and Java programming.

## Installation

To get started with this Java loginpage, follow these steps:

1. **Clone the repository:**

   ```bash
   git clone git@github.com:laaksha/java-loginpage.git
2. Navigate to the project directory
3. Build the project
4. Run the main application
     
#### 4. **Usage**

Launch the Main class.
Enter your user ID and password in the login form.
Click "Login" to authenticate.
If the credentials are correct, you will be greeted with a welcome message on the next screen.


### Example

```java
public static void main(String[] args) {
    LoginInfo loginInfo = new LoginInfo();
    loginInfo.addUser("Laak", "PASSWORD");
    LoginPage loginPage = new LoginPage(loginInfo.getLoginInfo());
}


## Contributing

Contributions to the project are welcome! To contribute:

1. **Fork the repository.**
2. **Create a new branch for your feature or bug fix:**

   ```bash
   git checkout -b feature/my-new-feature
3. **commit your changes**
git commit -m "Add my new feature"

4. push to the branch
git push origin feature/my-new-feature

5. Submit pull request


