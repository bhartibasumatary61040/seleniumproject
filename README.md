# Selenium Project
  name: Selenium Automation Practice Project
  description: >
    This project contains multiple Selenium WebDriver automation practice
    programs organized into different packages. It includes real-time
    web automation examples such as alerts handling, drag and drop,
    button interactions, e-commerce automation, and jQuery-based scenarios.

technology_stack:
  programming_language: Java
  automation_tool: Selenium WebDriver
  build_tool: Maven
  test_structure: Package-based modular design
  version_control: Git & GitHub

key_features:
  - Alert handling (accept, dismiss, sendKeys)
  - Drag and Drop functionality
  - Button click operations
  - Locator strategies (XPath, CSS Selector)
  - E-commerce automation examples (Flipkart)
  - jQuery UI interaction examples
  - Multiple package-based practice structure

prerequisites:
  - Java JDK 8 or above
  - Maven installed
  - Chrome Browser
  - ChromeDriver configured in system PATH

dependencies:
  - selenium-java
  - maven-surefire-plugin

how_to_run:
  step_1: Clone repository
  command_1: git clone https://github.com/bhartibasumatary61040/seleniumproject.git

  step_2: Navigate to project
  command_2: cd seleniumproject

  step_3: Install dependencies
  command_3: mvn clean install

  step_4: Run tests
  command_4: mvn test

learning_objective:
  - Master Selenium WebDriver basics
  - Understand locator strategies
  - Practice real-time automation scenarios
  - Improve Java + Selenium integration skills

future_enhancements:
  - Integrate TestNG framework
  - Implement Page Object Model (POM)
  - Add Extent Reports
  - Add Screenshot capture on failure
  - Implement Data-Driven framework
  - CI/CD integration using GitHub Actions
notes:
  - Remove hs_err_pid*.log files from repository.
  - Add proper .gitignore to avoid committing logs and IDE files.
  - Refactor code into reusable utility classes.
